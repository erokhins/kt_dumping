'AbstractAnnotationDescriptorResolveTest' @ [24:50] ==> public constructor AbstractAnnotationDescriptorResolveTest() defined in org.jetbrains.kotlin.resolve.annotation.AbstractAnnotationDescriptorResolveTest[JavaClassConstructorDescriptor]

'loadFile' @ [26:33] ==> @NotNull public open fun loadFile(@NotNull p0: File, p1: Boolean): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [26:42] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [26:47] ==> value-parameter path: String defined in org.jetbrains.kotlin.resolve.annotation.AbstractAnnotationParameterTest.doTest[ValueParameterDescriptorImpl]

'getPackage' @ [27:27] ==> @NotNull protected/*protected and package*/ open fun getPackage(@NotNull content: String): PackageFragmentDescriptor defined in org.jetbrains.kotlin.resolve.annotation.AbstractAnnotationParameterTest[JavaMethodDescriptor]

'fileText' @ [27:38] ==> val fileText: String defined in org.jetbrains.kotlin.resolve.annotation.AbstractAnnotationParameterTest.doTest[LocalVariableDescriptor]

'getClassDescriptor' @ [28:71] ==> @NotNull protected/*protected static*/ open fun getClassDescriptor(@NotNull packageView: PackageFragmentDescriptor, @NotNull name: String): ClassDescriptor defined in org.jetbrains.kotlin.resolve.annotation.AbstractAnnotationDescriptorResolveTest[JavaMethodDescriptor]

'packageView' @ [28:90] ==> val packageView: PackageFragmentDescriptor defined in org.jetbrains.kotlin.resolve.annotation.AbstractAnnotationParameterTest.doTest[LocalVariableDescriptor]

'findListWithPrefixes' @ [30:46] ==> @NotNull public open fun findListWithPrefixes(@NotNull fileText: String, @NotNull vararg prefixes: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [30:67] ==> val fileText: String defined in org.jetbrains.kotlin.resolve.annotation.AbstractAnnotationParameterTest.doTest[LocalVariableDescriptor]

'joinToString' @ [30:94] ==> public fun <T> Iterable<(String..String?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((String..String?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'getAnnotations' @ [31:62] ==> @NotNull protected/*protected static*/ open fun getAnnotations(member: (DeclarationDescriptor..DeclarationDescriptor?)): String defined in org.jetbrains.kotlin.resolve.annotation.AbstractAnnotationDescriptorResolveTest[JavaMethodDescriptor]

'classDescriptor' @ [31:77] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.annotation.AbstractAnnotationParameterTest.doTest[LocalVariableDescriptor]

'assertEqualsToFile' @ [33:25] ==> public open fun assertEqualsToFile(@NotNull expectedFile: File, @NotNull actual: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'File' @ [33:44] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [33:49] ==> value-parameter path: String defined in org.jetbrains.kotlin.resolve.annotation.AbstractAnnotationParameterTest.doTest[ValueParameterDescriptorImpl]

'fileText' @ [33:56] ==> val fileText: String defined in org.jetbrains.kotlin.resolve.annotation.AbstractAnnotationParameterTest.doTest[LocalVariableDescriptor]

'replace' @ [33:65] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expected' @ [33:73] ==> val expected: String defined in org.jetbrains.kotlin.resolve.annotation.AbstractAnnotationParameterTest.doTest[LocalVariableDescriptor]

'actual' @ [33:83] ==> val actual: String defined in org.jetbrains.kotlin.resolve.annotation.AbstractAnnotationParameterTest.doTest[LocalVariableDescriptor]

