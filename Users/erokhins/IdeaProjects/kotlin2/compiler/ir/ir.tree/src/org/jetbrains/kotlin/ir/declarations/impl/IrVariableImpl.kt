'IrDeclarationBase' @ [33:5] ==> public constructor IrDeclarationBase(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin) defined in org.jetbrains.kotlin.ir.declarations.impl.IrDeclarationBase[ClassConstructorDescriptorImpl]

'startOffset' @ [33:23] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [33:36] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl.<init>[ValueParameterDescriptorImpl]

'origin' @ [33:47] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [35:13] ==> public constructor IrVariableImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrVariableSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [35:18] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [35:31] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl.<init>[ValueParameterDescriptorImpl]

'origin' @ [35:42] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl.<init>[ValueParameterDescriptorImpl]

'IrVariableSymbolImpl' @ [35:50] ==> public constructor IrVariableSymbolImpl(descriptor: VariableDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrVariableSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [35:71] ==> value-parameter descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [43:9] ==> public constructor IrVariableImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: VariableDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [43:14] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [43:27] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl.<init>[ValueParameterDescriptorImpl]

'origin' @ [43:38] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [43:46] ==> value-parameter descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [44:9] ==> <this> defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl[LazyClassReceiverParameterDescriptor]

'initializer' @ [44:14] ==> public open var initializer: IrExpression? defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl[PropertyDescriptorImpl]

'initializer' @ [44:28] ==> value-parameter initializer: IrExpression? defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl.<init>[ValueParameterDescriptorImpl]

'symbol' @ [48:9] ==> public open val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl[PropertyDescriptorImpl]

'bind' @ [48:16] ==> public abstract fun bind(owner: IrVariable): Unit defined in org.jetbrains.kotlin.ir.symbols.IrVariableSymbol[SimpleFunctionDescriptorImpl]

'this' @ [48:21] ==> <this> defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl[LazyClassReceiverParameterDescriptor]

'symbol' @ [51:57] ==> public open val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl[PropertyDescriptorImpl]

'descriptor' @ [51:64] ==> public abstract val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrVariableSymbol[PropertyDescriptorImpl]

'visitor' @ [56:16] ==> value-parameter visitor: IrElementVisitor<R, D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl.accept[ValueParameterDescriptorImpl]

'visitVariable' @ [56:24] ==> public open fun visitVariable(declaration: IrVariable, data: D): R defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[SimpleFunctionDescriptorImpl]

'this' @ [56:38] ==> <this> defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl[LazyClassReceiverParameterDescriptor]

'data' @ [56:44] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl.accept[ValueParameterDescriptorImpl]

'initializer' @ [60:9] ==> public open var initializer: IrExpression? defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl[PropertyDescriptorImpl]

'accept' @ [60:22] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [60:29] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [60:38] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl.acceptChildren[ValueParameterDescriptorImpl]

'initializer' @ [64:9] ==> public open var initializer: IrExpression? defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl[PropertyDescriptorImpl]

'initializer' @ [64:23] ==> public open var initializer: IrExpression? defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl[PropertyDescriptorImpl]

'transform' @ [64:36] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [64:46] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [64:59] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl.transformChildren[ValueParameterDescriptorImpl]

