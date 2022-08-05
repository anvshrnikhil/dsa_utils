class vector<Type>
{
    private arr: Type[];
    public constructor();
    public constructor(size: number, defaultValue: Type);
    public constructor(...params: any[]) {
        if(params.length == 2 && params[0].type === 'number') {
            let size = params[0];
            let defaultValue = params[1];
            this.arr.length = size;
            this.arr.forEach( (val: Type, idx: number) => {
                this.arr[idx] = defaultValue;
            });
        }
    }

}