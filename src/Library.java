import java.util.ArrayList;

public class Library
{
    private ArrayList<String> librarylist;

    public void library()
    {
        librarylist = new ArrayList<>();
    }

    public void addItem(String item)
    {
        librarylist.add(item);
    }

    public void removeItem(String item)
    {
        for (int i = 0; i < librarylist.size(); i++)
        {
            if (librarylist.get(i).contains(item))
            {
                librarylist.remove(i);
            }
        }

    }

    public string find(String item)
    {
        for (int i = 0; i < librarylist.size(); i++)
        {
            if (librarylist.get(i).contains(item))
            {
                return toString(i);
            }
            else
            {
                return
            }
        }
    }

    public String getNextItem(String item)
    {
        return librarylist.get(0);
    }

    public void skipNextItem(String item)
    {
        librarylist.remove(0);
    }


}
