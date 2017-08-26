'getInstance' @ [27:31] ==> public open fun getInstance(p0: (Project..Project?)): (PsiFileFactory..PsiFileFactory?) defined in com.intellij.psi.PsiFileFactory[JavaMethodDescriptor]

'project' @ [27:43] ==> value-parameter project: Project defined in org.jetbrains.kotlin.j2k.JavaToKotlinTranslator.createFile[ValueParameterDescriptorImpl]

'createFileFromText' @ [27:52] ==> public abstract fun createFileFromText(@NotNull p0: String, @NotNull p1: Language, @NotNull p2: CharSequence): (PsiFile..PsiFile?) defined in com.intellij.psi.PsiFileFactory[JavaMethodDescriptor]

'INSTANCE' @ [27:97] ==> @NotNull public final val INSTANCE: JavaLanguage defined in com.intellij.lang.java.JavaLanguage[JavaPropertyDescriptor]

'text' @ [27:107] ==> value-parameter text: String defined in org.jetbrains.kotlin.j2k.JavaToKotlinTranslator.createFile[ValueParameterDescriptorImpl]

'code' @ [31:13] ==> value-parameter code: String? defined in org.jetbrains.kotlin.j2k.JavaToKotlinTranslator.prettify[ValueParameterDescriptorImpl]

'code' @ [35:16] ==> value-parameter code: String? defined in org.jetbrains.kotlin.j2k.JavaToKotlinTranslator.prettify[ValueParameterDescriptorImpl]

'trim' @ [36:18] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [37:18] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [38:18] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [39:18] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [40:18] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [40:32] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [41:18] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [41:31] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trim' @ [42:18] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'createFile' @ [46:20] ==> private final fun createFile(text: String, project: Project): PsiFile? defined in org.jetbrains.kotlin.j2k.JavaToKotlinTranslator[SimpleFunctionDescriptorImpl]

'javaCode' @ [46:31] ==> value-parameter javaCode: String defined in org.jetbrains.kotlin.j2k.JavaToKotlinTranslator.generateKotlinCode[ValueParameterDescriptorImpl]

'project' @ [46:41] ==> value-parameter project: Project defined in org.jetbrains.kotlin.j2k.JavaToKotlinTranslator.generateKotlinCode[ValueParameterDescriptorImpl]

'file' @ [47:13] ==> val file: PsiFile? defined in org.jetbrains.kotlin.j2k.JavaToKotlinTranslator.generateKotlinCode[LocalVariableDescriptor]

'JavaToKotlinConverter' @ [48:29] ==> public constructor JavaToKotlinConverter(project: Project, settings: ConverterSettings, services: JavaToKotlinConverterServices) defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[ClassConstructorDescriptorImpl]

'file' @ [48:51] ==> val file: PsiFile? defined in org.jetbrains.kotlin.j2k.JavaToKotlinTranslator.generateKotlinCode[LocalVariableDescriptor]

'project' @ [48:56] ==> public final val PsiJavaFile.project: Project[MyPropertyDescriptor]

'ConverterSettings' @ [48:65] ==> public companion object defined in org.jetbrains.kotlin.j2k.ConverterSettings[FakeCallableDescriptorForObject]

'defaultSettings' @ [48:83] ==> public final val defaultSettings: ConverterSettings defined in org.jetbrains.kotlin.j2k.ConverterSettings.Companion[PropertyDescriptorImpl]

'EmptyJavaToKotlinServices' @ [48:100] ==> public object EmptyJavaToKotlinServices : JavaToKotlinConverterServices defined in org.jetbrains.kotlin.j2k in file JavaToKotlinConverterServices.kt[FakeCallableDescriptorForObject]

'prettify' @ [49:20] ==> private final fun prettify(code: String?): String defined in org.jetbrains.kotlin.j2k.JavaToKotlinTranslator[SimpleFunctionDescriptorImpl]

'converter' @ [49:29] ==> val converter: JavaToKotlinConverter defined in org.jetbrains.kotlin.j2k.JavaToKotlinTranslator.generateKotlinCode[LocalVariableDescriptor]

'elementsToKotlin' @ [49:39] ==> public final fun elementsToKotlin(inputElements: List<PsiElement>): JavaToKotlinConverter.Result defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[SimpleFunctionDescriptorImpl]

'listOf' @ [49:56] ==> public fun <T> listOf(element: PsiJavaFile): List<PsiJavaFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiJavaFile

'file' @ [49:63] ==> val file: PsiFile? defined in org.jetbrains.kotlin.j2k.JavaToKotlinTranslator.generateKotlinCode[LocalVariableDescriptor]

'results' @ [49:70] ==> public final val results: List<JavaToKotlinConverter.ElementResult?> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.Result[PropertyDescriptorImpl]

'single' @ [49:78] ==> public fun <T> List<JavaToKotlinConverter.ElementResult?>.single(): JavaToKotlinConverter.ElementResult? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ElementResult?

'text' @ [49:89] ==> public final val text: String defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ElementResult[PropertyDescriptorImpl]

'JavaToKotlinTranslator' @ [57:12] ==> public object JavaToKotlinTranslator defined in org.jetbrains.kotlin.j2k in file JavaToKotlinTranslator.kt[FakeCallableDescriptorForObject]

'generateKotlinCode' @ [57:35] ==> public final fun generateKotlinCode(javaCode: String, project: Project): String defined in org.jetbrains.kotlin.j2k.JavaToKotlinTranslator[SimpleFunctionDescriptorImpl]

'code' @ [57:54] ==> value-parameter code: String defined in org.jetbrains.kotlin.j2k.translateToKotlin[ValueParameterDescriptorImpl]

'project' @ [57:60] ==> value-parameter project: Project defined in org.jetbrains.kotlin.j2k.translateToKotlin[ValueParameterDescriptorImpl]

