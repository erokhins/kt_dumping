'IrElementBase' @ [30:32] ==> public constructor IrElementBase(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.IrElementBase[ClassConstructorDescriptorImpl]

'UNDEFINED_OFFSET' @ [30:46] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'UNDEFINED_OFFSET' @ [30:64] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'symbol' @ [32:9] ==> public open val symbol: IrExternalPackageFragmentSymbol defined in org.jetbrains.kotlin.ir.declarations.impl.IrExternalPackageFragmentImpl[PropertyDescriptorImpl]

'bind' @ [32:16] ==> public abstract fun bind(owner: IrExternalPackageFragment): Unit defined in org.jetbrains.kotlin.ir.symbols.IrExternalPackageFragmentSymbol[SimpleFunctionDescriptorImpl]

'this' @ [32:21] ==> <this> defined in org.jetbrains.kotlin.ir.declarations.impl.IrExternalPackageFragmentImpl[LazyClassReceiverParameterDescriptor]

'symbol' @ [35:79] ==> public open val symbol: IrExternalPackageFragmentSymbol defined in org.jetbrains.kotlin.ir.declarations.impl.IrExternalPackageFragmentImpl[PropertyDescriptorImpl]

'descriptor' @ [35:86] ==> public abstract val descriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrExternalPackageFragmentSymbol[PropertyDescriptorImpl]

'ArrayList' @ [37:61] ==> public final fun <E> <init>(): ArrayList<IrDeclaration> /* = ArrayList<IrDeclaration> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> IrDeclaration

'visitor' @ [40:13] ==> value-parameter visitor: IrElementVisitor<R, D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrExternalPackageFragmentImpl.accept[ValueParameterDescriptorImpl]

'visitExternalPackageFragment' @ [40:21] ==> public open fun visitExternalPackageFragment(declaration: IrExternalPackageFragment, data: D): R defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[SimpleFunctionDescriptorImpl]

'this' @ [40:50] ==> <this> defined in org.jetbrains.kotlin.ir.declarations.impl.IrExternalPackageFragmentImpl[LazyClassReceiverParameterDescriptor]

'data' @ [40:56] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrExternalPackageFragmentImpl.accept[ValueParameterDescriptorImpl]

'declarations' @ [43:9] ==> public open val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.impl.IrExternalPackageFragmentImpl[PropertyDescriptorImpl]

'forEach' @ [43:22] ==> @HidesMembers public inline fun <T> Iterable<IrDeclaration>.forEach(action: (IrDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDeclaration

'it' @ [43:32] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.ir.declarations.impl.IrExternalPackageFragmentImpl.acceptChildren.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [43:35] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.declarations.IrDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [43:42] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrExternalPackageFragmentImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [43:51] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrExternalPackageFragmentImpl.acceptChildren[ValueParameterDescriptorImpl]

'declarations' @ [47:9] ==> public open val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.impl.IrExternalPackageFragmentImpl[PropertyDescriptorImpl]

'forEachIndexed' @ [47:22] ==> public inline fun <T> Iterable<IrDeclaration>.forEachIndexed(action: (index: Int, IrDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDeclaration

'declarations' @ [48:13] ==> public open val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.impl.IrExternalPackageFragmentImpl[PropertyDescriptorImpl]

'i' @ [48:26] ==> value-parameter i: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrExternalPackageFragmentImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'irDeclaration' @ [48:31] ==> value-parameter irDeclaration: IrDeclaration defined in org.jetbrains.kotlin.ir.declarations.impl.IrExternalPackageFragmentImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [48:45] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrStatement defined in org.jetbrains.kotlin.ir.declarations.IrDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [48:55] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrExternalPackageFragmentImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [48:68] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrExternalPackageFragmentImpl.transformChildren[ValueParameterDescriptorImpl]

