'KotlinQuickFixAction<KtSecondaryConstructor>' @ [40:92] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtSecondaryConstructor) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtSecondaryConstructor

'element' @ [40:137] ==> value-parameter element: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.<init>[ValueParameterDescriptorImpl]

'message' @ [41:43] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'keywordToUse' @ [41:77] ==> private final val keywordToUse: String defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix[PropertyDescriptorImpl]

'if (isThis) "this" else "super"' @ [44:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isThis' @ [44:36] ==> public final val isThis: Boolean defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix[PropertyDescriptorImpl]

'element' @ [47:23] ==> protected final val element: KtSecondaryConstructor? defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix[PropertyDescriptorImpl]

'element' @ [48:33] ==> val element: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.invoke[LocalVariableDescriptor]

'replaceImplicitDelegationCallWithExplicit' @ [48:41] ==> public final fun replaceImplicitDelegationCallWithExplicit(isThis: Boolean): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'isThis' @ [48:83] ==> public final val isThis: Boolean defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix[PropertyDescriptorImpl]

'newDelegationCall' @ [50:28] ==> val newDelegationCall: KtConstructorDelegationCall defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.invoke[LocalVariableDescriptor]

'getResolvedCall' @ [50:46] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'newDelegationCall' @ [50:62] ==> val newDelegationCall: KtConstructorDelegationCall defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.invoke[LocalVariableDescriptor]

'analyze' @ [50:80] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'element' @ [51:26] ==> val element: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.invoke[LocalVariableDescriptor]

'resolveToDescriptor' @ [51:34] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [54:13] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.invoke[LocalVariableDescriptor]

'isReallySuccess' @ [54:27] ==> public fun ResolvedCall<*>.isReallySuccess(): Boolean defined in org.jetbrains.kotlin.resolve.calls.model[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [54:57] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.invoke[LocalVariableDescriptor]

'candidateDescriptor' @ [54:72] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'original' @ [54:92] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'descriptor' @ [54:104] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.invoke[LocalVariableDescriptor]

'newDelegationCall' @ [56:29] ==> val newDelegationCall: KtConstructorDelegationCall defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.invoke[LocalVariableDescriptor]

'valueArgumentList' @ [56:47] ==> public final val KtConstructorDelegationCall.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'leftParenthesis' @ [56:67] ==> public final val KtValueArgumentList.leftParenthesis: PsiElement?[MyPropertyDescriptor]

'textOffset' @ [56:85] ==> public final val PsiElement.textOffset: Int[MyPropertyDescriptor]

'editor' @ [58:9] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.invoke[ValueParameterDescriptorImpl]

'moveCaret' @ [58:17] ==> public fun Editor.moveCaret(offset: Int, scrollType: ScrollType = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'leftParOffset' @ [58:27] ==> val leftParOffset: Int defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.invoke[LocalVariableDescriptor]

'element' @ [62:23] ==> protected final val element: KtSecondaryConstructor? defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix[PropertyDescriptorImpl]

'super' @ [63:16] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [63:22] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [63:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [63:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [63:51] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.isAvailable[ValueParameterDescriptorImpl]

'element' @ [63:60] ==> val element: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.isAvailable[LocalVariableDescriptor]

'hasImplicitDelegationCall' @ [63:68] ==> public final fun hasImplicitDelegationCall(): Boolean defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'KotlinSingleIntentionActionFactory' @ [66:46] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [67:61] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.InsertThisDelegationCallFactory.createAction[ValueParameterDescriptorImpl]

'createIntentionForFirstParentOfType' @ [67:72] ==> public inline fun <reified T : PsiElement> Diagnostic.createIntentionForFirstParentOfType(factory: (KtSecondaryConstructor) -> KotlinQuickFixAction<KtSecondaryConstructor>?): KotlinQuickFixAction<KtSecondaryConstructor>? defined in org.jetbrains.kotlin.idea.quickfix.quickfixUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtSecondaryConstructor

'secondaryConstructor' @ [69:17] ==> value-parameter secondaryConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.InsertThisDelegationCallFactory.createAction.<anonymous>[ValueParameterDescriptorImpl]

'getContainingClassOrObject' @ [69:38] ==> public open fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'getConstructorsCount' @ [69:67] ==> private final fun KtClassOrObject.getConstructorsCount(): Int defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.InsertThisDelegationCallFactory[SimpleFunctionDescriptorImpl]

'!' @ [70:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'secondaryConstructor' @ [70:18] ==> value-parameter secondaryConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.InsertThisDelegationCallFactory.createAction.<anonymous>[ValueParameterDescriptorImpl]

'hasImplicitDelegationCall' @ [70:39] ==> public final fun hasImplicitDelegationCall(): Boolean defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'InsertDelegationCallQuickfix' @ [72:20] ==> public constructor InsertDelegationCallQuickfix(isThis: Boolean, element: KtSecondaryConstructor) defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix[ClassConstructorDescriptorImpl]

'secondaryConstructor' @ [72:74] ==> value-parameter secondaryConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.InsertThisDelegationCallFactory.createAction.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [75:63] ==> public val KtDeclaration.descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedPropertyDescriptor]

'constructors' @ [75:94] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'size' @ [75:107] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [78:47] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [80:40] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.InsertSuperDelegationCallFactory.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [80:51] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [80:62] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtSecondaryConstructor? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSecondaryConstructor

'!' @ [81:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'secondaryConstructor' @ [81:18] ==> val secondaryConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.InsertSuperDelegationCallFactory.createAction[LocalVariableDescriptor]

'hasImplicitDelegationCall' @ [81:39] ==> public final fun hasImplicitDelegationCall(): Boolean defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'secondaryConstructor' @ [82:25] ==> val secondaryConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.InsertSuperDelegationCallFactory.createAction[LocalVariableDescriptor]

'getContainingClassOrObject' @ [82:46] ==> public open fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'klass' @ [83:17] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.InsertSuperDelegationCallFactory.createAction[LocalVariableDescriptor]

'hasPrimaryConstructor' @ [83:23] ==> public open fun hasPrimaryConstructor(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'InsertDelegationCallQuickfix' @ [85:20] ==> public constructor InsertDelegationCallQuickfix(isThis: Boolean, element: KtSecondaryConstructor) defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix[ClassConstructorDescriptorImpl]

'secondaryConstructor' @ [85:75] ==> val secondaryConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.quickfix.InsertDelegationCallQuickfix.InsertSuperDelegationCallFactory.createAction[LocalVariableDescriptor]

