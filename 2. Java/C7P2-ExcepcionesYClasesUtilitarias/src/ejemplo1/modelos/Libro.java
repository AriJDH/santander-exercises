package ejemplo1.modelos;

public class Libro {
    int cantidad_paginas;

    public Libro(int cantidad_paginas) {
        this.cantidad_paginas = cantidad_paginas;
    }

    public int getCantidad_paginas() {
        return cantidad_paginas;
    }

    public void setCantidad_paginas(int cantidad_paginas) {
        this.cantidad_paginas = cantidad_paginas;
    }
}
