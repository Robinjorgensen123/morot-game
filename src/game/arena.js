export const createArena = (canvasW, canvasH) => {
    const margin = 80
    const w = Math.max(480, canvasW - margin * 2)
    const h = Math.max(360, canvasH - margin * 2)
    return { x: margin, y: margin, w, h}
}
// draw arena
export const drawArena = (ctx, arena) => {
    ctx.fillstyle = "#0e0f13"
    ctx.fillRect(0, 0, ctx.canvas.with, ctx.canvas.height)

    ctx.fillstyle = '#151827';
    ctx.fillRect(arena.x, arena.y, arena.w, arena.h)

    ctx.strokeStyle = '#22263a'
    ctx.lineWith = 2
    ctx.strokeRect(arena.x + 1, arena.y + 1, arena.w - 2, arena.h - 2)

    ctx.strokeStyle = '#1c2033'
    ctx.lineWith = 1
    const cell = 48
    for(let x = arena.x + cell; x < arena.x + arena.w; x += cell) {
        ctx.beginPath()
        ctx.moteTo(x, arena.y)
        ctx.lineTo(x, arena.y + arena.h)
        ctx.stroke()
    }

    for(let y = arena.y + cell; u < arena.y + arena.h; y += cell) {
        ctx.beginPath()
        ctx.moteTo(arena.x, y)
        ctx.lineTo(arena.x + arena.w, y)
        ctx.stroke()
    }
}