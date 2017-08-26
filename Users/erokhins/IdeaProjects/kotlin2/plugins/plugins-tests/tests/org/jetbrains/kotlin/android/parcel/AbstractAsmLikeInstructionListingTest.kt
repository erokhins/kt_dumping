'getProperty' @ [30:37] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'CodegenTestCase' @ [32:56] ==> public constructor CodegenTestCase() defined in org.jetbrains.kotlin.codegen.CodegenTestCase[JavaClassConstructorDescriptor]

'File' @ [38:23] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'wholeFile' @ [38:28] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.doMultiFileTest[ValueParameterDescriptorImpl]

'parentFile' @ [38:38] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'wholeFile' @ [38:50] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.doMultiFileTest[ValueParameterDescriptorImpl]

'nameWithoutExtension' @ [38:60] ==> public val File.nameWithoutExtension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'compile' @ [39:9] ==> protected/*protected and package*/ open fun compile(@NotNull p0: (MutableList<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>..List<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>), @Nullable p1: File?): Unit defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest[JavaMethodDescriptor]

'files' @ [39:17] ==> value-parameter files: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.doMultiFileTest[ValueParameterDescriptorImpl]

'javaFilesDir' @ [39:24] ==> value-parameter javaFilesDir: File? defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.doMultiFileTest[ValueParameterDescriptorImpl]

'classFileFactory' @ [41:23] ==> protected/*protected and package*/ final var classFileFactory: (ClassFileFactory..ClassFileFactory?) defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest[JavaPropertyDescriptor]

'getClassFiles' @ [42:18] ==> public fun ClassFileFactory.getClassFiles(): Iterable<OutputFile> defined in org.jetbrains.kotlin.codegen[DeserializedSimpleFunctionDescriptor]

'sortedBy' @ [43:18] ==> public inline fun <T, R : Comparable<String>> Iterable<OutputFile>.sortedBy(crossinline selector: (OutputFile) -> String?): List<OutputFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputFile
    <R : Comparable<R>> -> String

'it' @ [43:29] ==> value-parameter it: OutputFile defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.doMultiFileTest.<anonymous>[ValueParameterDescriptorImpl]

'relativePath' @ [43:32] ==> public abstract val relativePath: String defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedPropertyDescriptor]

'map' @ [44:18] ==> public inline fun <T, R> Iterable<OutputFile>.map(transform: (OutputFile) -> ClassNode): List<ClassNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputFile
    <R> -> ClassNode

'ClassNode' @ [44:32] ==> public constructor ClassNode() defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaClassConstructorDescriptor]

'also' @ [44:44] ==> @InlineOnly @SinceKotlin public inline fun <T> ClassNode.also(block: (ClassNode) -> Unit): ClassNode defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassNode

'ClassReader' @ [44:51] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'file' @ [44:63] ==> value-parameter file: OutputFile defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.doMultiFileTest.<anonymous>[ValueParameterDescriptorImpl]

'asByteArray' @ [44:68] ==> public abstract fun asByteArray(): ByteArray defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedSimpleFunctionDescriptor]

'accept' @ [44:83] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'it' @ [44:90] ==> value-parameter it: ClassNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.doMultiFileTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'EXPAND_FRAMES' @ [44:106] ==> public const final val EXPAND_FRAMES: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'wholeFile' @ [46:44] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.doMultiFileTest[ValueParameterDescriptorImpl]

'readLines' @ [46:54] ==> public fun File.readLines(charset: Charset = ...): List<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'filter' @ [47:18] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [47:27] ==> value-parameter it: String defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.doMultiFileTest.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [47:30] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'CURIOUS_ABOUT_DIRECTIVE' @ [47:41] ==> public final val CURIOUS_ABOUT_DIRECTIVE: String defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.Companion[PropertyDescriptorImpl]

'map' @ [48:18] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [48:24] ==> value-parameter it: String defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.doMultiFileTest.<anonymous>[ValueParameterDescriptorImpl]

'substring' @ [48:27] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'CURIOUS_ABOUT_DIRECTIVE' @ [48:37] ==> public final val CURIOUS_ABOUT_DIRECTIVE: String defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.Companion[PropertyDescriptorImpl]

'length' @ [48:61] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'flatMap' @ [49:18] ==> public inline fun <T, R> Iterable<String>.flatMap(transform: (String) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [49:28] ==> value-parameter it: String defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.doMultiFileTest.<anonymous>[ValueParameterDescriptorImpl]

'split' @ [49:31] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [49:42] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [49:48] ==> value-parameter it: String defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.doMultiFileTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'trim' @ [49:51] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEqualsToFile' @ [51:25] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'txtFile' @ [51:44] ==> val txtFile: File defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.doMultiFileTest[LocalVariableDescriptor]

'classes' @ [51:53] ==> val classes: List<ClassNode> defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.doMultiFileTest[LocalVariableDescriptor]

'joinToString' @ [51:61] ==> public fun <T> Iterable<ClassNode>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((ClassNode) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassNode

'LINE_SEPARATOR' @ [51:74] ==> private val LINE_SEPARATOR: (String..String?) defined in org.jetbrains.kotlin.android.parcel in file AbstractAsmLikeInstructionListingTest.kt[PropertyDescriptorImpl]

'repeat' @ [51:89] ==> public fun CharSequence.repeat(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'renderClassNode' @ [52:13] ==> private final fun renderClassNode(clazz: ClassNode, printBytecodeForTheseMethods: List<String>): String defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest[SimpleFunctionDescriptorImpl]

'it' @ [52:29] ==> value-parameter it: ClassNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.doMultiFileTest.<anonymous>[ValueParameterDescriptorImpl]

'printBytecodeForTheseMethods' @ [52:33] ==> val printBytecodeForTheseMethods: List<String> defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.doMultiFileTest[LocalVariableDescriptor]

'clazz' @ [57:23] ==> value-parameter clazz: ClassNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode[ValueParameterDescriptorImpl]

'fields' @ [57:29] ==> public final var fields: (MutableList<(FieldNode..FieldNode?)>..List<(FieldNode..FieldNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'emptyList' @ [57:39] ==> public fun <T> emptyList(): List<(FieldNode..FieldNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.FieldNode..org.jetbrains.org.objectweb.asm.tree.FieldNode?)

'sortedBy' @ [57:52] ==> public inline fun <T, R : Comparable<String>> Iterable<(FieldNode..FieldNode?)>.sortedBy(crossinline selector: ((FieldNode..FieldNode?)) -> String?): List<(FieldNode..FieldNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.FieldNode..org.jetbrains.org.objectweb.asm.tree.FieldNode?)
    <R : Comparable<R>> -> String

'it' @ [57:63] ==> value-parameter it: (FieldNode..FieldNode?) defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [57:66] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldNode[JavaPropertyDescriptor]

'clazz' @ [58:24] ==> value-parameter clazz: ClassNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode[ValueParameterDescriptorImpl]

'methods' @ [58:30] ==> public final var methods: (MutableList<(MethodNode..MethodNode?)>..List<(MethodNode..MethodNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'emptyList' @ [58:41] ==> public fun <T> emptyList(): List<(MethodNode..MethodNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.MethodNode..org.jetbrains.org.objectweb.asm.tree.MethodNode?)

'sortedBy' @ [58:54] ==> public inline fun <T, R : Comparable<String>> Iterable<(MethodNode..MethodNode?)>.sortedBy(crossinline selector: ((MethodNode..MethodNode?)) -> String?): List<(MethodNode..MethodNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.MethodNode..org.jetbrains.org.objectweb.asm.tree.MethodNode?)
    <R : Comparable<R>> -> String

'it' @ [58:65] ==> value-parameter it: (MethodNode..MethodNode?) defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [58:68] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'listOf' @ [60:27] ==> public fun <T> listOf(element: (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'clazz' @ [60:34] ==> value-parameter clazz: ClassNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode[ValueParameterDescriptorImpl]

'superName' @ [60:40] ==> public final var superName: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'clazz' @ [60:53] ==> value-parameter clazz: ClassNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode[ValueParameterDescriptorImpl]

'interfaces' @ [60:59] ==> public final var interfaces: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'filterNotNull' @ [60:71] ==> public fun <T : Any> Iterable<String?>.filterNotNull(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'buildString' @ [62:16] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'renderVisibilityModifiers' @ [63:13] ==> private final fun StringBuilder /* = StringBuilder */.renderVisibilityModifiers(access: Int): Unit defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest[SimpleFunctionDescriptorImpl]

'clazz' @ [63:39] ==> value-parameter clazz: ClassNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode[ValueParameterDescriptorImpl]

'access' @ [63:45] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'renderModalityModifiers' @ [64:13] ==> private final fun StringBuilder /* = StringBuilder */.renderModalityModifiers(access: Int): Unit defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest[SimpleFunctionDescriptorImpl]

'clazz' @ [64:37] ==> value-parameter clazz: ClassNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode[ValueParameterDescriptorImpl]

'access' @ [64:43] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'append' @ [65:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'if ((clazz.access and ACC_INTERFACE) != 0) "interface " else "class "' @ [65:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'!=' @ [65:24] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'clazz' @ [65:25] ==> value-parameter clazz: ClassNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode[ValueParameterDescriptorImpl]

'access' @ [65:31] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'ACC_INTERFACE' @ [65:42] ==> public const final val ACC_INTERFACE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'append' @ [66:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'clazz' @ [66:20] ==> value-parameter clazz: ClassNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode[ValueParameterDescriptorImpl]

'name' @ [66:26] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'superTypes' @ [68:17] ==> val superTypes: List<String> defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode[LocalVariableDescriptor]

'isNotEmpty' @ [68:28] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'append' @ [69:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'+' @ [69:24] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'superTypes' @ [69:32] ==> val superTypes: List<String> defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode[LocalVariableDescriptor]

'joinToString' @ [69:43] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'appendln' @ [72:13] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fields' @ [74:13] ==> val fields: List<(FieldNode..FieldNode?)> defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode[LocalVariableDescriptor]

'joinTo' @ [74:20] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<(FieldNode..FieldNode?)>.joinTo(buffer: StringBuilder /* = StringBuilder */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((FieldNode..FieldNode?)) -> CharSequence)? = ...): StringBuilder /* = StringBuilder */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.FieldNode..org.jetbrains.org.objectweb.asm.tree.FieldNode?)
    <A : Appendable /* = Appendable */> -> StringBuilder

'this' @ [74:27] ==> <this> defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode.<anonymous>[ReceiverParameterDescriptorImpl]

'LINE_SEPARATOR' @ [74:33] ==> private val LINE_SEPARATOR: (String..String?) defined in org.jetbrains.kotlin.android.parcel in file AbstractAsmLikeInstructionListingTest.kt[PropertyDescriptorImpl]

'repeat' @ [74:48] ==> public fun CharSequence.repeat(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'renderField' @ [74:61] ==> private final fun renderField(field: FieldNode): String defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest[SimpleFunctionDescriptorImpl]

'it' @ [74:73] ==> value-parameter it: (FieldNode..FieldNode?) defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'withMargin' @ [74:77] ==> private final fun String.withMargin(margin: String = ...): String defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest[SimpleFunctionDescriptorImpl]

'fields' @ [76:17] ==> val fields: List<(FieldNode..FieldNode?)> defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode[LocalVariableDescriptor]

'isNotEmpty' @ [76:24] ==> @InlineOnly public inline fun <T> Collection<(FieldNode..FieldNode?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.FieldNode..org.jetbrains.org.objectweb.asm.tree.FieldNode?)

'appendln' @ [77:17] ==> public fun StringBuilder /* = StringBuilder */.appendln(): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [77:28] ==> public fun StringBuilder /* = StringBuilder */.appendln(): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'methods' @ [80:13] ==> val methods: List<(MethodNode..MethodNode?)> defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode[LocalVariableDescriptor]

'joinTo' @ [80:21] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<(MethodNode..MethodNode?)>.joinTo(buffer: StringBuilder /* = StringBuilder */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((MethodNode..MethodNode?)) -> CharSequence)? = ...): StringBuilder /* = StringBuilder */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.MethodNode..org.jetbrains.org.objectweb.asm.tree.MethodNode?)
    <A : Appendable /* = Appendable */> -> StringBuilder

'this' @ [80:28] ==> <this> defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode.<anonymous>[ReceiverParameterDescriptorImpl]

'LINE_SEPARATOR' @ [80:34] ==> private val LINE_SEPARATOR: (String..String?) defined in org.jetbrains.kotlin.android.parcel in file AbstractAsmLikeInstructionListingTest.kt[PropertyDescriptorImpl]

'repeat' @ [80:49] ==> public fun CharSequence.repeat(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'printBytecodeForTheseMethods' @ [81:37] ==> value-parameter printBytecodeForTheseMethods: List<String> defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode[ValueParameterDescriptorImpl]

'contains' @ [81:66] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'it' @ [81:75] ==> value-parameter it: (MethodNode..MethodNode?) defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [81:78] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'renderMethod' @ [82:17] ==> private final fun renderMethod(method: MethodNode, printBytecode: Boolean): String defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest[SimpleFunctionDescriptorImpl]

'it' @ [82:30] ==> value-parameter it: (MethodNode..MethodNode?) defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'printBytecode' @ [82:34] ==> val printBytecode: Boolean defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderClassNode.<anonymous>.<anonymous>[LocalVariableDescriptor]

'withMargin' @ [82:49] ==> private final fun String.withMargin(margin: String = ...): String defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest[SimpleFunctionDescriptorImpl]

'appendln' @ [85:13] ==> public fun StringBuilder /* = StringBuilder */.appendln(): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [85:24] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'buildString' @ [89:49] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'renderVisibilityModifiers' @ [90:9] ==> private final fun StringBuilder /* = StringBuilder */.renderVisibilityModifiers(access: Int): Unit defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest[SimpleFunctionDescriptorImpl]

'field' @ [90:35] ==> value-parameter field: FieldNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderField[ValueParameterDescriptorImpl]

'access' @ [90:41] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.FieldNode[JavaPropertyDescriptor]

'renderModalityModifiers' @ [91:9] ==> private final fun StringBuilder /* = StringBuilder */.renderModalityModifiers(access: Int): Unit defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest[SimpleFunctionDescriptorImpl]

'field' @ [91:33] ==> value-parameter field: FieldNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderField[ValueParameterDescriptorImpl]

'access' @ [91:39] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.FieldNode[JavaPropertyDescriptor]

'append' @ [92:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'getType' @ [92:21] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'field' @ [92:29] ==> value-parameter field: FieldNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderField[ValueParameterDescriptorImpl]

'desc' @ [92:35] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldNode[JavaPropertyDescriptor]

'className' @ [92:41] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'append' @ [92:52] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [93:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'field' @ [93:16] ==> value-parameter field: FieldNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderField[ValueParameterDescriptorImpl]

'name' @ [93:22] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldNode[JavaPropertyDescriptor]

'buildString' @ [96:76] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'renderVisibilityModifiers' @ [97:9] ==> private final fun StringBuilder /* = StringBuilder */.renderVisibilityModifiers(access: Int): Unit defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest[SimpleFunctionDescriptorImpl]

'method' @ [97:35] ==> value-parameter method: MethodNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderMethod[ValueParameterDescriptorImpl]

'access' @ [97:42] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'renderModalityModifiers' @ [98:9] ==> private final fun StringBuilder /* = StringBuilder */.renderModalityModifiers(access: Int): Unit defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest[SimpleFunctionDescriptorImpl]

'method' @ [98:33] ==> value-parameter method: MethodNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderMethod[ValueParameterDescriptorImpl]

'access' @ [98:40] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'component1' @ [99:14] ==> public final operator fun component1(): (Type..Type?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [99:26] ==> public final operator fun component2(): (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'with' @ [99:44] ==> @InlineOnly public inline fun <T, R> with(receiver: (Type..Type?), block: (Type..Type?).() -> Pair<(Type..Type?), (Array<(Type..Type?)>..Array<out (Type..Type?)>?)>): Pair<(Type..Type?), (Array<(Type..Type?)>..Array<out (Type..Type?)>?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)
    <R> -> Pair<(org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?), (kotlin.Array<(org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)>..kotlin.Array<out (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)>?)>

'getMethodType' @ [99:54] ==> public open fun getMethodType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'method' @ [99:68] ==> value-parameter method: MethodNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderMethod[ValueParameterDescriptorImpl]

'desc' @ [99:75] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'returnType' @ [99:84] ==> public final val Type.returnType: (Type..Type?)[MyPropertyDescriptor]

'argumentTypes' @ [99:98] ==> public final val Type.argumentTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'append' @ [100:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'returnType' @ [100:16] ==> val returnType: (Type..Type?) defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderMethod.<anonymous>[LocalVariableDescriptor]

'className' @ [100:27] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'append' @ [100:38] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [101:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'method' @ [101:16] ==> value-parameter method: MethodNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderMethod[ValueParameterDescriptorImpl]

'name' @ [101:23] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'parameterTypes' @ [102:9] ==> val parameterTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderMethod.<anonymous>[LocalVariableDescriptor]

'mapIndexed' @ [102:24] ==> public inline fun <T, R> Array<out (Type..Type?)>.mapIndexed(transform: (index: Int, (Type..Type?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)
    <R> -> String

'type' @ [102:55] ==> value-parameter type: (Type..Type?) defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderMethod.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'className' @ [102:60] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'index' @ [102:73] ==> value-parameter index: Int defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderMethod.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'joinTo' @ [102:82] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<String>.joinTo(buffer: StringBuilder /* = StringBuilder */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): StringBuilder /* = StringBuilder */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <A : Appendable /* = Appendable */> -> StringBuilder

'this' @ [102:89] ==> <this> defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderMethod.<anonymous>[ReceiverParameterDescriptorImpl]

'printBytecode' @ [104:13] ==> value-parameter printBytecode: Boolean defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderMethod[ValueParameterDescriptorImpl]

'==' @ [104:30] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'method' @ [104:31] ==> value-parameter method: MethodNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderMethod[ValueParameterDescriptorImpl]

'access' @ [104:38] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'ACC_ABSTRACT' @ [104:49] ==> public const final val ACC_ABSTRACT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'appendln' @ [105:13] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [106:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'renderBytecodeInstructions' @ [106:20] ==> private final fun renderBytecodeInstructions(instructions: InsnList): String defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest[SimpleFunctionDescriptorImpl]

'method' @ [106:47] ==> value-parameter method: MethodNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderMethod[ValueParameterDescriptorImpl]

'instructions' @ [106:54] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'trimEnd' @ [106:68] ==> @InlineOnly public inline fun String.trimEnd(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'withMargin' @ [106:78] ==> private final fun String.withMargin(margin: String = ...): String defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest[SimpleFunctionDescriptorImpl]

'appendln' @ [107:13] ==> public fun StringBuilder /* = StringBuilder */.appendln(): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [107:24] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'buildString' @ [111:70] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'LabelMappings' @ [112:29] ==> public constructor LabelMappings() defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.LabelMappings[ClassConstructorDescriptorImpl]

'instructions' @ [114:27] ==> value-parameter instructions: InsnList defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderBytecodeInstructions[ValueParameterDescriptorImpl]

'first' @ [114:40] ==> public final val InsnList.first: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'currentInsn' @ [115:16] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderBytecodeInstructions.<anonymous>[LocalVariableDescriptor]

'renderInstruction' @ [116:13] ==> private final fun StringBuilder /* = StringBuilder */.renderInstruction(node: AbstractInsnNode, labelMappings: AbstractAsmLikeInstructionListingTest.LabelMappings): Unit defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest[SimpleFunctionDescriptorImpl]

'currentInsn' @ [116:31] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderBytecodeInstructions.<anonymous>[LocalVariableDescriptor]

'labelMappings' @ [116:44] ==> val labelMappings: AbstractAsmLikeInstructionListingTest.LabelMappings defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderBytecodeInstructions.<anonymous>[LocalVariableDescriptor]

'currentInsn' @ [117:13] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderBytecodeInstructions.<anonymous>[LocalVariableDescriptor]

'currentInsn' @ [117:27] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderBytecodeInstructions.<anonymous>[LocalVariableDescriptor]

'next' @ [117:39] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'node' @ [122:13] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderInstruction[ValueParameterDescriptorImpl]

'appendln' @ [123:13] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [123:22] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'labelMappings' @ [123:35] ==> value-parameter labelMappings: AbstractAsmLikeInstructionListingTest.LabelMappings defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderInstruction[ValueParameterDescriptorImpl]

'node' @ [123:49] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderInstruction[ValueParameterDescriptorImpl]

'label' @ [123:54] ==> public final val LabelNode.label: (Label..Label?)[MyPropertyDescriptor]

'node' @ [127:13] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderInstruction[ValueParameterDescriptorImpl]

'appendln' @ [128:13] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [128:22] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'node' @ [128:39] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderInstruction[ValueParameterDescriptorImpl]

'line' @ [128:44] ==> public final var line: Int defined in org.jetbrains.org.objectweb.asm.tree.LineNumberNode[JavaPropertyDescriptor]

'node' @ [132:13] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderInstruction[ValueParameterDescriptorImpl]

'append' @ [134:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [134:22] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'Printer.OPCODES[node.opcode]' @ [134:29] ==> public final operator fun get(index: Int): (String..String?) defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'OPCODES' @ [134:37] ==> public final val OPCODES: (Array<(String..String?)>..Array<out (String..String?)>?) defined in org.jetbrains.org.objectweb.asm.util.Printer[JavaPropertyDescriptor]

'node' @ [134:45] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderInstruction[ValueParameterDescriptorImpl]

'opcode' @ [134:50] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'error' @ [134:61] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'node' @ [134:85] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderInstruction[ValueParameterDescriptorImpl]

'opcode' @ [134:90] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'when (node) {
            is FieldInsnNode -> append(" (" + node.name + ", " + node.desc + ")")
            is JumpInsnNode -> append(" (L" + labelMappings[node.label.label] + ")")
            is IntInsnNode -> append(" (" + node.operand + ")")
            is MethodInsnNode -> append(" (" + node.owner + ", "+ node.name + ", " + node.desc + ")")
            is VarInsnNode -> append(" (" + node.`var` + ")")
            is LdcInsnNode -> append(" (" + node.cst + ")")
        }' @ [136:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (StringBuilder..StringBuilder?), entry1: (StringBuilder..StringBuilder?), entry2: (StringBuilder..StringBuilder?), entry3: (StringBuilder..StringBuilder?), entry4: (StringBuilder..StringBuilder?), entry5: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'node' @ [136:15] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderInstruction[ValueParameterDescriptorImpl]

'append' @ [137:33] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'+' @ [137:40] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'node' @ [137:47] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderInstruction[ValueParameterDescriptorImpl]

'name' @ [137:52] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'node' @ [137:66] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderInstruction[ValueParameterDescriptorImpl]

'desc' @ [137:71] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'append' @ [138:32] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'+' @ [138:39] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'labelMappings' @ [138:47] ==> value-parameter labelMappings: AbstractAsmLikeInstructionListingTest.LabelMappings defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderInstruction[ValueParameterDescriptorImpl]

'node' @ [138:61] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderInstruction[ValueParameterDescriptorImpl]

'label' @ [138:66] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'label' @ [138:72] ==> public final val LabelNode.label: (Label..Label?)[MyPropertyDescriptor]

'append' @ [139:31] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'+' @ [139:38] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'node' @ [139:45] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderInstruction[ValueParameterDescriptorImpl]

'operand' @ [139:50] ==> public final var operand: Int defined in org.jetbrains.org.objectweb.asm.tree.IntInsnNode[JavaPropertyDescriptor]

'append' @ [140:34] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'+' @ [140:41] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'node' @ [140:48] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderInstruction[ValueParameterDescriptorImpl]

'owner' @ [140:53] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'node' @ [140:67] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderInstruction[ValueParameterDescriptorImpl]

'name' @ [140:72] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'node' @ [140:86] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderInstruction[ValueParameterDescriptorImpl]

'desc' @ [140:91] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'append' @ [141:31] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'+' @ [141:38] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'node' @ [141:45] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderInstruction[ValueParameterDescriptorImpl]

'`var`' @ [141:50] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'append' @ [142:31] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'+' @ [142:38] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'node' @ [142:45] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderInstruction[ValueParameterDescriptorImpl]

'cst' @ [142:50] ==> public final var cst: (Any..Any?) defined in org.jetbrains.org.objectweb.asm.tree.LdcInsnNode[JavaPropertyDescriptor]

'appendln' @ [145:9] ==> public fun StringBuilder /* = StringBuilder */.appendln(): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'lineSequence' @ [149:16] ==> public fun CharSequence.lineSequence(): Sequence<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [149:31] ==> public fun <T, R> Sequence<String>.map(transform: (String) -> String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'margin' @ [149:37] ==> value-parameter margin: String = ... defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.withMargin[ValueParameterDescriptorImpl]

'it' @ [149:46] ==> value-parameter it: String defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.withMargin.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [149:51] ==> public fun <T> Sequence<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'LINE_SEPARATOR' @ [149:64] ==> private val LINE_SEPARATOR: (String..String?) defined in org.jetbrains.kotlin.android.parcel in file AbstractAsmLikeInstructionListingTest.kt[PropertyDescriptorImpl]

'!=' @ [153:13] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'access' @ [153:14] ==> value-parameter access: Int defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderVisibilityModifiers[ValueParameterDescriptorImpl]

'ACC_PUBLIC' @ [153:25] ==> public const final val ACC_PUBLIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'append' @ [153:43] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'!=' @ [154:13] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'access' @ [154:14] ==> value-parameter access: Int defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderVisibilityModifiers[ValueParameterDescriptorImpl]

'ACC_PRIVATE' @ [154:25] ==> public const final val ACC_PRIVATE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'append' @ [154:44] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'!=' @ [155:13] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'access' @ [155:14] ==> value-parameter access: Int defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderVisibilityModifiers[ValueParameterDescriptorImpl]

'ACC_PROTECTED' @ [155:25] ==> public const final val ACC_PROTECTED: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'append' @ [155:46] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'!=' @ [159:13] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'access' @ [159:14] ==> value-parameter access: Int defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderModalityModifiers[ValueParameterDescriptorImpl]

'ACC_FINAL' @ [159:25] ==> public const final val ACC_FINAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'append' @ [159:42] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'!=' @ [160:13] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'access' @ [160:14] ==> value-parameter access: Int defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderModalityModifiers[ValueParameterDescriptorImpl]

'ACC_ABSTRACT' @ [160:25] ==> public const final val ACC_ABSTRACT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'append' @ [160:45] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'!=' @ [161:13] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'access' @ [161:14] ==> value-parameter access: Int defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.renderModalityModifiers[ValueParameterDescriptorImpl]

'ACC_STATIC' @ [161:25] ==> public const final val ACC_STATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'append' @ [161:43] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'hashMapOf' @ [165:32] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<Int, Int> /* = HashMap<Int, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> Int

'identityHashCode' @ [169:35] ==> public open fun identityHashCode(p0: (Any..Any?)): Int defined in java.lang.System[JavaMethodDescriptor]

'label' @ [169:52] ==> value-parameter label: Label defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.LabelMappings.get[ValueParameterDescriptorImpl]

'mappings' @ [170:20] ==> private final var mappings: HashMap<Int, Int> /* = HashMap<Int, Int> */ defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.LabelMappings[PropertyDescriptorImpl]

'getOrPut' @ [170:29] ==> public inline fun <K, V> MutableMap<Int, Int>.getOrPut(key: Int, defaultValue: () -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> Int

'hashCode' @ [170:38] ==> val hashCode: Int defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.LabelMappings.get[LocalVariableDescriptor]

'currentIndex' @ [170:50] ==> private final var currentIndex: Int defined in org.jetbrains.kotlin.android.parcel.AbstractAsmLikeInstructionListingTest.LabelMappings[PropertyDescriptorImpl]

