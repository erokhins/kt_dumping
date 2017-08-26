'storageManager' @ [41:45] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [41:60] ==> public abstract fun <T : Any> createLazyValue(computable: () -> List<ImportPath>): NotNullLazyValue<List<ImportPath>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> List<ImportPath>

'targetPlatform' @ [42:9] ==> private final val targetPlatform: TargetPlatform defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider[PropertyDescriptorImpl]

'getDefaultImports' @ [42:24] ==> public abstract fun getDefaultImports(includeKotlinComparisons: Boolean): List<ImportPath> defined in org.jetbrains.kotlin.resolve.TargetPlatform[SimpleFunctionDescriptorImpl]

'languageVersionSettings' @ [42:42] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider[PropertyDescriptorImpl]

'supportsFeature' @ [42:66] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'DefaultImportOfPackageKotlinComparisons' @ [42:82] ==> enum entry DefaultImportOfPackageKotlinComparisons defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'storageManager' @ [45:42] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [45:57] ==> public abstract fun <T : Any> createLazyValue(computable: () -> List<FqName>): NotNullLazyValue<List<FqName>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> List<FqName>

'listOf' @ [46:35] ==> public fun <T> listOf(vararg elements: (FqName..FqName?)): List<(FqName..FqName?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)

'BUILT_INS_PACKAGE_FQ_NAME' @ [46:57] ==> public final val BUILT_INS_PACKAGE_FQ_NAME: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'TEXT_PACKAGE_FQ_NAME' @ [46:99] ==> public final val TEXT_PACKAGE_FQ_NAME: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'moduleDescriptor' @ [47:34] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider.<init>[ValueParameterDescriptorImpl]

'allDependencyModules' @ [47:51] ==> public abstract val allDependencyModules: List<ModuleDescriptor> defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'flatMap' @ [48:18] ==> public inline fun <T, R> Iterable<ModuleDescriptor>.flatMap(transform: (ModuleDescriptor) -> Iterable<TypeAliasDescriptor>): List<TypeAliasDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptor
    <R> -> TypeAliasDescriptor

'packagesWithAliases' @ [49:21] ==> val packagesWithAliases: List<(FqName..FqName?)> defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider.excludedImports.<anonymous>[LocalVariableDescriptor]

'map' @ [49:41] ==> public inline fun <T, R> Iterable<(FqName..FqName?)>.map(transform: ((FqName..FqName?)) -> PackageViewDescriptor): List<PackageViewDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)
    <R> -> PackageViewDescriptor

'dependencyModule' @ [49:45] ==> value-parameter dependencyModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider.excludedImports.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'flatMap' @ [49:75] ==> public inline fun <T, R> Iterable<PackageViewDescriptor>.flatMap(transform: (PackageViewDescriptor) -> Iterable<TypeAliasDescriptor>): List<TypeAliasDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageViewDescriptor
    <R> -> TypeAliasDescriptor

'it' @ [50:25] ==> value-parameter it: PackageViewDescriptor defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider.excludedImports.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'memberScope' @ [50:28] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'getContributedDescriptors' @ [50:40] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [50:66] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'TYPE_ALIASES' @ [50:87] ==> @field:JvmField public final val TYPE_ALIASES: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'filterIsInstance' @ [50:101] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<TypeAliasDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> TypeAliasDescriptor

'filter' @ [53:18] ==> public inline fun <T> Iterable<TypeAliasDescriptor>.filter(predicate: (TypeAliasDescriptor) -> Boolean): List<TypeAliasDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeAliasDescriptor

'it' @ [53:27] ==> value-parameter it: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider.excludedImports.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'checkSinceKotlinVersionAccessibility' @ [53:30] ==> internal fun DeclarationDescriptor.checkSinceKotlinVersionAccessibility(languageVersionSettings: LanguageVersionSettings, actionIfInaccessible: ((ApiVersion) -> Unit)? = ...): Boolean defined in org.jetbrains.kotlin.resolve[SimpleFunctionDescriptorImpl]

'languageVersionSettings' @ [53:67] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider[PropertyDescriptorImpl]

'defaultImports' @ [57:17] ==> public final val defaultImports: List<ImportPath> defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider[PropertyDescriptorImpl]

'filter' @ [58:26] ==> public inline fun <T> Iterable<ImportPath>.filter(predicate: (ImportPath) -> Boolean): List<ImportPath> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportPath

'it' @ [58:35] ==> value-parameter it: ImportPath defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider.excludedImports.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAllUnder' @ [58:38] ==> public final val isAllUnder: Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[PropertyDescriptorImpl]

'mapNotNull' @ [59:26] ==> public inline fun <T, R : Any> Iterable<ImportPath>.mapNotNull(transform: (ImportPath) -> FqName?): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportPath
    <R : Any> -> FqName

'it' @ [60:29] ==> value-parameter it: ImportPath defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider.excludedImports.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [60:32] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[PropertyDescriptorImpl]

'takeUnless' @ [60:39] ==> @InlineOnly @SinceKotlin public inline fun <T> FqName.takeUnless(predicate: (FqName) -> Boolean): FqName? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'it' @ [60:52] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider.excludedImports.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isSubpackageOf' @ [60:55] ==> public fun FqName.isSubpackageOf(packageName: FqName): Boolean defined in org.jetbrains.kotlin.name[DeserializedSimpleFunctionDescriptor]

'BUILT_INS_PACKAGE_FQ_NAME' @ [60:85] ==> public final val BUILT_INS_PACKAGE_FQ_NAME: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'builtinTypeAliases' @ [63:17] ==> val builtinTypeAliases: List<TypeAliasDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider.excludedImports.<anonymous>[LocalVariableDescriptor]

'mapNotNull' @ [64:26] ==> public inline fun <T, R : Any> Iterable<TypeAliasDescriptor>.mapNotNull(transform: (TypeAliasDescriptor) -> FqName?): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeAliasDescriptor
    <R : Any> -> FqName

'it' @ [64:39] ==> value-parameter it: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider.excludedImports.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expandedType' @ [64:42] ==> public abstract val expandedType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'constructor' @ [64:55] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [64:67] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'fqNameSafe' @ [64:90] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'filter' @ [65:26] ==> public inline fun <T> Iterable<FqName>.filter(predicate: (FqName) -> Boolean): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'nonKotlinDefaultImportedPackages' @ [65:35] ==> val nonKotlinDefaultImportedPackages: List<FqName> defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider.excludedImports.<anonymous>[LocalVariableDescriptor]

'any' @ [65:68] ==> public inline fun <T> Iterable<FqName>.any(predicate: (FqName) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'it' @ [65:72] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider.excludedImports.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'nonKotlinAliasedTypeFqNames' @ [67:9] ==> val nonKotlinAliasedTypeFqNames: List<FqName> defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider.excludedImports.<anonymous>[LocalVariableDescriptor]

'targetPlatform' @ [67:39] ==> private final val targetPlatform: TargetPlatform defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider[PropertyDescriptorImpl]

'excludedImports' @ [67:54] ==> public open val excludedImports: List<FqName> defined in org.jetbrains.kotlin.resolve.TargetPlatform[PropertyDescriptorImpl]

