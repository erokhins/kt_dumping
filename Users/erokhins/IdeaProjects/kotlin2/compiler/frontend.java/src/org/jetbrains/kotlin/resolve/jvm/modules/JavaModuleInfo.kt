'moduleName' @ [41:22] ==> public final val moduleName: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo[PropertyDescriptorImpl]

'requires' @ [41:36] ==> public final val requires: List<JavaModuleInfo.Requires> defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo[PropertyDescriptorImpl]

'size' @ [41:45] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'exports' @ [41:63] ==> public final val exports: List<JavaModuleInfo.Exports> defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo[PropertyDescriptorImpl]

'size' @ [41:71] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'JavaModuleInfo' @ [45:20] ==> public constructor JavaModuleInfo(moduleName: String, requires: List<JavaModuleInfo.Requires>, exports: List<JavaModuleInfo.Exports>) defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo[ClassConstructorDescriptorImpl]

'psiJavaModule' @ [46:21] ==> value-parameter psiJavaModule: PsiJavaModule defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.create[ValueParameterDescriptorImpl]

'name' @ [46:35] ==> public final var PsiJavaModule.name: String[MyPropertyDescriptor]

'psiJavaModule' @ [47:21] ==> value-parameter psiJavaModule: PsiJavaModule defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.create[ValueParameterDescriptorImpl]

'requires' @ [47:35] ==> public final val PsiJavaModule.requires: (MutableIterable<(PsiRequiresStatement..PsiRequiresStatement?)>..Iterable<(PsiRequiresStatement..PsiRequiresStatement?)>)[MyPropertyDescriptor]

'mapNotNull' @ [47:44] ==> public inline fun <T, R : Any> Iterable<(PsiRequiresStatement..PsiRequiresStatement?)>.mapNotNull(transform: ((PsiRequiresStatement..PsiRequiresStatement?)) -> JavaModuleInfo.Requires?): List<JavaModuleInfo.Requires> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiRequiresStatement..com.intellij.psi.PsiRequiresStatement?)
    <R : Any> -> Requires

'statement' @ [48:25] ==> value-parameter statement: (PsiRequiresStatement..PsiRequiresStatement?) defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'moduleName' @ [48:35] ==> public final val PsiRequiresStatement.moduleName: String?[MyPropertyDescriptor]

'let' @ [48:47] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> JavaModuleInfo.Requires): JavaModuleInfo.Requires defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Requires

'JavaModuleInfo' @ [49:29] ==> public companion object defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo[FakeCallableDescriptorForObject]

'Requires' @ [49:44] ==> public constructor Requires(moduleName: String, isTransitive: Boolean) defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Requires[ClassConstructorDescriptorImpl]

'moduleName' @ [49:53] ==> value-parameter moduleName: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.create.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'statement' @ [49:65] ==> value-parameter statement: (PsiRequiresStatement..PsiRequiresStatement?) defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [49:75] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiRequiresStatement[JavaMethodDescriptor]

'TRANSITIVE' @ [49:107] ==> public const final val TRANSITIVE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'psiJavaModule' @ [52:21] ==> value-parameter psiJavaModule: PsiJavaModule defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.create[ValueParameterDescriptorImpl]

'exports' @ [52:35] ==> public final val PsiJavaModule.exports: (MutableIterable<(PsiPackageAccessibilityStatement..PsiPackageAccessibilityStatement?)>..Iterable<(PsiPackageAccessibilityStatement..PsiPackageAccessibilityStatement?)>)[MyPropertyDescriptor]

'mapNotNull' @ [52:43] ==> public inline fun <T, R : Any> Iterable<(PsiPackageAccessibilityStatement..PsiPackageAccessibilityStatement?)>.mapNotNull(transform: ((PsiPackageAccessibilityStatement..PsiPackageAccessibilityStatement?)) -> JavaModuleInfo.Exports?): List<JavaModuleInfo.Exports> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiPackageAccessibilityStatement..com.intellij.psi.PsiPackageAccessibilityStatement?)
    <R : Any> -> Exports

'statement' @ [53:25] ==> value-parameter statement: (PsiPackageAccessibilityStatement..PsiPackageAccessibilityStatement?) defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'packageName' @ [53:35] ==> public final val PsiPackageAccessibilityStatement.packageName: String?[MyPropertyDescriptor]

'let' @ [53:48] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> JavaModuleInfo.Exports): JavaModuleInfo.Exports defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Exports

'JavaModuleInfo' @ [54:29] ==> public companion object defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo[FakeCallableDescriptorForObject]

'Exports' @ [54:44] ==> public constructor Exports(packageFqName: FqName, toModules: List<String>) defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Exports[ClassConstructorDescriptorImpl]

'FqName' @ [54:52] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'packageName' @ [54:59] ==> value-parameter packageName: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.create.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'statement' @ [54:73] ==> value-parameter statement: (PsiPackageAccessibilityStatement..PsiPackageAccessibilityStatement?) defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'moduleNames' @ [54:83] ==> public final val PsiPackageAccessibilityStatement.moduleNames: (MutableList<(String..String?)>..List<(String..String?)>)[MyPropertyDescriptor]

'file' @ [61:34] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.read[ValueParameterDescriptorImpl]

'contentsToByteArray' @ [61:39] ==> @NotNull public abstract fun contentsToByteArray(): ByteArray defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'arrayListOf' @ [64:28] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<JavaModuleInfo.Requires> /* = ArrayList<JavaModuleInfo.Requires> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Requires

'arrayListOf' @ [65:27] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<JavaModuleInfo.Exports> /* = ArrayList<JavaModuleInfo.Exports> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Exports

'ClassReader' @ [67:13] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'contents' @ [67:25] ==> val contents: ByteArray defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.read[LocalVariableDescriptor]

'accept' @ [67:35] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'ClassVisitor' @ [67:51] ==> public constructor ClassVisitor(p0: Int) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaClassConstructorDescriptor]

'ASM6' @ [67:72] ==> public const final val ASM6: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'moduleName' @ [69:21] ==> var moduleName: String? defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.read[LocalVariableDescriptor]

'name' @ [69:34] ==> value-parameter name: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.read.<no name provided>.visitModule[ValueParameterDescriptorImpl]

'ModuleVisitor' @ [71:37] ==> public constructor ModuleVisitor(p0: Int) defined in org.jetbrains.org.objectweb.asm.ModuleVisitor[JavaClassConstructorDescriptor]

'ASM6' @ [71:59] ==> public const final val ASM6: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'requires' @ [73:29] ==> val requires: ArrayList<JavaModuleInfo.Requires> /* = ArrayList<JavaModuleInfo.Requires> */ defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.read[LocalVariableDescriptor]

'add' @ [73:38] ==> public open fun add(element: JavaModuleInfo.Requires): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Requires' @ [73:42] ==> public constructor Requires(moduleName: String, isTransitive: Boolean) defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Requires[ClassConstructorDescriptorImpl]

'module' @ [73:51] ==> value-parameter module: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.read.<no name provided>.visitModule.<no name provided>.visitRequire[ValueParameterDescriptorImpl]

'!=' @ [73:59] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'access' @ [73:60] ==> value-parameter access: Int defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.read.<no name provided>.visitModule.<no name provided>.visitRequire[ValueParameterDescriptorImpl]

'ACC_TRANSITIVE' @ [73:71] ==> public const final val ACC_TRANSITIVE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'exports' @ [78:29] ==> val exports: ArrayList<JavaModuleInfo.Exports> /* = ArrayList<JavaModuleInfo.Exports> */ defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.read[LocalVariableDescriptor]

'add' @ [78:37] ==> public open fun add(element: JavaModuleInfo.Exports): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Exports' @ [78:41] ==> public constructor Exports(packageFqName: FqName, toModules: List<String>) defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Exports[ClassConstructorDescriptorImpl]

'FqName' @ [78:49] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'packageFqName' @ [78:56] ==> value-parameter packageFqName: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.read.<no name provided>.visitModule.<no name provided>.visitExport[ValueParameterDescriptorImpl]

'replace' @ [78:70] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'modules' @ [78:90] ==> value-parameter modules: Array<String>? defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.read.<no name provided>.visitModule.<no name provided>.visitExport[ValueParameterDescriptorImpl]

'toList' @ [78:99] ==> public fun <T> Array<out String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'orEmpty' @ [78:108] ==> @InlineOnly public inline fun <T> List<String>?.orEmpty(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'or' @ [82:16] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'SKIP_DEBUG' @ [82:28] ==> public const final val SKIP_DEBUG: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'SKIP_CODE' @ [82:54] ==> public const final val SKIP_CODE: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'SKIP_FRAMES' @ [82:79] ==> public const final val SKIP_FRAMES: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'if (moduleName != null)
                JavaModuleInfo(moduleName!!, requires.compact(), exports.compact())
            else null' @ [84:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JavaModuleInfo?, elseBranch: JavaModuleInfo?): JavaModuleInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JavaModuleInfo?

'moduleName' @ [84:24] ==> var moduleName: String? defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.read[LocalVariableDescriptor]

'JavaModuleInfo' @ [85:17] ==> public constructor JavaModuleInfo(moduleName: String, requires: List<JavaModuleInfo.Requires>, exports: List<JavaModuleInfo.Exports>) defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo[ClassConstructorDescriptorImpl]

'moduleName' @ [85:32] ==> var moduleName: String? defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.read[LocalVariableDescriptor]

'requires' @ [85:46] ==> val requires: ArrayList<JavaModuleInfo.Requires> /* = ArrayList<JavaModuleInfo.Requires> */ defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.read[LocalVariableDescriptor]

'compact' @ [85:55] ==> public fun <T> ArrayList<JavaModuleInfo.Requires>.compact(): List<JavaModuleInfo.Requires> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Requires

'exports' @ [85:66] ==> val exports: ArrayList<JavaModuleInfo.Exports> /* = ArrayList<JavaModuleInfo.Exports> */ defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion.read[LocalVariableDescriptor]

'compact' @ [85:74] ==> public fun <T> ArrayList<JavaModuleInfo.Exports>.compact(): List<JavaModuleInfo.Exports> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Exports

