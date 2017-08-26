'servicesFacade' @ [26:13] ==> private final val servicesFacade: IncrementalCompilerServicesFacade defined in org.jetbrains.kotlin.daemon.incremental.RemoteArtifactChangesProvider[PropertyDescriptorImpl]

'getChanges' @ [26:28] ==> public abstract fun getChanges(artifact: File, sinceTS: Long): Iterable<SimpleDirtyData>? defined in org.jetbrains.kotlin.daemon.common.IncrementalCompilerServicesFacade[DeserializedSimpleFunctionDescriptor]

'artifact' @ [26:39] ==> value-parameter artifact: File defined in org.jetbrains.kotlin.daemon.incremental.RemoteArtifactChangesProvider.getChanges[ValueParameterDescriptorImpl]

'sinceTS' @ [26:49] ==> value-parameter sinceTS: Long defined in org.jetbrains.kotlin.daemon.incremental.RemoteArtifactChangesProvider.getChanges[ValueParameterDescriptorImpl]

'map' @ [26:59] ==> public inline fun <T, R> Iterable<SimpleDirtyData>.map(transform: (SimpleDirtyData) -> DirtyData): List<DirtyData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleDirtyData
    <R> -> DirtyData

'it' @ [26:65] ==> value-parameter it: SimpleDirtyData defined in org.jetbrains.kotlin.daemon.incremental.RemoteArtifactChangesProvider.getChanges.<anonymous>[ValueParameterDescriptorImpl]

'toDirtyData' @ [26:68] ==> public fun SimpleDirtyData.toDirtyData(): DirtyData defined in org.jetbrains.kotlin.daemon.incremental in file dirtyDataUtils.kt[SimpleFunctionDescriptorImpl]

