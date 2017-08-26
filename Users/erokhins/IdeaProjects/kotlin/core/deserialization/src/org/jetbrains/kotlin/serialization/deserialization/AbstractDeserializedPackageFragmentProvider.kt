'storageManager' @ [33:29] ==> protected final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.AbstractDeserializedPackageFragmentProvider[PropertyDescriptorImpl]

'createMemoizedFunctionWithNullableValues' @ [33:44] ==> public abstract fun <K, V : Any> createMemoizedFunctionWithNullableValues(compute: (FqName) -> PackageFragmentDescriptor?): MemoizedFunctionToNullable<FqName, PackageFragmentDescriptor> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> FqName
    <V : Any> -> PackageFragmentDescriptor

'findPackage' @ [34:9] ==> protected abstract fun findPackage(fqName: FqName): DeserializedPackageFragment? defined in org.jetbrains.kotlin.serialization.deserialization.AbstractDeserializedPackageFragmentProvider[SimpleFunctionDescriptorImpl]

'fqName' @ [34:21] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.serialization.deserialization.AbstractDeserializedPackageFragmentProvider.fragments.<anonymous>[ValueParameterDescriptorImpl]

'apply' @ [34:30] ==> @InlineOnly public inline fun <T> DeserializedPackageFragment.apply(block: DeserializedPackageFragment.() -> Unit): DeserializedPackageFragment defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeserializedPackageFragment

'components' @ [35:13] ==> public final lateinit var components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragment[PropertyDescriptorImpl]

'this@AbstractDeserializedPackageFragmentProvider' @ [35:26] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.AbstractDeserializedPackageFragmentProvider[LazyClassReceiverParameterDescriptor]

'components' @ [35:75] ==> protected final lateinit var components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.AbstractDeserializedPackageFragmentProvider[PropertyDescriptorImpl]

'listOfNotNull' @ [41:89] ==> public fun <T : Any> listOfNotNull(element: PackageFragmentDescriptor?): List<PackageFragmentDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PackageFragmentDescriptor

'invoke' @ [41:103] ==> public abstract fun invoke(p1: FqName): PackageFragmentDescriptor? defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNullable[FunctionInvokeDescriptor]

'fqName' @ [41:113] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.serialization.deserialization.AbstractDeserializedPackageFragmentProvider.getPackageFragments[ValueParameterDescriptorImpl]

'emptySet' @ [43:104] ==> public fun <T> emptySet(): Set<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

