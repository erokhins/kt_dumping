'CodegenTestCase' @ [24:46] ==> public constructor CodegenTestCase() defined in org.jetbrains.kotlin.codegen.CodegenTestCase[JavaClassConstructorDescriptor]

'File' @ [26:23] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'wholeFile' @ [26:28] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.codegen.AbstractBytecodeListingTest.doMultiFileTest[ValueParameterDescriptorImpl]

'parentFile' @ [26:38] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'wholeFile' @ [26:50] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.codegen.AbstractBytecodeListingTest.doMultiFileTest[ValueParameterDescriptorImpl]

'nameWithoutExtension' @ [26:60] ==> public val File.nameWithoutExtension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'compile' @ [27:9] ==> protected/*protected and package*/ open fun compile(@NotNull files: (MutableList<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>..List<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>), @Nullable javaSourceDir: File?): Unit defined in org.jetbrains.kotlin.codegen.AbstractBytecodeListingTest[JavaMethodDescriptor]

'files' @ [27:17] ==> value-parameter files: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeListingTest.doMultiFileTest[ValueParameterDescriptorImpl]

'javaFilesDir' @ [27:24] ==> value-parameter javaFilesDir: File? defined in org.jetbrains.kotlin.codegen.AbstractBytecodeListingTest.doMultiFileTest[ValueParameterDescriptorImpl]

'BytecodeListingTextCollectingVisitor' @ [28:25] ==> public companion object defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[FakeCallableDescriptorForObject]

'getText' @ [28:62] ==> @JvmOverloads public final fun getText(factory: ClassFileFactory, filter: BytecodeListingTextCollectingVisitor.Filter = ..., replaceHash: Boolean = ..., withSignatures: Boolean = ...): String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Companion[SimpleFunctionDescriptorImpl]

'classFileFactory' @ [28:70] ==> protected/*protected and package*/ final var classFileFactory: (ClassFileFactory..ClassFileFactory?) defined in org.jetbrains.kotlin.codegen.AbstractBytecodeListingTest[JavaPropertyDescriptor]

'isWithSignatures' @ [28:105] ==> private final fun isWithSignatures(wholeFile: File): Boolean defined in org.jetbrains.kotlin.codegen.AbstractBytecodeListingTest[SimpleFunctionDescriptorImpl]

'wholeFile' @ [28:122] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.codegen.AbstractBytecodeListingTest.doMultiFileTest[ValueParameterDescriptorImpl]

'assertEqualsToFile' @ [29:25] ==> public open fun assertEqualsToFile(@NotNull expectedFile: File, @NotNull actual: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'txtFile' @ [29:44] ==> val txtFile: File defined in org.jetbrains.kotlin.codegen.AbstractBytecodeListingTest.doMultiFileTest[LocalVariableDescriptor]

'actualTxt' @ [29:53] ==> val actualTxt: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeListingTest.doMultiFileTest[LocalVariableDescriptor]

'WITH_SIGNATURES' @ [33:13] ==> private final val WITH_SIGNATURES: Regex defined in org.jetbrains.kotlin.codegen.AbstractBytecodeListingTest.Companion[PropertyDescriptorImpl]

'containsMatchIn' @ [33:29] ==> public final fun containsMatchIn(input: CharSequence): Boolean defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'wholeFile' @ [33:45] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.codegen.AbstractBytecodeListingTest.isWithSignatures[ValueParameterDescriptorImpl]

'readText' @ [33:55] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Regex' @ [36:39] ==> public companion object defined in kotlin.text.Regex[FakeCallableDescriptorForObject]

'fromLiteral' @ [36:45] ==> public final fun fromLiteral(literal: String): Regex defined in kotlin.text.Regex.Companion[DeserializedSimpleFunctionDescriptor]

'ClassVisitor' @ [40:95] ==> public constructor ClassVisitor(p0: Int) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [40:108] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'JvmOverloads' @ [42:9] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'EMPTY' @ [45:41] ==> public object EMPTY : BytecodeListingTextCollectingVisitor.Filter defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Filter[FakeCallableDescriptorForObject]

'factory' @ [49:17] ==> value-parameter factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Companion.getText[ValueParameterDescriptorImpl]

'getClassFiles' @ [49:25] ==> public fun ClassFileFactory.getClassFiles(): Iterable<OutputFile> defined in org.jetbrains.kotlin.codegen[DeserializedSimpleFunctionDescriptor]

'sortedBy' @ [50:26] ==> public inline fun <T, R : Comparable<String>> Iterable<OutputFile>.sortedBy(crossinline selector: (OutputFile) -> String?): List<OutputFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputFile
    <R : Comparable<R>> -> String

'it' @ [50:37] ==> value-parameter it: OutputFile defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Companion.getText.<anonymous>[ValueParameterDescriptorImpl]

'relativePath' @ [50:40] ==> public abstract val relativePath: String defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedPropertyDescriptor]

'mapNotNull' @ [51:26] ==> public inline fun <T, R : Any> Iterable<OutputFile>.mapNotNull(transform: (OutputFile) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputFile
    <R : Any> -> String

'ClassReader' @ [52:38] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'it' @ [52:50] ==> value-parameter it: OutputFile defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Companion.getText.<anonymous>[ValueParameterDescriptorImpl]

'asByteArray' @ [52:53] ==> public abstract fun asByteArray(): ByteArray defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedSimpleFunctionDescriptor]

'BytecodeListingTextCollectingVisitor' @ [53:43] ==> public constructor BytecodeListingTextCollectingVisitor(filter: BytecodeListingTextCollectingVisitor.Filter, withSignatures: Boolean) defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[ClassConstructorDescriptorImpl]

'filter' @ [53:80] ==> value-parameter filter: BytecodeListingTextCollectingVisitor.Filter = ... defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Companion.getText[ValueParameterDescriptorImpl]

'withSignatures' @ [53:88] ==> value-parameter withSignatures: Boolean = ... defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Companion.getText[ValueParameterDescriptorImpl]

'cr' @ [54:29] ==> val cr: ClassReader defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Companion.getText.<anonymous>[LocalVariableDescriptor]

'accept' @ [54:32] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'visitor' @ [54:39] ==> val visitor: BytecodeListingTextCollectingVisitor defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Companion.getText.<anonymous>[LocalVariableDescriptor]

'SKIP_CODE' @ [54:60] ==> public const final val SKIP_CODE: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'!' @ [56:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'filter' @ [56:34] ==> value-parameter filter: BytecodeListingTextCollectingVisitor.Filter = ... defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Companion.getText[ValueParameterDescriptorImpl]

'shouldWriteClass' @ [56:41] ==> public abstract fun shouldWriteClass(access: Int, name: String): Boolean defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Filter[SimpleFunctionDescriptorImpl]

'cr' @ [56:58] ==> val cr: ClassReader defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Companion.getText.<anonymous>[LocalVariableDescriptor]

'access' @ [56:61] ==> public final val ClassReader.access: Int[MyPropertyDescriptor]

'cr' @ [56:69] ==> val cr: ClassReader defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Companion.getText.<anonymous>[LocalVariableDescriptor]

'className' @ [56:72] ==> public final val ClassReader.className: (String..String?)[MyPropertyDescriptor]

'if (replaceHash) {
                                KotlinTestUtils.replaceHash(visitor.text, "HASH")
                            }
                            else {
                                visitor.text
                            }' @ [60:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'replaceHash' @ [60:33] ==> value-parameter replaceHash: Boolean = ... defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Companion.getText[ValueParameterDescriptorImpl]

'replaceHash' @ [61:49] ==> public open fun replaceHash(@NotNull string: String, @NotNull replacement: String): (String..String?) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'visitor' @ [61:61] ==> val visitor: BytecodeListingTextCollectingVisitor defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Companion.getText.<anonymous>[LocalVariableDescriptor]

'text' @ [61:69] ==> public final val text: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'visitor' @ [64:33] ==> val visitor: BytecodeListingTextCollectingVisitor defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Companion.getText.<anonymous>[LocalVariableDescriptor]

'text' @ [64:41] ==> public final val text: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'joinToString' @ [66:27] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'arrayListOf' @ [83:88] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'arrayListOf' @ [85:43] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<BytecodeListingTextCollectingVisitor.Declaration> /* = ArrayList<BytecodeListingTextCollectingVisitor.Declaration> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Declaration

'arrayListOf' @ [86:36] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'declarationsInsideClass' @ [91:73] ==> private final val declarationsInsideClass: ArrayList<BytecodeListingTextCollectingVisitor.Declaration> /* = ArrayList<BytecodeListingTextCollectingVisitor.Declaration> */ defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'last' @ [91:97] ==> public fun <T> List<BytecodeListingTextCollectingVisitor.Declaration>.last(): BytecodeListingTextCollectingVisitor.Declaration defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Declaration

'annotations' @ [91:104] ==> public final val annotations: MutableList<String> defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Declaration[PropertyDescriptorImpl]

'getType' @ [92:25] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'desc' @ [92:33] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.addAnnotation[ValueParameterDescriptorImpl]

'className' @ [92:39] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'list' @ [93:9] ==> value-parameter list: MutableList<String> = ... defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.addAnnotation[ValueParameterDescriptorImpl]

'add' @ [93:14] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'name' @ [93:21] ==> val name: (String..String?) defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.addAnnotation[LocalVariableDescriptor]

'list' @ [97:9] ==> value-parameter list: MutableList<String> defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.addModifier[ValueParameterDescriptorImpl]

'add' @ [97:14] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'text' @ [97:20] ==> value-parameter text: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.addModifier[ValueParameterDescriptorImpl]

'declarationsInsideClass' @ [100:74] ==> private final val declarationsInsideClass: ArrayList<BytecodeListingTextCollectingVisitor.Declaration> /* = ArrayList<BytecodeListingTextCollectingVisitor.Declaration> */ defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'last' @ [100:98] ==> public fun <T> List<BytecodeListingTextCollectingVisitor.Declaration>.last(): BytecodeListingTextCollectingVisitor.Declaration defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Declaration

'annotations' @ [100:105] ==> public final val annotations: MutableList<String> defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Declaration[PropertyDescriptorImpl]

'access' @ [101:13] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.handleModifiers[ValueParameterDescriptorImpl]

'ACC_PUBLIC' @ [101:24] ==> public const final val ACC_PUBLIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'addModifier' @ [101:41] ==> private final fun addModifier(text: String, list: MutableList<String>): Unit defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[SimpleFunctionDescriptorImpl]

'list' @ [101:63] ==> value-parameter list: MutableList<String> = ... defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.handleModifiers[ValueParameterDescriptorImpl]

'access' @ [102:13] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.handleModifiers[ValueParameterDescriptorImpl]

'ACC_PROTECTED' @ [102:24] ==> public const final val ACC_PROTECTED: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'addModifier' @ [102:44] ==> private final fun addModifier(text: String, list: MutableList<String>): Unit defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[SimpleFunctionDescriptorImpl]

'list' @ [102:69] ==> value-parameter list: MutableList<String> = ... defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.handleModifiers[ValueParameterDescriptorImpl]

'access' @ [103:13] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.handleModifiers[ValueParameterDescriptorImpl]

'ACC_PRIVATE' @ [103:24] ==> public const final val ACC_PRIVATE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'addModifier' @ [103:42] ==> private final fun addModifier(text: String, list: MutableList<String>): Unit defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[SimpleFunctionDescriptorImpl]

'list' @ [103:65] ==> value-parameter list: MutableList<String> = ... defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.handleModifiers[ValueParameterDescriptorImpl]

'access' @ [105:13] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.handleModifiers[ValueParameterDescriptorImpl]

'ACC_SYNTHETIC' @ [105:24] ==> public const final val ACC_SYNTHETIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'addModifier' @ [105:44] ==> private final fun addModifier(text: String, list: MutableList<String>): Unit defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[SimpleFunctionDescriptorImpl]

'list' @ [105:69] ==> value-parameter list: MutableList<String> = ... defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.handleModifiers[ValueParameterDescriptorImpl]

'access' @ [106:13] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.handleModifiers[ValueParameterDescriptorImpl]

'ACC_DEPRECATED' @ [106:24] ==> public const final val ACC_DEPRECATED: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'addModifier' @ [106:45] ==> private final fun addModifier(text: String, list: MutableList<String>): Unit defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[SimpleFunctionDescriptorImpl]

'list' @ [106:71] ==> value-parameter list: MutableList<String> = ... defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.handleModifiers[ValueParameterDescriptorImpl]

'access' @ [107:13] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.handleModifiers[ValueParameterDescriptorImpl]

'ACC_FINAL' @ [107:24] ==> public const final val ACC_FINAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'addModifier' @ [107:40] ==> private final fun addModifier(text: String, list: MutableList<String>): Unit defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[SimpleFunctionDescriptorImpl]

'list' @ [107:61] ==> value-parameter list: MutableList<String> = ... defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.handleModifiers[ValueParameterDescriptorImpl]

'access' @ [108:13] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.handleModifiers[ValueParameterDescriptorImpl]

'ACC_ABSTRACT' @ [108:24] ==> public const final val ACC_ABSTRACT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'access' @ [108:45] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.handleModifiers[ValueParameterDescriptorImpl]

'ACC_INTERFACE' @ [108:56] ==> public const final val ACC_INTERFACE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'addModifier' @ [108:76] ==> private final fun addModifier(text: String, list: MutableList<String>): Unit defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[SimpleFunctionDescriptorImpl]

'list' @ [108:100] ==> value-parameter list: MutableList<String> = ... defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.handleModifiers[ValueParameterDescriptorImpl]

'access' @ [109:13] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.handleModifiers[ValueParameterDescriptorImpl]

'ACC_STATIC' @ [109:24] ==> public const final val ACC_STATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'addModifier' @ [109:41] ==> private final fun addModifier(text: String, list: MutableList<String>): Unit defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[SimpleFunctionDescriptorImpl]

'list' @ [109:63] ==> value-parameter list: MutableList<String> = ... defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.handleModifiers[ValueParameterDescriptorImpl]

'when {
            access and ACC_ANNOTATION != 0 -> "annotation class"
            access and ACC_ENUM != 0 -> "enum class"
            access and ACC_INTERFACE != 0 -> "interface"
            else -> "class"
        }' @ [113:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'access' @ [114:13] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.classOrInterface[ValueParameterDescriptorImpl]

'ACC_ANNOTATION' @ [114:24] ==> public const final val ACC_ANNOTATION: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'access' @ [115:13] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.classOrInterface[ValueParameterDescriptorImpl]

'ACC_ENUM' @ [115:24] ==> public const final val ACC_ENUM: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'access' @ [116:13] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.classOrInterface[ValueParameterDescriptorImpl]

'ACC_INTERFACE' @ [116:24] ==> public const final val ACC_INTERFACE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'StringBuilder' @ [122:17] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'apply' @ [122:33] ==> @InlineOnly public inline fun <T> StringBuilder /* = StringBuilder */.apply(block: StringBuilder /* = StringBuilder */.() -> Unit): StringBuilder /* = StringBuilder */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StringBuilder

'classAnnotations' @ [123:17] ==> private final val classAnnotations: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'isNotEmpty' @ [123:34] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'append' @ [124:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'classAnnotations' @ [124:24] ==> private final val classAnnotations: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'joinToString' @ [124:41] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'arrayListOf' @ [126:13] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'apply' @ [126:35] ==> @InlineOnly public inline fun <T> ArrayList<String> /* = ArrayList<String> */.apply(block: ArrayList<String> /* = ArrayList<String> */.() -> Unit): ArrayList<String> /* = ArrayList<String> */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<String>

'handleModifiers' @ [126:43] ==> private final fun handleModifiers(access: Int, list: MutableList<String> = ...): Unit defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[SimpleFunctionDescriptorImpl]

'classAccess' @ [126:59] ==> private final var classAccess: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'this' @ [126:72] ==> <this> defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.<get-text>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'forEach' @ [126:80] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'append' @ [126:90] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [126:97] ==> value-parameter it: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.<get-text>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'append' @ [127:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'classOrInterface' @ [127:20] ==> private final fun classOrInterface(access: Int): String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[SimpleFunctionDescriptorImpl]

'classAccess' @ [127:37] ==> private final var classAccess: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'withSignatures' @ [128:17] ==> public final val withSignatures: Boolean defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'append' @ [129:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'classSignature' @ [129:27] ==> private final var classSignature: String? defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'append' @ [131:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [132:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'className' @ [132:20] ==> private final var className: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'declarationsInsideClass' @ [133:17] ==> private final val declarationsInsideClass: ArrayList<BytecodeListingTextCollectingVisitor.Declaration> /* = ArrayList<BytecodeListingTextCollectingVisitor.Declaration> */ defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'isNotEmpty' @ [133:41] ==> @InlineOnly public inline fun <T> Collection<BytecodeListingTextCollectingVisitor.Declaration>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Declaration

'append' @ [134:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'declarationsInsideClass' @ [135:37] ==> private final val declarationsInsideClass: ArrayList<BytecodeListingTextCollectingVisitor.Declaration> /* = ArrayList<BytecodeListingTextCollectingVisitor.Declaration> */ defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'sortedBy' @ [135:61] ==> public inline fun <T, R : Comparable<String>> Iterable<BytecodeListingTextCollectingVisitor.Declaration>.sortedBy(crossinline selector: (BytecodeListingTextCollectingVisitor.Declaration) -> String?): List<BytecodeListingTextCollectingVisitor.Declaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Declaration
    <R : Comparable<R>> -> String

'it' @ [135:72] ==> value-parameter it: BytecodeListingTextCollectingVisitor.Declaration defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.<get-text>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [135:75] ==> public final val text: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Declaration[PropertyDescriptorImpl]

'append' @ [136:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [136:36] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'declaration' @ [136:43] ==> val declaration: BytecodeListingTextCollectingVisitor.Declaration defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.<get-text>.<anonymous>[LocalVariableDescriptor]

'annotations' @ [136:55] ==> public final val annotations: MutableList<String> defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Declaration[PropertyDescriptorImpl]

'joinToString' @ [136:67] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'append' @ [136:85] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'declaration' @ [136:92] ==> val declaration: BytecodeListingTextCollectingVisitor.Declaration defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.<get-text>.<anonymous>[LocalVariableDescriptor]

'text' @ [136:104] ==> public final val text: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Declaration[PropertyDescriptorImpl]

'append' @ [136:110] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [138:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'toString' @ [140:11] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'!' @ [149:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'filter' @ [149:14] ==> public final val filter: BytecodeListingTextCollectingVisitor.Filter defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'shouldWriteMethod' @ [149:21] ==> public abstract fun shouldWriteMethod(access: Int, name: String, desc: String): Boolean defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Filter[SimpleFunctionDescriptorImpl]

'access' @ [149:39] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod[ValueParameterDescriptorImpl]

'name' @ [149:47] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod[ValueParameterDescriptorImpl]

'desc' @ [149:53] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod[ValueParameterDescriptorImpl]

'getReturnType' @ [153:31] ==> public open fun getReturnType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'desc' @ [153:45] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod[ValueParameterDescriptorImpl]

'className' @ [153:51] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'getArgumentTypes' @ [154:35] ==> public open fun getArgumentTypes(p0: (String..String?)): (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'desc' @ [154:52] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod[ValueParameterDescriptorImpl]

'map' @ [154:58] ==> public inline fun <T, R> Array<out (Type..Type?)>.map(transform: ((Type..Type?)) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [154:64] ==> value-parameter it: (Type..Type?) defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<anonymous>[ValueParameterDescriptorImpl]

'className' @ [154:67] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'arrayListOf' @ [155:33] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'hashMapOf' @ [156:36] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<Int, MutableList<String>> /* = HashMap<Int, MutableList<String>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> MutableList<String>

'handleModifiers' @ [158:9] ==> private final fun handleModifiers(access: Int, list: MutableList<String> = ...): Unit defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[SimpleFunctionDescriptorImpl]

'access' @ [158:25] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod[ValueParameterDescriptorImpl]

'methodAnnotations' @ [158:33] ==> val methodAnnotations: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod[LocalVariableDescriptor]

'MethodVisitor' @ [160:25] ==> public constructor MethodVisitor(p0: Int) defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [160:39] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'getType' @ [162:33] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'desc' @ [162:41] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'className' @ [162:47] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'methodAnnotations' @ [163:17] ==> val methodAnnotations: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod[LocalVariableDescriptor]

'type' @ [163:41] ==> val type: (String..String?) defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<no name provided>.visitAnnotation[LocalVariableDescriptor]

'super' @ [164:24] ==> <this> defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitAnnotation' @ [164:30] ==> public open fun visitAnnotation(p0: (String..String?), p1: Boolean): (AnnotationVisitor..AnnotationVisitor?) defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'desc' @ [164:46] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'visible' @ [164:52] ==> value-parameter visible: Boolean defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'getType' @ [168:33] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'desc' @ [168:41] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<no name provided>.visitParameterAnnotation[ValueParameterDescriptorImpl]

'className' @ [168:47] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'parameterAnnotations' @ [169:17] ==> val parameterAnnotations: HashMap<Int, MutableList<String>> /* = HashMap<Int, MutableList<String>> */ defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod[LocalVariableDescriptor]

'getOrPut' @ [169:38] ==> public inline fun <K, V> MutableMap<Int, MutableList<String>>.getOrPut(key: Int, defaultValue: () -> MutableList<String>): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> MutableList<String>

'parameter' @ [169:47] ==> value-parameter parameter: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<no name provided>.visitParameterAnnotation[ValueParameterDescriptorImpl]

'arrayListOf' @ [169:60] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'add' @ [169:77] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'type' @ [169:84] ==> val type: (String..String?) defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<no name provided>.visitParameterAnnotation[LocalVariableDescriptor]

'super' @ [170:24] ==> <this> defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitParameterAnnotation' @ [170:30] ==> public open fun visitParameterAnnotation(p0: Int, p1: (String..String?), p2: Boolean): (AnnotationVisitor..AnnotationVisitor?) defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'parameter' @ [170:55] ==> value-parameter parameter: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<no name provided>.visitParameterAnnotation[ValueParameterDescriptorImpl]

'desc' @ [170:66] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<no name provided>.visitParameterAnnotation[ValueParameterDescriptorImpl]

'visible' @ [170:72] ==> value-parameter visible: Boolean defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<no name provided>.visitParameterAnnotation[ValueParameterDescriptorImpl]

'parameterTypes' @ [174:48] ==> val parameterTypes: List<(String..String?)> defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod[LocalVariableDescriptor]

'mapIndexed' @ [174:63] ==> public inline fun <T, R> Iterable<(String..String?)>.mapIndexed(transform: (index: Int, (String..String?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> String

'parameterAnnotations' @ [175:39] ==> val parameterAnnotations: HashMap<Int, MutableList<String>> /* = HashMap<Int, MutableList<String>> */ defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod[LocalVariableDescriptor]

'getOrElse' @ [175:60] ==> @InlineOnly public inline fun <K, V> Map<Int, List<String>>.getOrElse(key: Int, defaultValue: () -> List<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> List<String>

'index' @ [175:70] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<no name provided>.visitEnd.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [175:79] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'joinToString' @ [175:102] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'annotations' @ [176:24] ==> val annotations: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<no name provided>.visitEnd.<anonymous>[LocalVariableDescriptor]

'index' @ [176:38] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<no name provided>.visitEnd.<anonymous>[ValueParameterDescriptorImpl]

'parameter' @ [176:46] ==> value-parameter parameter: (String..String?) defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<no name provided>.visitEnd.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [177:19] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'if (withSignatures) "<$signature> " else ""' @ [178:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'withSignatures' @ [178:47] ==> public final val withSignatures: Boolean defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'signature' @ [178:66] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod[ValueParameterDescriptorImpl]

'declarationsInsideClass' @ [179:17] ==> private final val declarationsInsideClass: ArrayList<BytecodeListingTextCollectingVisitor.Declaration> /* = ArrayList<BytecodeListingTextCollectingVisitor.Declaration> */ defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'add' @ [179:41] ==> public open fun add(element: BytecodeListingTextCollectingVisitor.Declaration): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Declaration' @ [180:25] ==> public constructor Declaration(text: String, annotations: MutableList<String> = ...) defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Declaration[ClassConstructorDescriptorImpl]

'signatureIfRequired' @ [180:40] ==> val signatureIfRequired: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<no name provided>.visitEnd[LocalVariableDescriptor]

'name' @ [180:68] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod[ValueParameterDescriptorImpl]

'parameterWithAnnotations' @ [180:74] ==> val parameterWithAnnotations: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<no name provided>.visitEnd[LocalVariableDescriptor]

'returnType' @ [180:102] ==> val returnType: (String..String?) defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod[LocalVariableDescriptor]

'methodAnnotations' @ [180:115] ==> val methodAnnotations: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod[LocalVariableDescriptor]

'super' @ [182:17] ==> <this> defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitMethod.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitEnd' @ [182:23] ==> public open fun visitEnd(): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'!' @ [188:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'filter' @ [188:14] ==> public final val filter: BytecodeListingTextCollectingVisitor.Filter defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'shouldWriteField' @ [188:21] ==> public abstract fun shouldWriteField(access: Int, name: String, desc: String): Boolean defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Filter[SimpleFunctionDescriptorImpl]

'access' @ [188:38] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitField[ValueParameterDescriptorImpl]

'name' @ [188:46] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitField[ValueParameterDescriptorImpl]

'desc' @ [188:52] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitField[ValueParameterDescriptorImpl]

'getType' @ [192:25] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'desc' @ [192:33] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitField[ValueParameterDescriptorImpl]

'className' @ [192:39] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'if (withSignatures) "<$signature> " else ""' @ [193:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'withSignatures' @ [193:34] ==> public final val withSignatures: Boolean defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'signature' @ [193:53] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitField[ValueParameterDescriptorImpl]

'Declaration' @ [194:32] ==> public constructor Declaration(text: String, annotations: MutableList<String> = ...) defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Declaration[ClassConstructorDescriptorImpl]

'fieldSignature' @ [194:52] ==> val fieldSignature: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitField[LocalVariableDescriptor]

'name' @ [194:67] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitField[ValueParameterDescriptorImpl]

'type' @ [194:74] ==> val type: (String..String?) defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitField[LocalVariableDescriptor]

'declarationsInsideClass' @ [195:9] ==> private final val declarationsInsideClass: ArrayList<BytecodeListingTextCollectingVisitor.Declaration> /* = ArrayList<BytecodeListingTextCollectingVisitor.Declaration> */ defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'add' @ [195:33] ==> public open fun add(element: BytecodeListingTextCollectingVisitor.Declaration): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'fieldDeclaration' @ [195:37] ==> val fieldDeclaration: BytecodeListingTextCollectingVisitor.Declaration defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitField[LocalVariableDescriptor]

'handleModifiers' @ [196:9] ==> private final fun handleModifiers(access: Int, list: MutableList<String> = ...): Unit defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[SimpleFunctionDescriptorImpl]

'access' @ [196:25] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitField[ValueParameterDescriptorImpl]

'access' @ [197:13] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitField[ValueParameterDescriptorImpl]

'ACC_VOLATILE' @ [197:24] ==> public const final val ACC_VOLATILE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'addModifier' @ [197:43] ==> private final fun addModifier(text: String, list: MutableList<String>): Unit defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[SimpleFunctionDescriptorImpl]

'fieldDeclaration' @ [197:67] ==> val fieldDeclaration: BytecodeListingTextCollectingVisitor.Declaration defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitField[LocalVariableDescriptor]

'annotations' @ [197:84] ==> public final val annotations: MutableList<String> defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Declaration[PropertyDescriptorImpl]

'FieldVisitor' @ [199:25] ==> public constructor FieldVisitor(p0: Int) defined in org.jetbrains.org.objectweb.asm.FieldVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [199:38] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'addAnnotation' @ [201:17] ==> private final fun addAnnotation(desc: String, list: MutableList<String> = ...): Unit defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[SimpleFunctionDescriptorImpl]

'desc' @ [201:31] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitField.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'super' @ [202:24] ==> <this> defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitField.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitAnnotation' @ [202:30] ==> public open fun visitAnnotation(p0: (String..String?), p1: Boolean): (AnnotationVisitor..AnnotationVisitor?) defined in org.jetbrains.org.objectweb.asm.FieldVisitor[JavaMethodDescriptor]

'desc' @ [202:46] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitField.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'visible' @ [202:52] ==> value-parameter visible: Boolean defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitField.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'getType' @ [208:25] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'desc' @ [208:33] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitAnnotation[ValueParameterDescriptorImpl]

'className' @ [208:39] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'classAnnotations' @ [209:9] ==> private final val classAnnotations: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'add' @ [209:26] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'name' @ [209:33] ==> val name: (String..String?) defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitAnnotation[LocalVariableDescriptor]

'super' @ [210:16] ==> <this> defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[LazyClassReceiverParameterDescriptor]

'visitAnnotation' @ [210:22] ==> public open fun visitAnnotation(p0: (String..String?), p1: Boolean): (AnnotationVisitor..AnnotationVisitor?) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaMethodDescriptor]

'desc' @ [210:38] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitAnnotation[ValueParameterDescriptorImpl]

'visible' @ [210:44] ==> value-parameter visible: Boolean defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitAnnotation[ValueParameterDescriptorImpl]

'className' @ [221:9] ==> private final var className: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'name' @ [221:21] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visit[ValueParameterDescriptorImpl]

'classAccess' @ [222:9] ==> private final var classAccess: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'access' @ [222:23] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visit[ValueParameterDescriptorImpl]

'classSignature' @ [223:9] ==> private final var classSignature: String? defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'signature' @ [223:26] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visit[ValueParameterDescriptorImpl]

'!' @ [227:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'filter' @ [227:14] ==> public final val filter: BytecodeListingTextCollectingVisitor.Filter defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'shouldWriteInnerClass' @ [227:21] ==> public abstract fun shouldWriteInnerClass(name: String): Boolean defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Filter[SimpleFunctionDescriptorImpl]

'name' @ [227:43] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitInnerClass[ValueParameterDescriptorImpl]

'declarationsInsideClass' @ [230:9] ==> private final val declarationsInsideClass: ArrayList<BytecodeListingTextCollectingVisitor.Declaration> /* = ArrayList<BytecodeListingTextCollectingVisitor.Declaration> */ defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor[PropertyDescriptorImpl]

'add' @ [230:33] ==> public open fun add(element: BytecodeListingTextCollectingVisitor.Declaration): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Declaration' @ [230:37] ==> public constructor Declaration(text: String, annotations: MutableList<String> = ...) defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.Declaration[ClassConstructorDescriptorImpl]

'name' @ [230:63] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.BytecodeListingTextCollectingVisitor.visitInnerClass[ValueParameterDescriptorImpl]

