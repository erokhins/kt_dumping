'AbstractLazyMemberScope<PackageFragmentDescriptor, PackageMemberDeclarationProvider>' @ [33:3] ==> protected constructor AbstractLazyMemberScope<out D : DeclarationDescriptor, out DP : DeclarationProvider>(c: LazyClassContext, declarationProvider: PackageMemberDeclarationProvider, thisDescriptor: PackageFragmentDescriptor, trace: BindingTrace) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : DeclarationDescriptor> -> PackageFragmentDescriptor
    <out DP : DeclarationProvider> -> PackageMemberDeclarationProvider

'resolveSession' @ [33:88] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyPackageMemberScope.<init>[ValueParameterDescriptorImpl]

'declarationProvider' @ [33:104] ==> value-parameter declarationProvider: PackageMemberDeclarationProvider defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyPackageMemberScope.<init>[ValueParameterDescriptorImpl]

'thisPackage' @ [33:125] ==> value-parameter thisPackage: PackageFragmentDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyPackageMemberScope.<init>[ValueParameterDescriptorImpl]

'resolveSession' @ [33:138] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyPackageMemberScope.<init>[ValueParameterDescriptorImpl]

'trace' @ [33:153] ==> public open val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'computeDescriptorsFromDeclaredElements' @ [36:16] ==> protected final fun computeDescriptorsFromDeclaredElements(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean, location: LookupLocation): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyPackageMemberScope[SimpleFunctionDescriptorImpl]

'kindFilter' @ [36:55] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyPackageMemberScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'nameFilter' @ [36:67] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyPackageMemberScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'WHEN_GET_ALL_DESCRIPTORS' @ [36:96] ==> enum entry WHEN_GET_ALL_DESCRIPTORS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'resolveSession' @ [40:13] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyPackageMemberScope[PropertyDescriptorImpl]

'fileScopeProvider' @ [40:28] ==> public final var ResolveSession.fileScopeProvider: FileScopeProvider[MyPropertyDescriptor]

'getFileResolutionScope' @ [40:46] ==> public open fun getFileResolutionScope(file: KtFile): LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProvider[SimpleFunctionDescriptorImpl]

'declaration' @ [40:69] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyPackageMemberScope.getScopeForMemberDeclarationResolution[ValueParameterDescriptorImpl]

'containingKtFile' @ [40:81] ==> public final val KtDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'getScopeForMemberDeclarationResolution' @ [43:13] ==> protected open fun getScopeForMemberDeclarationResolution(declaration: KtDeclaration): LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyPackageMemberScope[SimpleFunctionDescriptorImpl]

'declaration' @ [43:52] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyPackageMemberScope.getScopeForInitializerResolution[ValueParameterDescriptorImpl]

'c' @ [58:9] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyPackageMemberScope[PropertyDescriptorImpl]

'lookupTracker' @ [58:11] ==> public abstract val lookupTracker: LookupTracker defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'record' @ [58:25] ==> public fun LookupTracker.record(from: LookupLocation, scopeOwner: PackageFragmentDescriptor, name: Name): Unit defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'from' @ [58:32] ==> value-parameter from: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyPackageMemberScope.recordLookup[ValueParameterDescriptorImpl]

'thisDescriptor' @ [58:38] ==> protected final val thisDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyPackageMemberScope[PropertyDescriptorImpl]

'name' @ [58:54] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyPackageMemberScope.recordLookup[ValueParameterDescriptorImpl]

'+' @ [62:31] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'thisDescriptor' @ [62:59] ==> protected final val thisDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyPackageMemberScope[PropertyDescriptorImpl]

'name' @ [62:74] ==> public final val PackageFragmentDescriptor.name: Name[MyPropertyDescriptor]

