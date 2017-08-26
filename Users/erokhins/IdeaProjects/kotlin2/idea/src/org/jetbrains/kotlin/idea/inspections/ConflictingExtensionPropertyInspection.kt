'AbstractKotlinInspection' @ [62:48] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'session' @ [64:20] ==> value-parameter session: LocalInspectionToolSession defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor[ValueParameterDescriptorImpl]

'file' @ [64:28] ==> public final val LocalInspectionToolSession.file: PsiFile[MyPropertyDescriptor]

'EMPTY_VISITOR' @ [64:72] ==> public final val EMPTY_VISITOR: (PsiElementVisitor..PsiElementVisitor?) defined in com.intellij.psi.PsiElementVisitor[JavaPropertyDescriptor]

'file' @ [65:32] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor[LocalVariableDescriptor]

'getResolutionFacade' @ [65:37] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'KtVisitorVoid' @ [67:25] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [69:17] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitProperty' @ [69:23] ==> public open fun visitProperty(@NotNull p0: KtProperty): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'property' @ [69:37] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'property' @ [71:21] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [71:30] ==> public final val KtProperty.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'property' @ [72:39] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'nameIdentifier' @ [72:48] ==> public final val KtProperty.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'property' @ [73:46] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'resolveToDescriptorIfAny' @ [73:55] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [75:43] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor[LocalVariableDescriptor]

'frontendService' @ [75:60] ==> public inline fun <reified T : Any> ResolutionFacade.frontendService(): SyntheticScopes defined in org.jetbrains.kotlin.idea.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> SyntheticScopes

'conflictingSyntheticExtension' @ [76:48] ==> private final fun conflictingSyntheticExtension(descriptor: PropertyDescriptor, scopes: SyntheticScopes): SyntheticJavaPropertyDescriptor? defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection[SimpleFunctionDescriptorImpl]

'propertyDescriptor' @ [76:78] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'syntheticScopes' @ [76:98] ==> val syntheticScopes: SyntheticScopes defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'propertyDescriptor' @ [79:25] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'isHiddenInResolution' @ [79:44] ==> @JvmOverloads public fun DeclarationDescriptor.isHiddenInResolution(languageVersionSettings: LanguageVersionSettings, isSuperCall: Boolean = ...): Boolean defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [79:65] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor[LocalVariableDescriptor]

'frontendService' @ [79:82] ==> public inline fun <reified T : Any> ResolutionFacade.frontendService(): LanguageVersionSettings defined in org.jetbrains.kotlin.idea.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> LanguageVersionSettings

'createFixes' @ [81:33] ==> private final fun createFixes(property: KtProperty, conflictingExtension: SyntheticJavaPropertyDescriptor, isOnTheFly: Boolean): Array<IntentionWrapper> defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection[SimpleFunctionDescriptorImpl]

'property' @ [81:45] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'conflictingExtension' @ [81:55] ==> val conflictingExtension: SyntheticJavaPropertyDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'isOnTheFly' @ [81:77] ==> value-parameter isOnTheFly: Boolean defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor[ValueParameterDescriptorImpl]

'holder' @ [83:45] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor[ValueParameterDescriptorImpl]

'manager' @ [83:52] ==> public final val ProblemsHolder.manager: InspectionManager[MyPropertyDescriptor]

'createProblemDescriptor' @ [83:60] ==> @NotNull @Contract public abstract fun createProblemDescriptor(@NotNull p0: PsiElement, @NotNull @Nls p1: String, p2: Boolean, p3: (Array<(LocalQuickFix..LocalQuickFix?)>..Array<out (LocalQuickFix..LocalQuickFix?)>?), @NotNull p4: ProblemHighlightType): ProblemDescriptor defined in com.intellij.codeInspection.InspectionManager[JavaMethodDescriptor]

'nameElement' @ [84:29] ==> val nameElement: PsiElement defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'fixes' @ [87:29] ==> val fixes: Array<IntentionWrapper> defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'GENERIC_ERROR_OR_WARNING' @ [88:50] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'holder' @ [90:21] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [90:28] ==> public open fun registerProblem(@NotNull p0: ProblemDescriptor): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'problemDescriptor' @ [90:44] ==> val problemDescriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'descriptor' @ [97:37] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.conflictingSyntheticExtension[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [97:48] ==> public final val PropertyDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [97:76] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'scopes' @ [98:16] ==> value-parameter scopes: SyntheticScopes defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.conflictingSyntheticExtension[ValueParameterDescriptorImpl]

'collectSyntheticExtensionProperties' @ [98:23] ==> public fun SyntheticScopes.collectSyntheticExtensionProperties(receiverTypes: Collection<KotlinType>, name: Name, location: LookupLocation): List<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'listOf' @ [98:59] ==> public fun <T> listOf(element: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'extensionReceiverType' @ [98:66] ==> val extensionReceiverType: KotlinType defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.conflictingSyntheticExtension[LocalVariableDescriptor]

'descriptor' @ [98:90] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.conflictingSyntheticExtension[ValueParameterDescriptorImpl]

'name' @ [98:101] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'FROM_IDE' @ [98:124] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'firstIsInstanceOrNull' @ [99:18] ==> public inline fun <reified T : Any> Iterable<*>.firstIsInstanceOrNull(): SyntheticJavaPropertyDescriptor? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> SyntheticJavaPropertyDescriptor

'declaration' @ [103:22] ==> value-parameter declaration: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isSameAsSynthetic[ValueParameterDescriptorImpl]

'getter' @ [103:34] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'declaration' @ [104:22] ==> value-parameter declaration: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isSameAsSynthetic[ValueParameterDescriptorImpl]

'setter' @ [104:34] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'!' @ [106:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkGetterBodyIsGetMethodCall' @ [106:14] ==> private final fun checkGetterBodyIsGetMethodCall(getter: KtPropertyAccessor, getMethod: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection[SimpleFunctionDescriptorImpl]

'getter' @ [106:45] ==> val getter: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isSameAsSynthetic[LocalVariableDescriptor]

'syntheticProperty' @ [106:53] ==> value-parameter syntheticProperty: SyntheticJavaPropertyDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isSameAsSynthetic[ValueParameterDescriptorImpl]

'getMethod' @ [106:71] ==> public abstract val getMethod: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[DeserializedPropertyDescriptor]

'setter' @ [108:13] ==> val setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isSameAsSynthetic[LocalVariableDescriptor]

'syntheticProperty' @ [109:29] ==> value-parameter syntheticProperty: SyntheticJavaPropertyDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isSameAsSynthetic[ValueParameterDescriptorImpl]

'setMethod' @ [109:47] ==> public abstract val setMethod: FunctionDescriptor? defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[DeserializedPropertyDescriptor]

'!' @ [110:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkSetterBodyIsSetMethodCall' @ [110:18] ==> private final fun checkSetterBodyIsSetMethodCall(setter: KtPropertyAccessor, setMethod: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection[SimpleFunctionDescriptorImpl]

'setter' @ [110:49] ==> val setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isSameAsSynthetic[LocalVariableDescriptor]

'setMethod' @ [110:57] ==> val setMethod: FunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isSameAsSynthetic[LocalVariableDescriptor]

'if (getter.hasBlockBody()) {
            val statement = (getter.bodyExpression as? KtBlockExpression)?.statements?.singleOrNull() ?: return false
            (statement as? KtReturnExpression)?.returnedExpression.isGetMethodCall(getMethod)
        }
        else {
            getter.bodyExpression.isGetMethodCall(getMethod)
        }' @ [117:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'getter' @ [117:20] ==> value-parameter getter: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.checkGetterBodyIsGetMethodCall[ValueParameterDescriptorImpl]

'hasBlockBody' @ [117:27] ==> public open fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtPropertyAccessor[JavaMethodDescriptor]

'?:' @ [118:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'getter' @ [118:30] ==> value-parameter getter: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.checkGetterBodyIsGetMethodCall[ValueParameterDescriptorImpl]

'bodyExpression' @ [118:37] ==> public final val KtPropertyAccessor.bodyExpression: KtExpression?[MyPropertyDescriptor]

'statements' @ [118:76] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'singleOrNull' @ [118:88] ==> public fun <T> List<(KtExpression..KtExpression?)>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'statement' @ [119:14] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.checkGetterBodyIsGetMethodCall[LocalVariableDescriptor]

'returnedExpression' @ [119:49] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'isGetMethodCall' @ [119:68] ==> private final fun KtExpression?.isGetMethodCall(getMethod: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection[SimpleFunctionDescriptorImpl]

'getMethod' @ [119:84] ==> value-parameter getMethod: FunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.checkGetterBodyIsGetMethodCall[ValueParameterDescriptorImpl]

'getter' @ [122:13] ==> value-parameter getter: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.checkGetterBodyIsGetMethodCall[ValueParameterDescriptorImpl]

'bodyExpression' @ [122:20] ==> public final val KtPropertyAccessor.bodyExpression: KtExpression?[MyPropertyDescriptor]

'isGetMethodCall' @ [122:35] ==> private final fun KtExpression?.isGetMethodCall(getMethod: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection[SimpleFunctionDescriptorImpl]

'getMethod' @ [122:51] ==> value-parameter getMethod: FunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.checkGetterBodyIsGetMethodCall[ValueParameterDescriptorImpl]

'setter' @ [127:34] ==> value-parameter setter: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.checkSetterBodyIsSetMethodCall[ValueParameterDescriptorImpl]

'valueParameters' @ [127:41] ==> public final val KtPropertyAccessor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'singleOrNull' @ [127:57] ==> public fun <T> List<(KtParameter..KtParameter?)>.singleOrNull(): KtParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'nameAsName' @ [127:73] ==> public final val KtParameter.nameAsName: Name?[MyPropertyDescriptor]

'if (setter.hasBlockBody()) {
            val statement = (setter.bodyExpression as? KtBlockExpression)?.statements?.singleOrNull() ?: return false
            return statement.isSetMethodCall(setMethod, valueParameterName)
        }
        else {
            return setter.bodyExpression.isSetMethodCall(setMethod, valueParameterName)
        }' @ [128:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'setter' @ [128:13] ==> value-parameter setter: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.checkSetterBodyIsSetMethodCall[ValueParameterDescriptorImpl]

'hasBlockBody' @ [128:20] ==> public open fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtPropertyAccessor[JavaMethodDescriptor]

'?:' @ [129:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'setter' @ [129:30] ==> value-parameter setter: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.checkSetterBodyIsSetMethodCall[ValueParameterDescriptorImpl]

'bodyExpression' @ [129:37] ==> public final val KtPropertyAccessor.bodyExpression: KtExpression?[MyPropertyDescriptor]

'statements' @ [129:76] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'singleOrNull' @ [129:88] ==> public fun <T> List<(KtExpression..KtExpression?)>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'statement' @ [130:20] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.checkSetterBodyIsSetMethodCall[LocalVariableDescriptor]

'isSetMethodCall' @ [130:30] ==> private final fun KtExpression?.isSetMethodCall(setMethod: FunctionDescriptor, valueParameterName: Name): Boolean defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection[SimpleFunctionDescriptorImpl]

'setMethod' @ [130:46] ==> value-parameter setMethod: FunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.checkSetterBodyIsSetMethodCall[ValueParameterDescriptorImpl]

'valueParameterName' @ [130:57] ==> val valueParameterName: Name defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.checkSetterBodyIsSetMethodCall[LocalVariableDescriptor]

'setter' @ [133:20] ==> value-parameter setter: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.checkSetterBodyIsSetMethodCall[ValueParameterDescriptorImpl]

'bodyExpression' @ [133:27] ==> public final val KtPropertyAccessor.bodyExpression: KtExpression?[MyPropertyDescriptor]

'isSetMethodCall' @ [133:42] ==> private final fun KtExpression?.isSetMethodCall(setMethod: FunctionDescriptor, valueParameterName: Name): Boolean defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection[SimpleFunctionDescriptorImpl]

'setMethod' @ [133:58] ==> value-parameter setMethod: FunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.checkSetterBodyIsSetMethodCall[ValueParameterDescriptorImpl]

'valueParameterName' @ [133:69] ==> val valueParameterName: Name defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.checkSetterBodyIsSetMethodCall[LocalVariableDescriptor]

'when (this) {
        is KtCallExpression -> {
            val resolvedCall = getResolvedCall(analyze())
            resolvedCall != null && resolvedCall.isReallySuccess() && resolvedCall.resultingDescriptor.original == getMethod.original
        }

        is KtQualifiedExpression -> {
            val receiver = receiverExpression
            receiver is KtThisExpression && receiver.labelQualifier == null && selectorExpression.isGetMethodCall(getMethod)
        }

        else -> false
    }' @ [137:89] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [137:95] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isGetMethodCall[ReceiverParameterDescriptorImpl]

'getResolvedCall' @ [139:32] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'analyze' @ [139:48] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [140:13] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isGetMethodCall[LocalVariableDescriptor]

'resolvedCall' @ [140:37] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isGetMethodCall[LocalVariableDescriptor]

'isReallySuccess' @ [140:50] ==> public fun ResolvedCall<*>.isReallySuccess(): Boolean defined in org.jetbrains.kotlin.resolve.calls.model[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [140:71] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isGetMethodCall[LocalVariableDescriptor]

'resultingDescriptor' @ [140:84] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'original' @ [140:104] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'getMethod' @ [140:116] ==> value-parameter getMethod: FunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isGetMethodCall[ValueParameterDescriptorImpl]

'original' @ [140:126] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'receiverExpression' @ [144:28] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'receiver' @ [145:13] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isGetMethodCall[LocalVariableDescriptor]

'receiver' @ [145:45] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isGetMethodCall[LocalVariableDescriptor]

'labelQualifier' @ [145:54] ==> public final val labelQualifier: KtContainerNode? defined in org.jetbrains.kotlin.psi.KtThisExpression[DeserializedPropertyDescriptor]

'selectorExpression' @ [145:80] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'isGetMethodCall' @ [145:99] ==> private final fun KtExpression?.isGetMethodCall(getMethod: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection[SimpleFunctionDescriptorImpl]

'getMethod' @ [145:115] ==> value-parameter getMethod: FunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isGetMethodCall[ValueParameterDescriptorImpl]

'when (this) {
            is KtCallExpression -> {
                if ((valueArguments.singleOrNull()?.getArgumentExpression() as? KtSimpleNameExpression)?.getReferencedNameAsName() != valueParameterName) return false
                val resolvedCall = getResolvedCall(analyze())
                return resolvedCall != null && resolvedCall.isReallySuccess() && resolvedCall.resultingDescriptor.original == setMethod.original
            }

            is KtQualifiedExpression -> {
                val receiver = receiverExpression
                return receiver is KtThisExpression && receiver.labelQualifier == null && selectorExpression.isSetMethodCall(setMethod, valueParameterName)
            }

            else -> return false
        }' @ [152:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'this' @ [152:15] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isSetMethodCall[ReceiverParameterDescriptorImpl]

'!=' @ [154:21] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'valueArguments' @ [154:22] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'singleOrNull' @ [154:37] ==> public fun <T> List<(KtValueArgument..KtValueArgument?)>.singleOrNull(): KtValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'getArgumentExpression' @ [154:53] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'getReferencedNameAsName' @ [154:106] ==> public abstract fun getReferencedNameAsName(): Name defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'valueParameterName' @ [154:135] ==> value-parameter valueParameterName: Name defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isSetMethodCall[ValueParameterDescriptorImpl]

'getResolvedCall' @ [155:36] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'analyze' @ [155:52] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [156:24] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isSetMethodCall[LocalVariableDescriptor]

'resolvedCall' @ [156:48] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isSetMethodCall[LocalVariableDescriptor]

'isReallySuccess' @ [156:61] ==> public fun ResolvedCall<*>.isReallySuccess(): Boolean defined in org.jetbrains.kotlin.resolve.calls.model[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [156:82] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isSetMethodCall[LocalVariableDescriptor]

'resultingDescriptor' @ [156:95] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'original' @ [156:115] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'setMethod' @ [156:127] ==> value-parameter setMethod: FunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isSetMethodCall[ValueParameterDescriptorImpl]

'original' @ [156:137] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'receiverExpression' @ [160:32] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'receiver' @ [161:24] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isSetMethodCall[LocalVariableDescriptor]

'receiver' @ [161:56] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isSetMethodCall[LocalVariableDescriptor]

'labelQualifier' @ [161:65] ==> public final val labelQualifier: KtContainerNode? defined in org.jetbrains.kotlin.psi.KtThisExpression[DeserializedPropertyDescriptor]

'selectorExpression' @ [161:91] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'isSetMethodCall' @ [161:110] ==> private final fun KtExpression?.isSetMethodCall(setMethod: FunctionDescriptor, valueParameterName: Name): Boolean defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection[SimpleFunctionDescriptorImpl]

'setMethod' @ [161:126] ==> value-parameter setMethod: FunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isSetMethodCall[ValueParameterDescriptorImpl]

'valueParameterName' @ [161:137] ==> value-parameter valueParameterName: Name defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.isSetMethodCall[ValueParameterDescriptorImpl]

'if (isSameAsSynthetic(property, conflictingExtension)) {
            val fix1 = IntentionWrapper(DeleteRedundantExtensionAction(property), property.containingFile)
            // don't add the second fix when on the fly to allow code cleanup
            val fix2 = if (isOnTheFly)
                object : IntentionWrapper(MarkHiddenAndDeprecatedAction(property), property.containingFile), LowPriorityAction {}
            else
                null
            listOfNotNull(fix1, fix2).toTypedArray()
        }
        else {
            emptyArray()
        }' @ [169:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<IntentionWrapper>, elseBranch: Array<IntentionWrapper>): Array<IntentionWrapper>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<IntentionWrapper>

'isSameAsSynthetic' @ [169:20] ==> private final fun isSameAsSynthetic(declaration: KtProperty, syntheticProperty: SyntheticJavaPropertyDescriptor): Boolean defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection[SimpleFunctionDescriptorImpl]

'property' @ [169:38] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.createFixes[ValueParameterDescriptorImpl]

'conflictingExtension' @ [169:48] ==> value-parameter conflictingExtension: SyntheticJavaPropertyDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.createFixes[ValueParameterDescriptorImpl]

'IntentionWrapper' @ [170:24] ==> public constructor IntentionWrapper(@NotNull p0: IntentionAction, @NotNull p1: PsiFile) defined in com.intellij.codeInspection.IntentionWrapper[JavaClassConstructorDescriptor]

'DeleteRedundantExtensionAction' @ [170:41] ==> public constructor DeleteRedundantExtensionAction(property: KtProperty) defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction[ClassConstructorDescriptorImpl]

'property' @ [170:72] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.createFixes[ValueParameterDescriptorImpl]

'property' @ [170:83] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.createFixes[ValueParameterDescriptorImpl]

'containingFile' @ [170:92] ==> public final val KtProperty.containingFile: PsiFile[MyPropertyDescriptor]

'if (isOnTheFly)
                object : IntentionWrapper(MarkHiddenAndDeprecatedAction(property), property.containingFile), LowPriorityAction {}
            else
                null' @ [172:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: <no name provided>?, elseBranch: <no name provided>?): <no name provided>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> <no name provided>?

'isOnTheFly' @ [172:28] ==> value-parameter isOnTheFly: Boolean defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.createFixes[ValueParameterDescriptorImpl]

'IntentionWrapper' @ [173:26] ==> public constructor IntentionWrapper(@NotNull p0: IntentionAction, @NotNull p1: PsiFile) defined in com.intellij.codeInspection.IntentionWrapper[JavaClassConstructorDescriptor]

'MarkHiddenAndDeprecatedAction' @ [173:43] ==> public constructor MarkHiddenAndDeprecatedAction(property: KtProperty) defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.MarkHiddenAndDeprecatedAction[ClassConstructorDescriptorImpl]

'property' @ [173:73] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.createFixes[ValueParameterDescriptorImpl]

'property' @ [173:84] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.createFixes[ValueParameterDescriptorImpl]

'containingFile' @ [173:93] ==> public final val KtProperty.containingFile: PsiFile[MyPropertyDescriptor]

'listOfNotNull' @ [176:13] ==> public fun <T : Any> listOfNotNull(vararg elements: IntentionWrapper?): List<IntentionWrapper> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> IntentionWrapper

'fix1' @ [176:27] ==> val fix1: IntentionWrapper defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.createFixes[LocalVariableDescriptor]

'fix2' @ [176:33] ==> val fix2: <no name provided>? defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.createFixes[LocalVariableDescriptor]

'toTypedArray' @ [176:39] ==> public inline fun <reified T> Collection<IntentionWrapper>.toTypedArray(): Array<IntentionWrapper> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> IntentionWrapper

'emptyArray' @ [179:13] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<IntentionWrapper> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> IntentionWrapper

'KotlinQuickFixAction<KtProperty>' @ [183:74] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtProperty) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtProperty

'property' @ [183:107] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.<init>[ValueParameterDescriptorImpl]

'getInstance' @ [184:34] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'DeleteRedundantExtensionAction' @ [184:46] ==> public constructor DeleteRedundantExtensionAction(property: KtProperty) defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction[ClassConstructorDescriptorImpl]

'java' @ [184:84] ==> public val <T> KClass<ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction>.java: Class<ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DeleteRedundantExtensionAction

'familyName' @ [187:34] ==> public final val ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.familyName: String[MyPropertyDescriptor]

'element' @ [192:31] ==> protected final val element: KtProperty? defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction[PropertyDescriptorImpl]

'declaration' @ [193:26] ==> val declaration: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.invoke[LocalVariableDescriptor]

'resolveToDescriptor' @ [193:38] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [193:74] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'importableFqName' @ [193:83] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'if (fqName != null) {
                ProgressManager.getInstance().run(
                        object : Task.Modal(project, "Searching for imports to delete", true) {
                            override fun run(indicator: ProgressIndicator) {
                                val importsToDelete = runReadAction {
                                    val searchScope = KotlinSourceFilterScope.projectSources(GlobalSearchScope.projectScope(project), project)
                                    ReferencesSearch.search(declaration, searchScope)
                                            .filterIsInstance<KtSimpleNameReference>()
                                            .mapNotNull { ref -> ref.expression.getStrictParentOfType<KtImportDirective>() }
                                            .filter { import -> !import.isAllUnder && import.targetDescriptors().size == 1 }
                                }
                                GuiUtils.invokeLaterIfNeeded({
                                    project.executeWriteCommand(text) {
                                        importsToDelete.forEach { import ->
                                            if (!FileModificationService.getInstance().preparePsiElementForWrite(import)) return@forEach
                                            try {
                                                import.delete()
                                            }
                                            catch(e: Exception) {
                                                LOG.error(e)
                                            }
                                        }
                                        declaration.delete()
                                    }
                                }, ModalityState.NON_MODAL)
                            }
                        })
            }
            else {
                project.executeWriteCommand(text) { declaration.delete() }
            }' @ [194:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'fqName' @ [194:17] ==> val fqName: FqName? defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.invoke[LocalVariableDescriptor]

'getInstance' @ [195:33] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'run' @ [195:47] ==> public abstract fun run(@NotNull p0: Task): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'Task.Modal' @ [196:34] ==> public constructor Modal(@Nullable p0: Project?, @Nls @NotNull p1: String, p2: Boolean) defined in com.intellij.openapi.progress.Task.Modal[JavaClassConstructorDescriptor]

'project' @ [196:45] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.invoke[ValueParameterDescriptorImpl]

'runReadAction' @ [198:55] ==> public fun <T> runReadAction(action: () -> List<KtImportDirective>): List<KtImportDirective> defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<KtImportDirective>

'KotlinSourceFilterScope' @ [199:55] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope[FakeCallableDescriptorForObject]

'projectSources' @ [199:79] ==> @JvmStatic public final fun projectSources(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[DeserializedSimpleFunctionDescriptor]

'projectScope' @ [199:112] ==> @NotNull public open fun projectScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [199:125] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.invoke[ValueParameterDescriptorImpl]

'project' @ [199:135] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.invoke[ValueParameterDescriptorImpl]

'search' @ [200:54] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'declaration' @ [200:61] ==> val declaration: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.invoke[LocalVariableDescriptor]

'searchScope' @ [200:74] ==> val searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.invoke.<no name provided>.run.<anonymous>[LocalVariableDescriptor]

'filterIsInstance' @ [201:46] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtSimpleNameReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtSimpleNameReference

'mapNotNull' @ [202:46] ==> public inline fun <T, R : Any> Iterable<KtSimpleNameReference>.mapNotNull(transform: (KtSimpleNameReference) -> KtImportDirective?): List<KtImportDirective> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameReference
    <R : Any> -> KtImportDirective

'ref' @ [202:66] ==> value-parameter ref: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.invoke.<no name provided>.run.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [202:70] ==> public final val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedPropertyDescriptor]

'getStrictParentOfType' @ [202:81] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtImportDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtImportDirective

'filter' @ [203:46] ==> public inline fun <T> Iterable<KtImportDirective>.filter(predicate: (KtImportDirective) -> Boolean): List<KtImportDirective> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtImportDirective

'!' @ [203:65] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'import' @ [203:66] ==> value-parameter import: KtImportDirective defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.invoke.<no name provided>.run.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAllUnder' @ [203:73] ==> public final val KtImportDirective.isAllUnder: Boolean[MyPropertyDescriptor]

'import' @ [203:87] ==> value-parameter import: KtImportDirective defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.invoke.<no name provided>.run.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'targetDescriptors' @ [203:94] ==> public fun KtImportDirective.targetDescriptors(resolutionFacade: ResolutionFacade = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'size' @ [203:114] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'invokeLaterIfNeeded' @ [205:42] ==> public final fun invokeLaterIfNeeded(@NotNull p0: () -> Unit, @NotNull p1: ModalityState): Unit defined in com.intellij.ui.GuiUtils[SamAdapterFunctionDescriptor]

'project' @ [206:37] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.invoke[ValueParameterDescriptorImpl]

'executeWriteCommand' @ [206:45] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'text' @ [206:65] ==> public final val ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.text: String[MyPropertyDescriptor]

'importsToDelete' @ [207:41] ==> val importsToDelete: List<KtImportDirective> defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.invoke.<no name provided>.run[LocalVariableDescriptor]

'forEach' @ [207:57] ==> @HidesMembers public inline fun <T> Iterable<KtImportDirective>.forEach(action: (KtImportDirective) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtImportDirective

'!' @ [208:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [208:74] ==> public open fun getInstance(): (FileModificationService..FileModificationService?) defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'preparePsiElementForWrite' @ [208:88] ==> public open fun preparePsiElementForWrite(@Nullable p0: PsiElement?): Boolean defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'import' @ [208:114] ==> value-parameter import: KtImportDirective defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.invoke.<no name provided>.run.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'import' @ [210:49] ==> value-parameter import: KtImportDirective defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.invoke.<no name provided>.run.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'delete' @ [210:56] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtImportDirective[JavaMethodDescriptor]

'LOG' @ [213:49] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction[PropertyDescriptorImpl]

'error' @ [213:53] ==> public open fun error(@NotNull p0: Throwable): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'e' @ [213:59] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.invoke.<no name provided>.run.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'declaration' @ [216:41] ==> val declaration: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.invoke[LocalVariableDescriptor]

'delete' @ [216:53] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'NON_MODAL' @ [218:50] ==> @NotNull public final val NON_MODAL: ModalityState defined in com.intellij.openapi.application.ModalityState[JavaPropertyDescriptor]

'project' @ [223:17] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.invoke[ValueParameterDescriptorImpl]

'executeWriteCommand' @ [223:25] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'text' @ [223:45] ==> public final val ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.text: String[MyPropertyDescriptor]

'declaration' @ [223:53] ==> val declaration: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.DeleteRedundantExtensionAction.invoke[LocalVariableDescriptor]

'delete' @ [223:65] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'KotlinQuickFixAction<KtProperty>' @ [228:73] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtProperty) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtProperty

'property' @ [228:106] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.MarkHiddenAndDeprecatedAction.<init>[ValueParameterDescriptorImpl]

'familyName' @ [230:34] ==> public final val ConflictingExtensionPropertyInspection.MarkHiddenAndDeprecatedAction.familyName: String[MyPropertyDescriptor]

'element' @ [233:27] ==> protected final val element: KtProperty? defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.MarkHiddenAndDeprecatedAction[PropertyDescriptorImpl]

'KtPsiFactory' @ [234:27] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [234:40] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.MarkHiddenAndDeprecatedAction.invoke[ValueParameterDescriptorImpl]

'element' @ [235:24] ==> val element: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.MarkHiddenAndDeprecatedAction.invoke[LocalVariableDescriptor]

'nameAsName' @ [235:32] ==> public final val KtProperty.nameAsName: Name?[MyPropertyDescriptor]

'render' @ [235:45] ==> public fun Name.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'element' @ [236:13] ==> val element: KtProperty defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.MarkHiddenAndDeprecatedAction.invoke[LocalVariableDescriptor]

'addAnnotationWithLineBreak' @ [236:21] ==> private final fun KtNamedDeclaration.addAnnotationWithLineBreak(annotationEntry: KtAnnotationEntry): KtAnnotationEntry defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.MarkHiddenAndDeprecatedAction[SimpleFunctionDescriptorImpl]

'factory' @ [236:48] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.MarkHiddenAndDeprecatedAction.invoke[LocalVariableDescriptor]

'createAnnotationEntry' @ [236:56] ==> public final fun createAnnotationEntry(text: String): KtAnnotationEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'name' @ [236:158] ==> val name: String defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.MarkHiddenAndDeprecatedAction.invoke[LocalVariableDescriptor]

'KtPsiFactory' @ [241:27] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [241:40] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.MarkHiddenAndDeprecatedAction.addAnnotationWithLineBreak[ReceiverParameterDescriptorImpl]

'createNewLine' @ [241:46] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'if (modifierList != null) {
                val result = addAnnotationEntry(annotationEntry)
                modifierList!!.addAfter(newLine, result)
                result
            }
            else {
                val result = addAnnotationEntry(annotationEntry)
                addAfter(newLine, modifierList)
                result
            }' @ [242:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtAnnotationEntry, elseBranch: KtAnnotationEntry): KtAnnotationEntry[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtAnnotationEntry

'modifierList' @ [242:24] ==> public final val KtNamedDeclaration.modifierList: KtModifierList?[MyPropertyDescriptor]

'addAnnotationEntry' @ [243:30] ==> @NotNull public abstract fun addAnnotationEntry(@NotNull p0: KtAnnotationEntry): KtAnnotationEntry defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'annotationEntry' @ [243:49] ==> value-parameter annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.MarkHiddenAndDeprecatedAction.addAnnotationWithLineBreak[ValueParameterDescriptorImpl]

'modifierList' @ [244:17] ==> public final val KtNamedDeclaration.modifierList: KtModifierList?[MyPropertyDescriptor]

'addAfter' @ [244:32] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'newLine' @ [244:41] ==> val newLine: PsiElement defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.MarkHiddenAndDeprecatedAction.addAnnotationWithLineBreak[LocalVariableDescriptor]

'result' @ [244:50] ==> val result: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.MarkHiddenAndDeprecatedAction.addAnnotationWithLineBreak[LocalVariableDescriptor]

'result' @ [245:17] ==> val result: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.MarkHiddenAndDeprecatedAction.addAnnotationWithLineBreak[LocalVariableDescriptor]

'addAnnotationEntry' @ [248:30] ==> @NotNull public abstract fun addAnnotationEntry(@NotNull p0: KtAnnotationEntry): KtAnnotationEntry defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'annotationEntry' @ [248:49] ==> value-parameter annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.MarkHiddenAndDeprecatedAction.addAnnotationWithLineBreak[ValueParameterDescriptorImpl]

'addAfter' @ [249:17] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'newLine' @ [249:26] ==> val newLine: PsiElement defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.MarkHiddenAndDeprecatedAction.addAnnotationWithLineBreak[LocalVariableDescriptor]

'modifierList' @ [249:35] ==> public final val KtNamedDeclaration.modifierList: KtModifierList?[MyPropertyDescriptor]

'result' @ [250:17] ==> val result: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.inspections.ConflictingExtensionPropertyInspection.MarkHiddenAndDeprecatedAction.addAnnotationWithLineBreak[LocalVariableDescriptor]

