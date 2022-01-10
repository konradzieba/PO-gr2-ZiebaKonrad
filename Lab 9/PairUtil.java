package lab9;

public class PairUtil
{
    public static <T> Pair swap(Pair<T> argum)
    {
        Pair<T> result = new Pair<T>(argum.getSecond(), argum.getFirst());
        return result;
    }
}
