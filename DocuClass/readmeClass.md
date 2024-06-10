# POO

## _Conceptos para un buen codigo_

1. **Entender el concepto del objeto:** Para un buen codigo la primera estrategia es entender conceptualmente el problema, utilizando herramientas graficas como flujogramas, dibujos, etc. Cuando tenemos un objeto, realizamos un proceso de _descripción_ de sus propiedades (caracteristidas). Debemos definir el objeto en el alcance de acción, sin caer en el plano de la excesividad.

    - 1.1. **Determinacion de metodos**: Los metodos o acciones deben estar ligado al alcance de acción o al interés de analisis del objeto, por lo tanto deben estar correlacionadas con las caracteristicas. Los metodos o acciones se nombran como verbos en infinitivo (terminados en ar, er, ir).

    - 1.2. **Determinar los parametros de los metodos**: Son similares a las propiedades pero los parametros estan destinados a poder matizar las acciones o metodos.

    - 1.3. **Ámbito del método**: En POO las funciones son conocidas como métodos con la diferencia de que tienen un ámbito, el que puede ser: público +, privado -, protegido ~,friendly #.

2. **UML**: Es el lenguaje unificado de modelado,y de este nos interesa conocer los _diagramas de clases_, en donde las clases se titulan en un recuadro y empiezan con mayuscula (UpperCamelCase). Dentro del recuadro se enlistan lass propiedades y los métodos con su ámbito.

3. Código (Java):

```java
public class Mujer {
    private short edad;
    public boolean  tieneOjos;
    public String tipoDeOjos;
    ...

}
```

_**Deber:**_ Conceptualizar un objeto "Animal salvaje" Que tenga 3 propiedades y 3 metodos, con los 3 puntos desarrollados.
