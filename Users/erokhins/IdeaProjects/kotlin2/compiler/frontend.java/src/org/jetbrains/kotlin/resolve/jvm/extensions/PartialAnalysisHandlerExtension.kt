'!' @ [46:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'analyzePartially' @ [46:14] ==> protected open val analyzePartially: Boolean defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension[PropertyDescriptorImpl]

'componentProvider' @ [50:30] ==> value-parameter componentProvider: ComponentProvider defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis[ValueParameterDescriptorImpl]

'get' @ [50:48] ==> public inline fun <reified T : Any> ComponentProvider.get(): ResolveSession defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ResolveSession

'componentProvider' @ [51:28] ==> value-parameter componentProvider: ComponentProvider defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis[ValueParameterDescriptorImpl]

'get' @ [51:46] ==> public inline fun <reified T : Any> ComponentProvider.get(): BodyResolver defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> BodyResolver

'componentProvider' @ [52:40] ==> value-parameter componentProvider: ComponentProvider defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis[ValueParameterDescriptorImpl]

'get' @ [52:58] ==> public inline fun <reified T : Any> ComponentProvider.get(): DeclarationScopeProvider defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> DeclarationScopeProvider

'TopDownAnalysisContext' @ [54:38] ==> public constructor TopDownAnalysisContext(@NotNull p0: TopDownAnalysisMode, @NotNull p1: DataFlowInfo, @NotNull p2: DeclarationScopeProvider) defined in org.jetbrains.kotlin.resolve.TopDownAnalysisContext[JavaClassConstructorDescriptor]

'TopLevelDeclarations' @ [55:37] ==> enum entry TopLevelDeclarations defined in org.jetbrains.kotlin.resolve.TopDownAnalysisMode[FakeCallableDescriptorForObject]

'DataFlowInfo' @ [55:59] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[FakeCallableDescriptorForObject]

'EMPTY' @ [55:72] ==> public final val EMPTY: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo.Companion[DeserializedPropertyDescriptor]

'declarationScopeProvider' @ [55:79] ==> val declarationScopeProvider: DeclarationScopeProvider defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis[LocalVariableDescriptor]

'files' @ [57:22] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis[ValueParameterDescriptorImpl]

'forceResolveAllContents' @ [58:30] ==> public open fun forceResolveAllContents(@NotNull p0: Annotations): Unit defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]

'resolveSession' @ [58:54] ==> val resolveSession: ResolveSession defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis[LocalVariableDescriptor]

'getFileAnnotations' @ [58:69] ==> @NotNull public open fun getFileAnnotations(@NotNull p0: KtFile): Annotations defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'file' @ [58:88] ==> val file: KtFile defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis[LocalVariableDescriptor]

'doForEachDeclaration' @ [61:9] ==> private final fun doForEachDeclaration(files: Collection<KtFile>, f: (KtDeclaration) -> Unit): Unit defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension[SimpleFunctionDescriptorImpl]

'files' @ [61:30] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis[ValueParameterDescriptorImpl]

'resolveSession' @ [62:30] ==> val resolveSession: ResolveSession defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis[LocalVariableDescriptor]

'resolveToDescriptor' @ [62:45] ==> @NotNull public open fun resolveToDescriptor(@NotNull p0: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'declaration' @ [62:65] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[ValueParameterDescriptorImpl]

'when (descriptor) {
                is ClassDescriptor -> {
                    ForceResolveUtil.forceResolveAllContents(descriptor)
                    ForceResolveUtil.forceResolveAllContents(descriptor.typeConstructor.supertypes)

                    if (declaration is KtClassOrObject && descriptor is ClassDescriptorWithResolutionScopes) {
                        bodyResolver.resolveSuperTypeEntryList(DataFlowInfo.EMPTY,
                                                               declaration,
                                                               descriptor,
                                                               descriptor.unsubstitutedPrimaryConstructor,
                                                               descriptor.scopeForConstructorHeaderResolution,
                                                               descriptor.scopeForMemberDeclarationResolution)
                    }
                }
                is PropertyDescriptor -> {
                    if (declaration is KtProperty) {
                        /* TODO Now we analyse body with anonymous object initializers. Check if we can't avoid it
                         * val a: Runnable = object : Runnable { ... } */
                        bodyResolver.resolveProperty(topDownAnalysisContext, declaration, descriptor)
                    }
                    else if (declaration is KtParameter) { // Annotation parameter
                        val ownerElement = declaration.ownerFunction
                        val ownerDescriptor = bindingTrace[BindingContext.VALUE_PARAMETER, declaration]?.containingDeclaration
                        val containingScope = ownerDescriptor?.containingScope

                        if (ownerElement is KtPrimaryConstructor && ownerDescriptor is ConstructorDescriptor && containingScope != null) {
                            bodyResolver.resolveConstructorParameterDefaultValues(
                                    topDownAnalysisContext.outerDataFlowInfo, bindingTrace, ownerElement, ownerDescriptor, containingScope)
                        }
                    }
                }
                is FunctionDescriptor -> {
                    // is body expression (not unit)
                    if (declaration is KtFunction && !declaration.hasDeclaredReturnType() && !declaration.hasBlockBody()) {
                        ForceResolveUtil.forceResolveAllContents(descriptor)
                    }
                }
            }' @ [64:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'descriptor' @ [64:19] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[LocalVariableDescriptor]

'forceResolveAllContents' @ [66:38] ==> public open fun <T : (Any..Any?)> forceResolveAllContents(@NotNull p0: ClassDescriptor): (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ClassDescriptor

'descriptor' @ [66:62] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[LocalVariableDescriptor]

'forceResolveAllContents' @ [67:38] ==> public open fun forceResolveAllContents(@NotNull p0: (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>)): Unit defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]

'descriptor' @ [67:62] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[LocalVariableDescriptor]

'typeConstructor' @ [67:73] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [67:89] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'declaration' @ [69:25] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [69:59] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[LocalVariableDescriptor]

'bodyResolver' @ [70:25] ==> val bodyResolver: BodyResolver defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis[LocalVariableDescriptor]

'resolveSuperTypeEntryList' @ [70:38] ==> public open fun resolveSuperTypeEntryList(@NotNull p0: DataFlowInfo, @NotNull p1: KtClassOrObject, @NotNull p2: ClassDescriptor, @Nullable p3: ConstructorDescriptor?, @NotNull p4: LexicalScope, @NotNull p5: LexicalScope): Unit defined in org.jetbrains.kotlin.resolve.BodyResolver[JavaMethodDescriptor]

'DataFlowInfo' @ [70:64] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[FakeCallableDescriptorForObject]

'EMPTY' @ [70:77] ==> public final val EMPTY: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo.Companion[DeserializedPropertyDescriptor]

'declaration' @ [71:64] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [72:64] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [73:64] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [73:75] ==> public final val ClassDescriptorWithResolutionScopes.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'descriptor' @ [74:64] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[LocalVariableDescriptor]

'scopeForConstructorHeaderResolution' @ [74:75] ==> public final val ClassDescriptorWithResolutionScopes.scopeForConstructorHeaderResolution: LexicalScope[MyPropertyDescriptor]

'descriptor' @ [75:64] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[LocalVariableDescriptor]

'scopeForMemberDeclarationResolution' @ [75:75] ==> public final val ClassDescriptorWithResolutionScopes.scopeForMemberDeclarationResolution: LexicalScope[MyPropertyDescriptor]

'if (declaration is KtProperty) {
                        /* TODO Now we analyse body with anonymous object initializers. Check if we can't avoid it
                         * val a: Runnable = object : Runnable { ... } */
                        bodyResolver.resolveProperty(topDownAnalysisContext, declaration, descriptor)
                    }
                    else if (declaration is KtParameter) { // Annotation parameter
                        val ownerElement = declaration.ownerFunction
                        val ownerDescriptor = bindingTrace[BindingContext.VALUE_PARAMETER, declaration]?.containingDeclaration
                        val containingScope = ownerDescriptor?.containingScope

                        if (ownerElement is KtPrimaryConstructor && ownerDescriptor is ConstructorDescriptor && containingScope != null) {
                            bodyResolver.resolveConstructorParameterDefaultValues(
                                    topDownAnalysisContext.outerDataFlowInfo, bindingTrace, ownerElement, ownerDescriptor, containingScope)
                        }
                    }' @ [79:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'declaration' @ [79:25] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[ValueParameterDescriptorImpl]

'bodyResolver' @ [82:25] ==> val bodyResolver: BodyResolver defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis[LocalVariableDescriptor]

'resolveProperty' @ [82:38] ==> public open fun resolveProperty(@NotNull p0: BodiesResolveContext, @NotNull p1: KtProperty, @NotNull p2: PropertyDescriptor): Unit defined in org.jetbrains.kotlin.resolve.BodyResolver[JavaMethodDescriptor]

'topDownAnalysisContext' @ [82:54] ==> val topDownAnalysisContext: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis[LocalVariableDescriptor]

'declaration' @ [82:78] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [82:91] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[LocalVariableDescriptor]

'declaration' @ [84:30] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [85:44] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[ValueParameterDescriptorImpl]

'ownerFunction' @ [85:56] ==> public final val KtParameter.ownerFunction: KtDeclarationWithBody?[MyPropertyDescriptor]

'bindingTrace' @ [86:47] ==> value-parameter bindingTrace: BindingTrace defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis[ValueParameterDescriptorImpl]

'VALUE_PARAMETER' @ [86:75] ==> public final val VALUE_PARAMETER: (WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declaration' @ [86:92] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [86:106] ==> public final val VariableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'ownerDescriptor' @ [87:47] ==> val ownerDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[LocalVariableDescriptor]

'containingScope' @ [87:64] ==> private final val DeclarationDescriptor.containingScope: LexicalScope? defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension[PropertyDescriptorImpl]

'ownerElement' @ [89:29] ==> val ownerElement: KtDeclarationWithBody? defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[LocalVariableDescriptor]

'ownerDescriptor' @ [89:69] ==> val ownerDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[LocalVariableDescriptor]

'containingScope' @ [89:113] ==> val containingScope: LexicalScope? defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[LocalVariableDescriptor]

'bodyResolver' @ [90:29] ==> val bodyResolver: BodyResolver defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis[LocalVariableDescriptor]

'resolveConstructorParameterDefaultValues' @ [90:42] ==> public open fun resolveConstructorParameterDefaultValues(@NotNull p0: DataFlowInfo, @NotNull p1: BindingTrace, @NotNull p2: KtPrimaryConstructor, @NotNull p3: ConstructorDescriptor, @NotNull p4: LexicalScope): Unit defined in org.jetbrains.kotlin.resolve.BodyResolver[JavaMethodDescriptor]

'topDownAnalysisContext' @ [91:37] ==> val topDownAnalysisContext: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis[LocalVariableDescriptor]

'outerDataFlowInfo' @ [91:60] ==> public final val TopDownAnalysisContext.outerDataFlowInfo: DataFlowInfo[MyPropertyDescriptor]

'bindingTrace' @ [91:79] ==> value-parameter bindingTrace: BindingTrace defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis[ValueParameterDescriptorImpl]

'ownerElement' @ [91:93] ==> val ownerElement: KtDeclarationWithBody? defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[LocalVariableDescriptor]

'ownerDescriptor' @ [91:107] ==> val ownerDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[LocalVariableDescriptor]

'containingScope' @ [91:124] ==> val containingScope: LexicalScope? defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[LocalVariableDescriptor]

'declaration' @ [97:25] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [97:54] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [97:55] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[ValueParameterDescriptorImpl]

'hasDeclaredReturnType' @ [97:67] ==> public abstract fun hasDeclaredReturnType(): Boolean defined in org.jetbrains.kotlin.psi.KtFunction[JavaMethodDescriptor]

'!' @ [97:94] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [97:95] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[ValueParameterDescriptorImpl]

'hasBlockBody' @ [97:107] ==> public abstract fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtFunction[JavaMethodDescriptor]

'forceResolveAllContents' @ [98:42] ==> public open fun <T : (Any..Any?)> forceResolveAllContents(@NotNull p0: FunctionDescriptor): (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FunctionDescriptor

'descriptor' @ [98:66] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis.<anonymous>[LocalVariableDescriptor]

'AnalysisResult' @ [104:16] ==> public companion object defined in org.jetbrains.kotlin.analyzer.AnalysisResult[FakeCallableDescriptorForObject]

'success' @ [104:41] ==> @JvmStatic public final fun success(bindingContext: BindingContext, module: ModuleDescriptor, shouldGenerateCode: Boolean): AnalysisResult defined in org.jetbrains.kotlin.analyzer.AnalysisResult.Companion[DeserializedSimpleFunctionDescriptor]

'bindingTrace' @ [104:49] ==> value-parameter bindingTrace: BindingTrace defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis[ValueParameterDescriptorImpl]

'bindingContext' @ [104:62] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'module' @ [104:78] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doAnalysis[ValueParameterDescriptorImpl]

'containingDeclaration' @ [109:40] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'when (containingDescriptor) {
                is ClassDescriptorWithResolutionScopes -> containingDescriptor.scopeForInitializerResolution
                is PackageFragmentDescriptor -> LexicalScope.Base(containingDescriptor.getMemberScope().memberScopeAsImportingScope(), this)
                else -> null
            }' @ [110:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: LexicalScope?, entry1: LexicalScope?, entry2: LexicalScope?): LexicalScope?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> LexicalScope?

'containingDescriptor' @ [110:26] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.<get-containingScope>[LocalVariableDescriptor]

'containingDescriptor' @ [111:59] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.<get-containingScope>[LocalVariableDescriptor]

'scopeForInitializerResolution' @ [111:80] ==> public final val ClassDescriptorWithResolutionScopes.scopeForInitializerResolution: LexicalScope[MyPropertyDescriptor]

'Base' @ [112:62] ==> public constructor Base(parent: HierarchicalScope, ownerDescriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope.Base[DeserializedClassConstructorDescriptor]

'containingDescriptor' @ [112:67] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.<get-containingScope>[LocalVariableDescriptor]

'getMemberScope' @ [112:88] ==> public abstract fun getMemberScope(): MemberScope defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedSimpleFunctionDescriptor]

'memberScopeAsImportingScope' @ [112:105] ==> @JvmOverloads public fun MemberScope.memberScopeAsImportingScope(parentScope: ImportingScope? = ...): ImportingScope defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'this' @ [112:136] ==> <this> defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.containingScope[ReceiverParameterDescriptorImpl]

'declaration' @ [118:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doForEachDeclaration[ValueParameterDescriptorImpl]

'invoke' @ [119:13] ==> public abstract operator fun invoke(p1: KtDeclaration): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'declaration' @ [119:15] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doForEachDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [122:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doForEachDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [123:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doForEachDeclaration[ValueParameterDescriptorImpl]

'declarations' @ [123:25] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'forEach' @ [123:38] ==> @HidesMembers public inline fun <T> Iterable<KtDeclaration>.forEach(action: (KtDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'doForEachDeclaration' @ [123:48] ==> private final fun doForEachDeclaration(declaration: KtDeclaration, f: (KtDeclaration) -> Unit): Unit defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension[SimpleFunctionDescriptorImpl]

'it' @ [123:69] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doForEachDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'f' @ [123:73] ==> value-parameter f: (KtDeclaration) -> Unit defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doForEachDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [126:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doForEachDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [126:39] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doForEachDeclaration[ValueParameterDescriptorImpl]

'isAnnotation' @ [126:51] ==> public final fun isAnnotation(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'declaration' @ [127:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doForEachDeclaration[ValueParameterDescriptorImpl]

'primaryConstructorParameters' @ [127:25] ==> public final val KtClass.primaryConstructorParameters: List<KtParameter>[MyPropertyDescriptor]

'forEach' @ [127:54] ==> @HidesMembers public inline fun <T> Iterable<KtParameter>.forEach(action: (KtParameter) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'doForEachDeclaration' @ [127:64] ==> private final fun doForEachDeclaration(declaration: KtDeclaration, f: (KtDeclaration) -> Unit): Unit defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension[SimpleFunctionDescriptorImpl]

'it' @ [127:85] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doForEachDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'f' @ [127:89] ==> value-parameter f: (KtDeclaration) -> Unit defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doForEachDeclaration[ValueParameterDescriptorImpl]

'files' @ [132:22] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doForEachDeclaration[ValueParameterDescriptorImpl]

'file' @ [133:13] ==> val file: KtFile defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doForEachDeclaration[LocalVariableDescriptor]

'declarations' @ [133:18] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'forEach' @ [133:31] ==> @HidesMembers public inline fun <T> Iterable<(KtDeclaration..KtDeclaration?)>.forEach(action: ((KtDeclaration..KtDeclaration?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'doForEachDeclaration' @ [133:41] ==> private final fun doForEachDeclaration(declaration: KtDeclaration, f: (KtDeclaration) -> Unit): Unit defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension[SimpleFunctionDescriptorImpl]

'it' @ [133:62] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doForEachDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'f' @ [133:66] ==> value-parameter f: (KtDeclaration) -> Unit defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension.doForEachDeclaration[ValueParameterDescriptorImpl]

