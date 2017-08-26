'FqName' @ [32:28] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'JVM_NAME' @ [33:34] ==> public final val JVM_NAME: FqName defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[PropertyDescriptorImpl]

'shortName' @ [33:43] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [33:55] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'FqName' @ [35:39] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'JVM_MULTIFILE_CLASS' @ [36:37] ==> public final val JVM_MULTIFILE_CLASS: FqName defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[PropertyDescriptorImpl]

'shortName' @ [36:57] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [36:69] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'if (jvmFileClassAnnotations != null)
                getFileClassInfoForAnnotation(file, jvmFileClassAnnotations)
            else
                getDefaultFileClassInfo(file)' @ [41:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JvmFileClassInfo, elseBranch: JvmFileClassInfo): JvmFileClassInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JvmFileClassInfo

'jvmFileClassAnnotations' @ [41:17] ==> value-parameter jvmFileClassAnnotations: ParsedJvmFileClassAnnotations? defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getFileClassInfo[ValueParameterDescriptorImpl]

'getFileClassInfoForAnnotation' @ [42:17] ==> private final fun getFileClassInfoForAnnotation(file: KtFile, jvmFileClassAnnotations: ParsedJvmFileClassAnnotations): JvmFileClassInfo defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[SimpleFunctionDescriptorImpl]

'file' @ [42:47] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getFileClassInfo[ValueParameterDescriptorImpl]

'jvmFileClassAnnotations' @ [42:53] ==> value-parameter jvmFileClassAnnotations: ParsedJvmFileClassAnnotations? defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getFileClassInfo[ValueParameterDescriptorImpl]

'getDefaultFileClassInfo' @ [44:17] ==> @JvmStatic public final fun getDefaultFileClassInfo(file: KtFile): JvmFileClassInfo defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[SimpleFunctionDescriptorImpl]

'file' @ [44:41] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getFileClassInfo[ValueParameterDescriptorImpl]

'if (jvmFileClassAnnotations.multipleFiles)
                JvmMultifileClassPartInfo(getHiddenPartFqName(file, jvmFileClassAnnotations),
                                          getFacadeFqName(file, jvmFileClassAnnotations))
            else
                JvmSimpleFileClassInfo(getFacadeFqName(file, jvmFileClassAnnotations), true)' @ [47:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JvmFileClassInfo, elseBranch: JvmFileClassInfo): JvmFileClassInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JvmFileClassInfo

'jvmFileClassAnnotations' @ [47:17] ==> value-parameter jvmFileClassAnnotations: ParsedJvmFileClassAnnotations defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getFileClassInfoForAnnotation[ValueParameterDescriptorImpl]

'multipleFiles' @ [47:41] ==> public final val multipleFiles: Boolean defined in org.jetbrains.kotlin.fileClasses.ParsedJvmFileClassAnnotations[PropertyDescriptorImpl]

'JvmMultifileClassPartInfo' @ [48:17] ==> public constructor JvmMultifileClassPartInfo(fileClassFqName: FqName, facadeClassFqName: FqName) defined in org.jetbrains.kotlin.fileClasses.JvmMultifileClassPartInfo[ClassConstructorDescriptorImpl]

'getHiddenPartFqName' @ [48:43] ==> private final fun getHiddenPartFqName(file: KtFile, jvmFileClassAnnotations: ParsedJvmFileClassAnnotations): FqName defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[SimpleFunctionDescriptorImpl]

'file' @ [48:63] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getFileClassInfoForAnnotation[ValueParameterDescriptorImpl]

'jvmFileClassAnnotations' @ [48:69] ==> value-parameter jvmFileClassAnnotations: ParsedJvmFileClassAnnotations defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getFileClassInfoForAnnotation[ValueParameterDescriptorImpl]

'getFacadeFqName' @ [49:43] ==> private final fun getFacadeFqName(file: KtFile, jvmFileClassAnnotations: ParsedJvmFileClassAnnotations): FqName defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[SimpleFunctionDescriptorImpl]

'file' @ [49:59] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getFileClassInfoForAnnotation[ValueParameterDescriptorImpl]

'jvmFileClassAnnotations' @ [49:65] ==> value-parameter jvmFileClassAnnotations: ParsedJvmFileClassAnnotations defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getFileClassInfoForAnnotation[ValueParameterDescriptorImpl]

'JvmSimpleFileClassInfo' @ [51:17] ==> public constructor JvmSimpleFileClassInfo(fileClassFqName: FqName, withJvmName: Boolean) defined in org.jetbrains.kotlin.fileClasses.JvmSimpleFileClassInfo[ClassConstructorDescriptorImpl]

'getFacadeFqName' @ [51:40] ==> private final fun getFacadeFqName(file: KtFile, jvmFileClassAnnotations: ParsedJvmFileClassAnnotations): FqName defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[SimpleFunctionDescriptorImpl]

'file' @ [51:56] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getFileClassInfoForAnnotation[ValueParameterDescriptorImpl]

'jvmFileClassAnnotations' @ [51:62] ==> value-parameter jvmFileClassAnnotations: ParsedJvmFileClassAnnotations defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getFileClassInfoForAnnotation[ValueParameterDescriptorImpl]

'JvmStatic' @ [53:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'JvmSimpleFileClassInfo' @ [54:13] ==> public constructor JvmSimpleFileClassInfo(fileClassFqName: FqName, withJvmName: Boolean) defined in org.jetbrains.kotlin.fileClasses.JvmSimpleFileClassInfo[ClassConstructorDescriptorImpl]

'PackagePartClassUtils' @ [54:36] ==> public object PackagePartClassUtils defined in org.jetbrains.kotlin.load.kotlin in file PackagePartClassUtils.kt[FakeCallableDescriptorForObject]

'getPackagePartFqName' @ [54:58] ==> @JvmStatic public final fun getPackagePartFqName(packageFqName: FqName, fileName: String): FqName defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[SimpleFunctionDescriptorImpl]

'file' @ [54:79] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getDefaultFileClassInfo[ValueParameterDescriptorImpl]

'packageFqName' @ [54:84] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'file' @ [54:99] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getDefaultFileClassInfo[ValueParameterDescriptorImpl]

'name' @ [54:104] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'file' @ [57:13] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getFacadeFqName[ValueParameterDescriptorImpl]

'packageFqName' @ [57:18] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'child' @ [57:32] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'identifier' @ [57:43] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'jvmFileClassAnnotations' @ [57:54] ==> value-parameter jvmFileClassAnnotations: ParsedJvmFileClassAnnotations defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getFacadeFqName[ValueParameterDescriptorImpl]

'name' @ [57:78] ==> public final val name: String defined in org.jetbrains.kotlin.fileClasses.ParsedJvmFileClassAnnotations[PropertyDescriptorImpl]

'JvmStatic' @ [59:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'getImplClassName' @ [60:29] ==> @JvmStatic public final fun getImplClassName(deserializedMemberDescriptor: DeserializedMemberDescriptor): Name? defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[SimpleFunctionDescriptorImpl]

'deserializedMemberDescriptor' @ [60:46] ==> value-parameter deserializedMemberDescriptor: DeserializedMemberDescriptor defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getPartFqNameForDeserialized[ValueParameterDescriptorImpl]

'error' @ [60:79] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'deserializedMemberDescriptor' @ [60:108] ==> value-parameter deserializedMemberDescriptor: DeserializedMemberDescriptor defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getPartFqNameForDeserialized[ValueParameterDescriptorImpl]

'deserializedMemberDescriptor' @ [61:30] ==> value-parameter deserializedMemberDescriptor: DeserializedMemberDescriptor defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getPartFqNameForDeserialized[ValueParameterDescriptorImpl]

'containingDeclaration' @ [61:59] ==> public final val DeserializedMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'fqName' @ [61:111] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'packageFqName' @ [62:16] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getPartFqNameForDeserialized[LocalVariableDescriptor]

'child' @ [62:30] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'implClassName' @ [62:36] ==> val implClassName: Name defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getPartFqNameForDeserialized[LocalVariableDescriptor]

'JvmStatic' @ [65:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'deserializedMemberDescriptor' @ [66:13] ==> value-parameter deserializedMemberDescriptor: DeserializedMemberDescriptor defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getImplClassName[ValueParameterDescriptorImpl]

'getImplClassNameForDeserialized' @ [66:42] ==> public fun DeserializedMemberDescriptor.getImplClassNameForDeserialized(): Name? defined in org.jetbrains.kotlin.load.java.descriptors[DeserializedSimpleFunctionDescriptor]

'file' @ [69:13] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getHiddenPartFqName[ValueParameterDescriptorImpl]

'packageFqName' @ [69:18] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'child' @ [69:32] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'identifier' @ [69:43] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'manglePartName' @ [69:54] ==> @JvmStatic public final fun manglePartName(facadeName: String, fileName: String): String defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[SimpleFunctionDescriptorImpl]

'jvmFileClassAnnotations' @ [69:69] ==> value-parameter jvmFileClassAnnotations: ParsedJvmFileClassAnnotations defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getHiddenPartFqName[ValueParameterDescriptorImpl]

'name' @ [69:93] ==> public final val name: String defined in org.jetbrains.kotlin.fileClasses.ParsedJvmFileClassAnnotations[PropertyDescriptorImpl]

'file' @ [69:99] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getHiddenPartFqName[ValueParameterDescriptorImpl]

'name' @ [69:104] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'JvmStatic' @ [71:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'facadeName' @ [72:15] ==> value-parameter facadeName: String defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.manglePartName[ValueParameterDescriptorImpl]

'MULTIFILE_PART_NAME_DELIMITER' @ [72:26] ==> public const final val MULTIFILE_PART_NAME_DELIMITER: String defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[PropertyDescriptorImpl]

'PackagePartClassUtils' @ [72:57] ==> public object PackagePartClassUtils defined in org.jetbrains.kotlin.load.kotlin in file PackagePartClassUtils.kt[FakeCallableDescriptorForObject]

'getFilePartShortName' @ [72:79] ==> @JvmStatic public final fun getFilePartShortName(fileName: String): String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[SimpleFunctionDescriptorImpl]

'fileName' @ [72:100] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.manglePartName[ValueParameterDescriptorImpl]

'JvmStatic' @ [74:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'getFileClassInfo' @ [75:13] ==> internal final fun getFileClassInfo(file: KtFile, jvmFileClassAnnotations: ParsedJvmFileClassAnnotations?): JvmFileClassInfo defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[SimpleFunctionDescriptorImpl]

'file' @ [75:30] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getFileClassInfoNoResolve[ValueParameterDescriptorImpl]

'parseJvmNameOnFileNoResolve' @ [75:36] ==> internal final fun parseJvmNameOnFileNoResolve(file: KtFile): ParsedJvmFileClassAnnotations? defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[SimpleFunctionDescriptorImpl]

'file' @ [75:64] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getFileClassInfoNoResolve[ValueParameterDescriptorImpl]

'findAnnotationEntryOnFileNoResolve' @ [78:23] ==> @JvmStatic public final fun findAnnotationEntryOnFileNoResolve(file: KtFile, shortName: String): KtAnnotationEntry? defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[SimpleFunctionDescriptorImpl]

'file' @ [78:58] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.parseJvmNameOnFileNoResolve[ValueParameterDescriptorImpl]

'JVM_NAME_SHORT' @ [78:64] ==> public final val JVM_NAME_SHORT: String defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[PropertyDescriptorImpl]

'jvmName' @ [79:24] ==> val jvmName: KtAnnotationEntry defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.parseJvmNameOnFileNoResolve[LocalVariableDescriptor]

'valueArguments' @ [79:32] ==> public final val KtAnnotationEntry.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'firstOrNull' @ [79:47] ==> public fun <T> List<(ValueArgument..ValueArgument?)>.firstOrNull(): ValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'getArgumentExpression' @ [79:62] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'getLiteralStringFromRestrictedConstExpression' @ [80:20] ==> @JvmStatic private final fun getLiteralStringFromRestrictedConstExpression(argumentExpression: KtExpression?): String? defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[SimpleFunctionDescriptorImpl]

'nameExpr' @ [80:66] ==> val nameExpr: KtExpression defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.parseJvmNameOnFileNoResolve[LocalVariableDescriptor]

'!' @ [81:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValidIdentifier' @ [81:19] ==> public open fun isValidIdentifier(@NotNull p0: String): Boolean defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [81:37] ==> val name: String defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.parseJvmNameOnFileNoResolve[LocalVariableDescriptor]

'findAnnotationEntryOnFileNoResolve' @ [82:36] ==> @JvmStatic public final fun findAnnotationEntryOnFileNoResolve(file: KtFile, shortName: String): KtAnnotationEntry? defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[SimpleFunctionDescriptorImpl]

'file' @ [82:71] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.parseJvmNameOnFileNoResolve[ValueParameterDescriptorImpl]

'JVM_MULTIFILE_CLASS_SHORT' @ [82:77] ==> public final val JVM_MULTIFILE_CLASS_SHORT: String defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[PropertyDescriptorImpl]

'ParsedJvmFileClassAnnotations' @ [83:16] ==> public constructor ParsedJvmFileClassAnnotations(name: String, multipleFiles: Boolean) defined in org.jetbrains.kotlin.fileClasses.ParsedJvmFileClassAnnotations[ClassConstructorDescriptorImpl]

'name' @ [83:46] ==> val name: String defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.parseJvmNameOnFileNoResolve[LocalVariableDescriptor]

'isMultifileClassPart' @ [83:52] ==> val isMultifileClassPart: Boolean defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.parseJvmNameOnFileNoResolve[LocalVariableDescriptor]

'JvmStatic' @ [86:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'file' @ [87:13] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.findAnnotationEntryOnFileNoResolve[ValueParameterDescriptorImpl]

'fileAnnotationList' @ [87:18] ==> public final val KtFile.fileAnnotationList: KtFileAnnotationList?[MyPropertyDescriptor]

'annotationEntries' @ [87:38] ==> public final val KtFileAnnotationList.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'firstOrNull' @ [87:57] ==> public inline fun <T> Iterable<(KtAnnotationEntry..KtAnnotationEntry?)>.firstOrNull(predicate: ((KtAnnotationEntry..KtAnnotationEntry?)) -> Boolean): KtAnnotationEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)

'it' @ [88:17] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.findAnnotationEntryOnFileNoResolve.<anonymous>[ValueParameterDescriptorImpl]

'calleeExpression' @ [88:20] ==> public final val KtAnnotationEntry.calleeExpression: KtConstructorCalleeExpression?[MyPropertyDescriptor]

'constructorReferenceExpression' @ [88:38] ==> public final val KtConstructorCalleeExpression.constructorReferenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'getReferencedName' @ [88:70] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'shortName' @ [88:93] ==> value-parameter shortName: String defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.findAnnotationEntryOnFileNoResolve[ValueParameterDescriptorImpl]

'JvmStatic' @ [91:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'argumentExpression' @ [92:30] ==> value-parameter argumentExpression: KtExpression? defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getLiteralStringFromRestrictedConstExpression[ValueParameterDescriptorImpl]

'stringTemplate' @ [93:37] ==> val stringTemplate: KtStringTemplateExpression defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getLiteralStringFromRestrictedConstExpression[LocalVariableDescriptor]

'entries' @ [93:52] ==> public final val KtStringTemplateExpression.entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>)[MyPropertyDescriptor]

'stringTemplateEntries' @ [94:13] ==> val stringTemplateEntries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>) defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getLiteralStringFromRestrictedConstExpression[LocalVariableDescriptor]

'size' @ [94:35] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'stringTemplateEntries' @ [95:27] ==> val stringTemplateEntries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>) defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getLiteralStringFromRestrictedConstExpression[LocalVariableDescriptor]

'singleEntry' @ [96:16] ==> val singleEntry: KtLiteralStringTemplateEntry defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.getLiteralStringFromRestrictedConstExpression[LocalVariableDescriptor]

'text' @ [96:28] ==> public final val KtLiteralStringTemplateEntry.text: (String..String?)[MyPropertyDescriptor]

'JvmStatic' @ [99:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'isTopLevelDeclaration' @ [100:29] ==> public open fun isTopLevelDeclaration(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [100:51] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.isFromMultifileClass[ValueParameterDescriptorImpl]

'JvmFileClassUtil' @ [101:33] ==> public object JvmFileClassUtil defined in org.jetbrains.kotlin.fileClasses in file JvmFileClassUtil.kt[FakeCallableDescriptorForObject]

'getFileClassInfoNoResolve' @ [101:50] ==> @JvmStatic public final fun getFileClassInfoNoResolve(file: KtFile): JvmFileClassInfo defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[SimpleFunctionDescriptorImpl]

'declarationElement' @ [101:76] ==> value-parameter declarationElement: KtElement defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.isFromMultifileClass[ValueParameterDescriptorImpl]

'containingKtFile' @ [101:95] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'fileClassInfo' @ [102:20] ==> val fileClassInfo: JvmFileClassInfo defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil.isFromMultifileClass[LocalVariableDescriptor]

'withJvmMultifileClass' @ [102:34] ==> public abstract val withJvmMultifileClass: Boolean defined in org.jetbrains.kotlin.fileClasses.JvmFileClassInfo[PropertyDescriptorImpl]

'getCachedValue' @ [112:36] ==> public final fun <T : (Any..Any?)> getCachedValue(@NotNull p0: PsiElement, @NotNull p1: () -> CachedValueProvider.Result<(FqName..FqName?)>?): (FqName..FqName?) defined in com.intellij.psi.util.CachedValuesManager[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FqName

'this' @ [112:51] ==> <this> defined in org.jetbrains.kotlin.fileClasses.javaFileFacadeFqName[ReceiverParameterDescriptorImpl]

'if (isCompiled) packageFqName.child(Name.identifier(virtualFile.nameWithoutExtension))
                    else JvmFileClassUtil.getFileClassInfoNoResolve(this).facadeClassFqName' @ [114:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FqName, elseBranch: FqName): FqName[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FqName

'isCompiled' @ [114:25] ==> public final val KtFile.isCompiled: Boolean[MyPropertyDescriptor]

'packageFqName' @ [114:37] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'child' @ [114:51] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'identifier' @ [114:62] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'virtualFile' @ [114:73] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'nameWithoutExtension' @ [114:85] ==> public final val VirtualFile.nameWithoutExtension: String[MyPropertyDescriptor]

'JvmFileClassUtil' @ [115:26] ==> public object JvmFileClassUtil defined in org.jetbrains.kotlin.fileClasses in file JvmFileClassUtil.kt[FakeCallableDescriptorForObject]

'getFileClassInfoNoResolve' @ [115:43] ==> @JvmStatic public final fun getFileClassInfoNoResolve(file: KtFile): JvmFileClassInfo defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[SimpleFunctionDescriptorImpl]

'this' @ [115:69] ==> <this> defined in org.jetbrains.kotlin.fileClasses.javaFileFacadeFqName[ReceiverParameterDescriptorImpl]

'facadeClassFqName' @ [115:75] ==> public abstract val facadeClassFqName: FqName defined in org.jetbrains.kotlin.fileClasses.JvmFileClassInfo[PropertyDescriptorImpl]

'Result' @ [116:33] ==> public constructor Result<T : (Any..Any?)>(@Nullable p0: FqName?, @NotNull vararg p1: (Any..Any?)) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FqName

'facadeFqName' @ [116:40] ==> val facadeFqName: FqName defined in org.jetbrains.kotlin.fileClasses.<get-javaFileFacadeFqName>.<anonymous>[LocalVariableDescriptor]

'this' @ [116:54] ==> <this> defined in org.jetbrains.kotlin.fileClasses.javaFileFacadeFqName[ReceiverParameterDescriptorImpl]

'JvmFileClassUtil' @ [120:53] ==> public object JvmFileClassUtil defined in org.jetbrains.kotlin.fileClasses in file JvmFileClassUtil.kt[FakeCallableDescriptorForObject]

'findAnnotationEntryOnFileNoResolve' @ [120:70] ==> @JvmStatic public final fun findAnnotationEntryOnFileNoResolve(file: KtFile, shortName: String): KtAnnotationEntry? defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[SimpleFunctionDescriptorImpl]

'containingKtFile' @ [121:9] ==> public final val KtDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'JvmFileClassUtil' @ [122:9] ==> public object JvmFileClassUtil defined in org.jetbrains.kotlin.fileClasses in file JvmFileClassUtil.kt[FakeCallableDescriptorForObject]

'JVM_MULTIFILE_CLASS_SHORT' @ [122:26] ==> public final val JVM_MULTIFILE_CLASS_SHORT: String defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[PropertyDescriptorImpl]

