import Task1_classes.Complex;

public class Task1 {

    public interface ComplexAbstractFactory{
        public abstract Complex createComplex();
        public abstract Complex createComplex(int real, int image);
    }

    public class ConcreteFactory implements ComplexAbstractFactory{

        @Override
        public Complex createComplex() {
            Complex emptyComplex = new Complex();
            return emptyComplex;
        }

        @Override
        public Complex createComplex(int real, int image) {
            Complex complex = new Complex();
            complex.setReal(real);
            complex.setImage(image);
            return complex;
        }
    }
}
