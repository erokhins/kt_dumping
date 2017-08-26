'IrDeclarationBase' @ [34:5] ==> public constructor IrDeclarationBase(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin) defined in org.jetbrains.kotlin.ir.declarations.impl.IrDeclarationBase[ClassConstructorDescriptorImpl]

'startOffset' @ [34:23] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [34:36] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.<init>[ValueParameterDescriptorImpl]

'origin' @ [34:47] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [36:13] ==> public constructor IrClassImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrClassSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [36:18] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [36:31] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.<init>[ValueParameterDescriptorImpl]

'origin' @ [36:42] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.<init>[ValueParameterDescriptorImpl]

'IrClassSymbolImpl' @ [36:50] ==> public constructor IrClassSymbolImpl(descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrClassSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [36:68] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [41:9] ==> public constructor IrClassImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [41:14] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [41:27] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.<init>[ValueParameterDescriptorImpl]

'origin' @ [41:38] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [41:46] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.<init>[ValueParameterDescriptorImpl]

'addAll' @ [42:9] ==> public fun IrClass.addAll(members: List<IrDeclaration>): Unit defined in org.jetbrains.kotlin.ir.declarations[SimpleFunctionDescriptorImpl]

'members' @ [42:16] ==> value-parameter members: List<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.<init>[ValueParameterDescriptorImpl]

'symbol' @ [46:9] ==> public open val symbol: IrClassSymbol defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl[PropertyDescriptorImpl]

'bind' @ [46:16] ==> public abstract fun bind(owner: IrClass): Unit defined in org.jetbrains.kotlin.ir.symbols.IrClassSymbol[SimpleFunctionDescriptorImpl]

'this' @ [46:21] ==> <this> defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl[LazyClassReceiverParameterDescriptor]

'symbol' @ [49:54] ==> public open val symbol: IrClassSymbol defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl[PropertyDescriptorImpl]

'descriptor' @ [49:61] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrClassSymbol[PropertyDescriptorImpl]

'ArrayList' @ [53:61] ==> public final fun <E> <init>(): ArrayList<IrDeclaration> /* = ArrayList<IrDeclaration> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> IrDeclaration

'SmartList' @ [55:65] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IrTypeParameter

'visitor' @ [58:13] ==> value-parameter visitor: IrElementVisitor<R, D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.accept[ValueParameterDescriptorImpl]

'visitClass' @ [58:21] ==> public open fun visitClass(declaration: IrClass, data: D): R defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[SimpleFunctionDescriptorImpl]

'this' @ [58:32] ==> <this> defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl[LazyClassReceiverParameterDescriptor]

'data' @ [58:38] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.accept[ValueParameterDescriptorImpl]

'thisReceiver' @ [61:9] ==> public open var thisReceiver: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl[PropertyDescriptorImpl]

'accept' @ [61:23] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [61:30] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [61:39] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.acceptChildren[ValueParameterDescriptorImpl]

'typeParameters' @ [62:9] ==> public open val typeParameters: MutableList<IrTypeParameter> defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl[PropertyDescriptorImpl]

'forEach' @ [62:24] ==> @HidesMembers public inline fun <T> Iterable<IrTypeParameter>.forEach(action: (IrTypeParameter) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrTypeParameter

'it' @ [62:34] ==> value-parameter it: IrTypeParameter defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.acceptChildren.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [62:37] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.declarations.IrTypeParameter[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [62:44] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [62:53] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.acceptChildren[ValueParameterDescriptorImpl]

'declarations' @ [63:9] ==> public open val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl[PropertyDescriptorImpl]

'forEach' @ [63:22] ==> @HidesMembers public inline fun <T> Iterable<IrDeclaration>.forEach(action: (IrDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDeclaration

'it' @ [63:32] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.acceptChildren.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [63:35] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.declarations.IrDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [63:42] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [63:51] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.acceptChildren[ValueParameterDescriptorImpl]

'thisReceiver' @ [67:9] ==> public open var thisReceiver: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl[PropertyDescriptorImpl]

'thisReceiver' @ [67:24] ==> public open var thisReceiver: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl[PropertyDescriptorImpl]

'transform' @ [67:38] ==> public abstract fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrValueParameter defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [67:48] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [67:61] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.transformChildren[ValueParameterDescriptorImpl]

'typeParameters' @ [68:9] ==> public open val typeParameters: MutableList<IrTypeParameter> defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl[PropertyDescriptorImpl]

'transform' @ [68:24] ==> public inline fun <reified T : IrElement> MutableList<IrTypeParameter>.transform(transformation: (IrTypeParameter) -> IrElement): Unit defined in org.jetbrains.kotlin.ir.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrTypeParameter

'it' @ [68:36] ==> value-parameter it: IrTypeParameter defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [68:39] ==> public abstract fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrTypeParameter defined in org.jetbrains.kotlin.ir.declarations.IrTypeParameter[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [68:49] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [68:62] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.transformChildren[ValueParameterDescriptorImpl]

'declarations' @ [69:9] ==> public open val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl[PropertyDescriptorImpl]

'transform' @ [69:22] ==> public inline fun <reified T : IrElement> MutableList<IrDeclaration>.transform(transformation: (IrDeclaration) -> IrElement): Unit defined in org.jetbrains.kotlin.ir.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrDeclaration

'it' @ [69:34] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [69:37] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrStatement defined in org.jetbrains.kotlin.ir.declarations.IrDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [69:47] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [69:60] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.transformChildren[ValueParameterDescriptorImpl]

