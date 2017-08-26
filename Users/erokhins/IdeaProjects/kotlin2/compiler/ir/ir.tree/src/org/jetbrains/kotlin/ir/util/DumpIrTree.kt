'StringBuilder' @ [31:14] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'accept' @ [32:5] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.IrElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'DumpIrTreeVisitor' @ [32:12] ==> public constructor DumpIrTreeVisitor(out: Appendable /* = Appendable */) defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[ClassConstructorDescriptorImpl]

'sb' @ [32:30] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir.util.dump[LocalVariableDescriptor]

'sb' @ [33:12] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir.util.dump[LocalVariableDescriptor]

'toString' @ [33:15] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'StringBuilder' @ [37:14] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'accept' @ [38:5] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, Nothing?>, data: Nothing?): Unit defined in org.jetbrains.kotlin.ir.declarations.IrFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> Nothing?

'DumpTreeFromSourceLineVisitor' @ [38:12] ==> public constructor DumpTreeFromSourceLineVisitor(fileEntry: SourceManager.FileEntry, lineNumber: Int, out: Appendable /* = Appendable */) defined in org.jetbrains.kotlin.ir.util.DumpTreeFromSourceLineVisitor[ClassConstructorDescriptorImpl]

'fileEntry' @ [38:42] ==> public abstract val fileEntry: SourceManager.FileEntry defined in org.jetbrains.kotlin.ir.declarations.IrFile[PropertyDescriptorImpl]

'lineNumber' @ [38:53] ==> value-parameter lineNumber: Int defined in org.jetbrains.kotlin.ir.util.dumpTreesFromLineNumber[ValueParameterDescriptorImpl]

'sb' @ [38:65] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir.util.dumpTreesFromLineNumber[LocalVariableDescriptor]

'sb' @ [39:12] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir.util.dumpTreesFromLineNumber[LocalVariableDescriptor]

'toString' @ [39:15] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'Printer' @ [43:27] ==> public constructor Printer(@NotNull p0: Appendable, @NotNull p1: String) defined in org.jetbrains.kotlin.utils.Printer[JavaClassConstructorDescriptor]

'out' @ [43:35] ==> value-parameter out: Appendable /* = Appendable */ defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.<init>[ValueParameterDescriptorImpl]

'RenderIrElementVisitor' @ [44:35] ==> public constructor RenderIrElementVisitor() defined in org.jetbrains.kotlin.ir.util.RenderIrElementVisitor[ClassConstructorDescriptorImpl]

'DescriptorRenderer' @ [47:36] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'withOptions' @ [47:55] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedSimpleFunctionDescriptor]

'verbose' @ [48:13] ==> public abstract var verbose: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'annotationArgumentsRenderingPolicy' @ [49:13] ==> public abstract var annotationArgumentsRenderingPolicy: AnnotationArgumentsRenderingPolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'UNLESS_EMPTY' @ [49:85] ==> enum entry UNLESS_EMPTY defined in org.jetbrains.kotlin.renderer.AnnotationArgumentsRenderingPolicy[FakeCallableDescriptorForObject]

'element' @ [54:9] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitElement[ValueParameterDescriptorImpl]

'dumpLabeledSubTree' @ [54:17] ==> private final fun IrElement.dumpLabeledSubTree(label: String): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'data' @ [54:36] ==> value-parameter data: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitElement[ValueParameterDescriptorImpl]

'declaration' @ [58:9] ==> value-parameter declaration: IrModuleFragment defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitModuleFragment[ValueParameterDescriptorImpl]

'dumpLabeledElementWith' @ [58:21] ==> private final inline fun IrElement.dumpLabeledElementWith(label: String, body: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'data' @ [58:44] ==> value-parameter data: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitModuleFragment[ValueParameterDescriptorImpl]

'declaration' @ [59:13] ==> value-parameter declaration: IrModuleFragment defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitModuleFragment[ValueParameterDescriptorImpl]

'files' @ [59:25] ==> public abstract val files: MutableList<IrFile> defined in org.jetbrains.kotlin.ir.declarations.IrModuleFragment[PropertyDescriptorImpl]

'dumpElements' @ [59:31] ==> private final fun List<IrElement>.dumpElements(): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'declaration' @ [60:13] ==> value-parameter declaration: IrModuleFragment defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitModuleFragment[ValueParameterDescriptorImpl]

'externalPackageFragments' @ [60:25] ==> public abstract val externalPackageFragments: MutableList<IrExternalPackageFragment> defined in org.jetbrains.kotlin.ir.declarations.IrModuleFragment[PropertyDescriptorImpl]

'dumpElements' @ [60:50] ==> private final fun List<IrElement>.dumpElements(): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'declaration' @ [65:9] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitFile[ValueParameterDescriptorImpl]

'dumpLabeledElementWith' @ [65:21] ==> private final inline fun IrElement.dumpLabeledElementWith(label: String, body: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'data' @ [65:44] ==> value-parameter data: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitFile[ValueParameterDescriptorImpl]

'declaration' @ [66:17] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitFile[ValueParameterDescriptorImpl]

'fileAnnotations' @ [66:29] ==> public abstract val fileAnnotations: MutableList<AnnotationDescriptor> defined in org.jetbrains.kotlin.ir.declarations.IrFile[PropertyDescriptorImpl]

'isNotEmpty' @ [66:45] ==> @InlineOnly public inline fun <T> Collection<AnnotationDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'printer' @ [67:17] ==> private final val printer: Printer defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[PropertyDescriptorImpl]

'println' @ [67:25] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'indented' @ [68:17] ==> private final inline fun indented(body: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'declaration' @ [69:21] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitFile[ValueParameterDescriptorImpl]

'fileAnnotations' @ [69:33] ==> public abstract val fileAnnotations: MutableList<AnnotationDescriptor> defined in org.jetbrains.kotlin.ir.declarations.IrFile[PropertyDescriptorImpl]

'forEach' @ [69:49] ==> @HidesMembers public inline fun <T> Iterable<AnnotationDescriptor>.forEach(action: (AnnotationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'printer' @ [70:25] ==> private final val printer: Printer defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[PropertyDescriptorImpl]

'println' @ [70:33] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'ANNOTATIONS_RENDERER' @ [70:41] ==> public final val ANNOTATIONS_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.Companion[PropertyDescriptorImpl]

'renderAnnotation' @ [70:62] ==> public abstract fun renderAnnotation(annotation: AnnotationDescriptor, target: AnnotationUseSiteTarget? = ...): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [70:79] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitFile.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [74:13] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitFile[ValueParameterDescriptorImpl]

'declarations' @ [74:25] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrFile[PropertyDescriptorImpl]

'dumpElements' @ [74:38] ==> private final fun List<IrElement>.dumpElements(): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'declaration' @ [79:9] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitClass[ValueParameterDescriptorImpl]

'dumpLabeledElementWith' @ [79:21] ==> private final inline fun IrElement.dumpLabeledElementWith(label: String, body: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'data' @ [79:44] ==> value-parameter data: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitClass[ValueParameterDescriptorImpl]

'declaration' @ [80:13] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitClass[ValueParameterDescriptorImpl]

'thisReceiver' @ [80:25] ==> public abstract var thisReceiver: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrClass[PropertyDescriptorImpl]

'accept' @ [80:39] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [80:46] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'declaration' @ [81:13] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitClass[ValueParameterDescriptorImpl]

'typeParameters' @ [81:25] ==> public abstract val typeParameters: MutableList<IrTypeParameter> defined in org.jetbrains.kotlin.ir.declarations.IrClass[PropertyDescriptorImpl]

'dumpElements' @ [81:40] ==> private final fun List<IrElement>.dumpElements(): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'declaration' @ [82:13] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitClass[ValueParameterDescriptorImpl]

'declarations' @ [82:25] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrClass[PropertyDescriptorImpl]

'dumpElements' @ [82:38] ==> private final fun List<IrElement>.dumpElements(): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'declaration' @ [87:9] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitFunction[ValueParameterDescriptorImpl]

'dumpLabeledElementWith' @ [87:21] ==> private final inline fun IrElement.dumpLabeledElementWith(label: String, body: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'data' @ [87:44] ==> value-parameter data: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitFunction[ValueParameterDescriptorImpl]

'declaration' @ [88:13] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitFunction[ValueParameterDescriptorImpl]

'typeParameters' @ [88:25] ==> public abstract val typeParameters: MutableList<IrTypeParameter> defined in org.jetbrains.kotlin.ir.declarations.IrFunction[PropertyDescriptorImpl]

'dumpElements' @ [88:40] ==> private final fun List<IrElement>.dumpElements(): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'declaration' @ [89:13] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitFunction[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [89:25] ==> public abstract var dispatchReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[PropertyDescriptorImpl]

'accept' @ [89:52] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [89:59] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'declaration' @ [90:13] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitFunction[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [90:25] ==> public abstract var extensionReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[PropertyDescriptorImpl]

'accept' @ [90:53] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [90:60] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'declaration' @ [91:13] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitFunction[ValueParameterDescriptorImpl]

'valueParameters' @ [91:25] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrFunction[PropertyDescriptorImpl]

'dumpElements' @ [91:41] ==> private final fun List<IrElement>.dumpElements(): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'declaration' @ [92:13] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitFunction[ValueParameterDescriptorImpl]

'body' @ [92:25] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[PropertyDescriptorImpl]

'accept' @ [92:31] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.expressions.IrBody[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [92:38] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'declaration' @ [97:9] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitConstructor[ValueParameterDescriptorImpl]

'dumpLabeledElementWith' @ [97:21] ==> private final inline fun IrElement.dumpLabeledElementWith(label: String, body: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'data' @ [97:44] ==> value-parameter data: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitConstructor[ValueParameterDescriptorImpl]

'declaration' @ [98:13] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitConstructor[ValueParameterDescriptorImpl]

'typeParameters' @ [98:25] ==> public abstract val typeParameters: MutableList<IrTypeParameter> defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[PropertyDescriptorImpl]

'dumpElements' @ [98:40] ==> private final fun List<IrElement>.dumpElements(): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'declaration' @ [99:13] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitConstructor[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [99:25] ==> public abstract var dispatchReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[PropertyDescriptorImpl]

'accept' @ [99:52] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [99:59] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'declaration' @ [100:13] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitConstructor[ValueParameterDescriptorImpl]

'valueParameters' @ [100:25] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[PropertyDescriptorImpl]

'dumpElements' @ [100:41] ==> private final fun List<IrElement>.dumpElements(): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'declaration' @ [101:13] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitConstructor[ValueParameterDescriptorImpl]

'body' @ [101:25] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[PropertyDescriptorImpl]

'accept' @ [101:31] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.expressions.IrBody[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [101:38] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'declaration' @ [106:9] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitProperty[ValueParameterDescriptorImpl]

'dumpLabeledElementWith' @ [106:21] ==> private final inline fun IrElement.dumpLabeledElementWith(label: String, body: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'data' @ [106:44] ==> value-parameter data: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitProperty[ValueParameterDescriptorImpl]

'declaration' @ [107:13] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitProperty[ValueParameterDescriptorImpl]

'typeParameters' @ [107:25] ==> public abstract val typeParameters: MutableList<IrTypeParameter> defined in org.jetbrains.kotlin.ir.declarations.IrProperty[PropertyDescriptorImpl]

'dumpElements' @ [107:40] ==> private final fun List<IrElement>.dumpElements(): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'declaration' @ [108:13] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitProperty[ValueParameterDescriptorImpl]

'backingField' @ [108:25] ==> public abstract var backingField: IrField? defined in org.jetbrains.kotlin.ir.declarations.IrProperty[PropertyDescriptorImpl]

'accept' @ [108:39] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.declarations.IrField[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [108:46] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'declaration' @ [109:13] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitProperty[ValueParameterDescriptorImpl]

'getter' @ [109:25] ==> public abstract var getter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.IrProperty[PropertyDescriptorImpl]

'accept' @ [109:33] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.declarations.IrFunction[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [109:40] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'declaration' @ [110:13] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitProperty[ValueParameterDescriptorImpl]

'setter' @ [110:25] ==> public abstract var setter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.IrProperty[PropertyDescriptorImpl]

'accept' @ [110:33] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.declarations.IrFunction[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [110:40] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'forEach' @ [115:9] ==> @HidesMembers public inline fun <T> Iterable<IrElement>.forEach(action: (IrElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrElement

'it' @ [115:19] ==> value-parameter it: IrElement defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.dumpElements.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [115:22] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.IrElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this@DumpIrTreeVisitor' @ [115:29] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'expression' @ [119:9] ==> value-parameter expression: IrErrorCallExpression defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitErrorCallExpression[ValueParameterDescriptorImpl]

'dumpLabeledElementWith' @ [119:20] ==> private final inline fun IrElement.dumpLabeledElementWith(label: String, body: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'data' @ [119:43] ==> value-parameter data: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitErrorCallExpression[ValueParameterDescriptorImpl]

'expression' @ [120:13] ==> value-parameter expression: IrErrorCallExpression defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitErrorCallExpression[ValueParameterDescriptorImpl]

'explicitReceiver' @ [120:24] ==> public abstract var explicitReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrErrorCallExpression[PropertyDescriptorImpl]

'accept' @ [120:42] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [120:49] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'expression' @ [121:13] ==> value-parameter expression: IrErrorCallExpression defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitErrorCallExpression[ValueParameterDescriptorImpl]

'arguments' @ [121:24] ==> public abstract val arguments: MutableList<IrExpression> defined in org.jetbrains.kotlin.ir.expressions.IrErrorCallExpression[PropertyDescriptorImpl]

'dumpElements' @ [121:34] ==> private final fun List<IrElement>.dumpElements(): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'declaration' @ [126:9] ==> value-parameter declaration: IrEnumEntry defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitEnumEntry[ValueParameterDescriptorImpl]

'dumpLabeledElementWith' @ [126:21] ==> private final inline fun IrElement.dumpLabeledElementWith(label: String, body: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'data' @ [126:44] ==> value-parameter data: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitEnumEntry[ValueParameterDescriptorImpl]

'declaration' @ [127:13] ==> value-parameter declaration: IrEnumEntry defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitEnumEntry[ValueParameterDescriptorImpl]

'initializerExpression' @ [127:25] ==> public abstract var initializerExpression: IrExpression? defined in org.jetbrains.kotlin.ir.declarations.IrEnumEntry[PropertyDescriptorImpl]

'accept' @ [127:48] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [127:55] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'declaration' @ [128:13] ==> value-parameter declaration: IrEnumEntry defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitEnumEntry[ValueParameterDescriptorImpl]

'correspondingClass' @ [128:25] ==> public abstract var correspondingClass: IrClass? defined in org.jetbrains.kotlin.ir.declarations.IrEnumEntry[PropertyDescriptorImpl]

'accept' @ [128:45] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.declarations.IrClass[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [128:52] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'expression' @ [133:9] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitMemberAccess[ValueParameterDescriptorImpl]

'dumpLabeledElementWith' @ [133:20] ==> private final inline fun IrElement.dumpLabeledElementWith(label: String, body: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'data' @ [133:43] ==> value-parameter data: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitMemberAccess[ValueParameterDescriptorImpl]

'dumpTypeArguments' @ [134:13] ==> private final fun dumpTypeArguments(expression: IrMemberAccessExpression): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [134:31] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitMemberAccess[ValueParameterDescriptorImpl]

'expression' @ [135:13] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitMemberAccess[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [135:24] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[PropertyDescriptorImpl]

'accept' @ [135:42] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [135:49] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'expression' @ [136:13] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitMemberAccess[ValueParameterDescriptorImpl]

'extensionReceiver' @ [136:24] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[PropertyDescriptorImpl]

'accept' @ [136:43] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [136:50] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'expression' @ [137:36] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitMemberAccess[ValueParameterDescriptorImpl]

'descriptor' @ [137:47] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[PropertyDescriptorImpl]

'valueParameters' @ [137:58] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'expression' @ [138:17] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitMemberAccess[ValueParameterDescriptorImpl]

'getValueArgument' @ [138:28] ==> public abstract fun getValueArgument(index: Int): IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[SimpleFunctionDescriptorImpl]

'valueParameter' @ [138:45] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitMemberAccess.<anonymous>[LocalVariableDescriptor]

'index' @ [138:60] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'accept' @ [138:68] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [138:75] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'valueParameter' @ [138:81] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitMemberAccess.<anonymous>[LocalVariableDescriptor]

'name' @ [138:96] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [138:101] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'expression' @ [144:31] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.dumpTypeArguments[ValueParameterDescriptorImpl]

'descriptor' @ [144:42] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[PropertyDescriptorImpl]

'original' @ [144:53] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'typeParameters' @ [144:62] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'DescriptorRenderer' @ [145:37] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'ONLY_NAMES_WITH_SHORT_TYPES' @ [145:56] ==> @field:JvmField public final val ONLY_NAMES_WITH_SHORT_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'render' @ [145:84] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'typeParameter' @ [145:91] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.dumpTypeArguments[LocalVariableDescriptor]

'expression' @ [146:32] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.dumpTypeArguments[ValueParameterDescriptorImpl]

'getTypeArgument' @ [146:43] ==> public abstract fun getTypeArgument(typeParameterDescriptor: TypeParameterDescriptor): KotlinType? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[SimpleFunctionDescriptorImpl]

'typeParameter' @ [146:59] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.dumpTypeArguments[LocalVariableDescriptor]

'typeArgument' @ [147:32] ==> val typeArgument: KotlinType? defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.dumpTypeArguments[LocalVariableDescriptor]

'let' @ [147:46] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> String

'DescriptorRenderer' @ [148:17] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'ONLY_NAMES_WITH_SHORT_TYPES' @ [148:36] ==> @field:JvmField public final val ONLY_NAMES_WITH_SHORT_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'renderType' @ [148:64] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'typeArgument' @ [148:75] ==> val typeArgument: KotlinType? defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.dumpTypeArguments[LocalVariableDescriptor]

'printer' @ [150:13] ==> private final val printer: Printer defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[PropertyDescriptorImpl]

'println' @ [150:21] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'renderedParameter' @ [150:31] ==> val renderedParameter: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.dumpTypeArguments[LocalVariableDescriptor]

'renderedType' @ [150:51] ==> val renderedType: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.dumpTypeArguments[LocalVariableDescriptor]

'expression' @ [155:9] ==> value-parameter expression: IrGetField defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitGetField[ValueParameterDescriptorImpl]

'dumpLabeledElementWith' @ [155:20] ==> private final inline fun IrElement.dumpLabeledElementWith(label: String, body: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'data' @ [155:43] ==> value-parameter data: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitGetField[ValueParameterDescriptorImpl]

'expression' @ [156:13] ==> value-parameter expression: IrGetField defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitGetField[ValueParameterDescriptorImpl]

'receiver' @ [156:24] ==> public abstract var receiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrGetField[PropertyDescriptorImpl]

'accept' @ [156:34] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [156:41] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'expression' @ [161:9] ==> value-parameter expression: IrSetField defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitSetField[ValueParameterDescriptorImpl]

'dumpLabeledElementWith' @ [161:20] ==> private final inline fun IrElement.dumpLabeledElementWith(label: String, body: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'data' @ [161:43] ==> value-parameter data: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitSetField[ValueParameterDescriptorImpl]

'expression' @ [162:13] ==> value-parameter expression: IrSetField defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitSetField[ValueParameterDescriptorImpl]

'receiver' @ [162:24] ==> public abstract var receiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrSetField[PropertyDescriptorImpl]

'accept' @ [162:34] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [162:41] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'expression' @ [163:13] ==> value-parameter expression: IrSetField defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitSetField[ValueParameterDescriptorImpl]

'value' @ [163:24] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrSetField[PropertyDescriptorImpl]

'accept' @ [163:30] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [163:37] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'expression' @ [168:9] ==> value-parameter expression: IrWhen defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitWhen[ValueParameterDescriptorImpl]

'dumpLabeledElementWith' @ [168:20] ==> private final inline fun IrElement.dumpLabeledElementWith(label: String, body: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'data' @ [168:43] ==> value-parameter data: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitWhen[ValueParameterDescriptorImpl]

'expression' @ [169:13] ==> value-parameter expression: IrWhen defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitWhen[ValueParameterDescriptorImpl]

'branches' @ [169:24] ==> public abstract val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.IrWhen[PropertyDescriptorImpl]

'dumpElements' @ [169:33] ==> private final fun List<IrElement>.dumpElements(): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'branch' @ [174:9] ==> value-parameter branch: IrBranch defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitBranch[ValueParameterDescriptorImpl]

'dumpLabeledElementWith' @ [174:16] ==> private final inline fun IrElement.dumpLabeledElementWith(label: String, body: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'data' @ [174:39] ==> value-parameter data: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitBranch[ValueParameterDescriptorImpl]

'branch' @ [175:13] ==> value-parameter branch: IrBranch defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitBranch[ValueParameterDescriptorImpl]

'condition' @ [175:20] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrBranch[PropertyDescriptorImpl]

'accept' @ [175:30] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [175:37] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'branch' @ [176:13] ==> value-parameter branch: IrBranch defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitBranch[ValueParameterDescriptorImpl]

'result' @ [176:20] ==> public abstract var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrBranch[PropertyDescriptorImpl]

'accept' @ [176:27] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [176:34] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'loop' @ [181:9] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitWhileLoop[ValueParameterDescriptorImpl]

'dumpLabeledElementWith' @ [181:14] ==> private final inline fun IrElement.dumpLabeledElementWith(label: String, body: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'data' @ [181:37] ==> value-parameter data: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitWhileLoop[ValueParameterDescriptorImpl]

'loop' @ [182:13] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitWhileLoop[ValueParameterDescriptorImpl]

'condition' @ [182:18] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrWhileLoop[PropertyDescriptorImpl]

'accept' @ [182:28] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [182:35] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'loop' @ [183:13] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitWhileLoop[ValueParameterDescriptorImpl]

'body' @ [183:18] ==> public abstract var body: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrWhileLoop[PropertyDescriptorImpl]

'accept' @ [183:24] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [183:31] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'loop' @ [188:9] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitDoWhileLoop[ValueParameterDescriptorImpl]

'dumpLabeledElementWith' @ [188:14] ==> private final inline fun IrElement.dumpLabeledElementWith(label: String, body: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'data' @ [188:37] ==> value-parameter data: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitDoWhileLoop[ValueParameterDescriptorImpl]

'loop' @ [189:13] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitDoWhileLoop[ValueParameterDescriptorImpl]

'body' @ [189:18] ==> public abstract var body: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrDoWhileLoop[PropertyDescriptorImpl]

'accept' @ [189:24] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [189:31] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'loop' @ [190:13] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitDoWhileLoop[ValueParameterDescriptorImpl]

'condition' @ [190:18] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrDoWhileLoop[PropertyDescriptorImpl]

'accept' @ [190:28] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [190:35] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'aTry' @ [195:9] ==> value-parameter aTry: IrTry defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitTry[ValueParameterDescriptorImpl]

'dumpLabeledElementWith' @ [195:14] ==> private final inline fun IrElement.dumpLabeledElementWith(label: String, body: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'data' @ [195:37] ==> value-parameter data: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitTry[ValueParameterDescriptorImpl]

'aTry' @ [196:13] ==> value-parameter aTry: IrTry defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitTry[ValueParameterDescriptorImpl]

'tryResult' @ [196:18] ==> public abstract var tryResult: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrTry[PropertyDescriptorImpl]

'accept' @ [196:28] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [196:35] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'aTry' @ [197:13] ==> value-parameter aTry: IrTry defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitTry[ValueParameterDescriptorImpl]

'catches' @ [197:18] ==> public abstract val catches: List<IrCatch> defined in org.jetbrains.kotlin.ir.expressions.IrTry[PropertyDescriptorImpl]

'dumpElements' @ [197:26] ==> private final fun List<IrElement>.dumpElements(): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'aTry' @ [198:13] ==> value-parameter aTry: IrTry defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.visitTry[ValueParameterDescriptorImpl]

'finallyExpression' @ [198:18] ==> public abstract var finallyExpression: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrTry[PropertyDescriptorImpl]

'accept' @ [198:37] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'this' @ [198:44] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'printer' @ [203:9] ==> private final val printer: Printer defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[PropertyDescriptorImpl]

'println' @ [203:17] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'accept' @ [203:25] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<String, Nothing?>, data: Nothing?): String defined in org.jetbrains.kotlin.ir.IrElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> String
    <D> -> Nothing?

'elementRenderer' @ [203:32] ==> private final val elementRenderer: RenderIrElementVisitor defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[PropertyDescriptorImpl]

'withLabel' @ [203:55] ==> private final fun String.withLabel(label: String): String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'label' @ [203:65] ==> value-parameter label: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.dumpLabeledElementWith[ValueParameterDescriptorImpl]

'indented' @ [204:9] ==> private final inline fun indented(body: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'body' @ [204:18] ==> value-parameter body: () -> Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.dumpLabeledElementWith[ValueParameterDescriptorImpl]

'printer' @ [208:9] ==> private final val printer: Printer defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[PropertyDescriptorImpl]

'println' @ [208:17] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'accept' @ [208:25] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<String, Nothing?>, data: Nothing?): String defined in org.jetbrains.kotlin.ir.IrElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> String
    <D> -> Nothing?

'elementRenderer' @ [208:32] ==> private final val elementRenderer: RenderIrElementVisitor defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[PropertyDescriptorImpl]

'withLabel' @ [208:55] ==> private final fun String.withLabel(label: String): String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'label' @ [208:65] ==> value-parameter label: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.dumpLabeledSubTree[ValueParameterDescriptorImpl]

'indented' @ [209:9] ==> private final inline fun indented(body: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[SimpleFunctionDescriptorImpl]

'acceptChildren' @ [210:13] ==> public abstract fun <D> acceptChildren(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.IrElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> String

'this@DumpIrTreeVisitor' @ [210:28] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[LazyClassReceiverParameterDescriptor]

'printer' @ [215:9] ==> private final val printer: Printer defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[PropertyDescriptorImpl]

'pushIndent' @ [215:17] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'invoke' @ [216:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'printer' @ [217:9] ==> private final val printer: Printer defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[PropertyDescriptorImpl]

'popIndent' @ [217:17] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'if (label.isEmpty()) this else "$label: $this"' @ [221:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'label' @ [221:17] ==> value-parameter label: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.withLabel[ValueParameterDescriptorImpl]

'isEmpty' @ [221:23] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'this' @ [221:34] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.withLabel[ReceiverParameterDescriptorImpl]

'label' @ [221:46] ==> value-parameter label: String defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.withLabel[ValueParameterDescriptorImpl]

'this' @ [221:54] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor.withLabel[ReceiverParameterDescriptorImpl]

'DumpIrTreeVisitor' @ [229:26] ==> public constructor DumpIrTreeVisitor(out: Appendable /* = Appendable */) defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[ClassConstructorDescriptorImpl]

'out' @ [229:44] ==> value-parameter out: Appendable /* = Appendable */ defined in org.jetbrains.kotlin.ir.util.DumpTreeFromSourceLineVisitor.<init>[ValueParameterDescriptorImpl]

'fileEntry' @ [232:13] ==> public final val fileEntry: SourceManager.FileEntry defined in org.jetbrains.kotlin.ir.util.DumpTreeFromSourceLineVisitor[PropertyDescriptorImpl]

'getLineNumber' @ [232:23] ==> public abstract fun getLineNumber(offset: Int): Int defined in org.jetbrains.kotlin.ir.SourceManager.FileEntry[SimpleFunctionDescriptorImpl]

'element' @ [232:37] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.ir.util.DumpTreeFromSourceLineVisitor.visitElement[ValueParameterDescriptorImpl]

'startOffset' @ [232:45] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[PropertyDescriptorImpl]

'lineNumber' @ [232:61] ==> private final val lineNumber: Int defined in org.jetbrains.kotlin.ir.util.DumpTreeFromSourceLineVisitor[PropertyDescriptorImpl]

'element' @ [233:13] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.ir.util.DumpTreeFromSourceLineVisitor.visitElement[ValueParameterDescriptorImpl]

'accept' @ [233:21] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.IrElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> String

'dumper' @ [233:28] ==> private final val dumper: DumpIrTreeVisitor defined in org.jetbrains.kotlin.ir.util.DumpTreeFromSourceLineVisitor[PropertyDescriptorImpl]

'element' @ [237:9] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.ir.util.DumpTreeFromSourceLineVisitor.visitElement[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [237:17] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors in file IrElementVisitorVoid.kt[SimpleFunctionDescriptorImpl]

'this' @ [237:36] ==> <this> defined in org.jetbrains.kotlin.ir.util.DumpTreeFromSourceLineVisitor[LazyClassReceiverParameterDescriptor]

