'moduleInfo' @ [32:13] ==> value-parameter moduleInfo: ModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.createOracle[ValueParameterDescriptorImpl]

'Optimistic' @ [32:65] ==> public object Optimistic : PackageOracle defined in org.jetbrains.kotlin.analyzer.PackageOracle[FakeCallableDescriptorForObject]

'when (moduleInfo.platform) {
            JvmPlatform -> when (moduleInfo.moduleOrigin) {
                ModuleOrigin.LIBRARY -> JavaPackagesOracle(moduleInfo, project)
                ModuleOrigin.MODULE -> JvmSourceOracle(moduleInfo as ModuleSourceInfo, project)
                ModuleOrigin.OTHER -> PackageOracle.Optimistic
            }
            else -> when (moduleInfo.moduleOrigin) {
                ModuleOrigin.MODULE -> KotlinSourceFilesOracle(moduleInfo as ModuleSourceInfo)
                else -> PackageOracle.Optimistic // binaries for non-jvm platform need some oracles based on their structure
            }
        }' @ [34:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PackageOracle, entry1: PackageOracle): PackageOracle[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PackageOracle

'moduleInfo' @ [34:22] ==> value-parameter moduleInfo: ModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.createOracle[ValueParameterDescriptorImpl]

'platform' @ [34:33] ==> public open val platform: TargetPlatform? defined in org.jetbrains.kotlin.analyzer.ModuleInfo[DeserializedPropertyDescriptor]

'JvmPlatform' @ [35:13] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'when (moduleInfo.moduleOrigin) {
                ModuleOrigin.LIBRARY -> JavaPackagesOracle(moduleInfo, project)
                ModuleOrigin.MODULE -> JvmSourceOracle(moduleInfo as ModuleSourceInfo, project)
                ModuleOrigin.OTHER -> PackageOracle.Optimistic
            }' @ [35:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PackageOracle, entry1: PackageOracle, entry2: PackageOracle): PackageOracle[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PackageOracle

'moduleInfo' @ [35:34] ==> value-parameter moduleInfo: ModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.createOracle[ValueParameterDescriptorImpl]

'moduleOrigin' @ [35:45] ==> public abstract val moduleOrigin: ModuleOrigin defined in org.jetbrains.kotlin.idea.caches.resolve.IdeaModuleInfo[PropertyDescriptorImpl]

'LIBRARY' @ [36:30] ==> enum entry LIBRARY defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleOrigin[FakeCallableDescriptorForObject]

'JavaPackagesOracle' @ [36:41] ==> public constructor JavaPackagesOracle(moduleInfo: IdeaModuleInfo, project: Project) defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.JavaPackagesOracle[ClassConstructorDescriptorImpl]

'moduleInfo' @ [36:60] ==> value-parameter moduleInfo: ModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.createOracle[ValueParameterDescriptorImpl]

'project' @ [36:72] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory[PropertyDescriptorImpl]

'MODULE' @ [37:30] ==> enum entry MODULE defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleOrigin[FakeCallableDescriptorForObject]

'JvmSourceOracle' @ [37:40] ==> public constructor JvmSourceOracle(moduleInfo: ModuleSourceInfo, project: Project) defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.JvmSourceOracle[ClassConstructorDescriptorImpl]

'moduleInfo' @ [37:56] ==> value-parameter moduleInfo: ModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.createOracle[ValueParameterDescriptorImpl]

'project' @ [37:88] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory[PropertyDescriptorImpl]

'OTHER' @ [38:30] ==> enum entry OTHER defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleOrigin[FakeCallableDescriptorForObject]

'Optimistic' @ [38:53] ==> public object Optimistic : PackageOracle defined in org.jetbrains.kotlin.analyzer.PackageOracle[FakeCallableDescriptorForObject]

'when (moduleInfo.moduleOrigin) {
                ModuleOrigin.MODULE -> KotlinSourceFilesOracle(moduleInfo as ModuleSourceInfo)
                else -> PackageOracle.Optimistic // binaries for non-jvm platform need some oracles based on their structure
            }' @ [40:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PackageOracle, entry1: PackageOracle): PackageOracle[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PackageOracle

'moduleInfo' @ [40:27] ==> value-parameter moduleInfo: ModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.createOracle[ValueParameterDescriptorImpl]

'moduleOrigin' @ [40:38] ==> public abstract val moduleOrigin: ModuleOrigin defined in org.jetbrains.kotlin.idea.caches.resolve.IdeaModuleInfo[PropertyDescriptorImpl]

'MODULE' @ [41:30] ==> enum entry MODULE defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleOrigin[FakeCallableDescriptorForObject]

'KotlinSourceFilesOracle' @ [41:40] ==> public constructor KotlinSourceFilesOracle(moduleInfo: ModuleSourceInfo) defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.KotlinSourceFilesOracle[ClassConstructorDescriptorImpl]

'moduleInfo' @ [41:64] ==> value-parameter moduleInfo: ModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.createOracle[ValueParameterDescriptorImpl]

'Optimistic' @ [42:39] ==> public object Optimistic : PackageOracle defined in org.jetbrains.kotlin.analyzer.PackageOracle[FakeCallableDescriptorForObject]

'moduleInfo' @ [48:29] ==> value-parameter moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.JavaPackagesOracle.<init>[ValueParameterDescriptorImpl]

'contentScope' @ [48:40] ==> public abstract fun contentScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IdeaModuleInfo[SimpleFunctionDescriptorImpl]

'project' @ [49:30] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.JavaPackagesOracle.<init>[ValueParameterDescriptorImpl]

'service' @ [49:38] ==> public inline fun <reified T : Any> Project.service(): KotlinJavaPsiFacade defined in com.intellij.openapi.components[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KotlinJavaPsiFacade

'facade' @ [51:54] ==> private final val facade: KotlinJavaPsiFacade defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.JavaPackagesOracle[PropertyDescriptorImpl]

'findPackage' @ [51:61] ==> public open fun findPackage(@NotNull p0: String, p1: (GlobalSearchScope..GlobalSearchScope?)): (PsiPackage..PsiPackage?) defined in org.jetbrains.kotlin.resolve.jvm.KotlinJavaPsiFacade[JavaMethodDescriptor]

'fqName' @ [51:73] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.JavaPackagesOracle.packageExists[ValueParameterDescriptorImpl]

'asString' @ [51:80] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'scope' @ [51:92] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.JavaPackagesOracle[PropertyDescriptorImpl]

'moduleInfo' @ [55:36] ==> private final val moduleInfo: ModuleSourceInfo defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.KotlinSourceFilesOracle[PropertyDescriptorImpl]

'module' @ [55:47] ==> public abstract val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleSourceInfo[PropertyDescriptorImpl]

'project' @ [55:54] ==> public final val Module.project: Project[MyPropertyDescriptor]

'service' @ [55:62] ==> public inline fun <reified T : Any> Project.service(): PerModulePackageCacheService defined in com.intellij.openapi.components[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> PerModulePackageCacheService

'cacheService' @ [58:20] ==> private final val cacheService: PerModulePackageCacheService defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.KotlinSourceFilesOracle[PropertyDescriptorImpl]

'packageExists' @ [58:33] ==> public final fun packageExists(packageFqName: FqName, moduleInfo: ModuleSourceInfo): Boolean defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[SimpleFunctionDescriptorImpl]

'fqName' @ [58:47] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.KotlinSourceFilesOracle.packageExists[ValueParameterDescriptorImpl]

'moduleInfo' @ [58:55] ==> private final val moduleInfo: ModuleSourceInfo defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.KotlinSourceFilesOracle[PropertyDescriptorImpl]

'JavaPackagesOracle' @ [63:42] ==> public constructor JavaPackagesOracle(moduleInfo: IdeaModuleInfo, project: Project) defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.JavaPackagesOracle[ClassConstructorDescriptorImpl]

'moduleInfo' @ [63:61] ==> value-parameter moduleInfo: ModuleSourceInfo defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.JvmSourceOracle.<init>[ValueParameterDescriptorImpl]

'project' @ [63:73] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.JvmSourceOracle.<init>[ValueParameterDescriptorImpl]

'KotlinSourceFilesOracle' @ [64:42] ==> public constructor KotlinSourceFilesOracle(moduleInfo: ModuleSourceInfo) defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.KotlinSourceFilesOracle[ClassConstructorDescriptorImpl]

'moduleInfo' @ [64:66] ==> value-parameter moduleInfo: ModuleSourceInfo defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.JvmSourceOracle.<init>[ValueParameterDescriptorImpl]

'javaPackagesOracle' @ [67:17] ==> private final val javaPackagesOracle: IdePackageOracleFactory.JavaPackagesOracle defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.JvmSourceOracle[PropertyDescriptorImpl]

'packageExists' @ [67:36] ==> public open fun packageExists(fqName: FqName): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.JavaPackagesOracle[SimpleFunctionDescriptorImpl]

'fqName' @ [67:50] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.JvmSourceOracle.packageExists[ValueParameterDescriptorImpl]

'kotlinSourceOracle' @ [68:20] ==> private final val kotlinSourceOracle: IdePackageOracleFactory.KotlinSourceFilesOracle defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.JvmSourceOracle[PropertyDescriptorImpl]

'packageExists' @ [68:39] ==> public open fun packageExists(fqName: FqName): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.KotlinSourceFilesOracle[SimpleFunctionDescriptorImpl]

'fqName' @ [68:53] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.JvmSourceOracle.packageExists[ValueParameterDescriptorImpl]

'fqName' @ [69:20] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.IdePackageOracleFactory.JvmSourceOracle.packageExists[ValueParameterDescriptorImpl]

'isSubpackageOf' @ [69:27] ==> public fun FqName.isSubpackageOf(packageName: FqName): Boolean defined in org.jetbrains.kotlin.name[DeserializedSimpleFunctionDescriptor]

'ANDROID_SYNTHETIC_PACKAGE_PREFIX' @ [69:42] ==> private val ANDROID_SYNTHETIC_PACKAGE_PREFIX: FqName defined in org.jetbrains.kotlin.idea.caches.resolve in file packageOracles.kt[PropertyDescriptorImpl]

'FqName' @ [73:48] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

