'IrElementBase' @ [35:5] ==> public constructor IrElementBase(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.IrElementBase[ClassConstructorDescriptorImpl]

'fileEntry' @ [35:22] ==> value-parameter fileEntry: SourceManager.FileEntry defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.<init>[ValueParameterDescriptorImpl]

'maxOffset' @ [35:32] ==> public abstract val maxOffset: Int defined in org.jetbrains.kotlin.ir.SourceManager.FileEntry[PropertyDescriptorImpl]

'this' @ [37:15] ==> public constructor IrFileImpl(fileEntry: SourceManager.FileEntry, symbol: IrFileSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl[ClassConstructorDescriptorImpl]

'fileEntry' @ [37:20] ==> value-parameter fileEntry: SourceManager.FileEntry defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.<init>[ValueParameterDescriptorImpl]

'IrFileSymbolImpl' @ [37:31] ==> public constructor IrFileSymbolImpl(descriptor: PackageFragmentDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrFileSymbolImpl[ClassConstructorDescriptorImpl]

'packageFragmentDescriptor' @ [37:48] ==> value-parameter packageFragmentDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [44:9] ==> public constructor IrFileImpl(fileEntry: SourceManager.FileEntry, packageFragmentDescriptor: PackageFragmentDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl[ClassConstructorDescriptorImpl]

'fileEntry' @ [44:14] ==> value-parameter fileEntry: SourceManager.FileEntry defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.<init>[ValueParameterDescriptorImpl]

'packageFragmentDescriptor' @ [44:25] ==> value-parameter packageFragmentDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [45:9] ==> <this> defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl[LazyClassReceiverParameterDescriptor]

'fileAnnotations' @ [45:14] ==> public open val fileAnnotations: MutableList<AnnotationDescriptor> defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl[PropertyDescriptorImpl]

'addAll' @ [45:30] ==> public abstract fun addAll(elements: Collection<AnnotationDescriptor>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'fileAnnotations' @ [45:37] ==> value-parameter fileAnnotations: List<AnnotationDescriptor> defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [46:9] ==> <this> defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl[LazyClassReceiverParameterDescriptor]

'declarations' @ [46:14] ==> public open val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl[PropertyDescriptorImpl]

'addAll' @ [46:27] ==> public abstract fun addAll(elements: Collection<IrDeclaration>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'declarations' @ [46:34] ==> value-parameter declarations: List<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.<init>[ValueParameterDescriptorImpl]

'symbol' @ [50:9] ==> public open val symbol: IrFileSymbol defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl[PropertyDescriptorImpl]

'bind' @ [50:16] ==> public abstract fun bind(owner: IrFile): Unit defined in org.jetbrains.kotlin.ir.symbols.IrFileSymbol[SimpleFunctionDescriptorImpl]

'this' @ [50:21] ==> <this> defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl[LazyClassReceiverParameterDescriptor]

'symbol' @ [53:79] ==> public open val symbol: IrFileSymbol defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl[PropertyDescriptorImpl]

'descriptor' @ [53:86] ==> public abstract val descriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFileSymbol[PropertyDescriptorImpl]

'SmartList' @ [55:71] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor..org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor?)

'ArrayList' @ [57:61] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IrDeclaration

'visitor' @ [60:13] ==> value-parameter visitor: IrElementVisitor<R, D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.accept[ValueParameterDescriptorImpl]

'visitFile' @ [60:21] ==> public open fun visitFile(declaration: IrFile, data: D): R defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[SimpleFunctionDescriptorImpl]

'this' @ [60:31] ==> <this> defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl[LazyClassReceiverParameterDescriptor]

'data' @ [60:37] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.accept[ValueParameterDescriptorImpl]

'declarations' @ [63:9] ==> public open val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl[PropertyDescriptorImpl]

'forEach' @ [63:22] ==> @HidesMembers public inline fun <T> Iterable<IrDeclaration>.forEach(action: (IrDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDeclaration

'it' @ [63:32] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.acceptChildren.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [63:35] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.declarations.IrDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [63:42] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [63:51] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.acceptChildren[ValueParameterDescriptorImpl]

'declarations' @ [67:9] ==> public open val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl[PropertyDescriptorImpl]

'forEachIndexed' @ [67:22] ==> public inline fun <T> Iterable<IrDeclaration>.forEachIndexed(action: (index: Int, IrDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDeclaration

'declarations' @ [68:13] ==> public open val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl[PropertyDescriptorImpl]

'i' @ [68:26] ==> value-parameter i: Int defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'irDeclaration' @ [68:31] ==> value-parameter irDeclaration: IrDeclaration defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [68:45] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrStatement defined in org.jetbrains.kotlin.ir.declarations.IrDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [68:55] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [68:68] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.transformChildren[ValueParameterDescriptorImpl]

