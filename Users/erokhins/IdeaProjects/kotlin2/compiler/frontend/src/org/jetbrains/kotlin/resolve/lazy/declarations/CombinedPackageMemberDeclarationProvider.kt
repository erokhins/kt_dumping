'providers' @ [26:77] ==> public final val providers: Collection<PackageMemberDeclarationProvider> defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider[PropertyDescriptorImpl]

'flatMap' @ [26:87] ==> public inline fun <T, R> Iterable<PackageMemberDeclarationProvider>.flatMap(transform: (PackageMemberDeclarationProvider) -> Iterable<FqName>): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageMemberDeclarationProvider
    <R> -> FqName

'it' @ [26:97] ==> value-parameter it: PackageMemberDeclarationProvider defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider.getAllDeclaredSubPackages.<anonymous>[ValueParameterDescriptorImpl]

'getAllDeclaredSubPackages' @ [26:100] ==> public abstract fun getAllDeclaredSubPackages(nameFilter: (Name) -> Boolean): Collection<FqName> defined in org.jetbrains.kotlin.resolve.lazy.declarations.PackageMemberDeclarationProvider[SimpleFunctionDescriptorImpl]

'nameFilter' @ [26:126] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider.getAllDeclaredSubPackages[ValueParameterDescriptorImpl]

'providers' @ [28:38] ==> public final val providers: Collection<PackageMemberDeclarationProvider> defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider[PropertyDescriptorImpl]

'flatMap' @ [28:48] ==> public inline fun <T, R> Iterable<PackageMemberDeclarationProvider>.flatMap(transform: (PackageMemberDeclarationProvider) -> Iterable<KtFile>): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageMemberDeclarationProvider
    <R> -> KtFile

'it' @ [28:58] ==> value-parameter it: PackageMemberDeclarationProvider defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider.getPackageFiles.<anonymous>[ValueParameterDescriptorImpl]

'getPackageFiles' @ [28:61] ==> public abstract fun getPackageFiles(): Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.declarations.PackageMemberDeclarationProvider[SimpleFunctionDescriptorImpl]

'providers' @ [31:15] ==> public final val providers: Collection<PackageMemberDeclarationProvider> defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider[PropertyDescriptorImpl]

'flatMap' @ [31:25] ==> public inline fun <T, R> Iterable<PackageMemberDeclarationProvider>.flatMap(transform: (PackageMemberDeclarationProvider) -> Iterable<KtDeclaration>): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageMemberDeclarationProvider
    <R> -> KtDeclaration

'it' @ [31:35] ==> value-parameter it: PackageMemberDeclarationProvider defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider.getDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'getDeclarations' @ [31:38] ==> public abstract fun getDeclarations(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): List<KtDeclaration> defined in org.jetbrains.kotlin.resolve.lazy.declarations.PackageMemberDeclarationProvider[SimpleFunctionDescriptorImpl]

'kindFilter' @ [31:54] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider.getDeclarations[ValueParameterDescriptorImpl]

'nameFilter' @ [31:66] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider.getDeclarations[ValueParameterDescriptorImpl]

'providers' @ [33:56] ==> public final val providers: Collection<PackageMemberDeclarationProvider> defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider[PropertyDescriptorImpl]

'flatMap' @ [33:66] ==> public inline fun <T, R> Iterable<PackageMemberDeclarationProvider>.flatMap(transform: (PackageMemberDeclarationProvider) -> Iterable<KtNamedFunction>): List<KtNamedFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageMemberDeclarationProvider
    <R> -> KtNamedFunction

'it' @ [33:76] ==> value-parameter it: PackageMemberDeclarationProvider defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider.getFunctionDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'getFunctionDeclarations' @ [33:79] ==> public abstract fun getFunctionDeclarations(name: Name): Collection<KtNamedFunction> defined in org.jetbrains.kotlin.resolve.lazy.declarations.PackageMemberDeclarationProvider[SimpleFunctionDescriptorImpl]

'name' @ [33:103] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider.getFunctionDeclarations[ValueParameterDescriptorImpl]

'providers' @ [35:56] ==> public final val providers: Collection<PackageMemberDeclarationProvider> defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider[PropertyDescriptorImpl]

'flatMap' @ [35:66] ==> public inline fun <T, R> Iterable<PackageMemberDeclarationProvider>.flatMap(transform: (PackageMemberDeclarationProvider) -> Iterable<KtProperty>): List<KtProperty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageMemberDeclarationProvider
    <R> -> KtProperty

'it' @ [35:76] ==> value-parameter it: PackageMemberDeclarationProvider defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider.getPropertyDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'getPropertyDeclarations' @ [35:79] ==> public abstract fun getPropertyDeclarations(name: Name): Collection<KtProperty> defined in org.jetbrains.kotlin.resolve.lazy.declarations.PackageMemberDeclarationProvider[SimpleFunctionDescriptorImpl]

'name' @ [35:103] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider.getPropertyDeclarations[ValueParameterDescriptorImpl]

'providers' @ [38:16] ==> public final val providers: Collection<PackageMemberDeclarationProvider> defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider[PropertyDescriptorImpl]

'flatMap' @ [38:26] ==> public inline fun <T, R> Iterable<PackageMemberDeclarationProvider>.flatMap(transform: (PackageMemberDeclarationProvider) -> Iterable<KtDestructuringDeclarationEntry>): List<KtDestructuringDeclarationEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageMemberDeclarationProvider
    <R> -> KtDestructuringDeclarationEntry

'it' @ [38:36] ==> value-parameter it: PackageMemberDeclarationProvider defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider.getDestructuringDeclarationsEntries.<anonymous>[ValueParameterDescriptorImpl]

'getDestructuringDeclarationsEntries' @ [38:39] ==> public abstract fun getDestructuringDeclarationsEntries(name: Name): Collection<KtDestructuringDeclarationEntry> defined in org.jetbrains.kotlin.resolve.lazy.declarations.PackageMemberDeclarationProvider[SimpleFunctionDescriptorImpl]

'name' @ [38:75] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider.getDestructuringDeclarationsEntries[ValueParameterDescriptorImpl]

'providers' @ [41:61] ==> public final val providers: Collection<PackageMemberDeclarationProvider> defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider[PropertyDescriptorImpl]

'flatMap' @ [41:71] ==> public inline fun <T, R> Iterable<PackageMemberDeclarationProvider>.flatMap(transform: (PackageMemberDeclarationProvider) -> Iterable<KtClassLikeInfo>): List<KtClassLikeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageMemberDeclarationProvider
    <R> -> KtClassLikeInfo

'it' @ [41:81] ==> value-parameter it: PackageMemberDeclarationProvider defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider.getClassOrObjectDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'getClassOrObjectDeclarations' @ [41:84] ==> public abstract fun getClassOrObjectDeclarations(name: Name): Collection<KtClassLikeInfo> defined in org.jetbrains.kotlin.resolve.lazy.declarations.PackageMemberDeclarationProvider[SimpleFunctionDescriptorImpl]

'name' @ [41:113] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider.getClassOrObjectDeclarations[ValueParameterDescriptorImpl]

'providers' @ [43:57] ==> public final val providers: Collection<PackageMemberDeclarationProvider> defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider[PropertyDescriptorImpl]

'flatMap' @ [43:67] ==> public inline fun <T, R> Iterable<PackageMemberDeclarationProvider>.flatMap(transform: (PackageMemberDeclarationProvider) -> Iterable<KtTypeAlias>): List<KtTypeAlias> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageMemberDeclarationProvider
    <R> -> KtTypeAlias

'it' @ [43:77] ==> value-parameter it: PackageMemberDeclarationProvider defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider.getTypeAliasDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'getTypeAliasDeclarations' @ [43:80] ==> public abstract fun getTypeAliasDeclarations(name: Name): Collection<KtTypeAlias> defined in org.jetbrains.kotlin.resolve.lazy.declarations.PackageMemberDeclarationProvider[SimpleFunctionDescriptorImpl]

'name' @ [43:105] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider.getTypeAliasDeclarations[ValueParameterDescriptorImpl]

