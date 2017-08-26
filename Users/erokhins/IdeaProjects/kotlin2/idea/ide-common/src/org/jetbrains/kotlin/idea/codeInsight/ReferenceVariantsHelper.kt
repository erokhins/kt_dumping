'setOf' @ [54:56] ==> @InlineOnly public inline fun <T> setOf(): Set<FqNameUnsafe> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqNameUnsafe

'getReferenceVariants' @ [65:15] ==> public final fun getReferenceVariants(contextElement: PsiElement, callTypeAndReceiver: CallTypeAndReceiver<*, *>, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean, filterOutJavaGettersAndSetters: Boolean = ..., filterOutShadowed: Boolean = ..., excludeNonInitializedVariable: Boolean = ..., useReceiverType: KotlinType? = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[SimpleFunctionDescriptorImpl]

'expression' @ [65:36] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'detect' @ [65:68] ==> public final fun detect(expression: KtSimpleNameExpression): CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [65:75] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'kindFilter' @ [66:36] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'nameFilter' @ [66:48] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'filterOutJavaGettersAndSetters' @ [66:60] ==> value-parameter filterOutJavaGettersAndSetters: Boolean = ... defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'filterOutShadowed' @ [66:92] ==> value-parameter filterOutShadowed: Boolean = ... defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'excludeNonInitializedVariable' @ [66:111] ==> value-parameter excludeNonInitializedVariable: Boolean = ... defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'useReceiverType' @ [66:142] ==> value-parameter useReceiverType: KotlinType? = ... defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'getReferenceVariantsNoVisibilityFilter' @ [79:19] ==> private final fun getReferenceVariantsNoVisibilityFilter(contextElement: PsiElement, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean, callTypeAndReceiver: CallTypeAndReceiver<*, *>, useReceiverType: KotlinType?): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[SimpleFunctionDescriptorImpl]

'contextElement' @ [79:58] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'kindFilter' @ [79:74] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'nameFilter' @ [79:86] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'callTypeAndReceiver' @ [79:98] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'useReceiverType' @ [79:119] ==> value-parameter useReceiverType: KotlinType? = ... defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'filter' @ [80:18] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'!' @ [80:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [80:28] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants.<anonymous>[ValueParameterDescriptorImpl]

'isHiddenInResolution' @ [80:31] ==> @JvmOverloads public fun DeclarationDescriptor.isHiddenInResolution(languageVersionSettings: LanguageVersionSettings, isSuperCall: Boolean = ...): Boolean defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [80:52] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'frontendService' @ [80:69] ==> public inline fun <reified T : Any> ResolutionFacade.frontendService(): LanguageVersionSettings defined in org.jetbrains.kotlin.idea.resolve[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> LanguageVersionSettings

'invoke' @ [80:116] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [80:133] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants.<anonymous>[ValueParameterDescriptorImpl]

'filterOutShadowed' @ [82:13] ==> value-parameter filterOutShadowed: Boolean = ... defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'ShadowedDeclarationsFilter' @ [83:13] ==> public companion object defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[FakeCallableDescriptorForObject]

'create' @ [83:40] ==> public final fun create(bindingContext: BindingContext, resolutionFacade: ResolutionFacade, context: PsiElement, callTypeAndReceiver: CallTypeAndReceiver<*, *>): ShadowedDeclarationsFilter? defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.Companion[SimpleFunctionDescriptorImpl]

'bindingContext' @ [83:47] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'resolutionFacade' @ [83:63] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'contextElement' @ [83:81] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'callTypeAndReceiver' @ [83:97] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'let' @ [83:119] ==> @InlineOnly public inline fun <T, R> ShadowedDeclarationsFilter.let(block: (ShadowedDeclarationsFilter) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ShadowedDeclarationsFilter
    <R> -> Unit

'variants' @ [84:17] ==> var variants: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[LocalVariableDescriptor]

'it' @ [84:28] ==> value-parameter it: ShadowedDeclarationsFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [84:31] ==> public final fun <TDescriptor : DeclarationDescriptor> filter(declarations: Collection<DeclarationDescriptor>): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[SimpleFunctionDescriptorImpl]
Inferred types:
    <TDescriptor : DeclarationDescriptor> -> DeclarationDescriptor

'variants' @ [84:38] ==> var variants: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[LocalVariableDescriptor]

'filterOutJavaGettersAndSetters' @ [88:13] ==> value-parameter filterOutJavaGettersAndSetters: Boolean = ... defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'kindFilter' @ [88:47] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'kindMask' @ [88:58] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedPropertyDescriptor]

'and' @ [88:67] ==> public final infix fun and(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'FUNCTIONS_MASK' @ [88:92] ==> public final val FUNCTIONS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'variants' @ [89:13] ==> var variants: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[LocalVariableDescriptor]

'filterOutJavaGettersAndSetters' @ [89:24] ==> public final fun <TDescriptor : DeclarationDescriptor> filterOutJavaGettersAndSetters(variants: Collection<DeclarationDescriptor>): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[SimpleFunctionDescriptorImpl]
Inferred types:
    <TDescriptor : DeclarationDescriptor> -> DeclarationDescriptor

'variants' @ [89:55] ==> var variants: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[LocalVariableDescriptor]

'excludeNonInitializedVariable' @ [92:13] ==> value-parameter excludeNonInitializedVariable: Boolean = ... defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'kindFilter' @ [92:46] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'kindMask' @ [92:57] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedPropertyDescriptor]

'and' @ [92:66] ==> public final infix fun and(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'VARIABLES_MASK' @ [92:91] ==> public final val VARIABLES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'variants' @ [93:13] ==> var variants: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[LocalVariableDescriptor]

'excludeNonInitializedVariable' @ [93:24] ==> public final fun excludeNonInitializedVariable(variants: Collection<DeclarationDescriptor>, contextElement: PsiElement): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[SimpleFunctionDescriptorImpl]

'variants' @ [93:54] ==> var variants: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[LocalVariableDescriptor]

'contextElement' @ [93:64] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[ValueParameterDescriptorImpl]

'variants' @ [96:16] ==> var variants: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariants[LocalVariableDescriptor]

'HashSet' @ [100:39] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FunctionDescriptor

'variants' @ [101:32] ==> value-parameter variants: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.filterOutJavaGettersAndSetters[ValueParameterDescriptorImpl]

'filter' @ [101:41] ==> public inline fun <T> Iterable<TDescriptor>.filter(predicate: (TDescriptor) -> Boolean): List<TDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TDescriptor

'it' @ [101:50] ==> value-parameter it: TDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.filterOutJavaGettersAndSetters.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [101:92] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [101:93] ==> value-parameter it: TDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.filterOutJavaGettersAndSetters.<anonymous>[ValueParameterDescriptorImpl]

'suppressedByNotPropertyList' @ [101:96] ==> public fun SyntheticJavaPropertyDescriptor.suppressedByNotPropertyList(set: Set<FqNameUnsafe>): Boolean defined in org.jetbrains.kotlin.idea.util in file NotPropertyList.kt[SimpleFunctionDescriptorImpl]

'notProperties' @ [101:124] ==> private final val notProperties: Set<FqNameUnsafe> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'filteredVariants' @ [103:25] ==> val filteredVariants: List<TDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.filterOutJavaGettersAndSetters[LocalVariableDescriptor]

'variant' @ [104:17] ==> val variant: TDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.filterOutJavaGettersAndSetters[LocalVariableDescriptor]

'accessorMethodsToRemove' @ [105:17] ==> val accessorMethodsToRemove: HashSet<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.filterOutJavaGettersAndSetters[LocalVariableDescriptor]

'add' @ [105:41] ==> public open fun add(element: FunctionDescriptor): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'variant' @ [105:45] ==> val variant: TDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.filterOutJavaGettersAndSetters[LocalVariableDescriptor]

'getMethod' @ [105:53] ==> public abstract val getMethod: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[DeserializedPropertyDescriptor]

'original' @ [105:63] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'variant' @ [107:30] ==> val variant: TDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.filterOutJavaGettersAndSetters[LocalVariableDescriptor]

'setMethod' @ [107:38] ==> public abstract val setMethod: FunctionDescriptor? defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[DeserializedPropertyDescriptor]

'setter' @ [108:21] ==> val setter: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.filterOutJavaGettersAndSetters[LocalVariableDescriptor]

'setter' @ [108:39] ==> val setter: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.filterOutJavaGettersAndSetters[LocalVariableDescriptor]

'returnType' @ [108:46] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'isUnit' @ [108:58] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'accessorMethodsToRemove' @ [109:21] ==> val accessorMethodsToRemove: HashSet<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.filterOutJavaGettersAndSetters[LocalVariableDescriptor]

'add' @ [109:45] ==> public open fun add(element: FunctionDescriptor): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'setter' @ [109:49] ==> val setter: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.filterOutJavaGettersAndSetters[LocalVariableDescriptor]

'original' @ [109:56] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'filteredVariants' @ [114:16] ==> val filteredVariants: List<TDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.filterOutJavaGettersAndSetters[LocalVariableDescriptor]

'filter' @ [114:33] ==> public inline fun <T> Iterable<TDescriptor>.filter(predicate: (TDescriptor) -> Boolean): List<TDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TDescriptor

'it' @ [114:42] ==> value-parameter it: TDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.filterOutJavaGettersAndSetters.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [114:71] ==> value-parameter it: TDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.filterOutJavaGettersAndSetters.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [114:74] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'accessorMethodsToRemove' @ [114:87] ==> val accessorMethodsToRemove: HashSet<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.filterOutJavaGettersAndSetters[LocalVariableDescriptor]

'contextElement' @ [119:25] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.excludeNonInitializedVariable[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [119:40] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [120:26] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.excludeNonInitializedVariable[LocalVariableDescriptor]

'parent' @ [120:34] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [121:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.excludeNonInitializedVariable[LocalVariableDescriptor]

'element' @ [121:52] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.excludeNonInitializedVariable[LocalVariableDescriptor]

'parent' @ [121:63] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.excludeNonInitializedVariable[LocalVariableDescriptor]

'initializer' @ [121:70] ==> public final val KtVariableDeclaration.initializer: KtExpression?[MyPropertyDescriptor]

'bindingContext' @ [122:34] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [122:64] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'parent' @ [122:91] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.excludeNonInitializedVariable[LocalVariableDescriptor]

'variants' @ [123:24] ==> value-parameter variants: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.excludeNonInitializedVariable[ValueParameterDescriptorImpl]

'filter' @ [123:33] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [123:42] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.excludeNonInitializedVariable.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [123:48] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.excludeNonInitializedVariable[LocalVariableDescriptor]

'element' @ [125:17] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.excludeNonInitializedVariable[LocalVariableDescriptor]

'variants' @ [127:16] ==> value-parameter variants: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.excludeNonInitializedVariable[ValueParameterDescriptorImpl]

'callTypeAndReceiver' @ [137:24] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'callType' @ [137:44] ==> public final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[PropertyDescriptorImpl]

'Suppress' @ [139:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'kindFilter' @ [140:26] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'intersect' @ [140:37] ==> public final fun intersect(other: DescriptorKindFilter): DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'callType' @ [140:47] ==> val callType: CallType<*> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'descriptorKindFilter' @ [140:56] ==> public final val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.util.CallType[PropertyDescriptorImpl]

'when (callTypeAndReceiver) {
            is CallTypeAndReceiver.IMPORT_DIRECTIVE -> {
                return getVariantsForImportOrPackageDirective(callTypeAndReceiver.receiver, kindFilter, nameFilter)
            }

            is CallTypeAndReceiver.PACKAGE_DIRECTIVE -> {
                return getVariantsForImportOrPackageDirective(callTypeAndReceiver.receiver, kindFilter, nameFilter)
            }

            is CallTypeAndReceiver.TYPE -> {
                return getVariantsForUserType(callTypeAndReceiver.receiver, contextElement, kindFilter, nameFilter)
            }

            is CallTypeAndReceiver.ANNOTATION -> {
                return getVariantsForUserType(callTypeAndReceiver.receiver, contextElement, kindFilter, nameFilter)
            }

            is CallTypeAndReceiver.CALLABLE_REFERENCE -> {
                return getVariantsForCallableReference(callTypeAndReceiver, contextElement, useReceiverType, kindFilter, nameFilter)
            }

            is CallTypeAndReceiver.DEFAULT -> receiverExpression = null
            is CallTypeAndReceiver.DOT -> receiverExpression = callTypeAndReceiver.receiver
            is CallTypeAndReceiver.SUPER_MEMBERS -> receiverExpression = callTypeAndReceiver.receiver
            is CallTypeAndReceiver.SAFE -> receiverExpression = callTypeAndReceiver.receiver
            is CallTypeAndReceiver.INFIX -> receiverExpression = callTypeAndReceiver.receiver
            is CallTypeAndReceiver.OPERATOR -> return emptyList()
            is CallTypeAndReceiver.UNKNOWN -> return emptyList()
            else -> throw RuntimeException() //TODO: see KT-9394
        }' @ [143:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit, entry6: Unit, entry7: Unit, entry8: Unit, entry9: Unit, entry10: Unit, entry11: Unit, entry12: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'callTypeAndReceiver' @ [143:15] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'getVariantsForImportOrPackageDirective' @ [145:24] ==> private final fun getVariantsForImportOrPackageDirective(receiverExpression: KtExpression?, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[SimpleFunctionDescriptorImpl]

'callTypeAndReceiver' @ [145:63] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'receiver' @ [145:83] ==> public final val receiver: KtExpression? defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.IMPORT_DIRECTIVE[PropertyDescriptorImpl]

'kindFilter' @ [145:93] ==> val kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'nameFilter' @ [145:105] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'getVariantsForImportOrPackageDirective' @ [149:24] ==> private final fun getVariantsForImportOrPackageDirective(receiverExpression: KtExpression?, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[SimpleFunctionDescriptorImpl]

'callTypeAndReceiver' @ [149:63] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'receiver' @ [149:83] ==> public final val receiver: KtExpression? defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.PACKAGE_DIRECTIVE[PropertyDescriptorImpl]

'kindFilter' @ [149:93] ==> val kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'nameFilter' @ [149:105] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'getVariantsForUserType' @ [153:24] ==> private final fun getVariantsForUserType(receiverExpression: KtExpression?, contextElement: PsiElement, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[SimpleFunctionDescriptorImpl]

'callTypeAndReceiver' @ [153:47] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'receiver' @ [153:67] ==> public final val receiver: KtExpression? defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.TYPE[PropertyDescriptorImpl]

'contextElement' @ [153:77] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'kindFilter' @ [153:93] ==> val kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'nameFilter' @ [153:105] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'getVariantsForUserType' @ [157:24] ==> private final fun getVariantsForUserType(receiverExpression: KtExpression?, contextElement: PsiElement, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[SimpleFunctionDescriptorImpl]

'callTypeAndReceiver' @ [157:47] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'receiver' @ [157:67] ==> public final val receiver: KtExpression? defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.ANNOTATION[PropertyDescriptorImpl]

'contextElement' @ [157:77] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'kindFilter' @ [157:93] ==> val kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'nameFilter' @ [157:105] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'getVariantsForCallableReference' @ [161:24] ==> private final fun getVariantsForCallableReference(callTypeAndReceiver: CallTypeAndReceiver.CALLABLE_REFERENCE, contextElement: PsiElement, useReceiverType: KotlinType?, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[SimpleFunctionDescriptorImpl]

'callTypeAndReceiver' @ [161:56] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'contextElement' @ [161:77] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'useReceiverType' @ [161:93] ==> value-parameter useReceiverType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'kindFilter' @ [161:110] ==> val kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'nameFilter' @ [161:122] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'receiverExpression' @ [164:47] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'receiverExpression' @ [165:43] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'callTypeAndReceiver' @ [165:64] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'receiver' @ [165:84] ==> public final val receiver: KtExpression defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.DOT[PropertyDescriptorImpl]

'receiverExpression' @ [166:53] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'callTypeAndReceiver' @ [166:74] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'receiver' @ [166:94] ==> public final val receiver: KtSuperExpression defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.SUPER_MEMBERS[PropertyDescriptorImpl]

'receiverExpression' @ [167:44] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'callTypeAndReceiver' @ [167:65] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'receiver' @ [167:85] ==> public final val receiver: KtExpression defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.SAFE[PropertyDescriptorImpl]

'receiverExpression' @ [168:45] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'callTypeAndReceiver' @ [168:66] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'receiver' @ [168:86] ==> public final val receiver: KtExpression defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.INFIX[PropertyDescriptorImpl]

'emptyList' @ [169:55] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'emptyList' @ [170:54] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'RuntimeException' @ [171:27] ==> public final fun <init>(): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'contextElement' @ [174:31] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'getResolutionScope' @ [174:46] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util in file scopeUtils.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [174:65] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'resolutionFacade' @ [174:81] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'bindingContext' @ [175:28] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'getDataFlowInfoBefore' @ [175:43] ==> public fun BindingContext.getDataFlowInfoBefore(position: PsiElement): DataFlowInfo defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'contextElement' @ [175:65] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'resolutionScope' @ [176:37] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'ownerDescriptor' @ [176:53] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'resolutionFacade' @ [178:32] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'frontendService' @ [178:49] ==> public inline fun <reified T : Any> ResolutionFacade.frontendService(): SmartCastManager defined in org.jetbrains.kotlin.idea.resolve[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> SmartCastManager

'resolutionScope' @ [179:37] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'getImplicitReceiversWithInstance' @ [179:53] ==> public fun LexicalScope.getImplicitReceiversWithInstance(): Collection<ReceiverParameterDescriptor> defined in org.jetbrains.kotlin.idea.util in file implicitReceiversUtils.kt[SimpleFunctionDescriptorImpl]

'flatMap' @ [179:88] ==> public inline fun <T, R> Iterable<ReceiverParameterDescriptor>.flatMap(transform: (ReceiverParameterDescriptor) -> Iterable<KotlinType>): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> KotlinType

'smartCastManager' @ [180:13] ==> val smartCastManager: SmartCastManager defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'getSmartCastVariantsWithLessSpecificExcluded' @ [180:30] ==> public fun SmartCastManager.getSmartCastVariantsWithLessSpecificExcluded(receiverToCast: ReceiverValue, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor, dataFlowInfo: DataFlowInfo): List<KotlinType> defined in org.jetbrains.kotlin.idea.util in file Utils.kt[SimpleFunctionDescriptorImpl]

'it' @ [180:75] ==> value-parameter it: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [180:78] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'bindingContext' @ [180:85] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'containingDeclaration' @ [180:101] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'dataFlowInfo' @ [180:124] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'toSet' @ [181:11] ==> public fun <T> Iterable<KotlinType>.toSet(): Set<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'LinkedHashSet' @ [183:27] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'kindFilter' @ [185:39] ==> val kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'Extensions' @ [185:80] ==> public object Extensions : DescriptorKindExclude defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[FakeCallableDescriptorForObject]

'if (receiverExpression != null) {
            val qualifier = bindingContext[BindingContext.QUALIFIER, receiverExpression]
            if (qualifier != null) {
                descriptors.addAll(qualifier.staticScope.collectStaticMembers(resolutionFacade, filterWithoutExtensions, nameFilter))
            }

            val explicitReceiverTypes = if (useReceiverType != null) {
                listOf(useReceiverType)
            }
            else {
                callTypeAndReceiver.receiverTypes(bindingContext, contextElement, moduleDescriptor, resolutionFacade, stableSmartCastsOnly = false)!!
            }

            descriptors.processAll(implicitReceiverTypes, explicitReceiverTypes, resolutionScope, callType, kindFilter, nameFilter)
        }
        else {
            assert(useReceiverType == null) { "'useReceiverType' parameter is not supported for implicit receiver" }

            descriptors.processAll(implicitReceiverTypes, implicitReceiverTypes, resolutionScope, callType, kindFilter, nameFilter)

            // add non-instance members
            descriptors.addAll(resolutionScope.collectDescriptorsFiltered(filterWithoutExtensions, nameFilter, changeNamesForAliased = true))
            descriptors.addAll(resolutionScope.collectAllFromMeAndParent { scope ->
                scope.collectSyntheticStaticMembersAndConstructors(resolutionFacade, kindFilter, nameFilter)
            })
        }' @ [186:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'receiverExpression' @ [186:13] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'bindingContext' @ [187:29] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'QUALIFIER' @ [187:59] ==> public final val QUALIFIER: (WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>..WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'receiverExpression' @ [187:70] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'qualifier' @ [188:17] ==> val qualifier: Qualifier? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'descriptors' @ [189:17] ==> val descriptors: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'addAll' @ [189:29] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'qualifier' @ [189:36] ==> val qualifier: Qualifier? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'staticScope' @ [189:46] ==> public abstract val staticScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.receivers.Qualifier[DeserializedPropertyDescriptor]

'collectStaticMembers' @ [189:58] ==> private fun MemberScope.collectStaticMembers(resolutionFacade: ResolutionFacade, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight in file ReferenceVariantsHelper.kt[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [189:79] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'filterWithoutExtensions' @ [189:97] ==> val filterWithoutExtensions: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'nameFilter' @ [189:122] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'if (useReceiverType != null) {
                listOf(useReceiverType)
            }
            else {
                callTypeAndReceiver.receiverTypes(bindingContext, contextElement, moduleDescriptor, resolutionFacade, stableSmartCastsOnly = false)!!
            }' @ [192:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<KotlinType>, elseBranch: Collection<KotlinType>): Collection<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<KotlinType>

'useReceiverType' @ [192:45] ==> value-parameter useReceiverType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'listOf' @ [193:17] ==> public fun <T> listOf(element: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'useReceiverType' @ [193:24] ==> value-parameter useReceiverType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'callTypeAndReceiver' @ [196:17] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'receiverTypes' @ [196:37] ==> public fun CallTypeAndReceiver<*, *>.receiverTypes(bindingContext: BindingContext, contextElement: PsiElement, moduleDescriptor: ModuleDescriptor, resolutionFacade: ResolutionFacade, stableSmartCastsOnly: Boolean): Collection<KotlinType>? defined in org.jetbrains.kotlin.idea.util in file CallType.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [196:51] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'contextElement' @ [196:67] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [196:83] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'resolutionFacade' @ [196:101] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'descriptors' @ [199:13] ==> val descriptors: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'processAll' @ [199:25] ==> private final fun MutableSet<DeclarationDescriptor>.processAll(implicitReceiverTypes: Collection<KotlinType>, receiverTypes: Collection<KotlinType>, resolutionScope: LexicalScope, callType: CallType<*>, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[SimpleFunctionDescriptorImpl]

'implicitReceiverTypes' @ [199:36] ==> val implicitReceiverTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'explicitReceiverTypes' @ [199:59] ==> val explicitReceiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'resolutionScope' @ [199:82] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'callType' @ [199:99] ==> val callType: CallType<*> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'kindFilter' @ [199:109] ==> val kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'nameFilter' @ [199:121] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'assert' @ [202:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'useReceiverType' @ [202:20] ==> value-parameter useReceiverType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'descriptors' @ [204:13] ==> val descriptors: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'processAll' @ [204:25] ==> private final fun MutableSet<DeclarationDescriptor>.processAll(implicitReceiverTypes: Collection<KotlinType>, receiverTypes: Collection<KotlinType>, resolutionScope: LexicalScope, callType: CallType<*>, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[SimpleFunctionDescriptorImpl]

'implicitReceiverTypes' @ [204:36] ==> val implicitReceiverTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'implicitReceiverTypes' @ [204:59] ==> val implicitReceiverTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'resolutionScope' @ [204:82] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'callType' @ [204:99] ==> val callType: CallType<*> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'kindFilter' @ [204:109] ==> val kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'nameFilter' @ [204:121] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'descriptors' @ [207:13] ==> val descriptors: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'addAll' @ [207:25] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'resolutionScope' @ [207:32] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'collectDescriptorsFiltered' @ [207:48] ==> public fun HierarchicalScope.collectDescriptorsFiltered(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ..., changeNamesForAliased: Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'filterWithoutExtensions' @ [207:75] ==> val filterWithoutExtensions: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'nameFilter' @ [207:100] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'descriptors' @ [208:13] ==> val descriptors: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'addAll' @ [208:25] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'resolutionScope' @ [208:32] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'collectAllFromMeAndParent' @ [208:48] ==> public inline fun <T : Any> HierarchicalScope.collectAllFromMeAndParent(collect: (HierarchicalScope) -> Collection<FunctionDescriptor>): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> FunctionDescriptor

'scope' @ [209:17] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter.<anonymous>[ValueParameterDescriptorImpl]

'collectSyntheticStaticMembersAndConstructors' @ [209:23] ==> public fun ResolutionScope.collectSyntheticStaticMembersAndConstructors(resolutionFacade: ResolutionFacade, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight in file ReferenceVariantsHelper.kt[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [209:68] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'kindFilter' @ [209:86] ==> val kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'nameFilter' @ [209:98] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[ValueParameterDescriptorImpl]

'callType' @ [213:13] ==> val callType: CallType<*> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'SUPER_MEMBERS' @ [213:34] ==> public object SUPER_MEMBERS : CallType<KtSuperExpression> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'descriptors' @ [214:20] ==> val descriptors: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'flatMapTo' @ [214:32] ==> public inline fun <T, R, C : MutableCollection<in DeclarationDescriptor>> Iterable<DeclarationDescriptor>.flatMapTo(destination: LinkedHashSet<DeclarationDescriptor>, transform: (DeclarationDescriptor) -> Iterable<DeclarationDescriptor>): LinkedHashSet<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> DeclarationDescriptor
    <C : MutableCollection<in R>> -> LinkedHashSet<DeclarationDescriptor>

'LinkedHashSet' @ [214:42] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'if (it is CallableMemberDescriptor && it.kind == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) it.overriddenDescriptors else listOf(it)' @ [215:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Iterable<DeclarationDescriptor>, elseBranch: Iterable<DeclarationDescriptor>): Iterable<DeclarationDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Iterable<DeclarationDescriptor>

'it' @ [215:21] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [215:55] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [215:58] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'FAKE_OVERRIDE' @ [215:96] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'it' @ [215:111] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter.<anonymous>[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [215:114] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'listOf' @ [215:141] ==> public fun <T> listOf(element: DeclarationDescriptor): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [215:148] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter.<anonymous>[ValueParameterDescriptorImpl]

'descriptors' @ [219:16] ==> val descriptors: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getReferenceVariantsNoVisibilityFilter[LocalVariableDescriptor]

'if (receiverExpression != null) {
            val qualifier = bindingContext[BindingContext.QUALIFIER, receiverExpression] ?: return emptyList()
            return qualifier.staticScope.collectStaticMembers(resolutionFacade, kindFilter, nameFilter)
        }
        else {
            val scope = contextElement.getResolutionScope(bindingContext, resolutionFacade)
            return scope.collectDescriptorsFiltered(kindFilter, nameFilter, changeNamesForAliased = true)
        }' @ [228:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'receiverExpression' @ [228:13] ==> value-parameter receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForUserType[ValueParameterDescriptorImpl]

'bindingContext' @ [229:29] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'QUALIFIER' @ [229:59] ==> public final val QUALIFIER: (WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>..WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'receiverExpression' @ [229:70] ==> value-parameter receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForUserType[ValueParameterDescriptorImpl]

'emptyList' @ [229:100] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'qualifier' @ [230:20] ==> val qualifier: Qualifier defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForUserType[LocalVariableDescriptor]

'staticScope' @ [230:30] ==> public abstract val staticScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.receivers.Qualifier[DeserializedPropertyDescriptor]

'collectStaticMembers' @ [230:42] ==> private fun MemberScope.collectStaticMembers(resolutionFacade: ResolutionFacade, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight in file ReferenceVariantsHelper.kt[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [230:63] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'kindFilter' @ [230:81] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForUserType[ValueParameterDescriptorImpl]

'nameFilter' @ [230:93] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForUserType[ValueParameterDescriptorImpl]

'contextElement' @ [233:25] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForUserType[ValueParameterDescriptorImpl]

'getResolutionScope' @ [233:40] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util in file scopeUtils.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [233:59] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'resolutionFacade' @ [233:75] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'scope' @ [234:20] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForUserType[LocalVariableDescriptor]

'collectDescriptorsFiltered' @ [234:26] ==> public fun HierarchicalScope.collectDescriptorsFiltered(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ..., changeNamesForAliased: Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'kindFilter' @ [234:53] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForUserType[ValueParameterDescriptorImpl]

'nameFilter' @ [234:65] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForUserType[ValueParameterDescriptorImpl]

'LinkedHashSet' @ [245:27] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'contextElement' @ [247:31] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[ValueParameterDescriptorImpl]

'getResolutionScope' @ [247:46] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util in file scopeUtils.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [247:65] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'resolutionFacade' @ [247:81] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [249:24] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver.CALLABLE_REFERENCE defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[ValueParameterDescriptorImpl]

'receiver' @ [249:44] ==> public final val receiver: KtExpression? defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.CALLABLE_REFERENCE[PropertyDescriptorImpl]

'if (receiver != null) {
            val isStatic = bindingContext[BindingContext.DOUBLE_COLON_LHS, receiver] is DoubleColonLHS.Type

            val explicitReceiverTypes = if (useReceiverType != null) {
                listOf(useReceiverType)
            }
            else {
                callTypeAndReceiver.receiverTypes(bindingContext, contextElement, moduleDescriptor, resolutionFacade, stableSmartCastsOnly = false)!!
            }

            val constructorFilter = { descriptor: ClassDescriptor -> if (isStatic) true else descriptor.isInner }
            descriptors.addNonExtensionMembers(explicitReceiverTypes, kindFilter, nameFilter, constructorFilter)

            descriptors.addScopeAndSyntheticExtensions(resolutionScope, explicitReceiverTypes, CallType.CALLABLE_REFERENCE, kindFilter, nameFilter)

            if (isStatic) {
                explicitReceiverTypes
                        .mapNotNull { (it.constructor.declarationDescriptor as? ClassDescriptor)?.staticScope }
                        .flatMapTo(descriptors) { it.collectStaticMembers(resolutionFacade, kindFilter, nameFilter) }
            }
        }
        else {
            // process non-instance members and class constructors
            descriptors.addNonExtensionCallablesAndConstructors(resolutionScope, kindFilter, nameFilter, constructorFilter = { !it.isInner })
        }' @ [250:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'receiver' @ [250:13] ==> val receiver: KtExpression? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[LocalVariableDescriptor]

'bindingContext' @ [251:28] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'DOUBLE_COLON_LHS' @ [251:58] ==> public final val DOUBLE_COLON_LHS: (WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'receiver' @ [251:76] ==> val receiver: KtExpression? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[LocalVariableDescriptor]

'if (useReceiverType != null) {
                listOf(useReceiverType)
            }
            else {
                callTypeAndReceiver.receiverTypes(bindingContext, contextElement, moduleDescriptor, resolutionFacade, stableSmartCastsOnly = false)!!
            }' @ [253:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<KotlinType>, elseBranch: Collection<KotlinType>): Collection<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<KotlinType>

'useReceiverType' @ [253:45] ==> value-parameter useReceiverType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[ValueParameterDescriptorImpl]

'listOf' @ [254:17] ==> public fun <T> listOf(element: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'useReceiverType' @ [254:24] ==> value-parameter useReceiverType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[ValueParameterDescriptorImpl]

'callTypeAndReceiver' @ [257:17] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver.CALLABLE_REFERENCE defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[ValueParameterDescriptorImpl]

'receiverTypes' @ [257:37] ==> public fun CallTypeAndReceiver<*, *>.receiverTypes(bindingContext: BindingContext, contextElement: PsiElement, moduleDescriptor: ModuleDescriptor, resolutionFacade: ResolutionFacade, stableSmartCastsOnly: Boolean): Collection<KotlinType>? defined in org.jetbrains.kotlin.idea.util in file CallType.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [257:51] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'contextElement' @ [257:67] ==> value-parameter contextElement: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [257:83] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'resolutionFacade' @ [257:101] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'if (isStatic) true else descriptor.isInner' @ [260:70] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'isStatic' @ [260:74] ==> val isStatic: Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[LocalVariableDescriptor]

'descriptor' @ [260:94] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference.<anonymous>[ValueParameterDescriptorImpl]

'isInner' @ [260:105] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'descriptors' @ [261:13] ==> val descriptors: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[LocalVariableDescriptor]

'addNonExtensionMembers' @ [261:25] ==> private final fun MutableSet<DeclarationDescriptor>.addNonExtensionMembers(receiverTypes: Collection<KotlinType>, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean, constructorFilter: (ClassDescriptor) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[SimpleFunctionDescriptorImpl]

'explicitReceiverTypes' @ [261:48] ==> val explicitReceiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[LocalVariableDescriptor]

'kindFilter' @ [261:71] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[ValueParameterDescriptorImpl]

'nameFilter' @ [261:83] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[ValueParameterDescriptorImpl]

'constructorFilter' @ [261:95] ==> val constructorFilter: (ClassDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[LocalVariableDescriptor]

'descriptors' @ [263:13] ==> val descriptors: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[LocalVariableDescriptor]

'addScopeAndSyntheticExtensions' @ [263:25] ==> private final fun MutableSet<DeclarationDescriptor>.addScopeAndSyntheticExtensions(scope: LexicalScope, receiverTypes: Collection<KotlinType>, callType: CallType<*>, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[SimpleFunctionDescriptorImpl]

'resolutionScope' @ [263:56] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[LocalVariableDescriptor]

'explicitReceiverTypes' @ [263:73] ==> val explicitReceiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[LocalVariableDescriptor]

'CALLABLE_REFERENCE' @ [263:105] ==> public object CALLABLE_REFERENCE : CallType<KtExpression?> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'kindFilter' @ [263:125] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[ValueParameterDescriptorImpl]

'nameFilter' @ [263:137] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[ValueParameterDescriptorImpl]

'isStatic' @ [265:17] ==> val isStatic: Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[LocalVariableDescriptor]

'explicitReceiverTypes' @ [266:17] ==> val explicitReceiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[LocalVariableDescriptor]

'mapNotNull' @ [267:26] ==> public inline fun <T, R : Any> Iterable<KotlinType>.mapNotNull(transform: (KotlinType) -> MemberScope?): List<MemberScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R : Any> -> MemberScope

'it' @ [267:40] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [267:43] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [267:55] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'staticScope' @ [267:99] ==> public final val ClassDescriptor.staticScope: MemberScope[MyPropertyDescriptor]

'flatMapTo' @ [268:26] ==> public inline fun <T, R, C : MutableCollection<in DeclarationDescriptor>> Iterable<MemberScope>.flatMapTo(destination: LinkedHashSet<DeclarationDescriptor>, transform: (MemberScope) -> Iterable<DeclarationDescriptor>): LinkedHashSet<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberScope
    <R> -> DeclarationDescriptor
    <C : MutableCollection<in R>> -> LinkedHashSet<DeclarationDescriptor>

'descriptors' @ [268:36] ==> val descriptors: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[LocalVariableDescriptor]

'it' @ [268:51] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference.<anonymous>[ValueParameterDescriptorImpl]

'collectStaticMembers' @ [268:54] ==> private fun MemberScope.collectStaticMembers(resolutionFacade: ResolutionFacade, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight in file ReferenceVariantsHelper.kt[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [268:75] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'kindFilter' @ [268:93] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[ValueParameterDescriptorImpl]

'nameFilter' @ [268:105] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[ValueParameterDescriptorImpl]

'descriptors' @ [273:13] ==> val descriptors: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[LocalVariableDescriptor]

'addNonExtensionCallablesAndConstructors' @ [273:25] ==> private final fun MutableSet<DeclarationDescriptor>.addNonExtensionCallablesAndConstructors(scope: HierarchicalScope, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean, constructorFilter: (ClassDescriptor) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[SimpleFunctionDescriptorImpl]

'resolutionScope' @ [273:65] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[LocalVariableDescriptor]

'kindFilter' @ [273:82] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[ValueParameterDescriptorImpl]

'nameFilter' @ [273:94] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[ValueParameterDescriptorImpl]

'!' @ [273:128] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [273:129] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference.<anonymous>[ValueParameterDescriptorImpl]

'isInner' @ [273:132] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'descriptors' @ [275:16] ==> val descriptors: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForCallableReference[LocalVariableDescriptor]

'if (receiverExpression != null) {
            val qualifier = bindingContext[BindingContext.QUALIFIER, receiverExpression] ?: return emptyList()
            val staticDescriptors = qualifier.staticScope.collectStaticMembers(resolutionFacade, kindFilter, nameFilter)

            val objectDescriptor = (qualifier as? ClassQualifier)?.descriptor?.takeIf { it.kind == ClassKind.OBJECT } ?: return staticDescriptors

            return staticDescriptors + objectDescriptor.defaultType.memberScope.getDescriptorsFiltered(kindFilter, nameFilter)
        }
        else {
            val rootPackage = resolutionFacade.moduleDescriptor.getPackage(FqName.ROOT)
            return rootPackage.memberScope.getDescriptorsFiltered(kindFilter, nameFilter)
        }' @ [283:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'receiverExpression' @ [283:13] ==> value-parameter receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForImportOrPackageDirective[ValueParameterDescriptorImpl]

'bindingContext' @ [284:29] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'QUALIFIER' @ [284:59] ==> public final val QUALIFIER: (WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>..WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'receiverExpression' @ [284:70] ==> value-parameter receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForImportOrPackageDirective[ValueParameterDescriptorImpl]

'emptyList' @ [284:100] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'qualifier' @ [285:37] ==> val qualifier: Qualifier defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForImportOrPackageDirective[LocalVariableDescriptor]

'staticScope' @ [285:47] ==> public abstract val staticScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.receivers.Qualifier[DeserializedPropertyDescriptor]

'collectStaticMembers' @ [285:59] ==> private fun MemberScope.collectStaticMembers(resolutionFacade: ResolutionFacade, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight in file ReferenceVariantsHelper.kt[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [285:80] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'kindFilter' @ [285:98] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForImportOrPackageDirective[ValueParameterDescriptorImpl]

'nameFilter' @ [285:110] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForImportOrPackageDirective[ValueParameterDescriptorImpl]

'?:' @ [287:36] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassDescriptor?, right: ClassDescriptor): ClassDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassDescriptor

'qualifier' @ [287:37] ==> val qualifier: Qualifier defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForImportOrPackageDirective[LocalVariableDescriptor]

'descriptor' @ [287:68] ==> public open val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ClassQualifier[DeserializedPropertyDescriptor]

'takeIf' @ [287:80] ==> @InlineOnly @SinceKotlin public inline fun <T> ClassDescriptor.takeIf(predicate: (ClassDescriptor) -> Boolean): ClassDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'it' @ [287:89] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForImportOrPackageDirective.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [287:92] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'OBJECT' @ [287:110] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'staticDescriptors' @ [287:129] ==> val staticDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForImportOrPackageDirective[LocalVariableDescriptor]

'staticDescriptors' @ [289:20] ==> val staticDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForImportOrPackageDirective[LocalVariableDescriptor]

'objectDescriptor' @ [289:40] ==> val objectDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForImportOrPackageDirective[LocalVariableDescriptor]

'defaultType' @ [289:57] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'memberScope' @ [289:69] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'getDescriptorsFiltered' @ [289:81] ==> public fun MemberScope.getDescriptorsFiltered(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'kindFilter' @ [289:104] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForImportOrPackageDirective[ValueParameterDescriptorImpl]

'nameFilter' @ [289:116] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForImportOrPackageDirective[ValueParameterDescriptorImpl]

'resolutionFacade' @ [292:31] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'moduleDescriptor' @ [292:48] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[PropertyDescriptorImpl]

'getPackage' @ [292:65] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'ROOT' @ [292:83] ==> public final val ROOT: (FqName..FqName?) defined in org.jetbrains.kotlin.name.FqName[JavaPropertyDescriptor]

'rootPackage' @ [293:20] ==> val rootPackage: PackageViewDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForImportOrPackageDirective[LocalVariableDescriptor]

'memberScope' @ [293:32] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'getDescriptorsFiltered' @ [293:44] ==> public fun MemberScope.getDescriptorsFiltered(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'kindFilter' @ [293:67] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForImportOrPackageDirective[ValueParameterDescriptorImpl]

'nameFilter' @ [293:79] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.getVariantsForImportOrPackageDirective[ValueParameterDescriptorImpl]

'addNonExtensionMembers' @ [305:9] ==> private final fun MutableSet<DeclarationDescriptor>.addNonExtensionMembers(receiverTypes: Collection<KotlinType>, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean, constructorFilter: (ClassDescriptor) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[SimpleFunctionDescriptorImpl]

'receiverTypes' @ [305:32] ==> value-parameter receiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.processAll[ValueParameterDescriptorImpl]

'kindFilter' @ [305:47] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.processAll[ValueParameterDescriptorImpl]

'nameFilter' @ [305:59] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.processAll[ValueParameterDescriptorImpl]

'it' @ [305:93] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.processAll.<anonymous>[ValueParameterDescriptorImpl]

'isInner' @ [305:96] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'addMemberExtensions' @ [306:9] ==> private final fun MutableSet<DeclarationDescriptor>.addMemberExtensions(dispatchReceiverTypes: Collection<KotlinType>, extensionReceiverTypes: Collection<KotlinType>, callType: CallType<*>, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[SimpleFunctionDescriptorImpl]

'implicitReceiverTypes' @ [306:29] ==> value-parameter implicitReceiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.processAll[ValueParameterDescriptorImpl]

'receiverTypes' @ [306:52] ==> value-parameter receiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.processAll[ValueParameterDescriptorImpl]

'callType' @ [306:67] ==> value-parameter callType: CallType<*> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.processAll[ValueParameterDescriptorImpl]

'kindFilter' @ [306:77] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.processAll[ValueParameterDescriptorImpl]

'nameFilter' @ [306:89] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.processAll[ValueParameterDescriptorImpl]

'addScopeAndSyntheticExtensions' @ [307:9] ==> private final fun MutableSet<DeclarationDescriptor>.addScopeAndSyntheticExtensions(scope: LexicalScope, receiverTypes: Collection<KotlinType>, callType: CallType<*>, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[SimpleFunctionDescriptorImpl]

'resolutionScope' @ [307:40] ==> value-parameter resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.processAll[ValueParameterDescriptorImpl]

'receiverTypes' @ [307:57] ==> value-parameter receiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.processAll[ValueParameterDescriptorImpl]

'callType' @ [307:72] ==> value-parameter callType: CallType<*> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.processAll[ValueParameterDescriptorImpl]

'kindFilter' @ [307:82] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.processAll[ValueParameterDescriptorImpl]

'nameFilter' @ [307:94] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.processAll[ValueParameterDescriptorImpl]

'kindFilter' @ [317:28] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addMemberExtensions[ValueParameterDescriptorImpl]

'NonExtensions' @ [317:69] ==> public object NonExtensions : DescriptorKindExclude defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[FakeCallableDescriptorForObject]

'dispatchReceiverTypes' @ [318:38] ==> value-parameter dispatchReceiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addMemberExtensions[ValueParameterDescriptorImpl]

'dispatchReceiverType' @ [319:28] ==> val dispatchReceiverType: KotlinType defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addMemberExtensions[LocalVariableDescriptor]

'memberScope' @ [319:49] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getDescriptorsFiltered' @ [319:61] ==> public fun MemberScope.getDescriptorsFiltered(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'memberFilter' @ [319:84] ==> val memberFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addMemberExtensions[LocalVariableDescriptor]

'nameFilter' @ [319:98] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addMemberExtensions[ValueParameterDescriptorImpl]

'addAll' @ [320:17] ==> public abstract fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'member' @ [320:25] ==> val member: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addMemberExtensions[LocalVariableDescriptor]

'substituteExtensionIfCallable' @ [320:55] ==> public fun <TCallable : CallableDescriptor> CallableDescriptor.substituteExtensionIfCallable(receiverTypes: Collection<KotlinType>, callType: CallType<*>): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <TCallable : CallableDescriptor> -> CallableDescriptor

'extensionReceiverTypes' @ [320:85] ==> value-parameter extensionReceiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addMemberExtensions[ValueParameterDescriptorImpl]

'callType' @ [320:109] ==> value-parameter callType: CallType<*> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addMemberExtensions[ValueParameterDescriptorImpl]

'receiverTypes' @ [331:30] ==> value-parameter receiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionMembers[ValueParameterDescriptorImpl]

'addNonExtensionCallablesAndConstructors' @ [332:13] ==> private final fun MutableSet<DeclarationDescriptor>.addNonExtensionCallablesAndConstructors(scope: HierarchicalScope, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean, constructorFilter: (ClassDescriptor) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[SimpleFunctionDescriptorImpl]

'receiverType' @ [332:53] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionMembers[LocalVariableDescriptor]

'memberScope' @ [332:66] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'memberScopeAsImportingScope' @ [332:78] ==> @JvmOverloads public fun MemberScope.memberScopeAsImportingScope(parentScope: ImportingScope? = ...): ImportingScope defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'kindFilter' @ [332:109] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionMembers[ValueParameterDescriptorImpl]

'nameFilter' @ [332:121] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionMembers[ValueParameterDescriptorImpl]

'constructorFilter' @ [332:133] ==> value-parameter constructorFilter: (ClassDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionMembers[ValueParameterDescriptorImpl]

'DescriptorKindFilter' @ [342:27] ==> public constructor DescriptorKindFilter(kindMask: Int, excludes: List<DescriptorKindExclude> = ...) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedClassConstructorDescriptor]

'kindFilter' @ [342:48] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionCallablesAndConstructors[ValueParameterDescriptorImpl]

'kindMask' @ [342:59] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedPropertyDescriptor]

'CALLABLES' @ [342:93] ==> @field:JvmField public final val CALLABLES: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'kindMask' @ [342:103] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedPropertyDescriptor]

'exclude' @ [342:113] ==> public final infix fun exclude(exclude: DescriptorKindExclude): DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'Extensions' @ [342:143] ==> public object Extensions : DescriptorKindExclude defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[FakeCallableDescriptorForObject]

'filterToUse' @ [345:13] ==> var filterToUse: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionCallablesAndConstructors[LocalVariableDescriptor]

'acceptsKinds' @ [345:25] ==> public final fun acceptsKinds(kinds: Int): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'FUNCTIONS_MASK' @ [345:59] ==> public final val FUNCTIONS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'filterToUse' @ [346:13] ==> var filterToUse: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionCallablesAndConstructors[LocalVariableDescriptor]

'filterToUse' @ [346:27] ==> var filterToUse: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionCallablesAndConstructors[LocalVariableDescriptor]

'withKinds' @ [346:39] ==> public final fun withKinds(kinds: Int): DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'NON_SINGLETON_CLASSIFIERS_MASK' @ [346:70] ==> public final val NON_SINGLETON_CLASSIFIERS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'scope' @ [349:28] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionCallablesAndConstructors[ValueParameterDescriptorImpl]

'collectDescriptorsFiltered' @ [349:34] ==> public fun HierarchicalScope.collectDescriptorsFiltered(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ..., changeNamesForAliased: Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'filterToUse' @ [349:61] ==> var filterToUse: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionCallablesAndConstructors[LocalVariableDescriptor]

'nameFilter' @ [349:74] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionCallablesAndConstructors[ValueParameterDescriptorImpl]

'if (descriptor is ClassDescriptor) {
                if (descriptor.modality == Modality.ABSTRACT || descriptor.modality == Modality.SEALED) continue
                if (!constructorFilter(descriptor)) continue
                descriptor.constructors.filterTo(this) { kindFilter.accepts(it) }
            }
            else if (kindFilter.accepts(descriptor)) {
                this.add(descriptor)
            }' @ [350:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'descriptor' @ [350:17] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionCallablesAndConstructors[LocalVariableDescriptor]

'descriptor' @ [351:21] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionCallablesAndConstructors[LocalVariableDescriptor]

'modality' @ [351:32] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'ABSTRACT' @ [351:53] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'descriptor' @ [351:65] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionCallablesAndConstructors[LocalVariableDescriptor]

'modality' @ [351:76] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'SEALED' @ [351:97] ==> enum entry SEALED defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'!' @ [352:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [352:22] ==> public abstract operator fun invoke(p1: ClassDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'descriptor' @ [352:40] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionCallablesAndConstructors[LocalVariableDescriptor]

'descriptor' @ [353:17] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionCallablesAndConstructors[LocalVariableDescriptor]

'constructors' @ [353:28] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'filterTo' @ [353:41] ==> public inline fun <T, C : MutableCollection<in (ClassConstructorDescriptor..ClassConstructorDescriptor?)>> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.filterTo(destination: MutableSet<DeclarationDescriptor>, predicate: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> Boolean): MutableSet<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)
    <C : MutableCollection<in T>> -> MutableSet<DeclarationDescriptor>

'this' @ [353:50] ==> <this> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionCallablesAndConstructors[ReceiverParameterDescriptorImpl]

'kindFilter' @ [353:58] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionCallablesAndConstructors[ValueParameterDescriptorImpl]

'accepts' @ [353:69] ==> public final fun accepts(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'it' @ [353:77] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionCallablesAndConstructors.<anonymous>[ValueParameterDescriptorImpl]

'kindFilter' @ [355:22] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionCallablesAndConstructors[ValueParameterDescriptorImpl]

'accepts' @ [355:33] ==> public final fun accepts(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [355:41] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionCallablesAndConstructors[LocalVariableDescriptor]

'this' @ [356:17] ==> <this> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionCallablesAndConstructors[ReceiverParameterDescriptorImpl]

'add' @ [356:22] ==> public abstract fun add(element: DeclarationDescriptor): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [356:26] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addNonExtensionCallablesAndConstructors[LocalVariableDescriptor]

'kindFilter' @ [368:13] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[ValueParameterDescriptorImpl]

'excludes' @ [368:24] ==> public final val excludes: List<DescriptorKindExclude> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedPropertyDescriptor]

'contains' @ [368:33] ==> public abstract fun contains(element: DescriptorKindExclude): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'Extensions' @ [368:64] ==> public object Extensions : DescriptorKindExclude defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[FakeCallableDescriptorForObject]

'receiverTypes' @ [369:13] ==> value-parameter receiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[ValueParameterDescriptorImpl]

'isEmpty' @ [369:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'kindFilter' @ [372:17] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[ValueParameterDescriptorImpl]

'accepts' @ [372:28] ==> public final fun accepts(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'extensionOrSyntheticMember' @ [372:36] ==> value-parameter extensionOrSyntheticMember: CallableDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions.process[ValueParameterDescriptorImpl]

'invoke' @ [372:67] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'extensionOrSyntheticMember' @ [372:78] ==> value-parameter extensionOrSyntheticMember: CallableDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions.process[ValueParameterDescriptorImpl]

'name' @ [372:105] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'if (extensionOrSyntheticMember.isExtension) {
                    addAll(extensionOrSyntheticMember.substituteExtensionIfCallable(receiverTypes, callType))
                }
                else {
                    add(extensionOrSyntheticMember)
                }' @ [373:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'extensionOrSyntheticMember' @ [373:21] ==> value-parameter extensionOrSyntheticMember: CallableDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions.process[ValueParameterDescriptorImpl]

'isExtension' @ [373:48] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'addAll' @ [374:21] ==> public abstract fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'extensionOrSyntheticMember' @ [374:28] ==> value-parameter extensionOrSyntheticMember: CallableDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions.process[ValueParameterDescriptorImpl]

'substituteExtensionIfCallable' @ [374:55] ==> public fun <TCallable : CallableDescriptor> CallableDescriptor.substituteExtensionIfCallable(receiverTypes: Collection<KotlinType>, callType: CallType<*>): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <TCallable : CallableDescriptor> -> CallableDescriptor

'receiverTypes' @ [374:85] ==> value-parameter receiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[ValueParameterDescriptorImpl]

'callType' @ [374:100] ==> value-parameter callType: CallType<*> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[ValueParameterDescriptorImpl]

'add' @ [377:21] ==> public abstract fun add(element: DeclarationDescriptor): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'extensionOrSyntheticMember' @ [377:25] ==> value-parameter extensionOrSyntheticMember: CallableDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions.process[ValueParameterDescriptorImpl]

'scope' @ [382:28] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[ValueParameterDescriptorImpl]

'collectDescriptorsFiltered' @ [382:34] ==> public fun HierarchicalScope.collectDescriptorsFiltered(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ..., changeNamesForAliased: Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'kindFilter' @ [382:61] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[ValueParameterDescriptorImpl]

'NonExtensions' @ [382:102] ==> public object NonExtensions : DescriptorKindExclude defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[FakeCallableDescriptorForObject]

'nameFilter' @ [382:117] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[ValueParameterDescriptorImpl]

'process' @ [384:13] ==> local final fun process(extensionOrSyntheticMember: CallableDescriptor): Unit defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[SimpleFunctionDescriptorImpl]

'descriptor' @ [384:21] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[LocalVariableDescriptor]

'resolutionFacade' @ [387:31] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[PropertyDescriptorImpl]

'getFrontendService' @ [387:48] ==> public abstract fun <T : Any> getFrontendService(serviceClass: Class<SyntheticScopes>): SyntheticScopes defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> SyntheticScopes

'java' @ [387:90] ==> public val <T> KClass<SyntheticScopes>.java: Class<SyntheticScopes> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SyntheticScopes

'kindFilter' @ [388:13] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[ValueParameterDescriptorImpl]

'acceptsKinds' @ [388:24] ==> public final fun acceptsKinds(kinds: Int): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'VARIABLES_MASK' @ [388:58] ==> public final val VARIABLES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'syntheticScopes' @ [389:31] ==> val syntheticScopes: SyntheticScopes defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[LocalVariableDescriptor]

'collectSyntheticExtensionProperties' @ [389:47] ==> public fun SyntheticScopes.collectSyntheticExtensionProperties(receiverTypes: Collection<KotlinType>): List<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'receiverTypes' @ [389:83] ==> value-parameter receiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[ValueParameterDescriptorImpl]

'process' @ [390:17] ==> local final fun process(extensionOrSyntheticMember: CallableDescriptor): Unit defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[SimpleFunctionDescriptorImpl]

'extension' @ [390:25] ==> val extension: PropertyDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[LocalVariableDescriptor]

'kindFilter' @ [394:13] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[ValueParameterDescriptorImpl]

'acceptsKinds' @ [394:24] ==> public final fun acceptsKinds(kinds: Int): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'FUNCTIONS_MASK' @ [394:58] ==> public final val FUNCTIONS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'syntheticScopes' @ [395:37] ==> val syntheticScopes: SyntheticScopes defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[LocalVariableDescriptor]

'collectSyntheticMemberFunctions' @ [395:53] ==> public fun SyntheticScopes.collectSyntheticMemberFunctions(receiverTypes: Collection<KotlinType>): List<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'receiverTypes' @ [395:85] ==> value-parameter receiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[ValueParameterDescriptorImpl]

'process' @ [396:17] ==> local final fun process(extensionOrSyntheticMember: CallableDescriptor): Unit defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[SimpleFunctionDescriptorImpl]

'syntheticMember' @ [396:25] ==> val syntheticMember: FunctionDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper.addScopeAndSyntheticExtensions[LocalVariableDescriptor]

'getDescriptorsFiltered' @ [407:12] ==> public fun MemberScope.getDescriptorsFiltered(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'kindFilter' @ [407:35] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.collectStaticMembers[ValueParameterDescriptorImpl]

'nameFilter' @ [407:47] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.collectStaticMembers[ValueParameterDescriptorImpl]

'collectSyntheticStaticMembersAndConstructors' @ [407:61] ==> public fun ResolutionScope.collectSyntheticStaticMembersAndConstructors(resolutionFacade: ResolutionFacade, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight in file ReferenceVariantsHelper.kt[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [407:106] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInsight.collectStaticMembers[ValueParameterDescriptorImpl]

'kindFilter' @ [407:124] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.collectStaticMembers[ValueParameterDescriptorImpl]

'nameFilter' @ [407:136] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.codeInsight.collectStaticMembers[ValueParameterDescriptorImpl]

'resolutionFacade' @ [415:27] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInsight.collectSyntheticStaticMembersAndConstructors[ValueParameterDescriptorImpl]

'getFrontendService' @ [415:44] ==> public abstract fun <T : Any> getFrontendService(serviceClass: Class<SyntheticScopes>): SyntheticScopes defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> SyntheticScopes

'java' @ [415:86] ==> public val <T> KClass<SyntheticScopes>.java: Class<SyntheticScopes> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SyntheticScopes

'syntheticScopes' @ [416:13] ==> val syntheticScopes: SyntheticScopes defined in org.jetbrains.kotlin.idea.codeInsight.collectSyntheticStaticMembersAndConstructors[LocalVariableDescriptor]

'collectSyntheticStaticFunctions' @ [416:29] ==> public fun SyntheticScopes.collectSyntheticStaticFunctions(scope: ResolutionScope): List<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'this' @ [416:61] ==> <this> defined in org.jetbrains.kotlin.idea.codeInsight.collectSyntheticStaticMembersAndConstructors[ReceiverParameterDescriptorImpl]

'syntheticScopes' @ [416:69] ==> val syntheticScopes: SyntheticScopes defined in org.jetbrains.kotlin.idea.codeInsight.collectSyntheticStaticMembersAndConstructors[LocalVariableDescriptor]

'collectSyntheticConstructors' @ [416:85] ==> public fun SyntheticScopes.collectSyntheticConstructors(scope: ResolutionScope): List<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'this' @ [416:114] ==> <this> defined in org.jetbrains.kotlin.idea.codeInsight.collectSyntheticStaticMembersAndConstructors[ReceiverParameterDescriptorImpl]

'filter' @ [417:14] ==> public inline fun <T> Iterable<FunctionDescriptor>.filter(predicate: (FunctionDescriptor) -> Boolean): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'kindFilter' @ [417:23] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.codeInsight.collectSyntheticStaticMembersAndConstructors[ValueParameterDescriptorImpl]

'accepts' @ [417:34] ==> public final fun accepts(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'it' @ [417:42] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.collectSyntheticStaticMembersAndConstructors.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [417:49] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [417:60] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.collectSyntheticStaticMembersAndConstructors.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [417:63] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

