'LazyJavaPackageScope' @ [40:30] ==> public constructor LazyJavaPackageScope(c: LazyJavaResolverContext, jPackage: JavaPackage, ownerDescriptor: LazyJavaPackageFragment) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope[ClassConstructorDescriptorImpl]

'c' @ [40:51] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'jPackage' @ [40:54] ==> value-parameter jPackage: JavaPackage defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.<init>[ValueParameterDescriptorImpl]

'packageFragment' @ [40:64] ==> private final val packageFragment: LazyJavaPackageFragment defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'c' @ [42:33] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'storageManager' @ [42:35] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createLazyValue' @ [42:50] ==> public abstract fun <T : Any> createLazyValue(computable: () -> List<MemberScope>): NotNullLazyValue<List<MemberScope>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> List<MemberScope>

'packageFragment' @ [43:9] ==> private final val packageFragment: LazyJavaPackageFragment defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'binaryClasses' @ [43:25] ==> internal final val binaryClasses: Map<String, KotlinJvmBinaryClass> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[PropertyDescriptorImpl]

'values' @ [43:39] ==> public abstract val values: Collection<KotlinJvmBinaryClass> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'mapNotNull' @ [43:46] ==> public inline fun <T, R : Any> Iterable<KotlinJvmBinaryClass>.mapNotNull(transform: (KotlinJvmBinaryClass) -> MemberScope?): List<MemberScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinJvmBinaryClass
    <R : Any> -> MemberScope

'c' @ [44:13] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'components' @ [44:15] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'deserializedDescriptorResolver' @ [44:26] ==> public final val deserializedDescriptorResolver: DeserializedDescriptorResolver defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'createKotlinPackagePartScope' @ [44:57] ==> public final fun createKotlinPackagePartScope(descriptor: PackageFragmentDescriptor, kotlinClass: KotlinJvmBinaryClass): MemberScope? defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[SimpleFunctionDescriptorImpl]

'packageFragment' @ [44:86] ==> private final val packageFragment: LazyJavaPackageFragment defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'partClass' @ [44:103] ==> value-parameter partClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.kotlinScopes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [45:11] ==> public fun <T> Iterable<MemberScope>.toList(): List<MemberScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberScope

'recordLookup' @ [49:9] ==> private final fun recordLookup(location: LookupLocation, name: Name): Unit defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[SimpleFunctionDescriptorImpl]

'location' @ [49:22] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedClassifier[ValueParameterDescriptorImpl]

'name' @ [49:32] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedClassifier[ValueParameterDescriptorImpl]

'javaScope' @ [51:30] ==> internal final val javaScope: LazyJavaPackageScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'getContributedClassifier' @ [51:40] ==> public open fun getContributedClassifier(name: Name, location: LookupLocation): ClassDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope[SimpleFunctionDescriptorImpl]

'name' @ [51:65] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedClassifier[ValueParameterDescriptorImpl]

'location' @ [51:71] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedClassifier[ValueParameterDescriptorImpl]

'javaClassifier' @ [52:13] ==> val javaClassifier: ClassDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedClassifier[LocalVariableDescriptor]

'javaClassifier' @ [52:44] ==> val javaClassifier: ClassDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedClassifier[LocalVariableDescriptor]

'getFirstClassifierDiscriminateHeaders' @ [54:16] ==> public inline fun <Scope, T : ClassifierDescriptor> getFirstClassifierDiscriminateHeaders(scopes: List<MemberScope>, callback: (MemberScope) -> ClassifierDescriptor?): ClassifierDescriptor? defined in org.jetbrains.kotlin.util.collectionUtils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <Scope> -> MemberScope
    <T : ClassifierDescriptor> -> ClassifierDescriptor

'kotlinScopes' @ [54:54] ==> private final val kotlinScopes: List<MemberScope> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'it' @ [54:70] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedClassifier.<anonymous>[ValueParameterDescriptorImpl]

'getContributedClassifier' @ [54:73] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [54:98] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedClassifier[ValueParameterDescriptorImpl]

'location' @ [54:104] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedClassifier[ValueParameterDescriptorImpl]

'recordLookup' @ [58:9] ==> private final fun recordLookup(location: LookupLocation, name: Name): Unit defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[SimpleFunctionDescriptorImpl]

'location' @ [58:22] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedVariables[ValueParameterDescriptorImpl]

'name' @ [58:32] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedVariables[ValueParameterDescriptorImpl]

'getFromAllScopes' @ [59:16] ==> public inline fun <Scope, T> getFromAllScopes(firstScope: MemberScope, restScopes: List<MemberScope>, callback: (MemberScope) -> Collection<PropertyDescriptor>): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.util.collectionUtils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <Scope> -> MemberScope
    <T> -> PropertyDescriptor

'javaScope' @ [59:33] ==> internal final val javaScope: LazyJavaPackageScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'kotlinScopes' @ [59:44] ==> private final val kotlinScopes: List<MemberScope> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'it' @ [59:60] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedVariables.<anonymous>[ValueParameterDescriptorImpl]

'getContributedVariables' @ [59:63] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [59:87] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedVariables[ValueParameterDescriptorImpl]

'location' @ [59:93] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedVariables[ValueParameterDescriptorImpl]

'recordLookup' @ [63:9] ==> private final fun recordLookup(location: LookupLocation, name: Name): Unit defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[SimpleFunctionDescriptorImpl]

'location' @ [63:22] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedFunctions[ValueParameterDescriptorImpl]

'name' @ [63:32] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedFunctions[ValueParameterDescriptorImpl]

'getFromAllScopes' @ [64:16] ==> public inline fun <Scope, T> getFromAllScopes(firstScope: MemberScope, restScopes: List<MemberScope>, callback: (MemberScope) -> Collection<SimpleFunctionDescriptor>): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.util.collectionUtils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <Scope> -> MemberScope
    <T> -> SimpleFunctionDescriptor

'javaScope' @ [64:33] ==> internal final val javaScope: LazyJavaPackageScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'kotlinScopes' @ [64:44] ==> private final val kotlinScopes: List<MemberScope> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'it' @ [64:60] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedFunctions.<anonymous>[ValueParameterDescriptorImpl]

'getContributedFunctions' @ [64:63] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [64:87] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedFunctions[ValueParameterDescriptorImpl]

'location' @ [64:93] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedFunctions[ValueParameterDescriptorImpl]

'getFromAllScopes' @ [70:13] ==> public inline fun <Scope, T> getFromAllScopes(firstScope: MemberScope, restScopes: List<MemberScope>, callback: (MemberScope) -> Collection<DeclarationDescriptor>): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.util.collectionUtils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <Scope> -> MemberScope
    <T> -> DeclarationDescriptor

'javaScope' @ [70:30] ==> internal final val javaScope: LazyJavaPackageScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'kotlinScopes' @ [70:41] ==> private final val kotlinScopes: List<MemberScope> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'it' @ [70:57] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'getContributedDescriptors' @ [70:60] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'kindFilter' @ [70:86] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'nameFilter' @ [70:98] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'kotlinScopes' @ [72:39] ==> private final val kotlinScopes: List<MemberScope> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'flatMapTo' @ [72:52] ==> public inline fun <T, R, C : MutableCollection<in Name>> Iterable<MemberScope>.flatMapTo(destination: MutableSet<Name>, transform: (MemberScope) -> Iterable<Name>): MutableSet<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberScope
    <R> -> Name
    <C : MutableCollection<in R>> -> MutableSet<Name>

'mutableSetOf' @ [72:62] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'it' @ [72:80] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getFunctionNames.<anonymous>[ValueParameterDescriptorImpl]

'getFunctionNames' @ [72:83] ==> public abstract fun getFunctionNames(): Set<Name> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'apply' @ [72:104] ==> @InlineOnly public inline fun <T> MutableSet<Name>.apply(block: MutableSet<Name>.() -> Unit): MutableSet<Name> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableSet<Name>

'addAll' @ [73:9] ==> public abstract fun addAll(elements: Collection<Name>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'javaScope' @ [73:16] ==> internal final val javaScope: LazyJavaPackageScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'getFunctionNames' @ [73:26] ==> public open fun getFunctionNames(): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope[SimpleFunctionDescriptorImpl]

'kotlinScopes' @ [75:39] ==> private final val kotlinScopes: List<MemberScope> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'flatMapTo' @ [75:52] ==> public inline fun <T, R, C : MutableCollection<in Name>> Iterable<MemberScope>.flatMapTo(destination: MutableSet<Name>, transform: (MemberScope) -> Iterable<Name>): MutableSet<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberScope
    <R> -> Name
    <C : MutableCollection<in R>> -> MutableSet<Name>

'mutableSetOf' @ [75:62] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'it' @ [75:80] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.getVariableNames.<anonymous>[ValueParameterDescriptorImpl]

'getVariableNames' @ [75:83] ==> public abstract fun getVariableNames(): Set<Name> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'apply' @ [75:104] ==> @InlineOnly public inline fun <T> MutableSet<Name>.apply(block: MutableSet<Name>.() -> Unit): MutableSet<Name> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableSet<Name>

'addAll' @ [76:9] ==> public abstract fun addAll(elements: Collection<Name>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'javaScope' @ [76:16] ==> internal final val javaScope: LazyJavaPackageScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'getVariableNames' @ [76:26] ==> public open fun getVariableNames(): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope[SimpleFunctionDescriptorImpl]

'p' @ [80:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [80:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'this' @ [80:19] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[LazyClassReceiverParameterDescriptor]

'java' @ [80:31] ==> public val <T> KClass<out JvmPackageScope>.java: Class<out JvmPackageScope> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JvmPackageScope

'simpleName' @ [80:36] ==> public final val <T : (Any..Any?)> Class<out JvmPackageScope>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JvmPackageScope

'p' @ [81:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.printScopeStructure[ValueParameterDescriptorImpl]

'pushIndent' @ [81:11] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [83:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [83:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'packageFragment' @ [83:44] ==> private final val packageFragment: LazyJavaPackageFragment defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'javaScope' @ [84:9] ==> internal final val javaScope: LazyJavaPackageScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'printScopeStructure' @ [84:19] ==> public open fun printScopeStructure(p: Printer): Unit defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope[SimpleFunctionDescriptorImpl]

'p' @ [84:39] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.printScopeStructure[ValueParameterDescriptorImpl]

'kotlinScopes' @ [86:29] ==> private final val kotlinScopes: List<MemberScope> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'kotlinScope' @ [87:13] ==> val kotlinScope: MemberScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.printScopeStructure[LocalVariableDescriptor]

'printScopeStructure' @ [87:25] ==> public abstract fun printScopeStructure(p: Printer): Unit defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'p' @ [87:45] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.printScopeStructure[ValueParameterDescriptorImpl]

'p' @ [90:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.printScopeStructure[ValueParameterDescriptorImpl]

'popIndent' @ [90:11] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [91:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [91:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'c' @ [95:9] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'components' @ [95:11] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'lookupTracker' @ [95:22] ==> public final val lookupTracker: LookupTracker defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'record' @ [95:36] ==> public fun LookupTracker.record(from: LookupLocation, scopeOwner: PackageFragmentDescriptor, name: Name): Unit defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'location' @ [95:43] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.recordLookup[ValueParameterDescriptorImpl]

'packageFragment' @ [95:53] ==> private final val packageFragment: LazyJavaPackageFragment defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'name' @ [95:70] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope.recordLookup[ValueParameterDescriptorImpl]

