class vector<Type> implements vectorContainer<Type>
{
    private arr: Type[];
    public constructor(size: number, defaultValue: Type) {
        for(let i=0;i<size;i++) {
            this.push_back(defaultValue);
        }
    }

    public get(idx: number): Type {
        return this.arr[idx];
    }

    public set(idx: number, val: Type): void {
        this.arr[idx] = val;
    }

    public empty(): boolean {
        return this.size() == 0 ?true :false;
    }

    public push_back(element: Type): void {
        this.arr.push(element);
    }

    public pop_back(): void {
        this.arr.pop();
    }

    public clear(): void {
        this.arr = [];
    }

    public front(): Type {
        return this.arr[0];
    }

    public back(): Type {
        return this.arr[this.size() - 1];
    }

    public size(): number {
        return this.arr.length;
    }
}


function uniquePaths(m: number, n: number): number {
    let arr: vector<vector<number>> = new vector<vector<number>>( m+1, new vector<number>(n+1, 0));
    arr.get(0).set(1,1);
    
    for(let i=1;i<m+1;i++) {
        for(let j=1;j<n+1;j++) {
            arr.get(i).set(j, arr.get(i-1).get(j) + arr.get(i).get(j-1));
        }
    }
    
    return arr.get(m+1).get(n+1);
};