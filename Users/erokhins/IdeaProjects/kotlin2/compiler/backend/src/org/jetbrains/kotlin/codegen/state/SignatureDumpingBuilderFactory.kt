'DelegatingClassBuilderFactory' @ [40:5] ==> public constructor DelegatingClassBuilderFactory(delegate: ClassBuilderFactory) defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilderFactory[ClassConstructorDescriptorImpl]

'builderFactory' @ [40:35] ==> value-parameter builderFactory: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.<init>[ValueParameterDescriptorImpl]

'DescriptorRenderer' @ [43:31] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'withOptions' @ [43:50] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedSimpleFunctionDescriptor]

'withDefinedIn' @ [44:13] ==> public abstract var withDefinedIn: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'modifiers' @ [45:13] ==> public abstract var modifiers: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'DescriptorRendererModifier' @ [45:26] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRendererModifier[FakeCallableDescriptorForObject]

'VISIBILITY' @ [45:53] ==> enum entry VISIBILITY defined in org.jetbrains.kotlin.renderer.DescriptorRendererModifier[FakeCallableDescriptorForObject]

'DescriptorRenderer' @ [47:29] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'withOptions' @ [47:48] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedSimpleFunctionDescriptor]

'withSourceFileForTopLevel' @ [48:13] ==> public abstract var withSourceFileForTopLevel: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'modifiers' @ [49:13] ==> public abstract var modifiers: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'DescriptorRendererModifier' @ [49:26] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRendererModifier[FakeCallableDescriptorForObject]

'VISIBILITY' @ [49:53] ==> enum entry VISIBILITY defined in org.jetbrains.kotlin.renderer.DescriptorRendererModifier[FakeCallableDescriptorForObject]

'lazy' @ [53:49] ==> public fun <T> lazy(initializer: () -> BufferedWriter): Lazy<BufferedWriter> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BufferedWriter

'println' @ [55:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'destination' @ [55:48] ==> public final val destination: File defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory[PropertyDescriptorImpl]

'destination' @ [56:9] ==> public final val destination: File defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory[PropertyDescriptorImpl]

'parentFile' @ [56:21] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'mkdirs' @ [56:33] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'destination' @ [57:9] ==> public final val destination: File defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory[PropertyDescriptorImpl]

'bufferedWriter' @ [57:21] ==> @InlineOnly public inline fun File.bufferedWriter(charset: Charset = ..., bufferSize: Int = ...): BufferedWriter defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'apply' @ [57:38] ==> @InlineOnly public inline fun <T> BufferedWriter.apply(block: BufferedWriter.() -> Unit): BufferedWriter defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BufferedWriter

'append' @ [57:46] ==> public open fun append(p0: (CharSequence..CharSequence?)): (Writer..Writer?) defined in java.io.BufferedWriter[JavaMethodDescriptor]

'outputStream' @ [62:9] ==> private final val outputStream: BufferedWriter defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory[PropertyDescriptorImpl]

'append' @ [62:22] ==> public open fun append(p0: (CharSequence..CharSequence?)): (Writer..Writer?) defined in java.io.BufferedWriter[JavaMethodDescriptor]

'outputStream' @ [63:9] ==> private final val outputStream: BufferedWriter defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory[PropertyDescriptorImpl]

'close' @ [63:22] ==> public open fun close(): Unit defined in java.io.BufferedWriter[JavaMethodDescriptor]

'super' @ [64:9] ==> <this> defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory[LazyClassReceiverParameterDescriptor]

'close' @ [64:15] ==> public open fun close(): Unit defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilderFactory[JavaMethodDescriptor]

'SignatureDumpingClassBuilder' @ [68:16] ==> public constructor SignatureDumpingClassBuilder(origin: JvmDeclarationOrigin, _delegate: ClassBuilder) defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder[ClassConstructorDescriptorImpl]

'origin' @ [68:45] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.newClassBuilder[ValueParameterDescriptorImpl]

'delegate' @ [68:53] ==> protected final val delegate: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory[PropertyDescriptorImpl]

'newClassBuilder' @ [68:62] ==> @NotNull public abstract fun newClassBuilder(@NotNull origin: JvmDeclarationOrigin): ClassBuilder defined in org.jetbrains.kotlin.codegen.ClassBuilderFactory[JavaMethodDescriptor]

'origin' @ [68:78] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.newClassBuilder[ValueParameterDescriptorImpl]

'DelegatingClassBuilder' @ [72:119] ==> public constructor DelegatingClassBuilder() defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaClassConstructorDescriptor]

'_delegate' @ [73:38] ==> public final val _delegate: ClassBuilder defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder[PropertyDescriptorImpl]

'mutableListOf' @ [75:34] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Pair<RawSignature, DeclarationDescriptor?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<RawSignature, DeclarationDescriptor?>

'javaClassName' @ [79:13] ==> private final lateinit var javaClassName: String defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder[PropertyDescriptorImpl]

'name' @ [79:29] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.defineClass[ValueParameterDescriptorImpl]

'super' @ [81:13] ==> <this> defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder[LazyClassReceiverParameterDescriptor]

'defineClass' @ [81:19] ==> @Override public open fun defineClass(@Nullable origin: PsiElement?, version: Int, access: Int, @NotNull name: String, @Nullable signature: String?, @NotNull superName: String, @NotNull interfaces: (Array<(String..String?)>..Array<out (String..String?)>)): Unit defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaMethodDescriptor]

'origin' @ [81:31] ==> value-parameter origin: PsiElement? defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.defineClass[ValueParameterDescriptorImpl]

'version' @ [81:39] ==> value-parameter version: Int defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.defineClass[ValueParameterDescriptorImpl]

'access' @ [81:48] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.defineClass[ValueParameterDescriptorImpl]

'name' @ [81:56] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.defineClass[ValueParameterDescriptorImpl]

'signature' @ [81:62] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.defineClass[ValueParameterDescriptorImpl]

'superName' @ [81:73] ==> value-parameter superName: String defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.defineClass[ValueParameterDescriptorImpl]

'interfaces' @ [81:84] ==> value-parameter interfaces: Array<out String> defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.defineClass[ValueParameterDescriptorImpl]

'signatures' @ [85:13] ==> private final val signatures: MutableList<Pair<RawSignature, DeclarationDescriptor?>> defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder[PropertyDescriptorImpl]

'RawSignature' @ [85:27] ==> public constructor RawSignature(name: String, desc: String, kind: MemberKind) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature[DeserializedClassConstructorDescriptor]

'name' @ [85:40] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.newMethod[ValueParameterDescriptorImpl]

'desc' @ [85:46] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.newMethod[ValueParameterDescriptorImpl]

'METHOD' @ [85:63] ==> enum entry METHOD defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.MemberKind[FakeCallableDescriptorForObject]

'origin' @ [85:74] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.newMethod[ValueParameterDescriptorImpl]

'descriptor' @ [85:81] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'super' @ [86:20] ==> <this> defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder[LazyClassReceiverParameterDescriptor]

'newMethod' @ [86:26] ==> @NotNull @Override public open fun newMethod(@NotNull origin: JvmDeclarationOrigin, access: Int, @NotNull name: String, @NotNull desc: String, @Nullable signature: String?, @Nullable exceptions: (Array<(String..String?)>?..Array<out (String..String?)>?)): MethodVisitor defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaMethodDescriptor]

'origin' @ [86:36] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.newMethod[ValueParameterDescriptorImpl]

'access' @ [86:44] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.newMethod[ValueParameterDescriptorImpl]

'name' @ [86:52] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.newMethod[ValueParameterDescriptorImpl]

'desc' @ [86:58] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.newMethod[ValueParameterDescriptorImpl]

'signature' @ [86:64] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.newMethod[ValueParameterDescriptorImpl]

'exceptions' @ [86:75] ==> value-parameter exceptions: Array<out String>? defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.newMethod[ValueParameterDescriptorImpl]

'signatures' @ [90:13] ==> private final val signatures: MutableList<Pair<RawSignature, DeclarationDescriptor?>> defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder[PropertyDescriptorImpl]

'RawSignature' @ [90:27] ==> public constructor RawSignature(name: String, desc: String, kind: MemberKind) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature[DeserializedClassConstructorDescriptor]

'name' @ [90:40] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.newField[ValueParameterDescriptorImpl]

'desc' @ [90:46] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.newField[ValueParameterDescriptorImpl]

'FIELD' @ [90:63] ==> enum entry FIELD defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.MemberKind[FakeCallableDescriptorForObject]

'origin' @ [90:73] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.newField[ValueParameterDescriptorImpl]

'descriptor' @ [90:80] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'super' @ [91:20] ==> <this> defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder[LazyClassReceiverParameterDescriptor]

'newField' @ [91:26] ==> @NotNull @Override public open fun newField(@NotNull origin: JvmDeclarationOrigin, access: Int, @NotNull name: String, @NotNull desc: String, @Nullable signature: String?, @Nullable value: Any?): FieldVisitor defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaMethodDescriptor]

'origin' @ [91:35] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.newField[ValueParameterDescriptorImpl]

'access' @ [91:43] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.newField[ValueParameterDescriptorImpl]

'name' @ [91:51] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.newField[ValueParameterDescriptorImpl]

'desc' @ [91:57] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.newField[ValueParameterDescriptorImpl]

'signature' @ [91:63] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.newField[ValueParameterDescriptorImpl]

'value' @ [91:74] ==> value-parameter value: Any? defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.newField[ValueParameterDescriptorImpl]

'if (firstClassWritten) outputStream.append(",\n") else firstClassWritten = true' @ [95:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'firstClassWritten' @ [95:17] ==> private final var firstClassWritten: Boolean defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory[PropertyDescriptorImpl]

'outputStream' @ [95:36] ==> private final val outputStream: BufferedWriter defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory[PropertyDescriptorImpl]

'append' @ [95:49] ==> public open fun append(p0: (CharSequence..CharSequence?)): (Writer..Writer?) defined in java.io.BufferedWriter[JavaMethodDescriptor]

'firstClassWritten' @ [95:68] ==> private final var firstClassWritten: Boolean defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory[PropertyDescriptorImpl]

'outputStream' @ [96:13] ==> private final val outputStream: BufferedWriter defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory[PropertyDescriptorImpl]

'append' @ [96:26] ==> public open fun append(p0: (CharSequence..CharSequence?)): (Writer..Writer?) defined in java.io.BufferedWriter[JavaMethodDescriptor]

'origin' @ [97:13] ==> public final val origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder[PropertyDescriptorImpl]

'descriptor' @ [97:20] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'let' @ [97:32] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor.let(block: (DeclarationDescriptor) -> Appendable?): Appendable? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> Appendable?

'outputStream' @ [98:17] ==> private final val outputStream: BufferedWriter defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory[PropertyDescriptorImpl]

'append' @ [98:30] ==> public open fun append(p0: (CharSequence..CharSequence?)): (Writer..Writer?) defined in java.io.BufferedWriter[JavaMethodDescriptor]

'appendNameValue' @ [98:45] ==> private fun Appendable /* = Appendable */.appendNameValue(name: String, value: String?): Appendable /* = Appendable */ defined in org.jetbrains.kotlin.codegen.state[SimpleFunctionDescriptorImpl]

'TYPE_RENDERER' @ [98:76] ==> public final val TYPE_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.Companion[PropertyDescriptorImpl]

'render' @ [98:90] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [98:97] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.done.<anonymous>[ValueParameterDescriptorImpl]

'append' @ [98:102] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'it' @ [99:18] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.done.<anonymous>[ValueParameterDescriptorImpl]

'visibility' @ [99:63] ==> public final val DeclarationDescriptorWithVisibility.visibility: Visibility[MyPropertyDescriptor]

'let' @ [99:75] ==> @InlineOnly public inline fun <T, R> Visibility.let(block: (Visibility) -> (Appendable..Appendable?)): (Appendable..Appendable?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Visibility
    <R> -> (java.lang.Appendable..java.lang.Appendable?)

'outputStream' @ [100:21] ==> private final val outputStream: BufferedWriter defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory[PropertyDescriptorImpl]

'append' @ [100:34] ==> public open fun append(p0: (CharSequence..CharSequence?)): (Writer..Writer?) defined in java.io.BufferedWriter[JavaMethodDescriptor]

'appendNameValue' @ [100:49] ==> private fun Appendable /* = Appendable */.appendNameValue(name: String, value: String?): Appendable /* = Appendable */ defined in org.jetbrains.kotlin.codegen.state[SimpleFunctionDescriptorImpl]

'it' @ [100:79] ==> value-parameter it: Visibility defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.done.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'displayName' @ [100:82] ==> public open val displayName: String defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedPropertyDescriptor]

'append' @ [100:95] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'outputStream' @ [103:13] ==> private final val outputStream: BufferedWriter defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory[PropertyDescriptorImpl]

'append' @ [103:26] ==> public open fun append(p0: (CharSequence..CharSequence?)): (Writer..Writer?) defined in java.io.BufferedWriter[JavaMethodDescriptor]

'appendNameValue' @ [103:41] ==> private fun Appendable /* = Appendable */.appendNameValue(name: String, value: String?): Appendable /* = Appendable */ defined in org.jetbrains.kotlin.codegen.state[SimpleFunctionDescriptorImpl]

'javaClassName' @ [103:66] ==> private final lateinit var javaClassName: String defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder[PropertyDescriptorImpl]

'append' @ [103:81] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'outputStream' @ [105:13] ==> private final val outputStream: BufferedWriter defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory[PropertyDescriptorImpl]

'append' @ [105:26] ==> public open fun append(p0: (CharSequence..CharSequence?)): (Writer..Writer?) defined in java.io.BufferedWriter[JavaMethodDescriptor]

'appendQuoted' @ [105:41] ==> private fun Appendable /* = Appendable */.appendQuoted(value: String?): Appendable /* = Appendable */ defined in org.jetbrains.kotlin.codegen.state[SimpleFunctionDescriptorImpl]

'append' @ [105:65] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'signatures' @ [106:13] ==> private final val signatures: MutableList<Pair<RawSignature, DeclarationDescriptor?>> defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder[PropertyDescriptorImpl]

'joinTo' @ [106:24] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<Pair<RawSignature, DeclarationDescriptor?>>.joinTo(buffer: BufferedWriter, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Pair<RawSignature, DeclarationDescriptor?>) -> CharSequence)? = ...): BufferedWriter defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<RawSignature, DeclarationDescriptor?>
    <A : Appendable /* = Appendable */> -> BufferedWriter

'outputStream' @ [106:31] ==> private final val outputStream: BufferedWriter defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory[PropertyDescriptorImpl]

'buildString' @ [106:54] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'component1' @ [107:22] ==> public final operator fun component1(): RawSignature defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [107:33] ==> public final operator fun component2(): DeclarationDescriptor? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'it' @ [107:47] ==> value-parameter it: Pair<RawSignature, DeclarationDescriptor?> defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.done.<anonymous>[ValueParameterDescriptorImpl]

'append' @ [108:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'descriptor' @ [109:17] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.done.<anonymous>.<anonymous>[LocalVariableDescriptor]

'let' @ [109:29] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor.let(block: (DeclarationDescriptor) -> (Appendable..Appendable?)): (Appendable..Appendable?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> (java.lang.Appendable..java.lang.Appendable?)

'it' @ [110:22] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.done.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'visibility' @ [110:67] ==> public final val DeclarationDescriptorWithVisibility.visibility: Visibility[MyPropertyDescriptor]

'let' @ [110:79] ==> @InlineOnly public inline fun <T, R> Visibility.let(block: (Visibility) -> (Appendable..Appendable?)): (Appendable..Appendable?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Visibility
    <R> -> (java.lang.Appendable..java.lang.Appendable?)

'appendNameValue' @ [111:25] ==> private fun Appendable /* = Appendable */.appendNameValue(name: String, value: String?): Appendable /* = Appendable */ defined in org.jetbrains.kotlin.codegen.state[SimpleFunctionDescriptorImpl]

'it' @ [111:55] ==> value-parameter it: Visibility defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.done.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'displayName' @ [111:58] ==> public open val displayName: String defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedPropertyDescriptor]

'append' @ [111:71] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'appendNameValue' @ [113:21] ==> private fun Appendable /* = Appendable */.appendNameValue(name: String, value: String?): Appendable /* = Appendable */ defined in org.jetbrains.kotlin.codegen.state[SimpleFunctionDescriptorImpl]

'MEMBER_RENDERER' @ [113:52] ==> public final val MEMBER_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.Companion[PropertyDescriptorImpl]

'render' @ [113:68] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [113:75] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.done.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'append' @ [113:80] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'appendNameValue' @ [116:17] ==> private fun Appendable /* = Appendable */.appendNameValue(name: String, value: String?): Appendable /* = Appendable */ defined in org.jetbrains.kotlin.codegen.state[SimpleFunctionDescriptorImpl]

'signature' @ [116:41] ==> val signature: RawSignature defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.done.<anonymous>.<anonymous>[LocalVariableDescriptor]

'name' @ [116:51] ==> public final val name: String defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature[DeserializedPropertyDescriptor]

'append' @ [116:57] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'appendNameValue' @ [117:17] ==> private fun Appendable /* = Appendable */.appendNameValue(name: String, value: String?): Appendable /* = Appendable */ defined in org.jetbrains.kotlin.codegen.state[SimpleFunctionDescriptorImpl]

'signature' @ [117:41] ==> val signature: RawSignature defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder.done.<anonymous>.<anonymous>[LocalVariableDescriptor]

'desc' @ [117:51] ==> public final val desc: String defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature[DeserializedPropertyDescriptor]

'append' @ [117:57] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'outputStream' @ [119:13] ==> private final val outputStream: BufferedWriter defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory[PropertyDescriptorImpl]

'append' @ [119:26] ==> public open fun append(p0: (CharSequence..CharSequence?)): (Writer..Writer?) defined in java.io.BufferedWriter[JavaMethodDescriptor]

'super' @ [121:13] ==> <this> defined in org.jetbrains.kotlin.codegen.state.SignatureDumpingBuilderFactory.SignatureDumpingClassBuilder[LazyClassReceiverParameterDescriptor]

'done' @ [121:19] ==> @Override public open fun done(): Unit defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaMethodDescriptor]

'value' @ [126:67] ==> value-parameter value: String? defined in org.jetbrains.kotlin.codegen.state.appendQuoted[ValueParameterDescriptorImpl]

'let' @ [126:74] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> (Appendable..Appendable?)): (Appendable..Appendable?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (java.lang.Appendable..java.lang.Appendable?)

'append' @ [126:80] ==> public abstract fun append(p0: Char): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'append' @ [126:92] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'jsonEscape' @ [126:99] ==> private fun jsonEscape(value: String): String defined in org.jetbrains.kotlin.codegen.state in file SignatureDumpingBuilderFactory.kt[SimpleFunctionDescriptorImpl]

'it' @ [126:110] ==> value-parameter it: String defined in org.jetbrains.kotlin.codegen.state.appendQuoted.<anonymous>[ValueParameterDescriptorImpl]

'append' @ [126:115] ==> public abstract fun append(p0: Char): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'append' @ [126:132] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'appendQuoted' @ [127:84] ==> private fun Appendable /* = Appendable */.appendQuoted(value: String?): Appendable /* = Appendable */ defined in org.jetbrains.kotlin.codegen.state[SimpleFunctionDescriptorImpl]

'name' @ [127:97] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.state.appendNameValue[ValueParameterDescriptorImpl]

'append' @ [127:103] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'appendQuoted' @ [127:116] ==> private fun Appendable /* = Appendable */.appendQuoted(value: String?): Appendable /* = Appendable */ defined in org.jetbrains.kotlin.codegen.state[SimpleFunctionDescriptorImpl]

'value' @ [127:129] ==> value-parameter value: String? defined in org.jetbrains.kotlin.codegen.state.appendNameValue[ValueParameterDescriptorImpl]

'buildString' @ [129:49] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'..' @ [130:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'value' @ [130:22] ==> value-parameter value: String defined in org.jetbrains.kotlin.codegen.state.jsonEscape[ValueParameterDescriptorImpl]

'length' @ [130:28] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'value' @ [131:18] ==> value-parameter value: String defined in org.jetbrains.kotlin.codegen.state.jsonEscape[ValueParameterDescriptorImpl]

'index' @ [131:24] ==> val index: Int defined in org.jetbrains.kotlin.codegen.state.jsonEscape.<anonymous>[LocalVariableDescriptor]

'when (ch) {
            '\b' -> append("\\b")
            '\t' -> append("\\t")
            '\n' -> append("\\n")
            '\r' -> append("\\r")
            '\"' -> append("\\\"")
            '\\' -> append("\\\\")
            else -> if (ch.toInt() < 32) {
                append("\\u" + Integer.toHexString(ch.toInt()).padStart(4, '0'))
            }
            else {
                append(ch)
            }
        }' @ [132:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (StringBuilder..StringBuilder?), entry1: (StringBuilder..StringBuilder?), entry2: (StringBuilder..StringBuilder?), entry3: (StringBuilder..StringBuilder?), entry4: (StringBuilder..StringBuilder?), entry5: (StringBuilder..StringBuilder?), entry6: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'ch' @ [132:15] ==> val ch: Char defined in org.jetbrains.kotlin.codegen.state.jsonEscape.<anonymous>[LocalVariableDescriptor]

'append' @ [133:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [134:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [135:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [136:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [137:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [138:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'if (ch.toInt() < 32) {
                append("\\u" + Integer.toHexString(ch.toInt()).padStart(4, '0'))
            }
            else {
                append(ch)
            }' @ [139:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StringBuilder..StringBuilder?), elseBranch: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'ch' @ [139:25] ==> val ch: Char defined in org.jetbrains.kotlin.codegen.state.jsonEscape.<anonymous>[LocalVariableDescriptor]

'toInt' @ [139:28] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'append' @ [140:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'+' @ [140:24] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'toHexString' @ [140:40] ==> public open fun toHexString(p0: Int): (String..String?) defined in java.lang.Integer[JavaMethodDescriptor]

'ch' @ [140:52] ==> val ch: Char defined in org.jetbrains.kotlin.codegen.state.jsonEscape.<anonymous>[LocalVariableDescriptor]

'toInt' @ [140:55] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'padStart' @ [140:64] ==> public fun String.padStart(length: Int, padChar: Char = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [143:17] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'ch' @ [143:24] ==> val ch: Char defined in org.jetbrains.kotlin.codegen.state.jsonEscape.<anonymous>[LocalVariableDescriptor]

