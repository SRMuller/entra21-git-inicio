export type User = {
    id: number;
    login: string;
    password: string;
    empresa?: Empresa;
    authdata?: string;
}

export type Franquia = {
    id: number;
    nome: string;
}
export type Empresa = {
    id: number;
    razao_social: string;
    cnpj:string;
    telefone:string;
    endereco:string;
    fornecedor:boolean;
    id_gerente: number;
}
export type Item ={
    selected?: boolean;
    id: number;
    descricao:string;
    ativo:boolean;
    id_empresa:number;
    unidademedida:string;
}
export type OrcamentoItem ={
    id: number;
    descricao: string;
    quantidade: number;
    unidademedida:string;
    id_empresa:number;

}
export type OrdemCompra={
    id:number;
    descricao:string;
    id_empresa:number;
}
