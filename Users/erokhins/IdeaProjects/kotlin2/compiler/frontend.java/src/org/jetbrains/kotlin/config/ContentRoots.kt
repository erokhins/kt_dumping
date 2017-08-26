'add' @ [24:5] ==> public open fun <T : (Any..Any?)> add(@NotNull p0: CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>, @NotNull p1: ContentRoot): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContentRoot

'CONTENT_ROOTS' @ [24:30] ==> public final val CONTENT_ROOTS: (CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>..CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'KotlinSourceRoot' @ [24:45] ==> public constructor KotlinSourceRoot(path: String) defined in org.jetbrains.kotlin.config.KotlinSourceRoot[ClassConstructorDescriptorImpl]

'source' @ [24:62] ==> value-parameter source: String defined in org.jetbrains.kotlin.config.addKotlinSourceRoot[ValueParameterDescriptorImpl]

'sources' @ [28:9] ==> value-parameter sources: List<String> defined in org.jetbrains.kotlin.config.addKotlinSourceRoots[ValueParameterDescriptorImpl]

'forEach' @ [28:17] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'this' @ [28:25] ==> <this> defined in org.jetbrains.kotlin.config.addKotlinSourceRoots[ReceiverParameterDescriptorImpl]

'get' @ [31:13] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>): (MutableList<(ContentRoot..ContentRoot?)>?..List<(ContentRoot..ContentRoot?)>?) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.config.ContentRoot..org.jetbrains.kotlin.config.ContentRoot?)>..kotlin.collections.List<(org.jetbrains.kotlin.config.ContentRoot..org.jetbrains.kotlin.config.ContentRoot?)>)

'CONTENT_ROOTS' @ [31:38] ==> public final val CONTENT_ROOTS: (CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>..CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'filterIsInstance' @ [31:54] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KotlinSourceRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KotlinSourceRoot

'map' @ [31:92] ==> public inline fun <T, R> Iterable<KotlinSourceRoot>.map(transform: (KotlinSourceRoot) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinSourceRoot
    <R> -> String

'it' @ [31:98] ==> value-parameter it: KotlinSourceRoot defined in org.jetbrains.kotlin.config.<get-kotlinSourceRoots>.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [31:101] ==> public final val path: String defined in org.jetbrains.kotlin.config.KotlinSourceRoot[PropertyDescriptorImpl]

'orEmpty' @ [31:108] ==> @InlineOnly public inline fun <T> List<String>?.orEmpty(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

