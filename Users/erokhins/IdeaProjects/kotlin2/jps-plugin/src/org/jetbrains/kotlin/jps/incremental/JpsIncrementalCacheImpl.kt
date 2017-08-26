'IncrementalCacheImpl<ModuleBuildTarget>' @ [31:5] ==> public constructor IncrementalCacheImpl<Target>(targetDataRoot: File, targetOutputDir: File?, target: ModuleBuildTarget) defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[DeserializedClassConstructorDescriptor]
Inferred types:
    <Target> -> ModuleBuildTarget

'paths' @ [31:45] ==> value-parameter paths: BuildDataPaths defined in org.jetbrains.kotlin.jps.incremental.JpsIncrementalCacheImpl.<init>[ValueParameterDescriptorImpl]

'getTargetDataRoot' @ [31:51] ==> public abstract fun getTargetDataRoot(p0: (BuildTarget<*>..BuildTarget<*>?)): (File..File?) defined in org.jetbrains.jps.builders.storage.BuildDataPaths[JavaMethodDescriptor]

'target' @ [31:69] ==> value-parameter target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.incremental.JpsIncrementalCacheImpl.<init>[ValueParameterDescriptorImpl]

'target' @ [31:78] ==> value-parameter target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.incremental.JpsIncrementalCacheImpl.<init>[ValueParameterDescriptorImpl]

'outputDir' @ [31:85] ==> public final val ModuleBuildTarget.outputDir: File?[MyPropertyDescriptor]

'target' @ [31:96] ==> value-parameter target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.incremental.JpsIncrementalCacheImpl.<init>[ValueParameterDescriptorImpl]

'KotlinBuilder' @ [33:9] ==> public companion object defined in org.jetbrains.kotlin.jps.build.KotlinBuilder[FakeCallableDescriptorForObject]

'LOG' @ [33:23] ==> public final val LOG: Logger defined in org.jetbrains.kotlin.jps.build.KotlinBuilder.Companion[PropertyDescriptorImpl]

'debug' @ [33:27] ==> public abstract fun debug(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'message' @ [33:33] ==> value-parameter message: String defined in org.jetbrains.kotlin.jps.incremental.JpsIncrementalCacheImpl.debugLog[ValueParameterDescriptorImpl]

'StorageProvider<JpsIncrementalCacheImpl>' @ [40:5] ==> public constructor StorageProvider<S : (StorageOwner..StorageOwner?)>() defined in org.jetbrains.jps.builders.storage.StorageProvider[JavaClassConstructorDescriptor]
Inferred types:
    <S : (StorageOwner..StorageOwner?)> -> JpsIncrementalCacheImpl

'other' @ [42:40] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.jps.incremental.KotlinIncrementalStorageProvider.equals[ValueParameterDescriptorImpl]

'target' @ [42:85] ==> private final val target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.incremental.KotlinIncrementalStorageProvider[PropertyDescriptorImpl]

'other' @ [42:95] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.jps.incremental.KotlinIncrementalStorageProvider.equals[ValueParameterDescriptorImpl]

'target' @ [42:101] ==> private final val target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.incremental.KotlinIncrementalStorageProvider[PropertyDescriptorImpl]

'target' @ [44:31] ==> private final val target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.incremental.KotlinIncrementalStorageProvider[PropertyDescriptorImpl]

'hashCode' @ [44:38] ==> public open fun hashCode(): Int defined in org.jetbrains.jps.incremental.ModuleBuildTarget[JavaMethodDescriptor]

'JpsIncrementalCacheImpl' @ [47:13] ==> public constructor JpsIncrementalCacheImpl(target: ModuleBuildTarget, paths: BuildDataPaths) defined in org.jetbrains.kotlin.jps.incremental.JpsIncrementalCacheImpl[ClassConstructorDescriptorImpl]

'target' @ [47:37] ==> private final val target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.incremental.KotlinIncrementalStorageProvider[PropertyDescriptorImpl]

'paths' @ [47:45] ==> private final val paths: BuildDataPaths defined in org.jetbrains.kotlin.jps.incremental.KotlinIncrementalStorageProvider[PropertyDescriptorImpl]

'getStorage' @ [51:9] ==> @NotNull public open fun <S : (StorageOwner..StorageOwner?)> getStorage(@NotNull p0: BuildTarget<*>, @NotNull p1: StorageProvider<(JpsIncrementalCacheImpl..JpsIncrementalCacheImpl?)>): JpsIncrementalCacheImpl defined in org.jetbrains.jps.incremental.storage.BuildDataManager[JavaMethodDescriptor]
Inferred types:
    <S : (StorageOwner..StorageOwner?)> -> (org.jetbrains.kotlin.jps.incremental.JpsIncrementalCacheImpl..org.jetbrains.kotlin.jps.incremental.JpsIncrementalCacheImpl?)

'target' @ [51:20] ==> value-parameter target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.incremental.getKotlinCache[ValueParameterDescriptorImpl]

'KotlinIncrementalStorageProvider' @ [51:28] ==> public constructor KotlinIncrementalStorageProvider(target: ModuleBuildTarget, paths: BuildDataPaths) defined in org.jetbrains.kotlin.jps.incremental.KotlinIncrementalStorageProvider[ClassConstructorDescriptorImpl]

'target' @ [51:61] ==> value-parameter target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.incremental.getKotlinCache[ValueParameterDescriptorImpl]

'dataPaths' @ [51:69] ==> public final val BuildDataManager.dataPaths: (BuildDataPaths..BuildDataPaths?)[MyPropertyDescriptor]

