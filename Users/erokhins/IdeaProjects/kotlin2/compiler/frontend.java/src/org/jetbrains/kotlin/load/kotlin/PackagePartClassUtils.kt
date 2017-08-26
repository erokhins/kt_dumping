'JvmStatic' @ [31:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'file' @ [32:13] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.getPathHashCode[ValueParameterDescriptorImpl]

'path' @ [32:18] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'toLowerCase' @ [32:23] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'hashCode' @ [32:37] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'JvmStatic' @ [36:13] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'when {
                Character.isJavaIdentifierStart(str[0]) -> str.substring(0, 1).toLowerCase(Locale.ENGLISH) + str.substring(1)
                str[0] == '_' -> str.substring(1)
                else -> str
            }' @ [39:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'isJavaIdentifierStart' @ [40:27] ==> public open fun isJavaIdentifierStart(p0: Char): Boolean defined in java.lang.Character[JavaMethodDescriptor]

'str' @ [40:49] ==> value-parameter str: String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.decapitalizeAsJavaClassName[ValueParameterDescriptorImpl]

'str' @ [40:60] ==> value-parameter str: String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.decapitalizeAsJavaClassName[ValueParameterDescriptorImpl]

'substring' @ [40:64] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toLowerCase' @ [40:80] ==> @InlineOnly public inline fun String.toLowerCase(locale: Locale): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ENGLISH' @ [40:99] ==> public final val ENGLISH: (Locale..Locale?) defined in java.util.Locale[JavaPropertyDescriptor]

'str' @ [40:110] ==> value-parameter str: String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.decapitalizeAsJavaClassName[ValueParameterDescriptorImpl]

'substring' @ [40:114] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'str' @ [41:17] ==> value-parameter str: String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.decapitalizeAsJavaClassName[ValueParameterDescriptorImpl]

'str' @ [41:34] ==> value-parameter str: String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.decapitalizeAsJavaClassName[ValueParameterDescriptorImpl]

'substring' @ [41:38] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'str' @ [42:25] ==> value-parameter str: String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.decapitalizeAsJavaClassName[ValueParameterDescriptorImpl]

'TestOnly' @ [45:5] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'JvmStatic' @ [46:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'getPackagePartFqName' @ [47:13] ==> @JvmStatic public final fun getPackagePartFqName(packageFqName: FqName, fileName: String): FqName defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[SimpleFunctionDescriptorImpl]

'facadeClassFqName' @ [47:34] ==> value-parameter facadeClassFqName: FqName defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.getDefaultPartFqName[ValueParameterDescriptorImpl]

'parent' @ [47:52] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'file' @ [47:62] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.getDefaultPartFqName[ValueParameterDescriptorImpl]

'name' @ [47:67] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'JvmStatic' @ [49:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'getFilePartShortName' @ [50:29] ==> @JvmStatic public final fun getFilePartShortName(fileName: String): String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[SimpleFunctionDescriptorImpl]

'fileName' @ [50:50] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.getPackagePartFqName[ValueParameterDescriptorImpl]

'packageFqName' @ [51:16] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.getPackagePartFqName[ValueParameterDescriptorImpl]

'child' @ [51:30] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'identifier' @ [51:41] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'partClassName' @ [51:52] ==> val partClassName: String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.getPackagePartFqName[LocalVariableDescriptor]

'JvmStatic' @ [54:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'files' @ [55:13] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.getFilesWithCallables[ValueParameterDescriptorImpl]

'filter' @ [55:19] ==> public inline fun <T> Iterable<KtFile>.filter(predicate: (KtFile) -> Boolean): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'fileHasTopLevelCallables' @ [55:28] ==> @JvmStatic public final fun fileHasTopLevelCallables(file: KtFile): Boolean defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[SimpleFunctionDescriptorImpl]

'it' @ [55:53] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.getFilesWithCallables.<anonymous>[ValueParameterDescriptorImpl]

'JvmStatic' @ [57:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'file' @ [58:13] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.fileHasTopLevelCallables[ValueParameterDescriptorImpl]

'declarations' @ [58:18] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'any' @ [58:31] ==> public inline fun <T> Iterable<(KtDeclaration..KtDeclaration?)>.any(predicate: ((KtDeclaration..KtDeclaration?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'it' @ [59:18] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.fileHasTopLevelCallables.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [60:17] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.fileHasTopLevelCallables.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [61:17] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.fileHasTopLevelCallables.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [62:17] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.fileHasTopLevelCallables.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [62:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [62:40] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.fileHasTopLevelCallables.<anonymous>[ValueParameterDescriptorImpl]

'hasModifier' @ [62:43] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'HEADER_KEYWORD' @ [62:64] ==> public final val HEADER_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'JvmStatic' @ [65:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'NameUtils' @ [66:13] ==> public object NameUtils defined in org.jetbrains.kotlin.name[FakeCallableDescriptorForObject]

'getPackagePartClassNamePrefix' @ [66:23] ==> @JvmStatic public final fun getPackagePartClassNamePrefix(shortFileName: String): String defined in org.jetbrains.kotlin.name.NameUtils[DeserializedSimpleFunctionDescriptor]

'getNameWithoutExtension' @ [66:62] ==> @NotNull public open fun getNameWithoutExtension(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'fileName' @ [66:86] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.getFilePartShortName[ValueParameterDescriptorImpl]

'PART_CLASS_NAME_SUFFIX' @ [66:99] ==> private final val PART_CLASS_NAME_SUFFIX: String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[PropertyDescriptorImpl]

'JvmStatic' @ [68:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'!' @ [69:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'facadeClassName' @ [69:14] ==> value-parameter facadeClassName: String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.getFileNameByFacadeName[ValueParameterDescriptorImpl]

'endsWith' @ [69:30] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'PART_CLASS_NAME_SUFFIX' @ [69:39] ==> private final val PART_CLASS_NAME_SUFFIX: String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[PropertyDescriptorImpl]

'facadeClassName' @ [70:24] ==> value-parameter facadeClassName: String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.getFileNameByFacadeName[ValueParameterDescriptorImpl]

'substring' @ [70:40] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'facadeClassName' @ [70:53] ==> value-parameter facadeClassName: String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.getFileNameByFacadeName[ValueParameterDescriptorImpl]

'length' @ [70:69] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'PART_CLASS_NAME_SUFFIX' @ [70:78] ==> private final val PART_CLASS_NAME_SUFFIX: String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[PropertyDescriptorImpl]

'length' @ [70:101] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'baseName' @ [71:13] ==> val baseName: String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.getFileNameByFacadeName[LocalVariableDescriptor]

'decapitalizeAsJavaClassName' @ [72:19] ==> @JvmStatic private final fun decapitalizeAsJavaClassName(str: String): String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[SimpleFunctionDescriptorImpl]

'baseName' @ [72:47] ==> val baseName: String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils.getFileNameByFacadeName[LocalVariableDescriptor]

'EXTENSION' @ [72:75] ==> public const final val EXTENSION: String defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

