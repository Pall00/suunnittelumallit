package visitor;

import javax.naming.Context;

interface State {
    void handle(Context context);
}
