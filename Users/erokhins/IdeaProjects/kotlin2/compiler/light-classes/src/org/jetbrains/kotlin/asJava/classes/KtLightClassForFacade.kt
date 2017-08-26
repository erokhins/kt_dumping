'KtLazyLightClass' @ [54:5] ==> public constructor KtLazyLightClass(manager: PsiManager) defined in org.jetbrains.kotlin.asJava.classes.KtLazyLightClass[ClassConstructorDescriptorImpl]

'manager' @ [54:22] ==> value-parameter manager: PsiManager defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.<init>[ValueParameterDescriptorImpl]

'SLRUCache<StubCacheKey, CachedValue<LightClassDataHolder.ForFacade>>' @ [59:34] ==> protected/*protected and package*/ constructor SLRUCache<K : (Any..Any?), V : (Any..Any?)>(p0: Int, p1: Int) defined in com.intellij.util.containers.SLRUCache[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> StubCacheKey
    <V : (Any..Any?)> -> CachedValue<ForFacade>

'ByProjectSource' @ [61:76] ==> public constructor ByProjectSource(project: Project, facadeFqName: FqName, searchScope: GlobalSearchScope) defined in org.jetbrains.kotlin.asJava.builder.LightClassDataProviderForFileFacade.ByProjectSource[ClassConstructorDescriptorImpl]

'project' @ [61:92] ==> private final val project: Project defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.FacadeStubCache[PropertyDescriptorImpl]

'key' @ [61:101] ==> value-parameter key: KtLightClassForFacade.StubCacheKey defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.FacadeStubCache.FacadeCacheData.cache.<no name provided>.createValue[ValueParameterDescriptorImpl]

'fqName' @ [61:105] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.StubCacheKey[PropertyDescriptorImpl]

'key' @ [61:113] ==> value-parameter key: KtLightClassForFacade.StubCacheKey defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.FacadeStubCache.FacadeCacheData.cache.<no name provided>.createValue[ValueParameterDescriptorImpl]

'searchScope' @ [61:117] ==> public final val searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.StubCacheKey[PropertyDescriptorImpl]

'getManager' @ [62:48] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [62:59] ==> private final val project: Project defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.FacadeStubCache[PropertyDescriptorImpl]

'createCachedValue' @ [62:68] ==> @NotNull public abstract fun <T : (Any..Any?)> createCachedValue(@NotNull p0: CachedValueProvider<(LightClassDataHolder.ForFacade..LightClassDataHolder.ForFacade?)>, p1: Boolean): CachedValue<(LightClassDataHolder.ForFacade..LightClassDataHolder.ForFacade?)> defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ForFacade

'stubProvider' @ [62:118] ==> val stubProvider: LightClassDataProviderForFileFacade.ByProjectSource defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.FacadeStubCache.FacadeCacheData.cache.<no name provided>.createValue[LocalVariableDescriptor]

'getManager' @ [67:85] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [67:96] ==> private final val project: Project defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.FacadeStubCache[PropertyDescriptorImpl]

'createCachedValue' @ [67:105] ==> @NotNull public final fun <T : (Any..Any?)> createCachedValue(@NotNull p0: () -> CachedValueProvider.Result<(KtLightClassForFacade.FacadeStubCache.FacadeCacheData..KtLightClassForFacade.FacadeStubCache.FacadeCacheData?)>?, p1: Boolean): CachedValue<(KtLightClassForFacade.FacadeStubCache.FacadeCacheData..KtLightClassForFacade.FacadeStubCache.FacadeCacheData?)> defined in com.intellij.psi.util.CachedValuesManager[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FacadeCacheData

'create' @ [68:46] ==> public open fun <T : (Any..Any?)> create(@Nullable p0: KtLightClassForFacade.FacadeStubCache.FacadeCacheData?, @NotNull vararg p1: (Any..Any?)): (CachedValueProvider.Result<(KtLightClassForFacade.FacadeStubCache.FacadeCacheData..KtLightClassForFacade.FacadeStubCache.FacadeCacheData?)>..CachedValueProvider.Result<(KtLightClassForFacade.FacadeStubCache.FacadeCacheData..KtLightClassForFacade.FacadeStubCache.FacadeCacheData?)>?) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FacadeCacheData

'FacadeCacheData' @ [68:53] ==> public constructor FacadeCacheData() defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.FacadeStubCache.FacadeCacheData[ClassConstructorDescriptorImpl]

'OUT_OF_CODE_BLOCK_MODIFICATION_COUNT' @ [68:95] ==> public final val OUT_OF_CODE_BLOCK_MODIFICATION_COUNT: raw (Key<(Any..Any?)>..Key<*>?) defined in com.intellij.psi.util.PsiModificationTracker[JavaPropertyDescriptor]

'synchronized' @ [72:13] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Nothing

'cachedValue' @ [72:27] ==> private final val cachedValue: CachedValue<KtLightClassForFacade.FacadeStubCache.FacadeCacheData> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.FacadeStubCache[PropertyDescriptorImpl]

'cachedValue' @ [73:24] ==> private final val cachedValue: CachedValue<KtLightClassForFacade.FacadeStubCache.FacadeCacheData> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.FacadeStubCache[PropertyDescriptorImpl]

'value' @ [73:36] ==> public final val <T : (Any..Any?)> CachedValue<KtLightClassForFacade.FacadeStubCache.FacadeCacheData>.value: (KtLightClassForFacade.FacadeStubCache.FacadeCacheData..KtLightClassForFacade.FacadeStubCache.FacadeCacheData?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FacadeCacheData

'cache' @ [73:42] ==> public final val cache: SLRUCache<KtLightClassForFacade.StubCacheKey, CachedValue<LightClassDataHolder.ForFacade>> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.FacadeStubCache.FacadeCacheData[PropertyDescriptorImpl]

'get' @ [73:48] ==> @NotNull public open fun get(p0: (KtLightClassForFacade.StubCacheKey..KtLightClassForFacade.StubCacheKey?)): CachedValue<LightClassDataHolder.ForFacade> defined in com.intellij.util.containers.SLRUCache[JavaMethodDescriptor]

'StubCacheKey' @ [73:52] ==> public constructor StubCacheKey(fqName: FqName, searchScope: GlobalSearchScope) defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.StubCacheKey[ClassConstructorDescriptorImpl]

'qualifiedName' @ [73:65] ==> value-parameter qualifiedName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.FacadeStubCache.get[ValueParameterDescriptorImpl]

'searchScope' @ [73:80] ==> value-parameter searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.FacadeStubCache.get[ValueParameterDescriptorImpl]

'getService' @ [79:39] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(KtLightClassForFacade.FacadeStubCache..KtLightClassForFacade.FacadeStubCache?)>): (KtLightClassForFacade.FacadeStubCache..KtLightClassForFacade.FacadeStubCache?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FacadeStubCache

'project' @ [79:67] ==> value-parameter project: Project defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.FacadeStubCache.Companion.getInstance[ValueParameterDescriptorImpl]

'FacadeStubCache' @ [79:76] ==> public companion object defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.FacadeStubCache[FakeCallableDescriptorForObject]

'java' @ [79:99] ==> public val <T> KClass<KtLightClassForFacade.FacadeStubCache>.java: Class<KtLightClassForFacade.FacadeStubCache> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FacadeStubCache

'files' @ [84:37] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.<init>[ValueParameterDescriptorImpl]

'toSet' @ [84:43] ==> public fun <T> Iterable<KtFile>.toSet(): Set<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'computeHashCode' @ [87:13] ==> private final fun computeHashCode(): Int defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[SimpleFunctionDescriptorImpl]

'facadeClassFqName' @ [90:13] ==> private final val facadeClassFqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'parent' @ [90:31] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'LightModifierList' @ [93:13] ==> public constructor LightModifierList(p0: (PsiManager..PsiManager?), p1: (Language..Language?), vararg p2: (String..String?)) defined in com.intellij.psi.impl.light.LightModifierList[JavaClassConstructorDescriptor]

'manager' @ [93:31] ==> value-parameter manager: PsiManager defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.<init>[ValueParameterDescriptorImpl]

'INSTANCE' @ [93:55] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'PUBLIC' @ [93:77] ==> public const final val PUBLIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'FINAL' @ [93:97] ==> public const final val FINAL: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'LightEmptyImplementsList' @ [96:13] ==> public constructor LightEmptyImplementsList(@NotNull p0: PsiManager) defined in com.intellij.psi.impl.light.LightEmptyImplementsList[JavaClassConstructorDescriptor]

'manager' @ [96:38] ==> value-parameter manager: PsiManager defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.<init>[ValueParameterDescriptorImpl]

'FakeFileForLightClass' @ [98:34] ==> public constructor FakeFileForLightClass(ktFile: KtFile, lightClass: () -> KtLightClass, stub: () -> PsiClassHolderFileStub<*>, packageFqName: FqName = ...) defined in org.jetbrains.kotlin.asJava.elements.FakeFileForLightClass[ClassConstructorDescriptorImpl]

'files' @ [99:13] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.<init>[ValueParameterDescriptorImpl]

'first' @ [99:19] ==> public fun <T> Iterable<KtFile>.first(): KtFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'this' @ [100:28] ==> <this> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[LazyClassReceiverParameterDescriptor]

'lightClassDataCache' @ [101:22] ==> private final val lightClassDataCache: CachedValue<LightClassDataHolder.ForFacade> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'value' @ [101:42] ==> public final val <T : (Any..Any?)> CachedValue<LightClassDataHolder.ForFacade>.value: (LightClassDataHolder.ForFacade..LightClassDataHolder.ForFacade?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ForFacade

'javaFileStub' @ [101:48] ==> public abstract val javaFileStub: PsiJavaFileStub defined in org.jetbrains.kotlin.asJava.builder.LightClassDataHolder.ForFacade[PropertyDescriptorImpl]

'packageFqName' @ [102:29] ==> private final val packageFqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'facadeClassFqName' @ [108:17] ==> private final val facadeClassFqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'modifierList' @ [110:38] ==> private final val modifierList: PsiModifierList defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'NonNls' @ [112:38] ==> public constructor NonNls() defined in org.jetbrains.annotations.NonNls[JavaClassConstructorDescriptor]

'modifierList' @ [112:62] ==> private final val modifierList: PsiModifierList defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'hasModifierProperty' @ [112:75] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String): Boolean defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'name' @ [112:95] ==> value-parameter @NonNls name: String defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.hasModifierProperty[ValueParameterDescriptorImpl]

'packageClsFile' @ [124:40] ==> private final val packageClsFile: FakeFileForLightClass defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'EMPTY_ARRAY' @ [128:57] ==> public final val EMPTY_ARRAY: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>?) defined in com.intellij.psi.PsiTypeParameter[JavaPropertyDescriptor]

'implementsList' @ [134:40] ==> private final val implementsList: LightEmptyImplementsList defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'EMPTY_ARRAY' @ [136:58] ==> public final val EMPTY_ARRAY: (Array<(PsiClassType..PsiClassType?)>..Array<out (PsiClassType..PsiClassType?)>?) defined in com.intellij.psi.PsiClassType[JavaPropertyDescriptor]

'EMPTY_ARRAY' @ [138:45] ==> @NotNull public final val EMPTY_ARRAY: (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>) defined in com.intellij.psi.PsiClass[JavaPropertyDescriptor]

'EMPTY_ARRAY' @ [140:47] ==> @NotNull public final val EMPTY_ARRAY: (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>) defined in com.intellij.psi.PsiClass[JavaPropertyDescriptor]

'listOf' @ [142:57] ==> @InlineOnly public inline fun <T> listOf(): List<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'EMPTY_ARRAY' @ [144:50] ==> @NotNull public final val EMPTY_ARRAY: (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>) defined in com.intellij.psi.PsiClass[JavaPropertyDescriptor]

'EMPTY_ARRAY' @ [146:58] ==> public final val EMPTY_ARRAY: (Array<(PsiClassInitializer..PsiClassInitializer?)>..Array<out (PsiClassInitializer..PsiClassInitializer?)>?) defined in com.intellij.psi.PsiClassInitializer[JavaPropertyDescriptor]

'NonNls' @ [148:39] ==> public constructor NonNls() defined in org.jetbrains.annotations.NonNls[JavaClassConstructorDescriptor]

'facadeClassFqName' @ [150:30] ==> private final val facadeClassFqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'shortName' @ [150:48] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [150:60] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'files' @ [153:22] ==> public final val files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'JvmFileClassUtil' @ [154:32] ==> public object JvmFileClassUtil defined in org.jetbrains.kotlin.fileClasses[FakeCallableDescriptorForObject]

'findAnnotationEntryOnFileNoResolve' @ [154:49] ==> @JvmStatic public final fun findAnnotationEntryOnFileNoResolve(file: KtFile, shortName: String): KtAnnotationEntry? defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[DeserializedSimpleFunctionDescriptor]

'file' @ [154:84] ==> val file: KtFile defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'JvmFileClassUtil' @ [154:90] ==> public object JvmFileClassUtil defined in org.jetbrains.kotlin.fileClasses[FakeCallableDescriptorForObject]

'JVM_NAME_SHORT' @ [154:107] ==> public final val JVM_NAME_SHORT: String defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[DeserializedPropertyDescriptor]

'PackagePartClassUtils' @ [156:17] ==> public object PackagePartClassUtils defined in org.jetbrains.kotlin.load.kotlin[FakeCallableDescriptorForObject]

'getFilePartShortName' @ [156:39] ==> @JvmStatic public final fun getFilePartShortName(fileName: String): String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[DeserializedSimpleFunctionDescriptor]

'file' @ [156:60] ==> val file: KtFile defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'name' @ [156:65] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'name' @ [156:74] ==> value-parameter name: String defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[ValueParameterDescriptorImpl]

'jvmNameEntry' @ [157:17] ==> val jvmNameEntry: KtAnnotationEntry? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'delete' @ [157:31] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtAnnotationEntry[JavaMethodDescriptor]

'jvmNameEntry' @ [161:17] ==> val jvmNameEntry: KtAnnotationEntry? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'PackagePartClassUtils' @ [162:35] ==> public object PackagePartClassUtils defined in org.jetbrains.kotlin.load.kotlin[FakeCallableDescriptorForObject]

'getFileNameByFacadeName' @ [162:57] ==> @JvmStatic public final fun getFileNameByFacadeName(facadeClassName: String): String? defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[DeserializedSimpleFunctionDescriptor]

'name' @ [162:81] ==> value-parameter name: String defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[ValueParameterDescriptorImpl]

'file' @ [163:33] ==> val file: KtFile defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'parent' @ [163:38] ==> public final val KtFile.parent: PsiDirectory?[MyPropertyDescriptor]

'newFileName' @ [164:21] ==> val newFileName: String? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'facadeDir' @ [164:44] ==> val facadeDir: PsiDirectory? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'facadeDir' @ [164:65] ==> val facadeDir: PsiDirectory? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'findFile' @ [164:75] ==> @Nullable public abstract fun findFile(@NotNull @NonNls p0: String): PsiFile? defined in com.intellij.psi.PsiDirectory[JavaMethodDescriptor]

'newFileName' @ [164:84] ==> val newFileName: String? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'file' @ [165:21] ==> val file: KtFile defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'name' @ [165:26] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'newFileName' @ [165:33] ==> val newFileName: String? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'KtPsiFactory' @ [169:34] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [169:47] ==> <this> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[LazyClassReceiverParameterDescriptor]

'JvmFileClassUtil' @ [170:41] ==> public object JvmFileClassUtil defined in org.jetbrains.kotlin.fileClasses[FakeCallableDescriptorForObject]

'JVM_NAME_SHORT' @ [170:58] ==> public final val JVM_NAME_SHORT: String defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[DeserializedPropertyDescriptor]

'name' @ [170:77] ==> value-parameter name: String defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[ValueParameterDescriptorImpl]

'psiFactory' @ [171:45] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'createFileAnnotationListWithAnnotation' @ [171:56] ==> public final fun createFileAnnotationListWithAnnotation(annotationText: String): KtFileAnnotationList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'annotationText' @ [171:95] ==> val annotationText: String defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'file' @ [172:38] ==> val file: KtFile defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'fileAnnotationList' @ [172:43] ==> public final val KtFile.fileAnnotationList: KtFileAnnotationList?[MyPropertyDescriptor]

'if (annotationList != null) {
                    annotationList.add(newFileAnnotationList.annotationEntries.first())
                }
                else {
                    val anchor = file.firstChild.siblings().firstOrNull { it !is PsiWhiteSpace && it !is PsiComment }
                    file.addBefore(newFileAnnotationList, anchor)
                }' @ [173:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'annotationList' @ [173:21] ==> val annotationList: KtFileAnnotationList? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'annotationList' @ [174:21] ==> val annotationList: KtFileAnnotationList? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'add' @ [174:36] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFileAnnotationList[JavaMethodDescriptor]

'newFileAnnotationList' @ [174:40] ==> val newFileAnnotationList: KtFileAnnotationList defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'annotationEntries' @ [174:62] ==> public final val KtFileAnnotationList.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'first' @ [174:80] ==> public fun <T> List<(KtAnnotationEntry..KtAnnotationEntry?)>.first(): (KtAnnotationEntry..KtAnnotationEntry?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)

'file' @ [177:34] ==> val file: KtFile defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'firstChild' @ [177:39] ==> public final val KtFile.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'siblings' @ [177:50] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [177:61] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [177:75] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [177:99] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [178:21] ==> val file: KtFile defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'addBefore' @ [178:26] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'newFileAnnotationList' @ [178:36] ==> val newFileAnnotationList: KtFileAnnotationList defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'anchor' @ [178:59] ==> val anchor: PsiElement? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'jvmNameEntry' @ [183:37] ==> val jvmNameEntry: KtAnnotationEntry? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'valueArguments' @ [183:50] ==> public final val KtAnnotationEntry.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'firstOrNull' @ [183:65] ==> public fun <T> List<(ValueArgument..ValueArgument?)>.firstOrNull(): ValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'getArgumentExpression' @ [183:80] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'handleContentChange' @ [185:33] ==> public open fun <T : (PsiElement..PsiElement?)> handleContentChange(@NotNull p0: KtStringTemplateExpression, p1: (String..String?)): (KtStringTemplateExpression..KtStringTemplateExpression?) defined in com.intellij.psi.ElementManipulators[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtStringTemplateExpression

'jvmNameExpression' @ [185:53] ==> val jvmNameExpression: KtStringTemplateExpression defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[LocalVariableDescriptor]

'name' @ [185:72] ==> value-parameter name: String defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.setName[ValueParameterDescriptorImpl]

'this' @ [188:16] ==> <this> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[LazyClassReceiverParameterDescriptor]

'facadeClassFqName' @ [191:39] ==> private final val facadeClassFqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'asString' @ [191:57] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'files' @ [193:30] ==> public final val files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'all' @ [193:36] ==> public inline fun <T> Iterable<KtFile>.all(predicate: (KtFile) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'it' @ [193:42] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.isValid.<anonymous>[ValueParameterDescriptorImpl]

'isValid' @ [193:45] ==> public final val KtFile.isValid: Boolean[MyPropertyDescriptor]

'fileHasTopLevelCallables' @ [193:56] ==> @JvmStatic public final fun fileHasTopLevelCallables(file: KtFile): Boolean defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[FunctionImportedFromObject]

'it' @ [193:81] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.isValid.<anonymous>[ValueParameterDescriptorImpl]

'facadeClassFqName' @ [193:88] ==> private final val facadeClassFqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'it' @ [193:109] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.isValid.<anonymous>[ValueParameterDescriptorImpl]

'javaFileFacadeFqName' @ [193:112] ==> public val KtFile.javaFileFacadeFqName: FqName defined in org.jetbrains.kotlin.fileClasses[DeserializedPropertyDescriptor]

'KtLightClassForFacade' @ [195:27] ==> private constructor KtLightClassForFacade(manager: PsiManager, facadeClassFqName: FqName, lightClassDataCache: CachedValue<LightClassDataHolder.ForFacade>, files: Collection<KtFile>) defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[ClassConstructorDescriptorImpl]

'manager' @ [195:49] ==> public final val KtLightClassForFacade.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'facadeClassFqName' @ [195:58] ==> private final val facadeClassFqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'lightClassDataCache' @ [195:77] ==> private final val lightClassDataCache: CachedValue<LightClassDataHolder.ForFacade> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'files' @ [195:98] ==> public final val files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'lightClassDataCache' @ [198:17] ==> private final val lightClassDataCache: CachedValue<LightClassDataHolder.ForFacade> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'value' @ [198:37] ==> public final val <T : (Any..Any?)> CachedValue<LightClassDataHolder.ForFacade>.value: (LightClassDataHolder.ForFacade..LightClassDataHolder.ForFacade?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ForFacade

'findDataForFacade' @ [198:43] ==> public open fun findDataForFacade(classFqName: FqName): LightClassData defined in org.jetbrains.kotlin.asJava.builder.LightClassDataHolder.ForFacade[SimpleFunctionDescriptorImpl]

'facadeClassFqName' @ [198:61] ==> private final val facadeClassFqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'files' @ [200:43] ==> public final val files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'iterator' @ [200:49] ==> public abstract fun iterator(): Iterator<KtFile> defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'next' @ [200:60] ==> public abstract operator fun next(): KtFile defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'another' @ [203:16] ==> value-parameter another: PsiElement? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.isEquivalentTo[ValueParameterDescriptorImpl]

'equal' @ [203:62] ==> public open fun equal(@Nullable p0: String?, @Nullable p1: String?): Boolean defined in com.intellij.openapi.util.Comparing[JavaMethodDescriptor]

'another' @ [203:68] ==> value-parameter another: PsiElement? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.isEquivalentTo[ValueParameterDescriptorImpl]

'qualifiedName' @ [203:76] ==> public final val KtLightClassForFacade.qualifiedName: String[MyPropertyDescriptor]

'qualifiedName' @ [203:91] ==> public final val KtLightClassForFacade.qualifiedName: String[MyPropertyDescriptor]

'UnsupportedOperationException' @ [206:60] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'baseClass' @ [209:16] ==> value-parameter baseClass: PsiClass defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.isInheritor[ValueParameterDescriptorImpl]

'qualifiedName' @ [209:26] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'JAVA_LANG_OBJECT' @ [209:60] ==> @NonNls public const final val JAVA_LANG_OBJECT: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'getInstance' @ [213:30] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [213:42] ==> public final val KtLightClassForFacade.project: Project[MyPropertyDescriptor]

'findClass' @ [213:51] ==> @Nullable public abstract fun findClass(@NonNls @NotNull p0: String, @NotNull p1: GlobalSearchScope): PsiClass? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'JAVA_LANG_OBJECT' @ [213:78] ==> @NonNls public const final val JAVA_LANG_OBJECT: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'resolveScope' @ [213:96] ==> public final val KtLightClassForFacade.resolveScope: GlobalSearchScope[MyPropertyDescriptor]

'superClass' @ [217:16] ==> public final val KtLightClassForFacade.superClass: PsiClass?[MyPropertyDescriptor]

'let' @ [217:28] ==> @InlineOnly public inline fun <T, R> PsiClass.let(block: (PsiClass) -> Array<PsiClass>): Array<PsiClass> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass
    <R> -> Array<PsiClass>

'arrayOf' @ [217:34] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiClass): Array<PsiClass> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiClass

'it' @ [217:42] ==> value-parameter it: PsiClass defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.getSupers.<anonymous>[ValueParameterDescriptorImpl]

'arrayOf' @ [217:51] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiClass): Array<PsiClass> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiClass

'arrayOf' @ [221:16] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiClassType): Array<PsiClassType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiClassType

'getJavaLangObject' @ [221:32] ==> @NotNull public open fun getJavaLangObject(@NotNull p0: PsiManager, @NotNull p1: GlobalSearchScope): PsiClassType defined in com.intellij.psi.PsiType[JavaMethodDescriptor]

'manager' @ [221:50] ==> public final val KtLightClassForFacade.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'resolveScope' @ [221:59] ==> public final val KtLightClassForFacade.resolveScope: GlobalSearchScope[MyPropertyDescriptor]

'hashCode' @ [224:31] ==> private final val hashCode: Int defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'manager' @ [227:22] ==> public final val KtLightClassForFacade.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'hashCode' @ [227:30] ==> public open fun hashCode(): Int defined in com.intellij.psi.PsiManager[DeserializedSimpleFunctionDescriptor]

'result' @ [228:9] ==> var result: Int defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.computeHashCode[LocalVariableDescriptor]

'*' @ [228:18] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'result' @ [228:23] ==> var result: Int defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.computeHashCode[LocalVariableDescriptor]

'files' @ [228:32] ==> public final val files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'hashCode' @ [228:38] ==> public open fun hashCode(): Int defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'result' @ [229:9] ==> var result: Int defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.computeHashCode[LocalVariableDescriptor]

'*' @ [229:18] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'result' @ [229:23] ==> var result: Int defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.computeHashCode[LocalVariableDescriptor]

'facadeClassFqName' @ [229:32] ==> private final val facadeClassFqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'hashCode' @ [229:50] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'result' @ [230:16] ==> var result: Int defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.computeHashCode[LocalVariableDescriptor]

'other' @ [234:13] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.equals[ValueParameterDescriptorImpl]

'this' @ [234:30] ==> <this> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[LazyClassReceiverParameterDescriptor]

'java' @ [234:42] ==> public val <T> KClass<out KtLightClassForFacade>.java: Class<out KtLightClassForFacade> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtLightClassForFacade

'other' @ [234:50] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.equals[ValueParameterDescriptorImpl]

'java' @ [234:63] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'other' @ [238:26] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.equals[ValueParameterDescriptorImpl]

'this' @ [239:13] ==> <this> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[LazyClassReceiverParameterDescriptor]

'other' @ [239:22] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.equals[ValueParameterDescriptorImpl]

'this' @ [241:13] ==> <this> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[LazyClassReceiverParameterDescriptor]

'hashCode' @ [241:18] ==> private final val hashCode: Int defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'lightClass' @ [241:30] ==> val lightClass: KtLightClassForFacade defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.equals[LocalVariableDescriptor]

'hashCode' @ [241:41] ==> private final val hashCode: Int defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'manager' @ [242:13] ==> public final val KtLightClassForFacade.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'lightClass' @ [242:24] ==> val lightClass: KtLightClassForFacade defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.equals[LocalVariableDescriptor]

'manager' @ [242:35] ==> public final val KtLightClassForFacade.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'files' @ [243:13] ==> public final val files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'lightClass' @ [243:22] ==> val lightClass: KtLightClassForFacade defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.equals[LocalVariableDescriptor]

'files' @ [243:33] ==> public final val files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'facadeClassFqName' @ [244:13] ==> private final val facadeClassFqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'lightClass' @ [244:34] ==> val lightClass: KtLightClassForFacade defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.equals[LocalVariableDescriptor]

'facadeClassFqName' @ [244:45] ==> private final val facadeClassFqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'KtLightClassForFacade' @ [249:34] ==> public companion object Factory defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[FakeCallableDescriptorForObject]

'java' @ [249:63] ==> public val <T> KClass<KtLightClassForFacade>.java: Class<KtLightClassForFacade> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtLightClassForFacade

'simpleName' @ [249:68] ==> public final val <T : (Any..Any?)> Class<KtLightClassForFacade>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KtLightClassForFacade

'facadeClassFqName' @ [249:81] ==> private final val facadeClassFqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'assert' @ [258:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'files' @ [258:20] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory.createForFacade[ValueParameterDescriptorImpl]

'isNotEmpty' @ [258:26] ==> @InlineOnly public inline fun <T> Collection<KtFile>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'facadeClassFqName' @ [258:64] ==> value-parameter facadeClassFqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory.createForFacade[ValueParameterDescriptorImpl]

'FacadeStubCache' @ [260:39] ==> public companion object defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.FacadeStubCache[FakeCallableDescriptorForObject]

'getInstance' @ [260:55] ==> public final fun getInstance(project: Project): KtLightClassForFacade.FacadeStubCache defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.FacadeStubCache.Companion[SimpleFunctionDescriptorImpl]

'manager' @ [260:67] ==> value-parameter manager: PsiManager defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory.createForFacade[ValueParameterDescriptorImpl]

'project' @ [260:75] ==> public final val PsiManager.project: Project[MyPropertyDescriptor]

'get' @ [260:84] ==> public final operator fun get(qualifiedName: FqName, searchScope: GlobalSearchScope): CachedValue<LightClassDataHolder.ForFacade> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.FacadeStubCache[SimpleFunctionDescriptorImpl]

'facadeClassFqName' @ [260:88] ==> value-parameter facadeClassFqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory.createForFacade[ValueParameterDescriptorImpl]

'searchScope' @ [260:107] ==> value-parameter searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory.createForFacade[ValueParameterDescriptorImpl]

'KtLightClassForFacade' @ [261:20] ==> private constructor KtLightClassForFacade(manager: PsiManager, facadeClassFqName: FqName, lightClassDataCache: CachedValue<LightClassDataHolder.ForFacade>, files: Collection<KtFile>) defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[ClassConstructorDescriptorImpl]

'manager' @ [261:42] ==> value-parameter manager: PsiManager defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory.createForFacade[ValueParameterDescriptorImpl]

'facadeClassFqName' @ [261:51] ==> value-parameter facadeClassFqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory.createForFacade[ValueParameterDescriptorImpl]

'lightClassDataCache' @ [261:70] ==> val lightClassDataCache: CachedValue<LightClassDataHolder.ForFacade> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory.createForFacade[LocalVariableDescriptor]

'files' @ [261:91] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory.createForFacade[ValueParameterDescriptorImpl]

'getManager' @ [270:51] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'manager' @ [270:62] ==> value-parameter manager: PsiManager defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory.createForSyntheticFile[ValueParameterDescriptorImpl]

'project' @ [270:70] ==> public final val PsiManager.project: Project[MyPropertyDescriptor]

'createCachedValue' @ [271:21] ==> @NotNull public abstract fun <T : (Any..Any?)> createCachedValue(@NotNull p0: CachedValueProvider<(LightClassDataHolder.ForFacade..LightClassDataHolder.ForFacade?)>, p1: Boolean): CachedValue<(LightClassDataHolder.ForFacade..LightClassDataHolder.ForFacade?)> defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ForFacade

'ByFile' @ [272:65] ==> public constructor ByFile(project: Project, facadeFqName: FqName, file: KtFile) defined in org.jetbrains.kotlin.asJava.builder.LightClassDataProviderForFileFacade.ByFile[ClassConstructorDescriptorImpl]

'manager' @ [272:72] ==> value-parameter manager: PsiManager defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory.createForSyntheticFile[ValueParameterDescriptorImpl]

'project' @ [272:80] ==> public final val PsiManager.project: Project[MyPropertyDescriptor]

'facadeClassFqName' @ [272:89] ==> value-parameter facadeClassFqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory.createForSyntheticFile[ValueParameterDescriptorImpl]

'file' @ [272:108] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory.createForSyntheticFile[ValueParameterDescriptorImpl]

'KtLightClassForFacade' @ [274:20] ==> private constructor KtLightClassForFacade(manager: PsiManager, facadeClassFqName: FqName, lightClassDataCache: CachedValue<LightClassDataHolder.ForFacade>, files: Collection<KtFile>) defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[ClassConstructorDescriptorImpl]

'manager' @ [274:42] ==> value-parameter manager: PsiManager defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory.createForSyntheticFile[ValueParameterDescriptorImpl]

'facadeClassFqName' @ [274:51] ==> value-parameter facadeClassFqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory.createForSyntheticFile[ValueParameterDescriptorImpl]

'cachedValue' @ [274:70] ==> val cachedValue: CachedValue<(LightClassDataHolder.ForFacade..LightClassDataHolder.ForFacade?)> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory.createForSyntheticFile[LocalVariableDescriptor]

'listOf' @ [274:83] ==> public fun <T> listOf(element: KtFile): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'file' @ [274:90] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory.createForSyntheticFile[ValueParameterDescriptorImpl]

'SOURCE' @ [279:38] ==> enum entry SOURCE defined in org.jetbrains.kotlin.load.java.structure.LightClassOriginKind[FakeCallableDescriptorForObject]

