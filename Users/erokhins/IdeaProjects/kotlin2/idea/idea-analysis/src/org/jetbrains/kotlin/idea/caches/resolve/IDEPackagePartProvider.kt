'getPackageParts' @ [27:13] ==> private final fun getPackageParts(packageFqName: String): MutableList<PackageParts> defined in org.jetbrains.kotlin.idea.caches.resolve.IDEPackagePartProvider[SimpleFunctionDescriptorImpl]

'packageFqName' @ [27:29] ==> value-parameter packageFqName: String defined in org.jetbrains.kotlin.idea.caches.resolve.IDEPackagePartProvider.findPackageParts[ValueParameterDescriptorImpl]

'flatMap' @ [27:44] ==> public inline fun <T, R> Iterable<PackageParts>.flatMap(transform: (PackageParts) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageParts
    <R> -> String

'PackageParts' @ [27:52] ==> public constructor PackageParts(packageFqName: String) defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedClassConstructorDescriptor]

'parts' @ [27:66] ==> public final val parts: Set<String> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedPropertyDescriptor]

'distinct' @ [27:73] ==> public fun <T> Iterable<String>.distinct(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'getPackageParts' @ [30:13] ==> private final fun getPackageParts(packageFqName: String): MutableList<PackageParts> defined in org.jetbrains.kotlin.idea.caches.resolve.IDEPackagePartProvider[SimpleFunctionDescriptorImpl]

'packageFqName' @ [30:29] ==> value-parameter packageFqName: String defined in org.jetbrains.kotlin.idea.caches.resolve.IDEPackagePartProvider.findMetadataPackageParts[ValueParameterDescriptorImpl]

'flatMap' @ [30:44] ==> public inline fun <T, R> Iterable<PackageParts>.flatMap(transform: (PackageParts) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageParts
    <R> -> String

'PackageParts' @ [30:52] ==> public constructor PackageParts(packageFqName: String) defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedClassConstructorDescriptor]

'metadataParts' @ [30:66] ==> public final val metadataParts: Set<String> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedPropertyDescriptor]

'distinct' @ [30:81] ==> public fun <T> Iterable<String>.distinct(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'getInstance' @ [33:28] ==> public open fun getInstance(): (FileBasedIndex..FileBasedIndex?) defined in com.intellij.util.indexing.FileBasedIndex[JavaMethodDescriptor]

'getValues' @ [33:42] ==> @NotNull public abstract fun <K : (Any..Any?), V : (Any..Any?)> getValues(@NotNull p0: ID<(String..String?), (PackageParts..PackageParts?)>, @NotNull p1: String, @NotNull p2: GlobalSearchScope): (MutableList<(PackageParts..PackageParts?)>..List<(PackageParts..PackageParts?)>) defined in com.intellij.util.indexing.FileBasedIndex[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (kotlin.String..kotlin.String?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.load.kotlin.PackageParts..org.jetbrains.kotlin.load.kotlin.PackageParts?)

'KEY' @ [33:77] ==> public final val KEY: ID<String, PackageParts> defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex[PropertyDescriptorImpl]

'packageFqName' @ [33:82] ==> value-parameter packageFqName: String defined in org.jetbrains.kotlin.idea.caches.resolve.IDEPackagePartProvider.getPackageParts[ValueParameterDescriptorImpl]

'scope' @ [33:97] ==> public final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IDEPackagePartProvider[PropertyDescriptorImpl]

