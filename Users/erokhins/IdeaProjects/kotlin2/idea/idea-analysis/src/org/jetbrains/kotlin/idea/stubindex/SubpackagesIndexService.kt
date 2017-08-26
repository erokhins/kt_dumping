'getManager' @ [33:51] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [33:62] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService[PropertyDescriptorImpl]

'createCachedValue' @ [33:71] ==> @NotNull public final fun <T : (Any..Any?)> createCachedValue(@NotNull p0: () -> CachedValueProvider.Result<(SubpackagesIndexService.SubpackagesIndex..SubpackagesIndexService.SubpackagesIndex?)>?, p1: Boolean): CachedValue<(SubpackagesIndexService.SubpackagesIndex..SubpackagesIndexService.SubpackagesIndex?)> defined in com.intellij.psi.util.CachedValuesManager[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SubpackagesIndex

'Result' @ [35:37] ==> public constructor Result<T : (Any..Any?)>(@Nullable p0: SubpackagesIndexService.SubpackagesIndex?, @NotNull vararg p1: (Any..Any?)) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SubpackagesIndex

'SubpackagesIndex' @ [36:25] ==> public constructor SubpackagesIndex(allPackageFqNames: Collection<String>) defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex[ClassConstructorDescriptorImpl]

'getInstance' @ [36:67] ==> @NotNull public open fun getInstance(): KotlinExactPackagesIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinExactPackagesIndex[JavaMethodDescriptor]

'getAllKeys' @ [36:81] ==> public open fun getAllKeys(p0: (Project..Project?)): (MutableCollection<(String..String?)>..Collection<(String..String?)>?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinExactPackagesIndex[JavaMethodDescriptor]

'project' @ [36:92] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService[PropertyDescriptorImpl]

'OUT_OF_CODE_BLOCK_MODIFICATION_COUNT' @ [37:48] ==> public final val OUT_OF_CODE_BLOCK_MODIFICATION_COUNT: raw (Key<(Any..Any?)>..Key<*>?) defined in com.intellij.psi.util.PsiModificationTracker[JavaPropertyDescriptor]

'hashSetOf' @ [44:41] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<FqName> /* = HashSet<FqName> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'createSet' @ [45:47] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> createSet(): MultiMap<(FqName..FqName?), (FqName..FqName?)> defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> FqName
    <V : (Any..Any?)> -> FqName

'getInstance' @ [46:44] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [46:56] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService[PropertyDescriptorImpl]

'modificationTracker' @ [46:65] ==> public final val PsiManager.modificationTracker: PsiModificationTracker[MyPropertyDescriptor]

'outOfCodeBlockModificationCount' @ [46:85] ==> public final val PsiModificationTracker.outOfCodeBlockModificationCount: Long[MyPropertyDescriptor]

'allPackageFqNames' @ [49:36] ==> value-parameter allPackageFqNames: Collection<String> defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.<init>[ValueParameterDescriptorImpl]

'FqName' @ [50:30] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'fqNameAsString' @ [50:37] ==> val fqNameAsString: String defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.<init>[LocalVariableDescriptor]

'this' @ [51:17] ==> <this> defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex[LazyClassReceiverParameterDescriptor]

'allPackageFqNames' @ [51:22] ==> private final val allPackageFqNames: HashSet<FqName> /* = HashSet<FqName> */ defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex[PropertyDescriptorImpl]

'add' @ [51:40] ==> public open fun add(element: FqName): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'fqName' @ [51:44] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.<init>[LocalVariableDescriptor]

'fqName' @ [53:30] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.<init>[LocalVariableDescriptor]

'!' @ [54:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'prefix' @ [54:25] ==> var prefix: FqName defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.<init>[LocalVariableDescriptor]

'isRoot' @ [54:32] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'prefix' @ [55:21] ==> var prefix: FqName defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.<init>[LocalVariableDescriptor]

'prefix' @ [55:30] ==> var prefix: FqName defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.<init>[LocalVariableDescriptor]

'parent' @ [55:37] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'fqNameByPrefix' @ [56:21] ==> private final val fqNameByPrefix: MultiMap<(FqName..FqName?), (FqName..FqName?)> defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex[PropertyDescriptorImpl]

'putValue' @ [56:36] ==> public open fun putValue(@Nullable p0: FqName?, p1: (FqName..FqName?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'prefix' @ [56:45] ==> var prefix: FqName defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.<init>[LocalVariableDescriptor]

'fqName' @ [56:53] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.<init>[LocalVariableDescriptor]

'fqNameByPrefix' @ [62:20] ==> private final val fqNameByPrefix: MultiMap<(FqName..FqName?), (FqName..FqName?)> defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex[PropertyDescriptorImpl]

'fqName' @ [62:35] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.hasSubpackages[ValueParameterDescriptorImpl]

'any' @ [62:43] ==> public inline fun <T> Iterable<(FqName..FqName?)>.any(predicate: ((FqName..FqName?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)

'PackageIndexUtil' @ [63:17] ==> public object PackageIndexUtil defined in org.jetbrains.kotlin.idea.stubindex in file PackageIndexUtil.kt[FakeCallableDescriptorForObject]

'containsFilesWithExactPackage' @ [63:34] ==> @JvmStatic public final fun containsFilesWithExactPackage(packageFqName: FqName, searchScope: GlobalSearchScope, project: Project): Boolean defined in org.jetbrains.kotlin.idea.stubindex.PackageIndexUtil[SimpleFunctionDescriptorImpl]

'packageWithFilesFqName' @ [63:64] ==> value-parameter packageWithFilesFqName: (FqName..FqName?) defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.hasSubpackages.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [63:88] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.hasSubpackages[ValueParameterDescriptorImpl]

'project' @ [63:95] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService[PropertyDescriptorImpl]

'fqName' @ [67:54] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.packageExists[ValueParameterDescriptorImpl]

'allPackageFqNames' @ [67:64] ==> private final val allPackageFqNames: HashSet<FqName> /* = HashSet<FqName> */ defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex[PropertyDescriptorImpl]

'fqNameByPrefix' @ [67:85] ==> private final val fqNameByPrefix: MultiMap<(FqName..FqName?), (FqName..FqName?)> defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex[PropertyDescriptorImpl]

'containsKey' @ [67:100] ==> public open fun containsKey(p0: (FqName..FqName?)): Boolean defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'fqName' @ [67:112] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.packageExists[ValueParameterDescriptorImpl]

'fqNameByPrefix' @ [70:40] ==> private final val fqNameByPrefix: MultiMap<(FqName..FqName?), (FqName..FqName?)> defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex[PropertyDescriptorImpl]

'fqName' @ [70:55] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.getSubpackages[ValueParameterDescriptorImpl]

'HashSet' @ [71:49] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Name

'fqName' @ [72:23] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.getSubpackages[ValueParameterDescriptorImpl]

'pathSegments' @ [72:30] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'size' @ [72:45] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'possibleFilesFqNames' @ [73:33] ==> val possibleFilesFqNames: (MutableCollection<(FqName..FqName?)>..Collection<(FqName..FqName?)>) defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.getSubpackages[LocalVariableDescriptor]

'filesFqName' @ [74:52] ==> val filesFqName: (FqName..FqName?) defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.getSubpackages[LocalVariableDescriptor]

'pathSegments' @ [74:64] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'len' @ [74:79] ==> val len: Int defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.getSubpackages[LocalVariableDescriptor]

'candidateSubPackageShortName' @ [75:21] ==> val candidateSubPackageShortName: (Name..Name?) defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.getSubpackages[LocalVariableDescriptor]

'existingSubPackagesShortNames' @ [75:53] ==> val existingSubPackagesShortNames: HashSet<Name> defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.getSubpackages[LocalVariableDescriptor]

'!' @ [75:86] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [75:87] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'candidateSubPackageShortName' @ [75:98] ==> val candidateSubPackageShortName: (Name..Name?) defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.getSubpackages[LocalVariableDescriptor]

'PackageIndexUtil' @ [77:41] ==> public object PackageIndexUtil defined in org.jetbrains.kotlin.idea.stubindex in file PackageIndexUtil.kt[FakeCallableDescriptorForObject]

'containsFilesWithExactPackage' @ [77:58] ==> @JvmStatic public final fun containsFilesWithExactPackage(packageFqName: FqName, searchScope: GlobalSearchScope, project: Project): Boolean defined in org.jetbrains.kotlin.idea.stubindex.PackageIndexUtil[SimpleFunctionDescriptorImpl]

'filesFqName' @ [77:88] ==> val filesFqName: (FqName..FqName?) defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.getSubpackages[LocalVariableDescriptor]

'scope' @ [77:101] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.getSubpackages[ValueParameterDescriptorImpl]

'project' @ [77:108] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService[PropertyDescriptorImpl]

'existsInThisScope' @ [78:21] ==> val existsInThisScope: Boolean defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.getSubpackages[LocalVariableDescriptor]

'existingSubPackagesShortNames' @ [79:21] ==> val existingSubPackagesShortNames: HashSet<Name> defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.getSubpackages[LocalVariableDescriptor]

'add' @ [79:51] ==> public open fun add(element: Name): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'candidateSubPackageShortName' @ [79:55] ==> val candidateSubPackageShortName: (Name..Name?) defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.getSubpackages[LocalVariableDescriptor]

'existingSubPackagesShortNames' @ [83:20] ==> val existingSubPackagesShortNames: HashSet<Name> defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.getSubpackages[LocalVariableDescriptor]

'map' @ [83:50] ==> public inline fun <T, R> Iterable<Name>.map(transform: (Name) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name
    <R> -> FqName

'fqName' @ [83:56] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.getSubpackages[ValueParameterDescriptorImpl]

'child' @ [83:63] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'it' @ [83:69] ==> value-parameter it: Name defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex.getSubpackages.<anonymous>[ValueParameterDescriptorImpl]

'oocbCount' @ [86:72] ==> private final val oocbCount: Long defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex[PropertyDescriptorImpl]

'allPackageFqNames' @ [86:103] ==> private final val allPackageFqNames: HashSet<FqName> /* = HashSet<FqName> */ defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex[PropertyDescriptorImpl]

'size' @ [86:121] ==> public open val size: Int defined in java.util.HashSet[JavaPropertyDescriptor]

'!!' @ [91:20] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: SubpackagesIndexService?): SubpackagesIndexService[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> SubpackagesIndexService

'getService' @ [91:35] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(SubpackagesIndexService..SubpackagesIndexService?)>): (SubpackagesIndexService..SubpackagesIndexService?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SubpackagesIndexService

'project' @ [91:46] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.Companion.getInstance[ValueParameterDescriptorImpl]

'SubpackagesIndexService' @ [91:55] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService[FakeCallableDescriptorForObject]

'java' @ [91:86] ==> public val <T> KClass<SubpackagesIndexService>.java: Class<SubpackagesIndexService> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SubpackagesIndexService

'cachedValue' @ [91:94] ==> private final val cachedValue: CachedValue<(SubpackagesIndexService.SubpackagesIndex..SubpackagesIndexService.SubpackagesIndex?)> defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService[PropertyDescriptorImpl]

'value' @ [91:106] ==> public final val <T : (Any..Any?)> CachedValue<(SubpackagesIndexService.SubpackagesIndex..SubpackagesIndexService.SubpackagesIndex?)>.value: (SubpackagesIndexService.SubpackagesIndex..SubpackagesIndexService.SubpackagesIndex?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex..org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex?)

