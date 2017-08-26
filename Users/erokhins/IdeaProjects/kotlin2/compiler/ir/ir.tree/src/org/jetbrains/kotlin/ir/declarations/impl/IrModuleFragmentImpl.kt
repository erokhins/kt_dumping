'this' @ [32:94] ==> public constructor IrModuleFragmentImpl(descriptor: ModuleDescriptor, irBuiltins: IrBuiltIns) defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [32:99] ==> value-parameter descriptor: ModuleDescriptor defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl.<init>[ValueParameterDescriptorImpl]

'irBuiltins' @ [32:111] ==> value-parameter irBuiltins: IrBuiltIns defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [33:9] ==> <this> defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl[LazyClassReceiverParameterDescriptor]

'files' @ [33:14] ==> public open val files: MutableList<IrFile> defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl[PropertyDescriptorImpl]

'addAll' @ [33:20] ==> public abstract fun addAll(elements: Collection<IrFile>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'files' @ [33:27] ==> value-parameter files: List<IrFile> defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl.<init>[ValueParameterDescriptorImpl]

'ArrayList' @ [36:47] ==> public final fun <E> <init>(): ArrayList<IrFile> /* = ArrayList<IrFile> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> IrFile

'ArrayList' @ [38:85] ==> public final fun <E> <init>(): ArrayList<IrExternalPackageFragment> /* = ArrayList<IrExternalPackageFragment> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> IrExternalPackageFragment

'ArrayList' @ [40:69] ==> public final fun <E> <init>(): ArrayList<IrModuleFragment> /* = ArrayList<IrModuleFragment> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> IrModuleFragment

'visitor' @ [43:13] ==> value-parameter visitor: IrElementVisitor<R, D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl.accept[ValueParameterDescriptorImpl]

'visitModuleFragment' @ [43:21] ==> public open fun visitModuleFragment(declaration: IrModuleFragment, data: D): R defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[SimpleFunctionDescriptorImpl]

'this' @ [43:41] ==> <this> defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl[LazyClassReceiverParameterDescriptor]

'data' @ [43:47] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl.accept[ValueParameterDescriptorImpl]

'files' @ [46:9] ==> public open val files: MutableList<IrFile> defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl[PropertyDescriptorImpl]

'forEach' @ [46:15] ==> @HidesMembers public inline fun <T> Iterable<IrFile>.forEach(action: (IrFile) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFile

'it' @ [46:25] ==> value-parameter it: IrFile defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl.acceptChildren.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [46:28] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.declarations.IrFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [46:35] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [46:44] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl.acceptChildren[ValueParameterDescriptorImpl]

'files' @ [50:9] ==> public open val files: MutableList<IrFile> defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl[PropertyDescriptorImpl]

'forEachIndexed' @ [50:15] ==> public inline fun <T> Iterable<IrFile>.forEachIndexed(action: (index: Int, IrFile) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFile

'files' @ [51:13] ==> public open val files: MutableList<IrFile> defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl[PropertyDescriptorImpl]

'i' @ [51:19] ==> value-parameter i: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'irFile' @ [51:24] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [51:31] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrFile defined in org.jetbrains.kotlin.ir.declarations.IrFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [51:41] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [51:54] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl.transformChildren[ValueParameterDescriptorImpl]

