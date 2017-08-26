'DeepCopySymbolsRemapper' @ [33:20] ==> public constructor DeepCopySymbolsRemapper(descriptorsRemapper: DescriptorsRemapper = ...) defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[ClassConstructorDescriptorImpl]

'acceptVoid' @ [34:5] ==> public fun IrElement.acceptVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors in file IrElementVisitorVoid.kt[SimpleFunctionDescriptorImpl]

'remapper' @ [34:16] ==> val remapper: DeepCopySymbolsRemapper defined in org.jetbrains.kotlin.ir.util.deepCopyWithSymbols[LocalVariableDescriptor]

'transform' @ [35:12] ==> public open fun <D> transform(transformer: IrElementTransformer<Nothing?>, data: Nothing?): IrElement defined in org.jetbrains.kotlin.ir.IrElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> Nothing?

'DeepCopyIrTreeWithSymbols' @ [35:22] ==> public constructor DeepCopyIrTreeWithSymbols(symbolRemapper: SymbolRemapper) defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[ClassConstructorDescriptorImpl]

'remapper' @ [35:48] ==> val remapper: DeepCopySymbolsRemapper defined in org.jetbrains.kotlin.ir.util.deepCopyWithSymbols[LocalVariableDescriptor]

'IrElementTransformerVoid' @ [39:84] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[ClassConstructorDescriptorImpl]

'origin' @ [40:69] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.mapDeclarationOrigin[ValueParameterDescriptorImpl]

'origin' @ [41:66] ==> value-parameter origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.mapStatementOrigin[ValueParameterDescriptorImpl]

'transform' @ [44:13] ==> public open fun <D> transform(transformer: IrElementTransformer<Nothing?>, data: Nothing?): IrElement defined in org.jetbrains.kotlin.ir.IrElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> Nothing?

'this@DeepCopyIrTreeWithSymbols' @ [44:23] ==> <this> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[LazyClassReceiverParameterDescriptor]

'map' @ [47:13] ==> public inline fun <T, R> Iterable<T>.map(transform: (T) -> T): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <R> -> T

'it' @ [47:19] ==> value-parameter it: T defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.transform.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [47:22] ==> private final inline fun <reified T : IrElement> T.transform(): T defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> T

'mapTo' @ [50:13] ==> public inline fun <T, R, C : MutableCollection<in T>> Iterable<T>.mapTo(destination: MutableList<T>, transform: (T) -> T): MutableList<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <R> -> T
    <C : MutableCollection<in R>> -> MutableList<T>

'destination' @ [50:19] ==> value-parameter destination: MutableList<T> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.transformTo[ValueParameterDescriptorImpl]

'it' @ [50:34] ==> value-parameter it: T defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.transformTo.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [50:37] ==> private final inline fun <reified T : IrElement> T.transform(): T defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> T

'declarations' @ [53:13] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationContainer[PropertyDescriptorImpl]

'transformTo' @ [53:26] ==> private final inline fun <reified T : IrElement> List<IrDeclaration>.transformTo(destination: MutableList<IrDeclaration>): MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrDeclaration

'destination' @ [53:38] ==> value-parameter destination: T defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.transformDeclarationsTo[ValueParameterDescriptorImpl]

'declarations' @ [53:50] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationContainer[PropertyDescriptorImpl]

'IllegalArgumentException' @ [56:19] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'element' @ [56:72] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitElement[ValueParameterDescriptorImpl]

'IrModuleFragmentImpl' @ [59:13] ==> public constructor IrModuleFragmentImpl(descriptor: ModuleDescriptor, irBuiltins: IrBuiltIns, files: List<IrFile>) defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl[ClassConstructorDescriptorImpl]

'declaration' @ [60:21] ==> value-parameter declaration: IrModuleFragment defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitModuleFragment[ValueParameterDescriptorImpl]

'descriptor' @ [60:33] ==> public abstract val descriptor: ModuleDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrModuleFragment[PropertyDescriptorImpl]

'declaration' @ [61:21] ==> value-parameter declaration: IrModuleFragment defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitModuleFragment[ValueParameterDescriptorImpl]

'irBuiltins' @ [61:33] ==> public abstract val irBuiltins: IrBuiltIns defined in org.jetbrains.kotlin.ir.declarations.IrModuleFragment[PropertyDescriptorImpl]

'declaration' @ [62:21] ==> value-parameter declaration: IrModuleFragment defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitModuleFragment[ValueParameterDescriptorImpl]

'files' @ [62:33] ==> public abstract val files: MutableList<IrFile> defined in org.jetbrains.kotlin.ir.declarations.IrModuleFragment[PropertyDescriptorImpl]

'transform' @ [62:39] ==> private final inline fun <reified T : IrElement> List<IrFile>.transform(): List<IrFile> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrFile

'IrExternalPackageFragmentImpl' @ [66:13] ==> public constructor IrExternalPackageFragmentImpl(symbol: IrExternalPackageFragmentSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrExternalPackageFragmentImpl[ClassConstructorDescriptorImpl]

'symbolRemapper' @ [67:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getDeclaredExternalPackageFragment' @ [67:36] ==> public abstract fun getDeclaredExternalPackageFragment(symbol: IrExternalPackageFragmentSymbol): IrExternalPackageFragmentSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'declaration' @ [67:71] ==> value-parameter declaration: IrExternalPackageFragment defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitExternalPackageFragment[ValueParameterDescriptorImpl]

'symbol' @ [67:83] ==> public abstract val symbol: IrExternalPackageFragmentSymbol defined in org.jetbrains.kotlin.ir.declarations.IrExternalPackageFragment[PropertyDescriptorImpl]

'apply' @ [68:15] ==> @InlineOnly public inline fun <T> IrExternalPackageFragmentImpl.apply(block: IrExternalPackageFragmentImpl.() -> Unit): IrExternalPackageFragmentImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExternalPackageFragmentImpl

'declaration' @ [69:17] ==> value-parameter declaration: IrExternalPackageFragment defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitExternalPackageFragment[ValueParameterDescriptorImpl]

'transformDeclarationsTo' @ [69:29] ==> private final fun <T : IrDeclarationContainer> IrExternalPackageFragment.transformDeclarationsTo(destination: IrExternalPackageFragment): MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrDeclarationContainer> -> IrExternalPackageFragment

'this' @ [69:53] ==> <this> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitExternalPackageFragment.<anonymous>[ReceiverParameterDescriptorImpl]

'IrFileImpl' @ [73:13] ==> public constructor IrFileImpl(fileEntry: SourceManager.FileEntry, symbol: IrFileSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl[ClassConstructorDescriptorImpl]

'declaration' @ [74:21] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitFile[ValueParameterDescriptorImpl]

'fileEntry' @ [74:33] ==> public abstract val fileEntry: SourceManager.FileEntry defined in org.jetbrains.kotlin.ir.declarations.IrFile[PropertyDescriptorImpl]

'symbolRemapper' @ [75:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getDeclaredFile' @ [75:36] ==> public abstract fun getDeclaredFile(symbol: IrFileSymbol): IrFileSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'declaration' @ [75:52] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitFile[ValueParameterDescriptorImpl]

'symbol' @ [75:64] ==> public abstract val symbol: IrFileSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFile[PropertyDescriptorImpl]

'apply' @ [76:15] ==> @InlineOnly public inline fun <T> IrFileImpl.apply(block: IrFileImpl.() -> Unit): IrFileImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFileImpl

'fileAnnotations' @ [77:17] ==> public open val fileAnnotations: MutableList<AnnotationDescriptor> defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl[PropertyDescriptorImpl]

'addAll' @ [77:33] ==> public abstract fun addAll(elements: Collection<AnnotationDescriptor>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'declaration' @ [77:40] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitFile[ValueParameterDescriptorImpl]

'fileAnnotations' @ [77:52] ==> public abstract val fileAnnotations: MutableList<AnnotationDescriptor> defined in org.jetbrains.kotlin.ir.declarations.IrFile[PropertyDescriptorImpl]

'declaration' @ [78:17] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitFile[ValueParameterDescriptorImpl]

'transformDeclarationsTo' @ [78:29] ==> private final fun <T : IrDeclarationContainer> IrFile.transformDeclarationsTo(destination: IrFile): MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrDeclarationContainer> -> IrFile

'this' @ [78:53] ==> <this> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitFile.<anonymous>[ReceiverParameterDescriptorImpl]

'IllegalArgumentException' @ [82:19] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'declaration' @ [82:76] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitDeclaration[ValueParameterDescriptorImpl]

'IrClassImpl' @ [85:13] ==> public constructor IrClassImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrClassSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl[ClassConstructorDescriptorImpl]

'declaration' @ [86:21] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitClass[ValueParameterDescriptorImpl]

'startOffset' @ [86:33] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[PropertyDescriptorImpl]

'declaration' @ [86:46] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitClass[ValueParameterDescriptorImpl]

'endOffset' @ [86:58] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[PropertyDescriptorImpl]

'mapDeclarationOrigin' @ [87:21] ==> private final fun mapDeclarationOrigin(origin: IrDeclarationOrigin): IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'declaration' @ [87:42] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitClass[ValueParameterDescriptorImpl]

'origin' @ [87:54] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrClass[PropertyDescriptorImpl]

'symbolRemapper' @ [88:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getDeclaredClass' @ [88:36] ==> public abstract fun getDeclaredClass(symbol: IrClassSymbol): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'declaration' @ [88:53] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitClass[ValueParameterDescriptorImpl]

'symbol' @ [88:65] ==> public abstract val symbol: IrClassSymbol defined in org.jetbrains.kotlin.ir.declarations.IrClass[PropertyDescriptorImpl]

'apply' @ [89:15] ==> @InlineOnly public inline fun <T> IrClassImpl.apply(block: IrClassImpl.() -> Unit): IrClassImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrClassImpl

'thisReceiver' @ [90:17] ==> public open var thisReceiver: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl[PropertyDescriptorImpl]

'declaration' @ [90:32] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitClass[ValueParameterDescriptorImpl]

'thisReceiver' @ [90:44] ==> public abstract var thisReceiver: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrClass[PropertyDescriptorImpl]

'transform' @ [90:58] ==> private final inline fun <reified T : IrElement> IrValueParameter.transform(): IrValueParameter defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrValueParameter

'declaration' @ [91:17] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitClass[ValueParameterDescriptorImpl]

'typeParameters' @ [91:29] ==> public abstract val typeParameters: MutableList<IrTypeParameter> defined in org.jetbrains.kotlin.ir.declarations.IrClass[PropertyDescriptorImpl]

'transformTo' @ [91:44] ==> private final inline fun <reified T : IrElement> List<IrTypeParameter>.transformTo(destination: MutableList<IrTypeParameter>): MutableList<IrTypeParameter> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrTypeParameter

'typeParameters' @ [91:56] ==> public open val typeParameters: MutableList<IrTypeParameter> defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl[PropertyDescriptorImpl]

'declaration' @ [92:17] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitClass[ValueParameterDescriptorImpl]

'transformDeclarationsTo' @ [92:29] ==> private final fun <T : IrDeclarationContainer> IrClass.transformDeclarationsTo(destination: IrClass): MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrDeclarationContainer> -> IrClass

'this' @ [92:53] ==> <this> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitClass.<anonymous>[ReceiverParameterDescriptorImpl]

'IrTypeAliasImpl' @ [96:13] ==> public constructor IrTypeAliasImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: TypeAliasDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrTypeAliasImpl[ClassConstructorDescriptorImpl]

'declaration' @ [97:21] ==> value-parameter declaration: IrTypeAlias defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTypeAlias[ValueParameterDescriptorImpl]

'startOffset' @ [97:33] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrTypeAlias[PropertyDescriptorImpl]

'declaration' @ [97:46] ==> value-parameter declaration: IrTypeAlias defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTypeAlias[ValueParameterDescriptorImpl]

'endOffset' @ [97:58] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrTypeAlias[PropertyDescriptorImpl]

'mapDeclarationOrigin' @ [98:21] ==> private final fun mapDeclarationOrigin(origin: IrDeclarationOrigin): IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'declaration' @ [98:42] ==> value-parameter declaration: IrTypeAlias defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTypeAlias[ValueParameterDescriptorImpl]

'origin' @ [98:54] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrTypeAlias[PropertyDescriptorImpl]

'declaration' @ [99:21] ==> value-parameter declaration: IrTypeAlias defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTypeAlias[ValueParameterDescriptorImpl]

'descriptor' @ [99:33] ==> public abstract val descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrTypeAlias[PropertyDescriptorImpl]

'IrFunctionImpl' @ [103:13] ==> public constructor IrFunctionImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrSimpleFunctionSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[ClassConstructorDescriptorImpl]

'declaration' @ [104:21] ==> value-parameter declaration: IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSimpleFunction[ValueParameterDescriptorImpl]

'startOffset' @ [104:33] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[PropertyDescriptorImpl]

'declaration' @ [104:46] ==> value-parameter declaration: IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSimpleFunction[ValueParameterDescriptorImpl]

'endOffset' @ [104:58] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[PropertyDescriptorImpl]

'mapDeclarationOrigin' @ [105:21] ==> private final fun mapDeclarationOrigin(origin: IrDeclarationOrigin): IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'declaration' @ [105:42] ==> value-parameter declaration: IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSimpleFunction[ValueParameterDescriptorImpl]

'origin' @ [105:54] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[PropertyDescriptorImpl]

'symbolRemapper' @ [106:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getDeclaredFunction' @ [106:36] ==> public abstract fun getDeclaredFunction(symbol: IrSimpleFunctionSymbol): IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'declaration' @ [106:56] ==> value-parameter declaration: IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSimpleFunction[ValueParameterDescriptorImpl]

'symbol' @ [106:68] ==> public abstract val symbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[PropertyDescriptorImpl]

'apply' @ [107:15] ==> @InlineOnly public inline fun <T> IrFunctionImpl.apply(block: IrFunctionImpl.() -> Unit): IrFunctionImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFunctionImpl

'transformFunctionChildren' @ [108:17] ==> private final fun <T : IrFunction> IrSimpleFunction.transformFunctionChildren(declaration: IrSimpleFunction): IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrFunction> -> IrSimpleFunction

'declaration' @ [108:43] ==> value-parameter declaration: IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSimpleFunction[ValueParameterDescriptorImpl]

'IrConstructorImpl' @ [112:13] ==> public constructor IrConstructorImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrConstructorSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrConstructorImpl[ClassConstructorDescriptorImpl]

'declaration' @ [113:21] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitConstructor[ValueParameterDescriptorImpl]

'startOffset' @ [113:33] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[PropertyDescriptorImpl]

'declaration' @ [113:46] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitConstructor[ValueParameterDescriptorImpl]

'endOffset' @ [113:58] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[PropertyDescriptorImpl]

'mapDeclarationOrigin' @ [114:21] ==> private final fun mapDeclarationOrigin(origin: IrDeclarationOrigin): IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'declaration' @ [114:42] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitConstructor[ValueParameterDescriptorImpl]

'origin' @ [114:54] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[PropertyDescriptorImpl]

'symbolRemapper' @ [115:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getDeclaredConstructor' @ [115:36] ==> public abstract fun getDeclaredConstructor(symbol: IrConstructorSymbol): IrConstructorSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'declaration' @ [115:59] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitConstructor[ValueParameterDescriptorImpl]

'symbol' @ [115:71] ==> public abstract val symbol: IrConstructorSymbol defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[PropertyDescriptorImpl]

'apply' @ [116:15] ==> @InlineOnly public inline fun <T> IrConstructorImpl.apply(block: IrConstructorImpl.() -> Unit): IrConstructorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrConstructorImpl

'transformFunctionChildren' @ [117:17] ==> private final fun <T : IrFunction> IrConstructor.transformFunctionChildren(declaration: IrConstructor): IrConstructor defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrFunction> -> IrConstructor

'declaration' @ [117:43] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitConstructor[ValueParameterDescriptorImpl]

'apply' @ [121:13] ==> @InlineOnly public inline fun <T> T.apply(block: T.() -> Unit): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'declaration' @ [122:17] ==> value-parameter declaration: T defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.transformFunctionChildren[ValueParameterDescriptorImpl]

'typeParameters' @ [122:29] ==> public abstract val typeParameters: MutableList<IrTypeParameter> defined in org.jetbrains.kotlin.ir.declarations.IrFunction[PropertyDescriptorImpl]

'transformTo' @ [122:44] ==> private final inline fun <reified T : IrElement> List<IrTypeParameter>.transformTo(destination: MutableList<IrTypeParameter>): MutableList<IrTypeParameter> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrTypeParameter

'typeParameters' @ [122:56] ==> public abstract val typeParameters: MutableList<IrTypeParameter> defined in org.jetbrains.kotlin.ir.declarations.IrFunction[PropertyDescriptorImpl]

'dispatchReceiverParameter' @ [123:17] ==> public abstract var dispatchReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[PropertyDescriptorImpl]

'declaration' @ [123:45] ==> value-parameter declaration: T defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.transformFunctionChildren[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [123:57] ==> public abstract var dispatchReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[PropertyDescriptorImpl]

'transform' @ [123:84] ==> private final inline fun <reified T : IrElement> IrValueParameter.transform(): IrValueParameter defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrValueParameter

'extensionReceiverParameter' @ [124:17] ==> public abstract var extensionReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[PropertyDescriptorImpl]

'declaration' @ [124:46] ==> value-parameter declaration: T defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.transformFunctionChildren[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [124:58] ==> public abstract var extensionReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[PropertyDescriptorImpl]

'transform' @ [124:86] ==> private final inline fun <reified T : IrElement> IrValueParameter.transform(): IrValueParameter defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrValueParameter

'declaration' @ [125:17] ==> value-parameter declaration: T defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.transformFunctionChildren[ValueParameterDescriptorImpl]

'valueParameters' @ [125:29] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrFunction[PropertyDescriptorImpl]

'transformTo' @ [125:45] ==> private final inline fun <reified T : IrElement> List<IrValueParameter>.transformTo(destination: MutableList<IrValueParameter>): MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrValueParameter

'valueParameters' @ [125:57] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrFunction[PropertyDescriptorImpl]

'body' @ [126:17] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[PropertyDescriptorImpl]

'declaration' @ [126:24] ==> value-parameter declaration: T defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.transformFunctionChildren[ValueParameterDescriptorImpl]

'body' @ [126:36] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[PropertyDescriptorImpl]

'transform' @ [126:42] ==> private final inline fun <reified T : IrElement> IrBody.transform(): IrBody defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrBody

'IrPropertyImpl' @ [130:13] ==> public constructor IrPropertyImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, isDelegated: Boolean, descriptor: PropertyDescriptor, backingField: IrField?, getter: IrFunction?, setter: IrFunction?) defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[ClassConstructorDescriptorImpl]

'declaration' @ [131:21] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitProperty[ValueParameterDescriptorImpl]

'startOffset' @ [131:33] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrProperty[PropertyDescriptorImpl]

'declaration' @ [131:46] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitProperty[ValueParameterDescriptorImpl]

'endOffset' @ [131:58] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrProperty[PropertyDescriptorImpl]

'mapDeclarationOrigin' @ [132:21] ==> private final fun mapDeclarationOrigin(origin: IrDeclarationOrigin): IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'declaration' @ [132:42] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitProperty[ValueParameterDescriptorImpl]

'origin' @ [132:54] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrProperty[PropertyDescriptorImpl]

'declaration' @ [133:21] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitProperty[ValueParameterDescriptorImpl]

'isDelegated' @ [133:33] ==> public abstract val isDelegated: Boolean defined in org.jetbrains.kotlin.ir.declarations.IrProperty[PropertyDescriptorImpl]

'declaration' @ [134:21] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitProperty[ValueParameterDescriptorImpl]

'descriptor' @ [134:33] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrProperty[PropertyDescriptorImpl]

'declaration' @ [135:21] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitProperty[ValueParameterDescriptorImpl]

'backingField' @ [135:33] ==> public abstract var backingField: IrField? defined in org.jetbrains.kotlin.ir.declarations.IrProperty[PropertyDescriptorImpl]

'transform' @ [135:47] ==> private final inline fun <reified T : IrElement> IrField.transform(): IrField defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrField

'declaration' @ [136:21] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitProperty[ValueParameterDescriptorImpl]

'getter' @ [136:33] ==> public abstract var getter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.IrProperty[PropertyDescriptorImpl]

'transform' @ [136:41] ==> private final inline fun <reified T : IrElement> IrFunction.transform(): IrFunction defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrFunction

'declaration' @ [137:21] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitProperty[ValueParameterDescriptorImpl]

'setter' @ [137:33] ==> public abstract var setter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.IrProperty[PropertyDescriptorImpl]

'transform' @ [137:41] ==> private final inline fun <reified T : IrElement> IrFunction.transform(): IrFunction defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrFunction

'IrFieldImpl' @ [141:13] ==> public constructor IrFieldImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrFieldSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFieldImpl[ClassConstructorDescriptorImpl]

'declaration' @ [142:21] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitField[ValueParameterDescriptorImpl]

'startOffset' @ [142:33] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrField[PropertyDescriptorImpl]

'declaration' @ [142:46] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitField[ValueParameterDescriptorImpl]

'endOffset' @ [142:58] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrField[PropertyDescriptorImpl]

'mapDeclarationOrigin' @ [143:21] ==> private final fun mapDeclarationOrigin(origin: IrDeclarationOrigin): IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'declaration' @ [143:42] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitField[ValueParameterDescriptorImpl]

'origin' @ [143:54] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrField[PropertyDescriptorImpl]

'symbolRemapper' @ [144:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getDeclaredField' @ [144:36] ==> public abstract fun getDeclaredField(symbol: IrFieldSymbol): IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'declaration' @ [144:53] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitField[ValueParameterDescriptorImpl]

'symbol' @ [144:65] ==> public abstract val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.ir.declarations.IrField[PropertyDescriptorImpl]

'apply' @ [145:15] ==> @InlineOnly public inline fun <T> IrFieldImpl.apply(block: IrFieldImpl.() -> Unit): IrFieldImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFieldImpl

'initializer' @ [146:17] ==> public open var initializer: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.impl.IrFieldImpl[PropertyDescriptorImpl]

'declaration' @ [146:31] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitField[ValueParameterDescriptorImpl]

'initializer' @ [146:43] ==> public abstract var initializer: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.IrField[PropertyDescriptorImpl]

'transform' @ [146:56] ==> private final inline fun <reified T : IrElement> IrExpressionBody.transform(): IrExpressionBody defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpressionBody

'IrLocalDelegatedPropertyImpl' @ [150:13] ==> public constructor IrLocalDelegatedPropertyImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: VariableDescriptorWithAccessors, delegate: IrVariable, getter: IrFunction, setter: IrFunction?) defined in org.jetbrains.kotlin.ir.declarations.impl.IrLocalDelegatedPropertyImpl[ClassConstructorDescriptorImpl]

'declaration' @ [151:21] ==> value-parameter declaration: IrLocalDelegatedProperty defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitLocalDelegatedProperty[ValueParameterDescriptorImpl]

'startOffset' @ [151:33] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrLocalDelegatedProperty[PropertyDescriptorImpl]

'declaration' @ [151:46] ==> value-parameter declaration: IrLocalDelegatedProperty defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitLocalDelegatedProperty[ValueParameterDescriptorImpl]

'endOffset' @ [151:58] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrLocalDelegatedProperty[PropertyDescriptorImpl]

'mapDeclarationOrigin' @ [152:21] ==> private final fun mapDeclarationOrigin(origin: IrDeclarationOrigin): IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'declaration' @ [152:42] ==> value-parameter declaration: IrLocalDelegatedProperty defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitLocalDelegatedProperty[ValueParameterDescriptorImpl]

'origin' @ [152:54] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrLocalDelegatedProperty[PropertyDescriptorImpl]

'declaration' @ [153:21] ==> value-parameter declaration: IrLocalDelegatedProperty defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitLocalDelegatedProperty[ValueParameterDescriptorImpl]

'descriptor' @ [153:33] ==> public abstract val descriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.ir.declarations.IrLocalDelegatedProperty[PropertyDescriptorImpl]

'declaration' @ [154:21] ==> value-parameter declaration: IrLocalDelegatedProperty defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitLocalDelegatedProperty[ValueParameterDescriptorImpl]

'delegate' @ [154:33] ==> public abstract var delegate: IrVariable defined in org.jetbrains.kotlin.ir.declarations.IrLocalDelegatedProperty[PropertyDescriptorImpl]

'transform' @ [154:42] ==> private final inline fun <reified T : IrElement> IrVariable.transform(): IrVariable defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrVariable

'declaration' @ [155:21] ==> value-parameter declaration: IrLocalDelegatedProperty defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitLocalDelegatedProperty[ValueParameterDescriptorImpl]

'getter' @ [155:33] ==> public abstract var getter: IrFunction defined in org.jetbrains.kotlin.ir.declarations.IrLocalDelegatedProperty[PropertyDescriptorImpl]

'transform' @ [155:40] ==> private final inline fun <reified T : IrElement> IrFunction.transform(): IrFunction defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrFunction

'declaration' @ [156:21] ==> value-parameter declaration: IrLocalDelegatedProperty defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitLocalDelegatedProperty[ValueParameterDescriptorImpl]

'setter' @ [156:33] ==> public abstract var setter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.IrLocalDelegatedProperty[PropertyDescriptorImpl]

'transform' @ [156:41] ==> private final inline fun <reified T : IrElement> IrFunction.transform(): IrFunction defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrFunction

'IrEnumEntryImpl' @ [160:13] ==> public constructor IrEnumEntryImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrEnumEntrySymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrEnumEntryImpl[ClassConstructorDescriptorImpl]

'declaration' @ [161:21] ==> value-parameter declaration: IrEnumEntry defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitEnumEntry[ValueParameterDescriptorImpl]

'startOffset' @ [161:33] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrEnumEntry[PropertyDescriptorImpl]

'declaration' @ [161:46] ==> value-parameter declaration: IrEnumEntry defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitEnumEntry[ValueParameterDescriptorImpl]

'endOffset' @ [161:58] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrEnumEntry[PropertyDescriptorImpl]

'mapDeclarationOrigin' @ [162:21] ==> private final fun mapDeclarationOrigin(origin: IrDeclarationOrigin): IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'declaration' @ [162:42] ==> value-parameter declaration: IrEnumEntry defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitEnumEntry[ValueParameterDescriptorImpl]

'origin' @ [162:54] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrEnumEntry[PropertyDescriptorImpl]

'symbolRemapper' @ [163:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getDeclaredEnumEntry' @ [163:36] ==> public abstract fun getDeclaredEnumEntry(symbol: IrEnumEntrySymbol): IrEnumEntrySymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'declaration' @ [163:57] ==> value-parameter declaration: IrEnumEntry defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitEnumEntry[ValueParameterDescriptorImpl]

'symbol' @ [163:69] ==> public abstract val symbol: IrEnumEntrySymbol defined in org.jetbrains.kotlin.ir.declarations.IrEnumEntry[PropertyDescriptorImpl]

'apply' @ [164:15] ==> @InlineOnly public inline fun <T> IrEnumEntryImpl.apply(block: IrEnumEntryImpl.() -> Unit): IrEnumEntryImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrEnumEntryImpl

'correspondingClass' @ [165:17] ==> public open var correspondingClass: IrClass? defined in org.jetbrains.kotlin.ir.declarations.impl.IrEnumEntryImpl[PropertyDescriptorImpl]

'declaration' @ [165:38] ==> value-parameter declaration: IrEnumEntry defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitEnumEntry[ValueParameterDescriptorImpl]

'correspondingClass' @ [165:50] ==> public abstract var correspondingClass: IrClass? defined in org.jetbrains.kotlin.ir.declarations.IrEnumEntry[PropertyDescriptorImpl]

'transform' @ [165:70] ==> private final inline fun <reified T : IrElement> IrClass.transform(): IrClass defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrClass

'initializerExpression' @ [166:17] ==> public open var initializerExpression: IrExpression? defined in org.jetbrains.kotlin.ir.declarations.impl.IrEnumEntryImpl[PropertyDescriptorImpl]

'declaration' @ [166:41] ==> value-parameter declaration: IrEnumEntry defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitEnumEntry[ValueParameterDescriptorImpl]

'initializerExpression' @ [166:53] ==> public abstract var initializerExpression: IrExpression? defined in org.jetbrains.kotlin.ir.declarations.IrEnumEntry[PropertyDescriptorImpl]

'transform' @ [166:76] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'IrAnonymousInitializerImpl' @ [170:13] ==> public constructor IrAnonymousInitializerImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrAnonymousInitializerSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrAnonymousInitializerImpl[ClassConstructorDescriptorImpl]

'declaration' @ [171:21] ==> value-parameter declaration: IrAnonymousInitializer defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitAnonymousInitializer[ValueParameterDescriptorImpl]

'startOffset' @ [171:33] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrAnonymousInitializer[PropertyDescriptorImpl]

'declaration' @ [171:46] ==> value-parameter declaration: IrAnonymousInitializer defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitAnonymousInitializer[ValueParameterDescriptorImpl]

'endOffset' @ [171:58] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrAnonymousInitializer[PropertyDescriptorImpl]

'mapDeclarationOrigin' @ [172:21] ==> private final fun mapDeclarationOrigin(origin: IrDeclarationOrigin): IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'declaration' @ [172:42] ==> value-parameter declaration: IrAnonymousInitializer defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitAnonymousInitializer[ValueParameterDescriptorImpl]

'origin' @ [172:54] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrAnonymousInitializer[PropertyDescriptorImpl]

'IrAnonymousInitializerSymbolImpl' @ [173:21] ==> public constructor IrAnonymousInitializerSymbolImpl(descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrAnonymousInitializerSymbolImpl[ClassConstructorDescriptorImpl]

'declaration' @ [173:54] ==> value-parameter declaration: IrAnonymousInitializer defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitAnonymousInitializer[ValueParameterDescriptorImpl]

'descriptor' @ [173:66] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrAnonymousInitializer[PropertyDescriptorImpl]

'apply' @ [174:15] ==> @InlineOnly public inline fun <T> IrAnonymousInitializerImpl.apply(block: IrAnonymousInitializerImpl.() -> Unit): IrAnonymousInitializerImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrAnonymousInitializerImpl

'body' @ [175:17] ==> public open lateinit var body: IrBlockBody defined in org.jetbrains.kotlin.ir.declarations.impl.IrAnonymousInitializerImpl[PropertyDescriptorImpl]

'declaration' @ [175:24] ==> value-parameter declaration: IrAnonymousInitializer defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitAnonymousInitializer[ValueParameterDescriptorImpl]

'body' @ [175:36] ==> public abstract var body: IrBlockBody defined in org.jetbrains.kotlin.ir.declarations.IrAnonymousInitializer[PropertyDescriptorImpl]

'transform' @ [175:41] ==> private final inline fun <reified T : IrElement> IrBlockBody.transform(): IrBlockBody defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrBlockBody

'IrVariableImpl' @ [179:13] ==> public constructor IrVariableImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrVariableSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl[ClassConstructorDescriptorImpl]

'declaration' @ [180:21] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitVariable[ValueParameterDescriptorImpl]

'startOffset' @ [180:33] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrVariable[PropertyDescriptorImpl]

'declaration' @ [180:46] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitVariable[ValueParameterDescriptorImpl]

'endOffset' @ [180:58] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrVariable[PropertyDescriptorImpl]

'mapDeclarationOrigin' @ [181:21] ==> private final fun mapDeclarationOrigin(origin: IrDeclarationOrigin): IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'declaration' @ [181:42] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitVariable[ValueParameterDescriptorImpl]

'origin' @ [181:54] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrVariable[PropertyDescriptorImpl]

'symbolRemapper' @ [182:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getDeclaredVariable' @ [182:36] ==> public abstract fun getDeclaredVariable(symbol: IrVariableSymbol): IrVariableSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'declaration' @ [182:56] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitVariable[ValueParameterDescriptorImpl]

'symbol' @ [182:68] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[PropertyDescriptorImpl]

'apply' @ [183:15] ==> @InlineOnly public inline fun <T> IrVariableImpl.apply(block: IrVariableImpl.() -> Unit): IrVariableImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrVariableImpl

'initializer' @ [184:17] ==> public open var initializer: IrExpression? defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl[PropertyDescriptorImpl]

'declaration' @ [184:31] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitVariable[ValueParameterDescriptorImpl]

'initializer' @ [184:43] ==> public abstract var initializer: IrExpression? defined in org.jetbrains.kotlin.ir.declarations.IrVariable[PropertyDescriptorImpl]

'transform' @ [184:56] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'IrTypeParameterImpl' @ [188:13] ==> public constructor IrTypeParameterImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrTypeParameterSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrTypeParameterImpl[ClassConstructorDescriptorImpl]

'declaration' @ [189:21] ==> value-parameter declaration: IrTypeParameter defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTypeParameter[ValueParameterDescriptorImpl]

'startOffset' @ [189:33] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrTypeParameter[PropertyDescriptorImpl]

'declaration' @ [189:46] ==> value-parameter declaration: IrTypeParameter defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTypeParameter[ValueParameterDescriptorImpl]

'endOffset' @ [189:58] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrTypeParameter[PropertyDescriptorImpl]

'mapDeclarationOrigin' @ [190:21] ==> private final fun mapDeclarationOrigin(origin: IrDeclarationOrigin): IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'declaration' @ [190:42] ==> value-parameter declaration: IrTypeParameter defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTypeParameter[ValueParameterDescriptorImpl]

'origin' @ [190:54] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrTypeParameter[PropertyDescriptorImpl]

'symbolRemapper' @ [191:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getDeclaredTypeParameter' @ [191:36] ==> public abstract fun getDeclaredTypeParameter(symbol: IrTypeParameterSymbol): IrTypeParameterSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'declaration' @ [191:61] ==> value-parameter declaration: IrTypeParameter defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTypeParameter[ValueParameterDescriptorImpl]

'symbol' @ [191:73] ==> public abstract val symbol: IrTypeParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrTypeParameter[PropertyDescriptorImpl]

'IrValueParameterImpl' @ [195:13] ==> public constructor IrValueParameterImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrValueParameterSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl[ClassConstructorDescriptorImpl]

'declaration' @ [196:21] ==> value-parameter declaration: IrValueParameter defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitValueParameter[ValueParameterDescriptorImpl]

'startOffset' @ [196:33] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[PropertyDescriptorImpl]

'declaration' @ [196:46] ==> value-parameter declaration: IrValueParameter defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitValueParameter[ValueParameterDescriptorImpl]

'endOffset' @ [196:58] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[PropertyDescriptorImpl]

'mapDeclarationOrigin' @ [197:21] ==> private final fun mapDeclarationOrigin(origin: IrDeclarationOrigin): IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'declaration' @ [197:42] ==> value-parameter declaration: IrValueParameter defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitValueParameter[ValueParameterDescriptorImpl]

'origin' @ [197:54] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[PropertyDescriptorImpl]

'symbolRemapper' @ [198:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getDeclaredValueParameter' @ [198:36] ==> public abstract fun getDeclaredValueParameter(symbol: IrValueParameterSymbol): IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'declaration' @ [198:62] ==> value-parameter declaration: IrValueParameter defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitValueParameter[ValueParameterDescriptorImpl]

'symbol' @ [198:74] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[PropertyDescriptorImpl]

'apply' @ [199:15] ==> @InlineOnly public inline fun <T> IrValueParameterImpl.apply(block: IrValueParameterImpl.() -> Unit): IrValueParameterImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameterImpl

'defaultValue' @ [200:17] ==> public open var defaultValue: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl[PropertyDescriptorImpl]

'declaration' @ [200:32] ==> value-parameter declaration: IrValueParameter defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitValueParameter[ValueParameterDescriptorImpl]

'defaultValue' @ [200:44] ==> public abstract var defaultValue: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[PropertyDescriptorImpl]

'transform' @ [200:58] ==> private final inline fun <reified T : IrElement> IrExpressionBody.transform(): IrExpressionBody defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpressionBody

'IllegalArgumentException' @ [204:19] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'body' @ [204:69] ==> value-parameter body: IrBody defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBody[ValueParameterDescriptorImpl]

'IrExpressionBodyImpl' @ [207:13] ==> public constructor IrExpressionBodyImpl(expression: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl[ClassConstructorDescriptorImpl]

'body' @ [207:34] ==> value-parameter body: IrExpressionBody defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitExpressionBody[ValueParameterDescriptorImpl]

'expression' @ [207:39] ==> public abstract var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpressionBody[PropertyDescriptorImpl]

'transform' @ [207:50] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'IrBlockBodyImpl' @ [210:13] ==> public constructor IrBlockBodyImpl(startOffset: Int, endOffset: Int, statements: List<IrStatement>) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[ClassConstructorDescriptorImpl]

'body' @ [211:21] ==> value-parameter body: IrBlockBody defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBlockBody[ValueParameterDescriptorImpl]

'startOffset' @ [211:26] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrBlockBody[PropertyDescriptorImpl]

'body' @ [211:39] ==> value-parameter body: IrBlockBody defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBlockBody[ValueParameterDescriptorImpl]

'endOffset' @ [211:44] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrBlockBody[PropertyDescriptorImpl]

'body' @ [212:21] ==> value-parameter body: IrBlockBody defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBlockBody[ValueParameterDescriptorImpl]

'statements' @ [212:26] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlockBody[PropertyDescriptorImpl]

'map' @ [212:37] ==> public inline fun <T, R> Iterable<IrStatement>.map(transform: (IrStatement) -> IrStatement): List<IrStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement
    <R> -> IrStatement

'it' @ [212:43] ==> value-parameter it: IrStatement defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBlockBody.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [212:46] ==> private final inline fun <reified T : IrElement> IrStatement.transform(): IrStatement defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrStatement

'IrSyntheticBodyImpl' @ [216:13] ==> public constructor IrSyntheticBodyImpl(startOffset: Int, endOffset: Int, kind: IrSyntheticBodyKind) defined in org.jetbrains.kotlin.ir.expressions.impl.IrSyntheticBodyImpl[ClassConstructorDescriptorImpl]

'body' @ [216:33] ==> value-parameter body: IrSyntheticBody defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSyntheticBody[ValueParameterDescriptorImpl]

'startOffset' @ [216:38] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrSyntheticBody[PropertyDescriptorImpl]

'body' @ [216:51] ==> value-parameter body: IrSyntheticBody defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSyntheticBody[ValueParameterDescriptorImpl]

'endOffset' @ [216:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrSyntheticBody[PropertyDescriptorImpl]

'body' @ [216:67] ==> value-parameter body: IrSyntheticBody defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSyntheticBody[ValueParameterDescriptorImpl]

'kind' @ [216:72] ==> public abstract val kind: IrSyntheticBodyKind defined in org.jetbrains.kotlin.ir.expressions.IrSyntheticBody[PropertyDescriptorImpl]

'IllegalArgumentException' @ [219:19] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'expression' @ [219:75] ==> value-parameter expression: IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitExpression[ValueParameterDescriptorImpl]

'expression' @ [222:13] ==> value-parameter expression: IrConst<T> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitConst[ValueParameterDescriptorImpl]

'copy' @ [222:24] ==> public abstract fun copy(): IrConst<T> defined in org.jetbrains.kotlin.ir.expressions.IrConst[SimpleFunctionDescriptorImpl]

'IrVarargImpl' @ [225:13] ==> public constructor IrVarargImpl(startOffset: Int, endOffset: Int, type: KotlinType, varargElementType: KotlinType, elements: List<IrVarargElement>) defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl[ClassConstructorDescriptorImpl]

'expression' @ [226:21] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitVararg[ValueParameterDescriptorImpl]

'startOffset' @ [226:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrVararg[PropertyDescriptorImpl]

'expression' @ [226:45] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitVararg[ValueParameterDescriptorImpl]

'endOffset' @ [226:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrVararg[PropertyDescriptorImpl]

'expression' @ [227:21] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitVararg[ValueParameterDescriptorImpl]

'type' @ [227:32] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrVararg[PropertyDescriptorImpl]

'expression' @ [227:38] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitVararg[ValueParameterDescriptorImpl]

'varargElementType' @ [227:49] ==> public abstract val varargElementType: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrVararg[PropertyDescriptorImpl]

'expression' @ [228:21] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitVararg[ValueParameterDescriptorImpl]

'elements' @ [228:32] ==> public abstract val elements: List<IrVarargElement> defined in org.jetbrains.kotlin.ir.expressions.IrVararg[PropertyDescriptorImpl]

'transform' @ [228:41] ==> private final inline fun <reified T : IrElement> List<IrVarargElement>.transform(): List<IrVarargElement> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrVarargElement

'IrSpreadElementImpl' @ [232:13] ==> public constructor IrSpreadElementImpl(startOffset: Int, endOffset: Int, expression: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl[ClassConstructorDescriptorImpl]

'spread' @ [233:21] ==> value-parameter spread: IrSpreadElement defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSpreadElement[ValueParameterDescriptorImpl]

'startOffset' @ [233:28] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrSpreadElement[PropertyDescriptorImpl]

'spread' @ [233:41] ==> value-parameter spread: IrSpreadElement defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSpreadElement[ValueParameterDescriptorImpl]

'endOffset' @ [233:48] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrSpreadElement[PropertyDescriptorImpl]

'spread' @ [234:21] ==> value-parameter spread: IrSpreadElement defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSpreadElement[ValueParameterDescriptorImpl]

'expression' @ [234:28] ==> public abstract var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrSpreadElement[PropertyDescriptorImpl]

'transform' @ [234:39] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'IrBlockImpl' @ [238:13] ==> public constructor IrBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin?, statements: List<IrStatement>) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[ClassConstructorDescriptorImpl]

'expression' @ [239:21] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBlock[ValueParameterDescriptorImpl]

'startOffset' @ [239:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrBlock[PropertyDescriptorImpl]

'expression' @ [239:45] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBlock[ValueParameterDescriptorImpl]

'endOffset' @ [239:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrBlock[PropertyDescriptorImpl]

'expression' @ [240:21] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBlock[ValueParameterDescriptorImpl]

'type' @ [240:32] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrBlock[PropertyDescriptorImpl]

'mapStatementOrigin' @ [241:21] ==> private final fun mapStatementOrigin(origin: IrStatementOrigin?): IrStatementOrigin? defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'expression' @ [241:40] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBlock[ValueParameterDescriptorImpl]

'origin' @ [241:51] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrBlock[PropertyDescriptorImpl]

'expression' @ [242:21] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBlock[ValueParameterDescriptorImpl]

'statements' @ [242:32] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlock[PropertyDescriptorImpl]

'map' @ [242:43] ==> public inline fun <T, R> Iterable<IrStatement>.map(transform: (IrStatement) -> IrStatement): List<IrStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement
    <R> -> IrStatement

'it' @ [242:49] ==> value-parameter it: IrStatement defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBlock.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [242:52] ==> private final inline fun <reified T : IrElement> IrStatement.transform(): IrStatement defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrStatement

'IrCompositeImpl' @ [246:13] ==> public constructor IrCompositeImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin?, statements: List<IrStatement>) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCompositeImpl[ClassConstructorDescriptorImpl]

'expression' @ [247:21] ==> value-parameter expression: IrComposite defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitComposite[ValueParameterDescriptorImpl]

'startOffset' @ [247:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrComposite[PropertyDescriptorImpl]

'expression' @ [247:45] ==> value-parameter expression: IrComposite defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitComposite[ValueParameterDescriptorImpl]

'endOffset' @ [247:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrComposite[PropertyDescriptorImpl]

'expression' @ [248:21] ==> value-parameter expression: IrComposite defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitComposite[ValueParameterDescriptorImpl]

'type' @ [248:32] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrComposite[PropertyDescriptorImpl]

'mapStatementOrigin' @ [249:21] ==> private final fun mapStatementOrigin(origin: IrStatementOrigin?): IrStatementOrigin? defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'expression' @ [249:40] ==> value-parameter expression: IrComposite defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitComposite[ValueParameterDescriptorImpl]

'origin' @ [249:51] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrComposite[PropertyDescriptorImpl]

'expression' @ [250:21] ==> value-parameter expression: IrComposite defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitComposite[ValueParameterDescriptorImpl]

'statements' @ [250:32] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrComposite[PropertyDescriptorImpl]

'map' @ [250:43] ==> public inline fun <T, R> Iterable<IrStatement>.map(transform: (IrStatement) -> IrStatement): List<IrStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement
    <R> -> IrStatement

'it' @ [250:49] ==> value-parameter it: IrStatement defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitComposite.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [250:52] ==> private final inline fun <reified T : IrElement> IrStatement.transform(): IrStatement defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrStatement

'IrStringConcatenationImpl' @ [254:13] ==> public constructor IrStringConcatenationImpl(startOffset: Int, endOffset: Int, type: KotlinType, arguments: Collection<IrExpression>) defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl[ClassConstructorDescriptorImpl]

'expression' @ [255:21] ==> value-parameter expression: IrStringConcatenation defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitStringConcatenation[ValueParameterDescriptorImpl]

'startOffset' @ [255:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrStringConcatenation[PropertyDescriptorImpl]

'expression' @ [255:45] ==> value-parameter expression: IrStringConcatenation defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitStringConcatenation[ValueParameterDescriptorImpl]

'endOffset' @ [255:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrStringConcatenation[PropertyDescriptorImpl]

'expression' @ [256:21] ==> value-parameter expression: IrStringConcatenation defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitStringConcatenation[ValueParameterDescriptorImpl]

'type' @ [256:32] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrStringConcatenation[PropertyDescriptorImpl]

'expression' @ [257:21] ==> value-parameter expression: IrStringConcatenation defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitStringConcatenation[ValueParameterDescriptorImpl]

'arguments' @ [257:32] ==> public abstract val arguments: List<IrExpression> defined in org.jetbrains.kotlin.ir.expressions.IrStringConcatenation[PropertyDescriptorImpl]

'map' @ [257:42] ==> public inline fun <T, R> Iterable<IrExpression>.map(transform: (IrExpression) -> IrExpression): List<IrExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression
    <R> -> IrExpression

'it' @ [257:48] ==> value-parameter it: IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitStringConcatenation.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [257:51] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'IrGetObjectValueImpl' @ [261:13] ==> public constructor IrGetObjectValueImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrClassSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetObjectValueImpl[ClassConstructorDescriptorImpl]

'expression' @ [262:21] ==> value-parameter expression: IrGetObjectValue defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetObjectValue[ValueParameterDescriptorImpl]

'startOffset' @ [262:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetObjectValue[PropertyDescriptorImpl]

'expression' @ [262:45] ==> value-parameter expression: IrGetObjectValue defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetObjectValue[ValueParameterDescriptorImpl]

'endOffset' @ [262:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetObjectValue[PropertyDescriptorImpl]

'expression' @ [263:21] ==> value-parameter expression: IrGetObjectValue defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetObjectValue[ValueParameterDescriptorImpl]

'type' @ [263:32] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrGetObjectValue[PropertyDescriptorImpl]

'symbolRemapper' @ [264:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedClass' @ [264:36] ==> public abstract fun getReferencedClass(symbol: IrClassSymbol): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [264:55] ==> value-parameter expression: IrGetObjectValue defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetObjectValue[ValueParameterDescriptorImpl]

'symbol' @ [264:66] ==> public abstract val symbol: IrClassSymbol defined in org.jetbrains.kotlin.ir.expressions.IrGetObjectValue[PropertyDescriptorImpl]

'IrGetEnumValueImpl' @ [268:13] ==> public constructor IrGetEnumValueImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrEnumEntrySymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetEnumValueImpl[ClassConstructorDescriptorImpl]

'expression' @ [269:21] ==> value-parameter expression: IrGetEnumValue defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetEnumValue[ValueParameterDescriptorImpl]

'startOffset' @ [269:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetEnumValue[PropertyDescriptorImpl]

'expression' @ [269:45] ==> value-parameter expression: IrGetEnumValue defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetEnumValue[ValueParameterDescriptorImpl]

'endOffset' @ [269:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetEnumValue[PropertyDescriptorImpl]

'expression' @ [270:21] ==> value-parameter expression: IrGetEnumValue defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetEnumValue[ValueParameterDescriptorImpl]

'type' @ [270:32] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrGetEnumValue[PropertyDescriptorImpl]

'symbolRemapper' @ [271:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedEnumEntry' @ [271:36] ==> public abstract fun getReferencedEnumEntry(symbol: IrEnumEntrySymbol): IrEnumEntrySymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [271:59] ==> value-parameter expression: IrGetEnumValue defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetEnumValue[ValueParameterDescriptorImpl]

'symbol' @ [271:70] ==> public abstract val symbol: IrEnumEntrySymbol defined in org.jetbrains.kotlin.ir.expressions.IrGetEnumValue[PropertyDescriptorImpl]

'IrGetValueImpl' @ [275:13] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[ClassConstructorDescriptorImpl]

'expression' @ [276:21] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetValue[ValueParameterDescriptorImpl]

'startOffset' @ [276:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[PropertyDescriptorImpl]

'expression' @ [276:45] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetValue[ValueParameterDescriptorImpl]

'endOffset' @ [276:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[PropertyDescriptorImpl]

'symbolRemapper' @ [277:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedValue' @ [277:36] ==> public abstract fun getReferencedValue(symbol: IrValueSymbol): IrValueSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [277:55] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetValue[ValueParameterDescriptorImpl]

'symbol' @ [277:66] ==> public abstract val symbol: IrValueSymbol defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[PropertyDescriptorImpl]

'mapStatementOrigin' @ [278:21] ==> private final fun mapStatementOrigin(origin: IrStatementOrigin?): IrStatementOrigin? defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'expression' @ [278:40] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetValue[ValueParameterDescriptorImpl]

'origin' @ [278:51] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[PropertyDescriptorImpl]

'IrSetVariableImpl' @ [282:13] ==> public constructor IrSetVariableImpl(startOffset: Int, endOffset: Int, symbol: IrVariableSymbol, value: IrExpression, origin: IrStatementOrigin?) defined in org.jetbrains.kotlin.ir.expressions.impl.IrSetVariableImpl[ClassConstructorDescriptorImpl]

'expression' @ [283:21] ==> value-parameter expression: IrSetVariable defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSetVariable[ValueParameterDescriptorImpl]

'startOffset' @ [283:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrSetVariable[PropertyDescriptorImpl]

'expression' @ [283:45] ==> value-parameter expression: IrSetVariable defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSetVariable[ValueParameterDescriptorImpl]

'endOffset' @ [283:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrSetVariable[PropertyDescriptorImpl]

'symbolRemapper' @ [284:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedVariable' @ [284:36] ==> public abstract fun getReferencedVariable(symbol: IrVariableSymbol): IrVariableSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [284:58] ==> value-parameter expression: IrSetVariable defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSetVariable[ValueParameterDescriptorImpl]

'symbol' @ [284:69] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.expressions.IrSetVariable[PropertyDescriptorImpl]

'expression' @ [285:21] ==> value-parameter expression: IrSetVariable defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSetVariable[ValueParameterDescriptorImpl]

'value' @ [285:32] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrSetVariable[PropertyDescriptorImpl]

'transform' @ [285:38] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'mapStatementOrigin' @ [286:21] ==> private final fun mapStatementOrigin(origin: IrStatementOrigin?): IrStatementOrigin? defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'expression' @ [286:40] ==> value-parameter expression: IrSetVariable defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSetVariable[ValueParameterDescriptorImpl]

'origin' @ [286:51] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrSetVariable[PropertyDescriptorImpl]

'IrGetFieldImpl' @ [290:13] ==> public constructor IrGetFieldImpl(startOffset: Int, endOffset: Int, symbol: IrFieldSymbol, receiver: IrExpression?, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetFieldImpl[ClassConstructorDescriptorImpl]

'expression' @ [291:21] ==> value-parameter expression: IrGetField defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetField[ValueParameterDescriptorImpl]

'startOffset' @ [291:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetField[PropertyDescriptorImpl]

'expression' @ [291:45] ==> value-parameter expression: IrGetField defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetField[ValueParameterDescriptorImpl]

'endOffset' @ [291:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetField[PropertyDescriptorImpl]

'symbolRemapper' @ [292:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedField' @ [292:36] ==> public abstract fun getReferencedField(symbol: IrFieldSymbol): IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [292:55] ==> value-parameter expression: IrGetField defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetField[ValueParameterDescriptorImpl]

'symbol' @ [292:66] ==> public abstract val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.ir.expressions.IrGetField[PropertyDescriptorImpl]

'expression' @ [293:21] ==> value-parameter expression: IrGetField defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetField[ValueParameterDescriptorImpl]

'receiver' @ [293:32] ==> public abstract var receiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrGetField[PropertyDescriptorImpl]

'transform' @ [293:42] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'mapStatementOrigin' @ [294:21] ==> private final fun mapStatementOrigin(origin: IrStatementOrigin?): IrStatementOrigin? defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'expression' @ [294:40] ==> value-parameter expression: IrGetField defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetField[ValueParameterDescriptorImpl]

'origin' @ [294:51] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrGetField[PropertyDescriptorImpl]

'symbolRemapper' @ [295:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedClassOrNull' @ [295:36] ==> public abstract fun getReferencedClassOrNull(symbol: IrClassSymbol?): IrClassSymbol? defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [295:61] ==> value-parameter expression: IrGetField defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetField[ValueParameterDescriptorImpl]

'superQualifierSymbol' @ [295:72] ==> public abstract val superQualifierSymbol: IrClassSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrGetField[PropertyDescriptorImpl]

'IrSetFieldImpl' @ [299:13] ==> public constructor IrSetFieldImpl(startOffset: Int, endOffset: Int, symbol: IrFieldSymbol, receiver: IrExpression?, value: IrExpression, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrSetFieldImpl[ClassConstructorDescriptorImpl]

'expression' @ [300:21] ==> value-parameter expression: IrSetField defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSetField[ValueParameterDescriptorImpl]

'startOffset' @ [300:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrSetField[PropertyDescriptorImpl]

'expression' @ [300:45] ==> value-parameter expression: IrSetField defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSetField[ValueParameterDescriptorImpl]

'endOffset' @ [300:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrSetField[PropertyDescriptorImpl]

'symbolRemapper' @ [301:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedField' @ [301:36] ==> public abstract fun getReferencedField(symbol: IrFieldSymbol): IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [301:55] ==> value-parameter expression: IrSetField defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSetField[ValueParameterDescriptorImpl]

'symbol' @ [301:66] ==> public abstract val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.ir.expressions.IrSetField[PropertyDescriptorImpl]

'expression' @ [302:21] ==> value-parameter expression: IrSetField defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSetField[ValueParameterDescriptorImpl]

'receiver' @ [302:32] ==> public abstract var receiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrSetField[PropertyDescriptorImpl]

'transform' @ [302:42] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'expression' @ [303:21] ==> value-parameter expression: IrSetField defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSetField[ValueParameterDescriptorImpl]

'value' @ [303:32] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrSetField[PropertyDescriptorImpl]

'transform' @ [303:38] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'mapStatementOrigin' @ [304:21] ==> private final fun mapStatementOrigin(origin: IrStatementOrigin?): IrStatementOrigin? defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'expression' @ [304:40] ==> value-parameter expression: IrSetField defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSetField[ValueParameterDescriptorImpl]

'origin' @ [304:51] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrSetField[PropertyDescriptorImpl]

'symbolRemapper' @ [305:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedClassOrNull' @ [305:36] ==> public abstract fun getReferencedClassOrNull(symbol: IrClassSymbol?): IrClassSymbol? defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [305:61] ==> value-parameter expression: IrSetField defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitSetField[ValueParameterDescriptorImpl]

'superQualifierSymbol' @ [305:72] ==> public abstract val superQualifierSymbol: IrClassSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrSetField[PropertyDescriptorImpl]

'shallowCopyCall' @ [309:13] ==> private final fun shallowCopyCall(expression: IrCall): IrCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'expression' @ [309:29] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitCall[ValueParameterDescriptorImpl]

'transformValueArguments' @ [309:41] ==> private final fun <T : IrMemberAccessExpression> IrCall.transformValueArguments(original: IrCall): IrCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrMemberAccessExpression> -> IrCall

'expression' @ [309:65] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitCall[ValueParameterDescriptorImpl]

'when (expression) {
                is IrCallWithShallowCopy ->
                    expression.shallowCopy(
                            mapStatementOrigin(expression.origin),
                            symbolRemapper.getReferencedFunction(expression.symbol),
                            symbolRemapper.getReferencedClassOrNull(expression.superQualifierSymbol)
                    )
                else ->
                    IrCallImpl(
                            expression.startOffset, expression.endOffset,
                            expression.type,
                            symbolRemapper.getReferencedFunction(expression.symbol),
                            expression.descriptor, // TODO substitute referenced descriptor
                            expression.getTypeArgumentsMap(),
                            mapStatementOrigin(expression.origin),
                            symbolRemapper.getReferencedClassOrNull(expression.superQualifierSymbol)
                    )
            }' @ [312:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrCall, entry1: IrCall): IrCall[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrCall

'expression' @ [312:19] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.shallowCopyCall[ValueParameterDescriptorImpl]

'expression' @ [314:21] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.shallowCopyCall[ValueParameterDescriptorImpl]

'shallowCopy' @ [314:32] ==> public abstract fun shallowCopy(newOrigin: IrStatementOrigin?, newCallee: IrFunctionSymbol, newSuperQualifier: IrClassSymbol?): IrCall defined in org.jetbrains.kotlin.ir.expressions.IrCallWithShallowCopy[SimpleFunctionDescriptorImpl]

'mapStatementOrigin' @ [315:29] ==> private final fun mapStatementOrigin(origin: IrStatementOrigin?): IrStatementOrigin? defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'expression' @ [315:48] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.shallowCopyCall[ValueParameterDescriptorImpl]

'origin' @ [315:59] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrCall[PropertyDescriptorImpl]

'symbolRemapper' @ [316:29] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedFunction' @ [316:44] ==> public abstract fun getReferencedFunction(symbol: IrFunctionSymbol): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [316:66] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.shallowCopyCall[ValueParameterDescriptorImpl]

'symbol' @ [316:77] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.expressions.IrCall[PropertyDescriptorImpl]

'symbolRemapper' @ [317:29] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedClassOrNull' @ [317:44] ==> public abstract fun getReferencedClassOrNull(symbol: IrClassSymbol?): IrClassSymbol? defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [317:69] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.shallowCopyCall[ValueParameterDescriptorImpl]

'superQualifierSymbol' @ [317:80] ==> public abstract val superQualifierSymbol: IrClassSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrCall[PropertyDescriptorImpl]

'IrCallImpl' @ [320:21] ==> public constructor IrCallImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrFunctionSymbol, descriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[ClassConstructorDescriptorImpl]

'expression' @ [321:29] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.shallowCopyCall[ValueParameterDescriptorImpl]

'startOffset' @ [321:40] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrCall[PropertyDescriptorImpl]

'expression' @ [321:53] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.shallowCopyCall[ValueParameterDescriptorImpl]

'endOffset' @ [321:64] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrCall[PropertyDescriptorImpl]

'expression' @ [322:29] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.shallowCopyCall[ValueParameterDescriptorImpl]

'type' @ [322:40] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrCall[PropertyDescriptorImpl]

'symbolRemapper' @ [323:29] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedFunction' @ [323:44] ==> public abstract fun getReferencedFunction(symbol: IrFunctionSymbol): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [323:66] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.shallowCopyCall[ValueParameterDescriptorImpl]

'symbol' @ [323:77] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.expressions.IrCall[PropertyDescriptorImpl]

'expression' @ [324:29] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.shallowCopyCall[ValueParameterDescriptorImpl]

'descriptor' @ [324:40] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCall[PropertyDescriptorImpl]

'expression' @ [325:29] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.shallowCopyCall[ValueParameterDescriptorImpl]

'getTypeArgumentsMap' @ [325:40] ==> private final fun IrMemberAccessExpression.getTypeArgumentsMap(): Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'mapStatementOrigin' @ [326:29] ==> private final fun mapStatementOrigin(origin: IrStatementOrigin?): IrStatementOrigin? defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'expression' @ [326:48] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.shallowCopyCall[ValueParameterDescriptorImpl]

'origin' @ [326:59] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrCall[PropertyDescriptorImpl]

'symbolRemapper' @ [327:29] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedClassOrNull' @ [327:44] ==> public abstract fun getReferencedClassOrNull(symbol: IrClassSymbol?): IrClassSymbol? defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [327:69] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.shallowCopyCall[ValueParameterDescriptorImpl]

'superQualifierSymbol' @ [327:80] ==> public abstract val superQualifierSymbol: IrClassSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrCall[PropertyDescriptorImpl]

'apply' @ [332:13] ==> @InlineOnly public inline fun <T> T.apply(block: T.() -> Unit): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'dispatchReceiver' @ [333:17] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[PropertyDescriptorImpl]

'original' @ [333:36] ==> value-parameter original: T defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.transformReceiverArguments[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [333:45] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[PropertyDescriptorImpl]

'transform' @ [333:63] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'extensionReceiver' @ [334:17] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[PropertyDescriptorImpl]

'original' @ [334:37] ==> value-parameter original: T defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.transformReceiverArguments[ValueParameterDescriptorImpl]

'extensionReceiver' @ [334:46] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[PropertyDescriptorImpl]

'transform' @ [334:65] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'apply' @ [338:13] ==> @InlineOnly public inline fun <T> T.apply(block: T.() -> Unit): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'transformReceiverArguments' @ [339:17] ==> private final fun <T : IrMemberAccessExpression> T.transformReceiverArguments(original: T): T defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrMemberAccessExpression> -> T

'original' @ [339:44] ==> value-parameter original: T defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.transformValueArguments[ValueParameterDescriptorImpl]

'mapValueParameters' @ [340:17] ==> public inline fun <T : IrMemberAccessExpression> T.mapValueParameters(transform: (ValueParameterDescriptor) -> IrExpression?): T defined in org.jetbrains.kotlin.ir.expressions[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrMemberAccessExpression> -> T

'original' @ [341:21] ==> value-parameter original: T defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.transformValueArguments[ValueParameterDescriptorImpl]

'getValueArgument' @ [341:30] ==> public fun IrMemberAccessExpression.getValueArgument(valueParameterDescriptor: ValueParameterDescriptor): IrExpression? defined in org.jetbrains.kotlin.ir.expressions in file IrMemberAccessExpression.kt[SimpleFunctionDescriptorImpl]

'valueParameter' @ [341:47] ==> value-parameter valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.transformValueArguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [341:64] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'this' @ [346:13] ==> <this> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.getTypeArgumentsMap[ReceiverParameterDescriptorImpl]

'typeArguments' @ [346:58] ==> public final val typeArguments: Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.ir.expressions.impl.IrMemberAccessExpressionBase[PropertyDescriptorImpl]

'descriptor' @ [348:30] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[PropertyDescriptorImpl]

'original' @ [348:41] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'typeParameters' @ [348:50] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'if (typeParameters.isEmpty())
            null
        else
            typeParameters.associateBy({ it }, { getTypeArgument(it)!! })' @ [349:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Map<TypeParameterDescriptor, KotlinType>?, elseBranch: Map<TypeParameterDescriptor, KotlinType>?): Map<TypeParameterDescriptor, KotlinType>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Map<TypeParameterDescriptor, KotlinType>?

'typeParameters' @ [349:20] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.getTypeArgumentsMap[LocalVariableDescriptor]

'isEmpty' @ [349:35] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'typeParameters' @ [352:13] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.getTypeArgumentsMap[LocalVariableDescriptor]

'associateBy' @ [352:28] ==> public inline fun <T, K, V> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.associateBy(keySelector: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> TypeParameterDescriptor, valueTransform: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> KotlinType): Map<TypeParameterDescriptor, KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <K> -> TypeParameterDescriptor
    <V> -> KotlinType

'it' @ [352:42] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.getTypeArgumentsMap.<anonymous>[ValueParameterDescriptorImpl]

'getTypeArgument' @ [352:50] ==> public abstract fun getTypeArgument(typeParameterDescriptor: TypeParameterDescriptor): KotlinType? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[SimpleFunctionDescriptorImpl]

'it' @ [352:66] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.getTypeArgumentsMap.<anonymous>[ValueParameterDescriptorImpl]

'IrDelegatingConstructorCallImpl' @ [356:13] ==> public constructor IrDelegatingConstructorCallImpl(startOffset: Int, endOffset: Int, symbol: IrConstructorSymbol, descriptor: ClassConstructorDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl[ClassConstructorDescriptorImpl]

'expression' @ [357:21] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'startOffset' @ [357:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[PropertyDescriptorImpl]

'expression' @ [357:45] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'endOffset' @ [357:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[PropertyDescriptorImpl]

'symbolRemapper' @ [358:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedConstructor' @ [358:36] ==> public abstract fun getReferencedConstructor(symbol: IrConstructorSymbol): IrConstructorSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [358:61] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'symbol' @ [358:72] ==> public abstract val symbol: IrConstructorSymbol defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[PropertyDescriptorImpl]

'expression' @ [359:21] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'descriptor' @ [359:32] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[PropertyDescriptorImpl]

'expression' @ [360:21] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'getTypeArgumentsMap' @ [360:32] ==> private final fun IrMemberAccessExpression.getTypeArgumentsMap(): Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'transformValueArguments' @ [361:15] ==> private final fun <T : IrMemberAccessExpression> IrDelegatingConstructorCall.transformValueArguments(original: IrDelegatingConstructorCall): IrDelegatingConstructorCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrMemberAccessExpression> -> IrDelegatingConstructorCall

'expression' @ [361:39] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'IrEnumConstructorCallImpl' @ [364:13] ==> public constructor IrEnumConstructorCallImpl(startOffset: Int, endOffset: Int, symbol: IrConstructorSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrEnumConstructorCallImpl[ClassConstructorDescriptorImpl]

'expression' @ [365:21] ==> value-parameter expression: IrEnumConstructorCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitEnumConstructorCall[ValueParameterDescriptorImpl]

'startOffset' @ [365:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrEnumConstructorCall[PropertyDescriptorImpl]

'expression' @ [365:45] ==> value-parameter expression: IrEnumConstructorCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitEnumConstructorCall[ValueParameterDescriptorImpl]

'endOffset' @ [365:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrEnumConstructorCall[PropertyDescriptorImpl]

'symbolRemapper' @ [366:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedConstructor' @ [366:36] ==> public abstract fun getReferencedConstructor(symbol: IrConstructorSymbol): IrConstructorSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [366:61] ==> value-parameter expression: IrEnumConstructorCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitEnumConstructorCall[ValueParameterDescriptorImpl]

'symbol' @ [366:72] ==> public abstract val symbol: IrConstructorSymbol defined in org.jetbrains.kotlin.ir.expressions.IrEnumConstructorCall[PropertyDescriptorImpl]

'transformValueArguments' @ [367:15] ==> private final fun <T : IrMemberAccessExpression> IrEnumConstructorCall.transformValueArguments(original: IrEnumConstructorCall): IrEnumConstructorCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrMemberAccessExpression> -> IrEnumConstructorCall

'expression' @ [367:39] ==> value-parameter expression: IrEnumConstructorCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitEnumConstructorCall[ValueParameterDescriptorImpl]

'IrGetClassImpl' @ [370:13] ==> public constructor IrGetClassImpl(startOffset: Int, endOffset: Int, type: KotlinType, argument: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetClassImpl[ClassConstructorDescriptorImpl]

'expression' @ [371:21] ==> value-parameter expression: IrGetClass defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetClass[ValueParameterDescriptorImpl]

'startOffset' @ [371:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetClass[PropertyDescriptorImpl]

'expression' @ [371:45] ==> value-parameter expression: IrGetClass defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetClass[ValueParameterDescriptorImpl]

'endOffset' @ [371:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetClass[PropertyDescriptorImpl]

'expression' @ [372:21] ==> value-parameter expression: IrGetClass defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetClass[ValueParameterDescriptorImpl]

'type' @ [372:32] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrGetClass[PropertyDescriptorImpl]

'expression' @ [373:21] ==> value-parameter expression: IrGetClass defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitGetClass[ValueParameterDescriptorImpl]

'argument' @ [373:32] ==> public abstract var argument: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrGetClass[PropertyDescriptorImpl]

'transform' @ [373:41] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'IrFunctionReferenceImpl' @ [377:13] ==> public constructor IrFunctionReferenceImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrFunctionSymbol, descriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrFunctionReferenceImpl[ClassConstructorDescriptorImpl]

'expression' @ [378:21] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitFunctionReference[ValueParameterDescriptorImpl]

'startOffset' @ [378:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[PropertyDescriptorImpl]

'expression' @ [378:45] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitFunctionReference[ValueParameterDescriptorImpl]

'endOffset' @ [378:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[PropertyDescriptorImpl]

'expression' @ [379:21] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitFunctionReference[ValueParameterDescriptorImpl]

'type' @ [379:32] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[PropertyDescriptorImpl]

'symbolRemapper' @ [380:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedFunction' @ [380:36] ==> public abstract fun getReferencedFunction(symbol: IrFunctionSymbol): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [380:58] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitFunctionReference[ValueParameterDescriptorImpl]

'symbol' @ [380:69] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[PropertyDescriptorImpl]

'expression' @ [381:21] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitFunctionReference[ValueParameterDescriptorImpl]

'descriptor' @ [381:32] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[PropertyDescriptorImpl]

'expression' @ [382:21] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitFunctionReference[ValueParameterDescriptorImpl]

'getTypeArgumentsMap' @ [382:32] ==> private final fun IrMemberAccessExpression.getTypeArgumentsMap(): Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'mapStatementOrigin' @ [383:21] ==> private final fun mapStatementOrigin(origin: IrStatementOrigin?): IrStatementOrigin? defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'expression' @ [383:40] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitFunctionReference[ValueParameterDescriptorImpl]

'origin' @ [383:51] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[PropertyDescriptorImpl]

'transformValueArguments' @ [384:15] ==> private final fun <T : IrMemberAccessExpression> IrFunctionReference.transformValueArguments(original: IrFunctionReference): IrFunctionReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrMemberAccessExpression> -> IrFunctionReference

'expression' @ [384:39] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitFunctionReference[ValueParameterDescriptorImpl]

'IrPropertyReferenceImpl' @ [387:13] ==> public constructor IrPropertyReferenceImpl(startOffset: Int, endOffset: Int, type: KotlinType, descriptor: PropertyDescriptor, field: IrFieldSymbol?, getter: IrFunctionSymbol?, setter: IrFunctionSymbol?, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrPropertyReferenceImpl[ClassConstructorDescriptorImpl]

'expression' @ [388:21] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitPropertyReference[ValueParameterDescriptorImpl]

'startOffset' @ [388:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[PropertyDescriptorImpl]

'expression' @ [388:45] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitPropertyReference[ValueParameterDescriptorImpl]

'endOffset' @ [388:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[PropertyDescriptorImpl]

'expression' @ [389:21] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitPropertyReference[ValueParameterDescriptorImpl]

'type' @ [389:32] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[PropertyDescriptorImpl]

'expression' @ [390:21] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitPropertyReference[ValueParameterDescriptorImpl]

'descriptor' @ [390:32] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[PropertyDescriptorImpl]

'expression' @ [391:21] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitPropertyReference[ValueParameterDescriptorImpl]

'field' @ [391:32] ==> public abstract val field: IrFieldSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[PropertyDescriptorImpl]

'let' @ [391:39] ==> @InlineOnly public inline fun <T, R> IrFieldSymbol.let(block: (IrFieldSymbol) -> IrFieldSymbol): IrFieldSymbol defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFieldSymbol
    <R> -> IrFieldSymbol

'symbolRemapper' @ [391:45] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedField' @ [391:60] ==> public abstract fun getReferencedField(symbol: IrFieldSymbol): IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'it' @ [391:79] ==> value-parameter it: IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitPropertyReference.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [392:21] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitPropertyReference[ValueParameterDescriptorImpl]

'getter' @ [392:32] ==> public abstract val getter: IrFunctionSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[PropertyDescriptorImpl]

'let' @ [392:40] ==> @InlineOnly public inline fun <T, R> IrFunctionSymbol.let(block: (IrFunctionSymbol) -> IrFunctionSymbol): IrFunctionSymbol defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFunctionSymbol
    <R> -> IrFunctionSymbol

'symbolRemapper' @ [392:46] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedFunction' @ [392:61] ==> public abstract fun getReferencedFunction(symbol: IrFunctionSymbol): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'it' @ [392:83] ==> value-parameter it: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitPropertyReference.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [393:21] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitPropertyReference[ValueParameterDescriptorImpl]

'setter' @ [393:32] ==> public abstract val setter: IrFunctionSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[PropertyDescriptorImpl]

'let' @ [393:40] ==> @InlineOnly public inline fun <T, R> IrFunctionSymbol.let(block: (IrFunctionSymbol) -> IrFunctionSymbol): IrFunctionSymbol defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFunctionSymbol
    <R> -> IrFunctionSymbol

'symbolRemapper' @ [393:46] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedFunction' @ [393:61] ==> public abstract fun getReferencedFunction(symbol: IrFunctionSymbol): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'it' @ [393:83] ==> value-parameter it: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitPropertyReference.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [394:21] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitPropertyReference[ValueParameterDescriptorImpl]

'getTypeArgumentsMap' @ [394:32] ==> private final fun IrMemberAccessExpression.getTypeArgumentsMap(): Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'mapStatementOrigin' @ [395:21] ==> private final fun mapStatementOrigin(origin: IrStatementOrigin?): IrStatementOrigin? defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'expression' @ [395:40] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitPropertyReference[ValueParameterDescriptorImpl]

'origin' @ [395:51] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[PropertyDescriptorImpl]

'transformReceiverArguments' @ [396:15] ==> private final fun <T : IrMemberAccessExpression> IrPropertyReference.transformReceiverArguments(original: IrPropertyReference): IrPropertyReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrMemberAccessExpression> -> IrPropertyReference

'expression' @ [396:42] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitPropertyReference[ValueParameterDescriptorImpl]

'IrLocalDelegatedPropertyReferenceImpl' @ [399:13] ==> public constructor IrLocalDelegatedPropertyReferenceImpl(startOffset: Int, endOffset: Int, type: KotlinType, descriptor: VariableDescriptorWithAccessors, delegate: IrVariableSymbol, getter: IrFunctionSymbol, setter: IrFunctionSymbol?, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrLocalDelegatedPropertyReferenceImpl[ClassConstructorDescriptorImpl]

'expression' @ [400:21] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'startOffset' @ [400:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[PropertyDescriptorImpl]

'expression' @ [400:45] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'endOffset' @ [400:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[PropertyDescriptorImpl]

'expression' @ [401:21] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'type' @ [401:32] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[PropertyDescriptorImpl]

'expression' @ [402:21] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'descriptor' @ [402:32] ==> public abstract val descriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[PropertyDescriptorImpl]

'symbolRemapper' @ [403:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedVariable' @ [403:36] ==> public abstract fun getReferencedVariable(symbol: IrVariableSymbol): IrVariableSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [403:58] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'delegate' @ [403:69] ==> public abstract val delegate: IrVariableSymbol defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[PropertyDescriptorImpl]

'symbolRemapper' @ [404:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedFunction' @ [404:36] ==> public abstract fun getReferencedFunction(symbol: IrFunctionSymbol): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [404:58] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'getter' @ [404:69] ==> public abstract val getter: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[PropertyDescriptorImpl]

'expression' @ [405:21] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'setter' @ [405:32] ==> public abstract val setter: IrFunctionSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[PropertyDescriptorImpl]

'let' @ [405:40] ==> @InlineOnly public inline fun <T, R> IrFunctionSymbol.let(block: (IrFunctionSymbol) -> IrFunctionSymbol): IrFunctionSymbol defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFunctionSymbol
    <R> -> IrFunctionSymbol

'symbolRemapper' @ [405:46] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedFunction' @ [405:61] ==> public abstract fun getReferencedFunction(symbol: IrFunctionSymbol): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'it' @ [405:83] ==> value-parameter it: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitLocalDelegatedPropertyReference.<anonymous>[ValueParameterDescriptorImpl]

'mapStatementOrigin' @ [406:21] ==> private final fun mapStatementOrigin(origin: IrStatementOrigin?): IrStatementOrigin? defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'expression' @ [406:40] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'origin' @ [406:51] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[PropertyDescriptorImpl]

'IrClassReferenceImpl' @ [410:13] ==> public constructor IrClassReferenceImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrClassifierSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrClassReferenceImpl[ClassConstructorDescriptorImpl]

'expression' @ [411:21] ==> value-parameter expression: IrClassReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitClassReference[ValueParameterDescriptorImpl]

'startOffset' @ [411:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrClassReference[PropertyDescriptorImpl]

'expression' @ [411:45] ==> value-parameter expression: IrClassReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitClassReference[ValueParameterDescriptorImpl]

'endOffset' @ [411:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrClassReference[PropertyDescriptorImpl]

'expression' @ [412:21] ==> value-parameter expression: IrClassReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitClassReference[ValueParameterDescriptorImpl]

'type' @ [412:32] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrClassReference[PropertyDescriptorImpl]

'symbolRemapper' @ [413:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedClassifier' @ [413:36] ==> public abstract fun getReferencedClassifier(symbol: IrClassifierSymbol): IrClassifierSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [413:60] ==> value-parameter expression: IrClassReference defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitClassReference[ValueParameterDescriptorImpl]

'symbol' @ [413:71] ==> public abstract val symbol: IrClassifierSymbol defined in org.jetbrains.kotlin.ir.expressions.IrClassReference[PropertyDescriptorImpl]

'IrInstanceInitializerCallImpl' @ [417:13] ==> public constructor IrInstanceInitializerCallImpl(startOffset: Int, endOffset: Int, classSymbol: IrClassSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrInstanceInitializerCallImpl[ClassConstructorDescriptorImpl]

'expression' @ [418:21] ==> value-parameter expression: IrInstanceInitializerCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitInstanceInitializerCall[ValueParameterDescriptorImpl]

'startOffset' @ [418:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrInstanceInitializerCall[PropertyDescriptorImpl]

'expression' @ [418:45] ==> value-parameter expression: IrInstanceInitializerCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitInstanceInitializerCall[ValueParameterDescriptorImpl]

'endOffset' @ [418:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrInstanceInitializerCall[PropertyDescriptorImpl]

'symbolRemapper' @ [419:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedClass' @ [419:36] ==> public abstract fun getReferencedClass(symbol: IrClassSymbol): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [419:55] ==> value-parameter expression: IrInstanceInitializerCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitInstanceInitializerCall[ValueParameterDescriptorImpl]

'classSymbol' @ [419:66] ==> public abstract val classSymbol: IrClassSymbol defined in org.jetbrains.kotlin.ir.expressions.IrInstanceInitializerCall[PropertyDescriptorImpl]

'IrTypeOperatorCallImpl' @ [423:13] ==> public constructor IrTypeOperatorCallImpl(startOffset: Int, endOffset: Int, type: KotlinType, operator: IrTypeOperator, typeOperand: KotlinType, argument: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrTypeOperatorCallImpl[ClassConstructorDescriptorImpl]

'expression' @ [424:21] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTypeOperator[ValueParameterDescriptorImpl]

'startOffset' @ [424:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[PropertyDescriptorImpl]

'expression' @ [424:45] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTypeOperator[ValueParameterDescriptorImpl]

'endOffset' @ [424:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[PropertyDescriptorImpl]

'expression' @ [425:21] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTypeOperator[ValueParameterDescriptorImpl]

'type' @ [425:32] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[PropertyDescriptorImpl]

'expression' @ [426:21] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTypeOperator[ValueParameterDescriptorImpl]

'operator' @ [426:32] ==> public abstract val operator: IrTypeOperator defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[PropertyDescriptorImpl]

'expression' @ [427:21] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTypeOperator[ValueParameterDescriptorImpl]

'typeOperand' @ [427:32] ==> public abstract val typeOperand: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[PropertyDescriptorImpl]

'expression' @ [428:21] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTypeOperator[ValueParameterDescriptorImpl]

'argument' @ [428:32] ==> public abstract var argument: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[PropertyDescriptorImpl]

'transform' @ [428:41] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'IrWhenImpl' @ [432:13] ==> public constructor IrWhenImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin?, branches: List<IrBranch>) defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl[ClassConstructorDescriptorImpl]

'expression' @ [433:21] ==> value-parameter expression: IrWhen defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitWhen[ValueParameterDescriptorImpl]

'startOffset' @ [433:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrWhen[PropertyDescriptorImpl]

'expression' @ [433:45] ==> value-parameter expression: IrWhen defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitWhen[ValueParameterDescriptorImpl]

'endOffset' @ [433:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrWhen[PropertyDescriptorImpl]

'expression' @ [434:21] ==> value-parameter expression: IrWhen defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitWhen[ValueParameterDescriptorImpl]

'type' @ [434:32] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrWhen[PropertyDescriptorImpl]

'mapStatementOrigin' @ [435:21] ==> private final fun mapStatementOrigin(origin: IrStatementOrigin?): IrStatementOrigin? defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'expression' @ [435:40] ==> value-parameter expression: IrWhen defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitWhen[ValueParameterDescriptorImpl]

'origin' @ [435:51] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrWhen[PropertyDescriptorImpl]

'expression' @ [436:21] ==> value-parameter expression: IrWhen defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitWhen[ValueParameterDescriptorImpl]

'branches' @ [436:32] ==> public abstract val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.IrWhen[PropertyDescriptorImpl]

'map' @ [436:41] ==> public inline fun <T, R> Iterable<IrBranch>.map(transform: (IrBranch) -> IrBranch): List<IrBranch> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrBranch
    <R> -> IrBranch

'it' @ [436:47] ==> value-parameter it: IrBranch defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitWhen.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [436:50] ==> private final inline fun <reified T : IrElement> IrBranch.transform(): IrBranch defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrBranch

'IrBranchImpl' @ [440:13] ==> public constructor IrBranchImpl(startOffset: Int, endOffset: Int, condition: IrExpression, result: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl[ClassConstructorDescriptorImpl]

'branch' @ [441:21] ==> value-parameter branch: IrBranch defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBranch[ValueParameterDescriptorImpl]

'startOffset' @ [441:28] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrBranch[PropertyDescriptorImpl]

'branch' @ [441:41] ==> value-parameter branch: IrBranch defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBranch[ValueParameterDescriptorImpl]

'endOffset' @ [441:48] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrBranch[PropertyDescriptorImpl]

'branch' @ [442:21] ==> value-parameter branch: IrBranch defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBranch[ValueParameterDescriptorImpl]

'condition' @ [442:28] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrBranch[PropertyDescriptorImpl]

'transform' @ [442:38] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'branch' @ [443:21] ==> value-parameter branch: IrBranch defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBranch[ValueParameterDescriptorImpl]

'result' @ [443:28] ==> public abstract var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrBranch[PropertyDescriptorImpl]

'transform' @ [443:35] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'IrElseBranchImpl' @ [447:13] ==> public constructor IrElseBranchImpl(startOffset: Int, endOffset: Int, condition: IrExpression, result: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrElseBranchImpl[ClassConstructorDescriptorImpl]

'branch' @ [448:21] ==> value-parameter branch: IrElseBranch defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitElseBranch[ValueParameterDescriptorImpl]

'startOffset' @ [448:28] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrElseBranch[PropertyDescriptorImpl]

'branch' @ [448:41] ==> value-parameter branch: IrElseBranch defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitElseBranch[ValueParameterDescriptorImpl]

'endOffset' @ [448:48] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrElseBranch[PropertyDescriptorImpl]

'branch' @ [449:21] ==> value-parameter branch: IrElseBranch defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitElseBranch[ValueParameterDescriptorImpl]

'condition' @ [449:28] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrElseBranch[PropertyDescriptorImpl]

'transform' @ [449:38] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'branch' @ [450:21] ==> value-parameter branch: IrElseBranch defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitElseBranch[ValueParameterDescriptorImpl]

'result' @ [450:28] ==> public abstract var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrElseBranch[PropertyDescriptorImpl]

'transform' @ [450:35] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'HashMap' @ [453:36] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> IrLoop
    <V : (Any..Any?)> -> IrLoop

'transformedLoops' @ [456:13] ==> private final val transformedLoops: HashMap<IrLoop, IrLoop> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getOrElse' @ [456:30] ==> @InlineOnly public inline fun <K, V> Map<IrLoop, IrLoop>.getOrElse(key: IrLoop, defaultValue: () -> IrLoop): IrLoop defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrLoop
    <V> -> IrLoop

'irLoop' @ [456:40] ==> value-parameter irLoop: IrLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.getTransformedLoop[ValueParameterDescriptorImpl]

'getNonTransformedLoop' @ [456:50] ==> protected open fun getNonTransformedLoop(irLoop: IrLoop): IrLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'irLoop' @ [456:72] ==> value-parameter irLoop: IrLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.getTransformedLoop[ValueParameterDescriptorImpl]

'AssertionError' @ [459:19] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'irLoop' @ [459:69] ==> value-parameter irLoop: IrLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.getNonTransformedLoop[ValueParameterDescriptorImpl]

'render' @ [459:76] ==> public fun IrElement.render(): String defined in org.jetbrains.kotlin.ir.util in file RenderIrElement.kt[SimpleFunctionDescriptorImpl]

'IrWhileLoopImpl' @ [462:13] ==> public constructor IrWhileLoopImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin?) defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhileLoopImpl[ClassConstructorDescriptorImpl]

'loop' @ [462:29] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitWhileLoop[ValueParameterDescriptorImpl]

'startOffset' @ [462:34] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrWhileLoop[PropertyDescriptorImpl]

'loop' @ [462:47] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitWhileLoop[ValueParameterDescriptorImpl]

'endOffset' @ [462:52] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrWhileLoop[PropertyDescriptorImpl]

'loop' @ [462:63] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitWhileLoop[ValueParameterDescriptorImpl]

'type' @ [462:68] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrWhileLoop[PropertyDescriptorImpl]

'mapStatementOrigin' @ [462:74] ==> private final fun mapStatementOrigin(origin: IrStatementOrigin?): IrStatementOrigin? defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'loop' @ [462:93] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitWhileLoop[ValueParameterDescriptorImpl]

'origin' @ [462:98] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrWhileLoop[PropertyDescriptorImpl]

'also' @ [462:107] ==> @InlineOnly @SinceKotlin public inline fun <T> IrWhileLoopImpl.also(block: (IrWhileLoopImpl) -> Unit): IrWhileLoopImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrWhileLoopImpl

'transformedLoops' @ [463:17] ==> private final val transformedLoops: HashMap<IrLoop, IrLoop> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'loop' @ [463:34] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitWhileLoop[ValueParameterDescriptorImpl]

'newLoop' @ [463:42] ==> value-parameter newLoop: IrWhileLoopImpl defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitWhileLoop.<anonymous>[ValueParameterDescriptorImpl]

'newLoop' @ [464:17] ==> value-parameter newLoop: IrWhileLoopImpl defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitWhileLoop.<anonymous>[ValueParameterDescriptorImpl]

'label' @ [464:25] ==> public open var label: String? defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhileLoopImpl[PropertyDescriptorImpl]

'loop' @ [464:33] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitWhileLoop[ValueParameterDescriptorImpl]

'label' @ [464:38] ==> public abstract val label: String? defined in org.jetbrains.kotlin.ir.expressions.IrWhileLoop[PropertyDescriptorImpl]

'newLoop' @ [465:17] ==> value-parameter newLoop: IrWhileLoopImpl defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitWhileLoop.<anonymous>[ValueParameterDescriptorImpl]

'condition' @ [465:25] ==> public open lateinit var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhileLoopImpl[PropertyDescriptorImpl]

'loop' @ [465:37] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitWhileLoop[ValueParameterDescriptorImpl]

'condition' @ [465:42] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrWhileLoop[PropertyDescriptorImpl]

'transform' @ [465:52] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'newLoop' @ [466:17] ==> value-parameter newLoop: IrWhileLoopImpl defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitWhileLoop.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [466:25] ==> public open var body: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhileLoopImpl[PropertyDescriptorImpl]

'loop' @ [466:32] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitWhileLoop[ValueParameterDescriptorImpl]

'body' @ [466:37] ==> public abstract var body: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrWhileLoop[PropertyDescriptorImpl]

'transform' @ [466:43] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'IrDoWhileLoopImpl' @ [470:13] ==> public constructor IrDoWhileLoopImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin?) defined in org.jetbrains.kotlin.ir.expressions.impl.IrDoWhileLoopImpl[ClassConstructorDescriptorImpl]

'loop' @ [470:31] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitDoWhileLoop[ValueParameterDescriptorImpl]

'startOffset' @ [470:36] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrDoWhileLoop[PropertyDescriptorImpl]

'loop' @ [470:49] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitDoWhileLoop[ValueParameterDescriptorImpl]

'endOffset' @ [470:54] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrDoWhileLoop[PropertyDescriptorImpl]

'loop' @ [470:65] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitDoWhileLoop[ValueParameterDescriptorImpl]

'type' @ [470:70] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrDoWhileLoop[PropertyDescriptorImpl]

'mapStatementOrigin' @ [470:76] ==> private final fun mapStatementOrigin(origin: IrStatementOrigin?): IrStatementOrigin? defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'loop' @ [470:95] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitDoWhileLoop[ValueParameterDescriptorImpl]

'origin' @ [470:100] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrDoWhileLoop[PropertyDescriptorImpl]

'also' @ [470:109] ==> @InlineOnly @SinceKotlin public inline fun <T> IrDoWhileLoopImpl.also(block: (IrDoWhileLoopImpl) -> Unit): IrDoWhileLoopImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDoWhileLoopImpl

'transformedLoops' @ [471:17] ==> private final val transformedLoops: HashMap<IrLoop, IrLoop> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'loop' @ [471:34] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitDoWhileLoop[ValueParameterDescriptorImpl]

'newLoop' @ [471:42] ==> value-parameter newLoop: IrDoWhileLoopImpl defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitDoWhileLoop.<anonymous>[ValueParameterDescriptorImpl]

'newLoop' @ [472:17] ==> value-parameter newLoop: IrDoWhileLoopImpl defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitDoWhileLoop.<anonymous>[ValueParameterDescriptorImpl]

'label' @ [472:25] ==> public open var label: String? defined in org.jetbrains.kotlin.ir.expressions.impl.IrDoWhileLoopImpl[PropertyDescriptorImpl]

'loop' @ [472:33] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitDoWhileLoop[ValueParameterDescriptorImpl]

'label' @ [472:38] ==> public abstract val label: String? defined in org.jetbrains.kotlin.ir.expressions.IrDoWhileLoop[PropertyDescriptorImpl]

'newLoop' @ [473:17] ==> value-parameter newLoop: IrDoWhileLoopImpl defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitDoWhileLoop.<anonymous>[ValueParameterDescriptorImpl]

'condition' @ [473:25] ==> public open lateinit var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrDoWhileLoopImpl[PropertyDescriptorImpl]

'loop' @ [473:37] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitDoWhileLoop[ValueParameterDescriptorImpl]

'condition' @ [473:42] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrDoWhileLoop[PropertyDescriptorImpl]

'transform' @ [473:52] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'newLoop' @ [474:17] ==> value-parameter newLoop: IrDoWhileLoopImpl defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitDoWhileLoop.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [474:25] ==> public open var body: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrDoWhileLoopImpl[PropertyDescriptorImpl]

'loop' @ [474:32] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitDoWhileLoop[ValueParameterDescriptorImpl]

'body' @ [474:37] ==> public abstract var body: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrDoWhileLoop[PropertyDescriptorImpl]

'transform' @ [474:43] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'IrBreakImpl' @ [478:13] ==> public constructor IrBreakImpl(startOffset: Int, endOffset: Int, type: KotlinType, loop: IrLoop) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBreakImpl[ClassConstructorDescriptorImpl]

'jump' @ [479:21] ==> value-parameter jump: IrBreak defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBreak[ValueParameterDescriptorImpl]

'startOffset' @ [479:26] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrBreak[PropertyDescriptorImpl]

'jump' @ [479:39] ==> value-parameter jump: IrBreak defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBreak[ValueParameterDescriptorImpl]

'endOffset' @ [479:44] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrBreak[PropertyDescriptorImpl]

'jump' @ [480:21] ==> value-parameter jump: IrBreak defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBreak[ValueParameterDescriptorImpl]

'type' @ [480:26] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrBreak[PropertyDescriptorImpl]

'getTransformedLoop' @ [481:21] ==> private final fun getTransformedLoop(irLoop: IrLoop): IrLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'jump' @ [481:40] ==> value-parameter jump: IrBreak defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBreak[ValueParameterDescriptorImpl]

'loop' @ [481:45] ==> public abstract var loop: IrLoop defined in org.jetbrains.kotlin.ir.expressions.IrBreak[PropertyDescriptorImpl]

'apply' @ [482:15] ==> @InlineOnly public inline fun <T> IrBreakImpl.apply(block: IrBreakImpl.() -> Unit): IrBreakImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrBreakImpl

'label' @ [482:23] ==> public open var label: String? defined in org.jetbrains.kotlin.ir.expressions.impl.IrBreakImpl[PropertyDescriptorImpl]

'jump' @ [482:31] ==> value-parameter jump: IrBreak defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitBreak[ValueParameterDescriptorImpl]

'label' @ [482:36] ==> public abstract val label: String? defined in org.jetbrains.kotlin.ir.expressions.IrBreak[PropertyDescriptorImpl]

'IrContinueImpl' @ [485:13] ==> public constructor IrContinueImpl(startOffset: Int, endOffset: Int, type: KotlinType, loop: IrLoop) defined in org.jetbrains.kotlin.ir.expressions.impl.IrContinueImpl[ClassConstructorDescriptorImpl]

'jump' @ [486:21] ==> value-parameter jump: IrContinue defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitContinue[ValueParameterDescriptorImpl]

'startOffset' @ [486:26] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrContinue[PropertyDescriptorImpl]

'jump' @ [486:39] ==> value-parameter jump: IrContinue defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitContinue[ValueParameterDescriptorImpl]

'endOffset' @ [486:44] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrContinue[PropertyDescriptorImpl]

'jump' @ [487:21] ==> value-parameter jump: IrContinue defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitContinue[ValueParameterDescriptorImpl]

'type' @ [487:26] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrContinue[PropertyDescriptorImpl]

'getTransformedLoop' @ [488:21] ==> private final fun getTransformedLoop(irLoop: IrLoop): IrLoop defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]

'jump' @ [488:40] ==> value-parameter jump: IrContinue defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitContinue[ValueParameterDescriptorImpl]

'loop' @ [488:45] ==> public abstract var loop: IrLoop defined in org.jetbrains.kotlin.ir.expressions.IrContinue[PropertyDescriptorImpl]

'apply' @ [489:15] ==> @InlineOnly public inline fun <T> IrContinueImpl.apply(block: IrContinueImpl.() -> Unit): IrContinueImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrContinueImpl

'label' @ [489:23] ==> public open var label: String? defined in org.jetbrains.kotlin.ir.expressions.impl.IrContinueImpl[PropertyDescriptorImpl]

'jump' @ [489:31] ==> value-parameter jump: IrContinue defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitContinue[ValueParameterDescriptorImpl]

'label' @ [489:36] ==> public abstract val label: String? defined in org.jetbrains.kotlin.ir.expressions.IrContinue[PropertyDescriptorImpl]

'IrTryImpl' @ [492:13] ==> public constructor IrTryImpl(startOffset: Int, endOffset: Int, type: KotlinType, tryResult: IrExpression, catches: List<IrCatch>, finallyExpression: IrExpression?) defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[ClassConstructorDescriptorImpl]

'aTry' @ [493:21] ==> value-parameter aTry: IrTry defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTry[ValueParameterDescriptorImpl]

'startOffset' @ [493:26] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrTry[PropertyDescriptorImpl]

'aTry' @ [493:39] ==> value-parameter aTry: IrTry defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTry[ValueParameterDescriptorImpl]

'endOffset' @ [493:44] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrTry[PropertyDescriptorImpl]

'aTry' @ [494:21] ==> value-parameter aTry: IrTry defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTry[ValueParameterDescriptorImpl]

'type' @ [494:26] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrTry[PropertyDescriptorImpl]

'aTry' @ [495:21] ==> value-parameter aTry: IrTry defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTry[ValueParameterDescriptorImpl]

'tryResult' @ [495:26] ==> public abstract var tryResult: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrTry[PropertyDescriptorImpl]

'transform' @ [495:36] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'aTry' @ [496:21] ==> value-parameter aTry: IrTry defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTry[ValueParameterDescriptorImpl]

'catches' @ [496:26] ==> public abstract val catches: List<IrCatch> defined in org.jetbrains.kotlin.ir.expressions.IrTry[PropertyDescriptorImpl]

'map' @ [496:34] ==> public inline fun <T, R> Iterable<IrCatch>.map(transform: (IrCatch) -> IrCatch): List<IrCatch> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCatch
    <R> -> IrCatch

'it' @ [496:40] ==> value-parameter it: IrCatch defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTry.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [496:43] ==> private final inline fun <reified T : IrElement> IrCatch.transform(): IrCatch defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrCatch

'aTry' @ [497:21] ==> value-parameter aTry: IrTry defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitTry[ValueParameterDescriptorImpl]

'finallyExpression' @ [497:26] ==> public abstract var finallyExpression: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrTry[PropertyDescriptorImpl]

'transform' @ [497:45] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'IrCatchImpl' @ [501:13] ==> public constructor IrCatchImpl(startOffset: Int, endOffset: Int, catchParameter: IrVariable, result: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl[ClassConstructorDescriptorImpl]

'aCatch' @ [502:21] ==> value-parameter aCatch: IrCatch defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitCatch[ValueParameterDescriptorImpl]

'startOffset' @ [502:28] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrCatch[PropertyDescriptorImpl]

'aCatch' @ [502:41] ==> value-parameter aCatch: IrCatch defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitCatch[ValueParameterDescriptorImpl]

'endOffset' @ [502:48] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrCatch[PropertyDescriptorImpl]

'aCatch' @ [503:21] ==> value-parameter aCatch: IrCatch defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitCatch[ValueParameterDescriptorImpl]

'catchParameter' @ [503:28] ==> public abstract var catchParameter: IrVariable defined in org.jetbrains.kotlin.ir.expressions.IrCatch[PropertyDescriptorImpl]

'transform' @ [503:43] ==> private final inline fun <reified T : IrElement> IrVariable.transform(): IrVariable defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrVariable

'aCatch' @ [504:21] ==> value-parameter aCatch: IrCatch defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitCatch[ValueParameterDescriptorImpl]

'result' @ [504:28] ==> public abstract var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrCatch[PropertyDescriptorImpl]

'transform' @ [504:35] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'IrReturnImpl' @ [508:13] ==> public constructor IrReturnImpl(startOffset: Int, endOffset: Int, type: KotlinType, returnTargetSymbol: IrFunctionSymbol, value: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnImpl[ClassConstructorDescriptorImpl]

'expression' @ [509:21] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitReturn[ValueParameterDescriptorImpl]

'startOffset' @ [509:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrReturn[PropertyDescriptorImpl]

'expression' @ [509:45] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitReturn[ValueParameterDescriptorImpl]

'endOffset' @ [509:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrReturn[PropertyDescriptorImpl]

'expression' @ [510:21] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitReturn[ValueParameterDescriptorImpl]

'type' @ [510:32] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrReturn[PropertyDescriptorImpl]

'symbolRemapper' @ [511:21] ==> private final val symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[PropertyDescriptorImpl]

'getReferencedFunction' @ [511:36] ==> public abstract fun getReferencedFunction(symbol: IrFunctionSymbol): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolRemapper[SimpleFunctionDescriptorImpl]

'expression' @ [511:58] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitReturn[ValueParameterDescriptorImpl]

'returnTargetSymbol' @ [511:69] ==> public abstract val returnTargetSymbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.expressions.IrReturn[PropertyDescriptorImpl]

'expression' @ [512:21] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitReturn[ValueParameterDescriptorImpl]

'value' @ [512:32] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrReturn[PropertyDescriptorImpl]

'transform' @ [512:38] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'IrThrowImpl' @ [516:13] ==> public constructor IrThrowImpl(startOffset: Int, endOffset: Int, type: KotlinType, value: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrThrowImpl[ClassConstructorDescriptorImpl]

'expression' @ [517:21] ==> value-parameter expression: IrThrow defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitThrow[ValueParameterDescriptorImpl]

'startOffset' @ [517:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrThrow[PropertyDescriptorImpl]

'expression' @ [517:45] ==> value-parameter expression: IrThrow defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitThrow[ValueParameterDescriptorImpl]

'endOffset' @ [517:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrThrow[PropertyDescriptorImpl]

'expression' @ [518:21] ==> value-parameter expression: IrThrow defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitThrow[ValueParameterDescriptorImpl]

'type' @ [518:32] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrThrow[PropertyDescriptorImpl]

'expression' @ [519:21] ==> value-parameter expression: IrThrow defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitThrow[ValueParameterDescriptorImpl]

'value' @ [519:32] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrThrow[PropertyDescriptorImpl]

'transform' @ [519:38] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'IrErrorDeclarationImpl' @ [523:13] ==> public constructor IrErrorDeclarationImpl(startOffset: Int, endOffset: Int, descriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrErrorDeclarationImpl[ClassConstructorDescriptorImpl]

'declaration' @ [523:36] ==> value-parameter declaration: IrErrorDeclaration defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitErrorDeclaration[ValueParameterDescriptorImpl]

'startOffset' @ [523:48] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrErrorDeclaration[PropertyDescriptorImpl]

'declaration' @ [523:61] ==> value-parameter declaration: IrErrorDeclaration defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitErrorDeclaration[ValueParameterDescriptorImpl]

'endOffset' @ [523:73] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrErrorDeclaration[PropertyDescriptorImpl]

'declaration' @ [523:84] ==> value-parameter declaration: IrErrorDeclaration defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitErrorDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [523:96] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrErrorDeclaration[PropertyDescriptorImpl]

'IrErrorExpressionImpl' @ [526:13] ==> public constructor IrErrorExpressionImpl(startOffset: Int, endOffset: Int, type: KotlinType, description: String) defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorExpressionImpl[ClassConstructorDescriptorImpl]

'expression' @ [527:21] ==> value-parameter expression: IrErrorExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitErrorExpression[ValueParameterDescriptorImpl]

'startOffset' @ [527:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrErrorExpression[PropertyDescriptorImpl]

'expression' @ [527:45] ==> value-parameter expression: IrErrorExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitErrorExpression[ValueParameterDescriptorImpl]

'endOffset' @ [527:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrErrorExpression[PropertyDescriptorImpl]

'expression' @ [528:21] ==> value-parameter expression: IrErrorExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitErrorExpression[ValueParameterDescriptorImpl]

'type' @ [528:32] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrErrorExpression[PropertyDescriptorImpl]

'expression' @ [529:21] ==> value-parameter expression: IrErrorExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitErrorExpression[ValueParameterDescriptorImpl]

'description' @ [529:32] ==> public abstract val description: String defined in org.jetbrains.kotlin.ir.expressions.IrErrorExpression[PropertyDescriptorImpl]

'IrErrorCallExpressionImpl' @ [533:13] ==> public constructor IrErrorCallExpressionImpl(startOffset: Int, endOffset: Int, type: KotlinType, description: String) defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl[ClassConstructorDescriptorImpl]

'expression' @ [534:21] ==> value-parameter expression: IrErrorCallExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitErrorCallExpression[ValueParameterDescriptorImpl]

'startOffset' @ [534:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrErrorCallExpression[PropertyDescriptorImpl]

'expression' @ [534:45] ==> value-parameter expression: IrErrorCallExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitErrorCallExpression[ValueParameterDescriptorImpl]

'endOffset' @ [534:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrErrorCallExpression[PropertyDescriptorImpl]

'expression' @ [535:21] ==> value-parameter expression: IrErrorCallExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitErrorCallExpression[ValueParameterDescriptorImpl]

'type' @ [535:32] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrErrorCallExpression[PropertyDescriptorImpl]

'expression' @ [536:21] ==> value-parameter expression: IrErrorCallExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitErrorCallExpression[ValueParameterDescriptorImpl]

'description' @ [536:32] ==> public abstract val description: String defined in org.jetbrains.kotlin.ir.expressions.IrErrorCallExpression[PropertyDescriptorImpl]

'apply' @ [537:15] ==> @InlineOnly public inline fun <T> IrErrorCallExpressionImpl.apply(block: IrErrorCallExpressionImpl.() -> Unit): IrErrorCallExpressionImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrErrorCallExpressionImpl

'explicitReceiver' @ [538:17] ==> public open var explicitReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl[PropertyDescriptorImpl]

'expression' @ [538:36] ==> value-parameter expression: IrErrorCallExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitErrorCallExpression[ValueParameterDescriptorImpl]

'explicitReceiver' @ [538:47] ==> public abstract var explicitReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrErrorCallExpression[PropertyDescriptorImpl]

'transform' @ [538:65] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'expression' @ [539:17] ==> value-parameter expression: IrErrorCallExpression defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols.visitErrorCallExpression[ValueParameterDescriptorImpl]

'arguments' @ [539:28] ==> public abstract val arguments: MutableList<IrExpression> defined in org.jetbrains.kotlin.ir.expressions.IrErrorCallExpression[PropertyDescriptorImpl]

'transformTo' @ [539:38] ==> private final inline fun <reified T : IrElement> List<IrExpression>.transformTo(destination: MutableList<IrExpression>): MutableList<IrExpression> defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'arguments' @ [539:50] ==> public open val arguments: MutableList<IrExpression> defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl[PropertyDescriptorImpl]

