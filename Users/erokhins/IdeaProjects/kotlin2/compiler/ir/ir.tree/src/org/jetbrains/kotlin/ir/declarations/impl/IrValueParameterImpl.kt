'IrDeclarationBase' @ [33:5] ==> public constructor IrDeclarationBase(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin) defined in org.jetbrains.kotlin.ir.declarations.impl.IrDeclarationBase[ClassConstructorDescriptorImpl]

'startOffset' @ [33:23] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [33:36] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.<init>[ValueParameterDescriptorImpl]

'origin' @ [33:47] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.<init>[ValueParameterDescriptorImpl]

'symbol' @ [34:52] ==> public open val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl[PropertyDescriptorImpl]

'descriptor' @ [34:59] ==> public abstract val descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrValueParameterSymbol[PropertyDescriptorImpl]

'this' @ [37:13] ==> public constructor IrValueParameterImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrValueParameterSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [37:18] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [37:31] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.<init>[ValueParameterDescriptorImpl]

'origin' @ [37:42] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.<init>[ValueParameterDescriptorImpl]

'IrValueParameterSymbolImpl' @ [37:50] ==> public constructor IrValueParameterSymbolImpl(descriptor: ParameterDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrValueParameterSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [37:77] ==> value-parameter descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [45:9] ==> public constructor IrValueParameterImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: ParameterDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [45:14] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [45:27] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.<init>[ValueParameterDescriptorImpl]

'origin' @ [45:38] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [45:46] ==> value-parameter descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [46:9] ==> <this> defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl[LazyClassReceiverParameterDescriptor]

'defaultValue' @ [46:14] ==> public open var defaultValue: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl[PropertyDescriptorImpl]

'defaultValue' @ [46:29] ==> value-parameter defaultValue: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.<init>[ValueParameterDescriptorImpl]

'symbol' @ [50:9] ==> public open val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl[PropertyDescriptorImpl]

'bind' @ [50:16] ==> public abstract fun bind(owner: IrValueParameter): Unit defined in org.jetbrains.kotlin.ir.symbols.IrValueParameterSymbol[SimpleFunctionDescriptorImpl]

'this' @ [50:21] ==> <this> defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl[LazyClassReceiverParameterDescriptor]

'visitor' @ [56:13] ==> value-parameter visitor: IrElementVisitor<R, D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.accept[ValueParameterDescriptorImpl]

'visitValueParameter' @ [56:21] ==> public open fun visitValueParameter(declaration: IrValueParameter, data: D): R defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[SimpleFunctionDescriptorImpl]

'this' @ [56:41] ==> <this> defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl[LazyClassReceiverParameterDescriptor]

'data' @ [56:47] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.accept[ValueParameterDescriptorImpl]

'transformer' @ [59:13] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.transform[ValueParameterDescriptorImpl]

'visitValueParameter' @ [59:25] ==> public open fun visitValueParameter(declaration: IrValueParameter, data: D): IrStatement defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformer[SimpleFunctionDescriptorImpl]

'this' @ [59:45] ==> <this> defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl[LazyClassReceiverParameterDescriptor]

'data' @ [59:51] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.transform[ValueParameterDescriptorImpl]

'defaultValue' @ [62:9] ==> public open var defaultValue: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl[PropertyDescriptorImpl]

'accept' @ [62:23] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpressionBody[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [62:30] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [62:39] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.acceptChildren[ValueParameterDescriptorImpl]

'defaultValue' @ [66:9] ==> public open var defaultValue: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl[PropertyDescriptorImpl]

'defaultValue' @ [66:24] ==> public open var defaultValue: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl[PropertyDescriptorImpl]

'transform' @ [66:38] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrExpressionBody defined in org.jetbrains.kotlin.ir.expressions.IrExpressionBody[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [66:48] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [66:61] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl.transformChildren[ValueParameterDescriptorImpl]

