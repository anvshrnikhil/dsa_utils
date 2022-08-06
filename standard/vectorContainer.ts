interface vectorContainer<Type>
{
    size(): number;
    empty(): boolean;
    push_back(element: Type): void;
    pop_back(): void;
    clear(): void;
    front(): Type;
    back(): Type;
    get(idx: number): Type;
    set(idx: number, val: Type): void;
}