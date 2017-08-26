'codeToInline' @ [60:32] ==> value-parameter codeToInline: CodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.<init>[ValueParameterDescriptorImpl]

'toMutable' @ [60:45] ==> internal fun CodeToInline.toMutable(): MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner in file MutableCodeToInline.kt[SimpleFunctionDescriptorImpl]

'nameExpression' @ [61:27] ==> private final val nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'project' @ [61:42] ==> public final val KtSimpleNameExpression.project: Project[MyPropertyDescriptor]

'KtPsiFactory' @ [62:30] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [62:43] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'resolvedCall' @ [65:26] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'resultingDescriptor' @ [65:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'nameExpression' @ [66:20] ==> private final val nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'containingKtFile' @ [66:35] ==> public final val KtSimpleNameExpression.containingKtFile: KtFile[MyPropertyDescriptor]

'if (callElement is KtExpression) callElement.getQualifiedExpressionForSelectorOrThis() else callElement' @ [68:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElement, elseBranch: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElement

'callElement' @ [68:36] ==> private final val callElement: TCallElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'callElement' @ [68:65] ==> private final val callElement: TCallElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'getQualifiedExpressionForSelectorOrThis' @ [68:77] ==> public fun KtExpression.getQualifiedExpressionForSelectorOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'callElement' @ [68:124] ==> private final val callElement: TCallElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'qualifiedElement' @ [69:27] ==> val qualifiedElement: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'getAssignmentByLHS' @ [70:19] ==> public fun KtExpression.getAssignmentByLHS(): KtBinaryExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'takeIf' @ [71:19] ==> @InlineOnly @SinceKotlin public inline fun <T> KtBinaryExpression.takeIf(predicate: (KtBinaryExpression) -> Boolean): KtBinaryExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtBinaryExpression

'it' @ [71:28] ==> value-parameter it: KtBinaryExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline.<anonymous>[ValueParameterDescriptorImpl]

'operationToken' @ [71:31] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQ' @ [71:58] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'assignment' @ [72:35] ==> val assignment: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'qualifiedElement' @ [72:49] ==> val qualifiedElement: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'if (assignment != null && descriptor is PropertyDescriptor)
            descriptor.setter ?: descriptor
        else
            descriptor' @ [73:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallableDescriptor, elseBranch: CallableDescriptor): CallableDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallableDescriptor

'assignment' @ [73:41] ==> val assignment: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'descriptor' @ [73:63] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'descriptor' @ [74:13] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'setter' @ [74:24] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'descriptor' @ [74:34] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'descriptor' @ [76:13] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'CommentSaver' @ [78:28] ==> public constructor CommentSaver(originalElement: PsiElement, saveLineBreaks: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedClassConstructorDescriptor]

'elementToBeReplaced' @ [78:41] ==> val elementToBeReplaced: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'codeToInline' @ [81:13] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'mainExpression' @ [81:26] ==> public final var mainExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'elementToBeReplaced' @ [82:16] ==> val elementToBeReplaced: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'!' @ [83:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'elementToBeReplaced' @ [83:17] ==> val elementToBeReplaced: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'isUsedAsExpression' @ [83:37] ==> public fun KtExpression.isUsedAsExpression(context: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [83:56] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'!' @ [84:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'codeToInline' @ [84:17] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'mainExpression' @ [84:30] ==> public final var mainExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'shouldKeepValue' @ [84:45] ==> private final fun KtExpression?.shouldKeepValue(usageCount: Int): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'codeToInline' @ [86:13] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'mainExpression' @ [86:26] ==> public final var mainExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'nameExpression' @ [89:24] ==> private final val nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'getReceiverExpression' @ [89:39] ==> public fun KtSimpleNameExpression.getReceiverExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'marked' @ [89:64] ==> private final fun <T : KtElement> KtExpression.marked(key: Key<Unit>): KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : KtElement> -> KtExpression

'USER_CODE_KEY' @ [89:71] ==> private final val USER_CODE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'if (receiver != null) bindingContext.getType(receiver) else null' @ [90:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'receiver' @ [90:32] ==> var receiver: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'bindingContext' @ [90:50] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'getType' @ [90:65] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'receiver' @ [90:73] ==> var receiver: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'receiver' @ [92:13] ==> var receiver: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'if (descriptor.isExtension) resolvedCall.extensionReceiver else resolvedCall.dispatchReceiver' @ [93:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReceiverValue?, elseBranch: ReceiverValue?): ReceiverValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReceiverValue?

'descriptor' @ [93:37] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'isExtension' @ [93:48] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'resolvedCall' @ [93:61] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'extensionReceiver' @ [93:74] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'resolvedCall' @ [93:97] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'dispatchReceiver' @ [93:110] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'receiverValue' @ [94:17] ==> val receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'elementToBeReplaced' @ [95:39] ==> val elementToBeReplaced: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'getResolutionScope' @ [95:59] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [95:78] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'elementToBeReplaced' @ [95:94] ==> val elementToBeReplaced: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'getResolutionFacade' @ [95:114] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'receiver' @ [96:17] ==> var receiver: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'receiverValue' @ [96:28] ==> val receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'asExpression' @ [96:42] ==> public fun ImplicitReceiver.asExpression(resolutionScope: LexicalScope, psiFactory: KtPsiFactory): KtExpression? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'resolutionScope' @ [96:55] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'psiFactory' @ [96:72] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'receiverType' @ [97:17] ==> var receiverType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'receiverValue' @ [97:32] ==> val receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'type' @ [97:46] ==> public final val ImplicitReceiver.type: KotlinType[MyPropertyDescriptor]

'receiver' @ [101:9] ==> var receiver: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'mark' @ [101:19] ==> private final fun KtElement.mark(key: Key<Unit>): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'RECEIVER_VALUE_KEY' @ [101:24] ==> private final val RECEIVER_VALUE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'codeToInline' @ [103:32] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'collectDescendantsOfType' @ [103:45] ==> internal inline fun <reified T : PsiElement> MutableCodeToInline.collectDescendantsOfType(noinline predicate: (KtThisExpression) -> Boolean = ...): List<KtThisExpression> defined in org.jetbrains.kotlin.idea.codeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtThisExpression

'thisExpression' @ [105:17] ==> val thisExpression: KtThisExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'labelQualifier' @ [105:32] ==> public final val labelQualifier: KtContainerNode? defined in org.jetbrains.kotlin.psi.KtThisExpression[DeserializedPropertyDescriptor]

'receiver' @ [105:58] ==> var receiver: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'codeToInline' @ [106:17] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'replaceExpression' @ [106:30] ==> public final fun replaceExpression(oldExpression: KtExpression, newExpression: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[SimpleFunctionDescriptorImpl]

'thisExpression' @ [106:48] ==> val thisExpression: KtThisExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'receiver' @ [106:64] ==> var receiver: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'processValueParameterUsages' @ [110:44] ==> private final fun processValueParameterUsages(descriptor: CallableDescriptor): Collection<CodeInliner.IntroduceValueForParameter> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'callableForParameters' @ [110:72] ==> val callableForParameters: CallableDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'processTypeParameterUsages' @ [112:9] ==> private final fun processTypeParameterUsages(): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'callElement' @ [114:28] ==> private final val callElement: TCallElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'parent' @ [114:40] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getResolutionScope' @ [114:47] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext): LexicalScope? defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [114:66] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'if (elementToBeReplaced is KtSafeQualifiedExpression) {
            wrapCodeForSafeCall(receiver!!, receiverType, elementToBeReplaced)
        }
        else if (callElement is KtBinaryExpression && callElement.operationToken == KtTokens.IDENTIFIER) {
            keepInfixFormIfPossible()
        }' @ [116:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'elementToBeReplaced' @ [116:13] ==> val elementToBeReplaced: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'wrapCodeForSafeCall' @ [117:13] ==> private final fun wrapCodeForSafeCall(receiver: KtExpression, receiverType: KotlinType?, expressionToBeReplaced: KtExpression): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'receiver' @ [117:33] ==> var receiver: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'receiverType' @ [117:45] ==> var receiverType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'elementToBeReplaced' @ [117:59] ==> val elementToBeReplaced: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'callElement' @ [119:18] ==> private final val callElement: TCallElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'callElement' @ [119:55] ==> private final val callElement: TCallElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'operationToken' @ [119:67] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'IDENTIFIER' @ [119:94] ==> public final val IDENTIFIER: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'keepInfixFormIfPossible' @ [120:13] ==> private final fun keepInfixFormIfPossible(): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'elementToBeReplaced' @ [123:13] ==> val elementToBeReplaced: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'receiver' @ [124:17] ==> var receiver: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'codeToInline' @ [125:36] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'collectDescendantsOfType' @ [125:49] ==> internal inline fun <reified T : PsiElement> MutableCodeToInline.collectDescendantsOfType(noinline predicate: (KtExpression) -> Boolean = ...): List<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'it' @ [125:90] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline.<anonymous>[ValueParameterDescriptorImpl]

'RECEIVER_VALUE_KEY' @ [125:93] ==> private final val RECEIVER_VALUE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'receiver' @ [126:21] ==> var receiver: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'shouldKeepValue' @ [126:30] ==> private final fun KtExpression?.shouldKeepValue(usageCount: Int): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'thisReplaced' @ [126:59] ==> val thisReplaced: List<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'size' @ [126:72] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'codeToInline' @ [127:21] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'introduceValue' @ [127:34] ==> internal fun MutableCodeToInline.introduceValue(value: KtExpression, valueType: KotlinType?, usages: Collection<KtExpression>, expressionToBeReplaced: KtExpression, nameSuggestion: String? = ..., safeCall: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.codeInliner in file introduceValue.kt[SimpleFunctionDescriptorImpl]

'receiver' @ [127:49] ==> var receiver: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'receiverType' @ [127:59] ==> var receiverType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'thisReplaced' @ [127:73] ==> val thisReplaced: List<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'elementToBeReplaced' @ [127:87] ==> val elementToBeReplaced: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'component1' @ [131:19] ==> public final operator fun component1(): ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.IntroduceValueForParameter[SimpleFunctionDescriptorImpl]

'component2' @ [131:30] ==> public final operator fun component2(): KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.IntroduceValueForParameter[SimpleFunctionDescriptorImpl]

'component3' @ [131:37] ==> public final operator fun component3(): KotlinType? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.IntroduceValueForParameter[SimpleFunctionDescriptorImpl]

'introduceValuesForParameters' @ [131:51] ==> val introduceValuesForParameters: Collection<CodeInliner.IntroduceValueForParameter> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'codeToInline' @ [132:38] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'collectDescendantsOfType' @ [132:51] ==> internal inline fun <reified T : PsiElement> MutableCodeToInline.collectDescendantsOfType(noinline predicate: (KtExpression) -> Boolean = ...): List<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'it' @ [132:92] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline.<anonymous>[ValueParameterDescriptorImpl]

'PARAMETER_VALUE_KEY' @ [132:95] ==> private final val PARAMETER_VALUE_KEY: Key<ValueParameterDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'parameter' @ [132:119] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'codeToInline' @ [133:17] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'introduceValue' @ [133:30] ==> internal fun MutableCodeToInline.introduceValue(value: KtExpression, valueType: KotlinType?, usages: Collection<KtExpression>, expressionToBeReplaced: KtExpression, nameSuggestion: String? = ..., safeCall: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.codeInliner in file introduceValue.kt[SimpleFunctionDescriptorImpl]

'value' @ [133:45] ==> val value: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'valueType' @ [133:52] ==> val valueType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'usagesReplaced' @ [133:63] ==> val usagesReplaced: List<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'elementToBeReplaced' @ [133:79] ==> val elementToBeReplaced: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'parameter' @ [133:117] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'name' @ [133:127] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [133:132] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'codeToInline' @ [137:9] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'fqNamesToImport' @ [137:22] ==> public final val fqNamesToImport: MutableCollection<FqName> defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'flatMap' @ [138:18] ==> public inline fun <T, R> Iterable<FqName>.flatMap(transform: (FqName) -> Iterable<DeclarationDescriptor>): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> DeclarationDescriptor

'file' @ [138:28] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'resolveImportReference' @ [138:33] ==> public fun KtFile.resolveImportReference(fqName: FqName): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'it' @ [138:56] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [139:18] ==> @HidesMembers public inline fun <T> Iterable<DeclarationDescriptor>.forEach(action: (DeclarationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'ImportInsertHelper' @ [139:28] ==> public companion object defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[FakeCallableDescriptorForObject]

'getInstance' @ [139:47] ==> @JvmStatic public final fun getInstance(project: Project): ImportInsertHelper defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [139:59] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'importDescriptor' @ [139:68] ==> public abstract fun importDescriptor(file: KtFile, descriptor: DeclarationDescriptor, forceAllUnderImport: Boolean = ...): ImportDescriptorResult defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[DeserializedSimpleFunctionDescriptor]

'file' @ [139:85] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'it' @ [139:91] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline.<anonymous>[ValueParameterDescriptorImpl]

'when (elementToBeReplaced) {
            is KtExpression -> ExpressionReplacementPerformer(codeToInline, elementToBeReplaced)
            is KtAnnotationEntry -> AnnotationEntryReplacementPerformer(codeToInline, elementToBeReplaced)
            else -> error("Unsupported element")
        }' @ [141:36] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ReplacementPerformer<out KtElement>, entry1: ReplacementPerformer<out KtElement>, entry2: ReplacementPerformer<out KtElement>): ReplacementPerformer<out KtElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ReplacementPerformer<out KtElement>

'elementToBeReplaced' @ [141:42] ==> val elementToBeReplaced: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'ExpressionReplacementPerformer' @ [142:32] ==> public constructor ExpressionReplacementPerformer(codeToInline: MutableCodeToInline, expressionToBeReplaced: KtExpression) defined in org.jetbrains.kotlin.idea.codeInliner.ExpressionReplacementPerformer[ClassConstructorDescriptorImpl]

'codeToInline' @ [142:63] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'elementToBeReplaced' @ [142:77] ==> val elementToBeReplaced: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'AnnotationEntryReplacementPerformer' @ [143:37] ==> public constructor AnnotationEntryReplacementPerformer(codeToInline: MutableCodeToInline, elementToBeReplaced: KtAnnotationEntry) defined in org.jetbrains.kotlin.idea.codeInliner.AnnotationEntryReplacementPerformer[ClassConstructorDescriptorImpl]

'codeToInline' @ [143:73] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'elementToBeReplaced' @ [143:87] ==> val elementToBeReplaced: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'error' @ [144:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'replacementPerformer' @ [147:16] ==> val replacementPerformer: ReplacementPerformer<out KtElement> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'doIt' @ [147:37] ==> public abstract fun doIt(postProcessing: (PsiChildRange) -> PsiChildRange): KtElement? defined in org.jetbrains.kotlin.idea.codeInliner.ReplacementPerformer[SimpleFunctionDescriptorImpl]

'postProcessInsertedCode' @ [148:28] ==> private final fun postProcessInsertedCode(range: PsiChildRange, lexicalScope: LexicalScope?): PsiChildRange defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'range' @ [148:52] ==> value-parameter range: PsiChildRange defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline.<anonymous>[ValueParameterDescriptorImpl]

'lexicalScope' @ [148:59] ==> val lexicalScope: LexicalScope? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'!' @ [149:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'newRange' @ [149:18] ==> val newRange: PsiChildRange defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [149:27] ==> public final val isEmpty: Boolean defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedPropertyDescriptor]

'commentSaver' @ [150:17] ==> val commentSaver: CommentSaver defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline[LocalVariableDescriptor]

'restore' @ [150:30] ==> public final fun restore(resultElements: PsiChildRange, forceAdjustIndent: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedSimpleFunctionDescriptor]

'newRange' @ [150:38] ==> val newRange: PsiChildRange defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline.<anonymous>[LocalVariableDescriptor]

'newRange' @ [152:13] ==> val newRange: PsiChildRange defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.doInline.<anonymous>[LocalVariableDescriptor]

'CollectingNameValidator' @ [159:25] ==> @JvmOverloads public constructor CollectingNameValidator(existingNames: Collection<String> = ..., filter: (String) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.core.CollectingNameValidator[DeserializedClassConstructorDescriptor]

'!' @ [159:51] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [159:52] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.renameDuplicates.<anonymous>[ValueParameterDescriptorImpl]

'nameHasConflictsInScope' @ [159:55] ==> public fun String.nameHasConflictsInScope(lexicalScope: LexicalScope): Boolean defined in org.jetbrains.kotlin.idea.codeInliner in file introduceValue.kt[SimpleFunctionDescriptorImpl]

'lexicalScope' @ [159:79] ==> value-parameter lexicalScope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.renameDuplicates[ValueParameterDescriptorImpl]

'declarations' @ [160:29] ==> value-parameter declarations: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.renameDuplicates[ValueParameterDescriptorImpl]

'declaration' @ [161:27] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.renameDuplicates[LocalVariableDescriptor]

'name' @ [161:39] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'oldName' @ [162:17] ==> val oldName: String? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.renameDuplicates[LocalVariableDescriptor]

'oldName' @ [162:36] ==> val oldName: String? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.renameDuplicates[LocalVariableDescriptor]

'nameHasConflictsInScope' @ [162:44] ==> public fun String.nameHasConflictsInScope(lexicalScope: LexicalScope): Boolean defined in org.jetbrains.kotlin.idea.codeInliner in file introduceValue.kt[SimpleFunctionDescriptorImpl]

'lexicalScope' @ [162:68] ==> value-parameter lexicalScope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.renameDuplicates[ValueParameterDescriptorImpl]

'KotlinNameSuggester' @ [163:31] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNameByName' @ [163:51] ==> public final fun suggestNameByName(name: String, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'oldName' @ [163:69] ==> val oldName: String? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.renameDuplicates[LocalVariableDescriptor]

'validator' @ [163:78] ==> val validator: CollectingNameValidator defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.renameDuplicates[LocalVariableDescriptor]

'RenameProcessor' @ [164:39] ==> public constructor RenameProcessor(p0: (Project..Project?), @NotNull p1: PsiElement, @NotNull @NonNls p2: String, p3: Boolean, p4: Boolean) defined in com.intellij.refactoring.rename.RenameProcessor[JavaClassConstructorDescriptor]

'project' @ [164:55] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'declaration' @ [164:64] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.renameDuplicates[LocalVariableDescriptor]

'newName' @ [164:77] ==> val newName: String defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.renameDuplicates[LocalVariableDescriptor]

'renameProcessor' @ [165:17] ==> val renameProcessor: RenameProcessor defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.renameDuplicates[LocalVariableDescriptor]

'run' @ [165:33] ==> public final fun run(): Unit defined in com.intellij.refactoring.rename.RenameProcessor[JavaMethodDescriptor]

'ArrayList' @ [171:44] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IntroduceValueForParameter

'descriptor' @ [174:27] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages[ValueParameterDescriptorImpl]

'valueParameters' @ [174:38] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'asReversed' @ [174:54] ==> @JvmName public fun <T> MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>.asReversed(): MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'argumentForParameter' @ [175:28] ==> private final fun argumentForParameter(parameter: ValueParameterDescriptor, callableDescriptor: CallableDescriptor): CodeInliner.Argument? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'parameter' @ [175:49] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages[LocalVariableDescriptor]

'descriptor' @ [175:60] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages[ValueParameterDescriptorImpl]

'argument' @ [177:13] ==> val argument: CodeInliner.Argument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages[LocalVariableDescriptor]

'expression' @ [177:22] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.Argument[PropertyDescriptorImpl]

'put' @ [177:33] ==> private final fun <T : Any> KtElement.put(key: Key<ValueParameterDescriptor>, value: ValueParameterDescriptor): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> ValueParameterDescriptor

'PARAMETER_VALUE_KEY' @ [177:37] ==> private final val PARAMETER_VALUE_KEY: Key<ValueParameterDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'parameter' @ [177:58] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages[LocalVariableDescriptor]

'parameter' @ [179:33] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages[LocalVariableDescriptor]

'name' @ [179:43] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'codeToInline' @ [180:26] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'collectDescendantsOfType' @ [180:39] ==> internal inline fun <reified T : PsiElement> MutableCodeToInline.collectDescendantsOfType(noinline predicate: (KtExpression) -> Boolean = ...): List<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'it' @ [181:17] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages.<anonymous>[ValueParameterDescriptorImpl]

'PARAMETER_USAGE_KEY' @ [181:33] ==> public final val PARAMETER_USAGE_KEY: Key<Name> defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInline.Companion[PropertyDescriptorImpl]

'parameterName' @ [181:57] ==> val parameterName: Name defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages[LocalVariableDescriptor]

'usages' @ [183:13] ==> val usages: List<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages[LocalVariableDescriptor]

'forEach' @ [183:20] ==> @HidesMembers public inline fun <T> Iterable<KtExpression>.forEach(action: (KtExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [184:37] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [184:40] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'argument' @ [185:21] ==> val argument: CodeInliner.Argument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages[LocalVariableDescriptor]

'isNamed' @ [185:30] ==> public final val isNamed: Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.Argument[PropertyDescriptorImpl]

'usageArgument' @ [186:21] ==> val usageArgument: KtValueArgument? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages.<anonymous>[LocalVariableDescriptor]

'mark' @ [186:36] ==> private final fun KtElement.mark(key: Key<Unit>): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'MAKE_ARGUMENT_NAMED_KEY' @ [186:41] ==> private final val MAKE_ARGUMENT_NAMED_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'argument' @ [188:21] ==> val argument: CodeInliner.Argument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages[LocalVariableDescriptor]

'isDefaultValue' @ [188:30] ==> public final val isDefaultValue: Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.Argument[PropertyDescriptorImpl]

'usageArgument' @ [189:21] ==> val usageArgument: KtValueArgument? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages.<anonymous>[LocalVariableDescriptor]

'mark' @ [189:36] ==> private final fun KtElement.mark(key: Key<Unit>): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'DEFAULT_PARAMETER_VALUE_KEY' @ [189:41] ==> private final val DEFAULT_PARAMETER_VALUE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'codeToInline' @ [191:17] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'replaceExpression' @ [191:30] ==> public final fun replaceExpression(oldExpression: KtExpression, newExpression: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[SimpleFunctionDescriptorImpl]

'it' @ [191:48] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages.<anonymous>[ValueParameterDescriptorImpl]

'argument' @ [191:52] ==> val argument: CodeInliner.Argument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages[LocalVariableDescriptor]

'expression' @ [191:61] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.Argument[PropertyDescriptorImpl]

'argument' @ [196:17] ==> val argument: CodeInliner.Argument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages[LocalVariableDescriptor]

'expression' @ [196:26] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.Argument[PropertyDescriptorImpl]

'shouldKeepValue' @ [196:37] ==> private final fun KtExpression?.shouldKeepValue(usageCount: Int): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'usages' @ [196:66] ==> val usages: List<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages[LocalVariableDescriptor]

'size' @ [196:73] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'introduceValuesForParameters' @ [197:17] ==> val introduceValuesForParameters: ArrayList<CodeInliner.IntroduceValueForParameter> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages[LocalVariableDescriptor]

'add' @ [197:46] ==> public open fun add(element: CodeInliner.IntroduceValueForParameter): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'IntroduceValueForParameter' @ [197:50] ==> public constructor IntroduceValueForParameter(parameter: ValueParameterDescriptor, value: KtExpression, valueType: KotlinType?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.IntroduceValueForParameter[ClassConstructorDescriptorImpl]

'parameter' @ [197:77] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages[LocalVariableDescriptor]

'argument' @ [197:88] ==> val argument: CodeInliner.Argument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages[LocalVariableDescriptor]

'expression' @ [197:97] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.Argument[PropertyDescriptorImpl]

'argument' @ [197:109] ==> val argument: CodeInliner.Argument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages[LocalVariableDescriptor]

'expressionType' @ [197:118] ==> public final val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.Argument[PropertyDescriptorImpl]

'introduceValuesForParameters' @ [201:16] ==> val introduceValuesForParameters: ArrayList<CodeInliner.IntroduceValueForParameter> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processValueParameterUsages[LocalVariableDescriptor]

'resolvedCall' @ [210:30] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'resultingDescriptor' @ [210:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'original' @ [210:63] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'typeParameters' @ [210:72] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'resolvedCall' @ [212:27] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'call' @ [212:40] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'callElement' @ [212:45] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'callElement' @ [213:30] ==> val callElement: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'callExpression' @ [214:32] ==> val callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'typeArgumentList' @ [214:48] ==> public final val KtCallExpression.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'arguments' @ [214:66] ==> public final val KtTypeArgumentList.arguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'explicitTypeArgs' @ [215:13] ==> val explicitTypeArgs: (MutableList<(KtTypeProjection..KtTypeProjection?)>?..List<(KtTypeProjection..KtTypeProjection?)>?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'explicitTypeArgs' @ [215:41] ==> val explicitTypeArgs: (MutableList<(KtTypeProjection..KtTypeProjection?)>?..List<(KtTypeProjection..KtTypeProjection?)>?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'size' @ [215:58] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'typeParameters' @ [215:66] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'size' @ [215:81] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'component1' @ [217:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [217:22] ==> public final operator fun component2(): (TypeParameterDescriptor..TypeParameterDescriptor?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'typeParameters' @ [217:40] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'withIndex' @ [217:55] ==> public fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.withIndex(): Iterable<IndexedValue<(TypeParameterDescriptor..TypeParameterDescriptor?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'typeParameter' @ [218:33] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'name' @ [218:47] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'codeToInline' @ [219:26] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'collectDescendantsOfType' @ [219:39] ==> internal inline fun <reified T : PsiElement> MutableCodeToInline.collectDescendantsOfType(noinline predicate: (KtExpression) -> Boolean = ...): List<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'it' @ [220:17] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages.<anonymous>[ValueParameterDescriptorImpl]

'TYPE_PARAMETER_USAGE_KEY' @ [220:33] ==> public final val TYPE_PARAMETER_USAGE_KEY: Key<Name> defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInline.Companion[PropertyDescriptorImpl]

'parameterName' @ [220:62] ==> val parameterName: Name defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'resolvedCall' @ [223:24] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'typeArguments' @ [223:37] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.typeArguments: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'typeParameter' @ [223:51] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'if (explicitTypeArgs != null) { // we use explicit type arguments if available to avoid shortening
                val _typeElement = explicitTypeArgs[index].typeReference?.typeElement ?: continue
                _typeElement.marked(USER_CODE_KEY)
            }
            else {
                psiFactory.createType(IdeDescriptorRenderers.SOURCE_CODE.renderType(type)).typeElement!!
            }' @ [224:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtTypeElement, elseBranch: KtTypeElement): KtTypeElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtTypeElement

'explicitTypeArgs' @ [224:35] ==> val explicitTypeArgs: (MutableList<(KtTypeProjection..KtTypeProjection?)>?..List<(KtTypeProjection..KtTypeProjection?)>?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'explicitTypeArgs' @ [225:36] ==> val explicitTypeArgs: (MutableList<(KtTypeProjection..KtTypeProjection?)>?..List<(KtTypeProjection..KtTypeProjection?)>?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'index' @ [225:53] ==> val index: Int defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'typeReference' @ [225:60] ==> public final val KtTypeProjection.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeElement' @ [225:75] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'_typeElement' @ [226:17] ==> val _typeElement: KtTypeElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'marked' @ [226:30] ==> private final fun <T : KtElement> KtTypeElement.marked(key: Key<Unit>): KtTypeElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : KtElement> -> KtTypeElement

'USER_CODE_KEY' @ [226:37] ==> private final val USER_CODE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'psiFactory' @ [229:17] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'createType' @ [229:28] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'SOURCE_CODE' @ [229:62] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [229:74] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [229:85] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'typeElement' @ [229:92] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'type' @ [232:34] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'constructor' @ [232:39] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [232:51] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'usages' @ [234:27] ==> val usages: List<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'usage' @ [235:30] ==> val usage: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'parent' @ [235:36] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (parent is KtClassLiteralExpression && typeClassifier != null) {
                    // for class literal ("X::class") we need type arguments only for kotlin.Array
                    val arguments =
                            if (typeElement is KtUserType && KotlinBuiltIns.isArray(type)) typeElement.typeArgumentList?.text.orEmpty()
                            else ""
                    codeToInline.replaceExpression(usage, psiFactory.createExpression(
                            IdeDescriptorRenderers.SOURCE_CODE.renderClassifierName(typeClassifier) + arguments
                    ))
                }
                else if (parent is KtUserType) {
                    parent.replace(typeElement)
                }
                else {
                    //TODO: tests for this?
                    codeToInline.replaceExpression(usage, psiFactory.createExpression(typeElement.text))
                }' @ [236:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'parent' @ [236:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'typeClassifier' @ [236:59] ==> val typeClassifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'if (typeElement is KtUserType && KotlinBuiltIns.isArray(type)) typeElement.typeArgumentList?.text.orEmpty()
                            else ""' @ [239:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'typeElement' @ [239:33] ==> val typeElement: KtTypeElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'isArray' @ [239:77] ==> public open fun isArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [239:85] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'typeElement' @ [239:92] ==> val typeElement: KtTypeElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'typeArgumentList' @ [239:104] ==> public final val KtUserType.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'text' @ [239:122] ==> public final val KtTypeArgumentList.text: (String..String?)[MyPropertyDescriptor]

'orEmpty' @ [239:127] ==> @InlineOnly public inline fun String?.orEmpty(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'codeToInline' @ [241:21] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'replaceExpression' @ [241:34] ==> public final fun replaceExpression(oldExpression: KtExpression, newExpression: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[SimpleFunctionDescriptorImpl]

'usage' @ [241:52] ==> val usage: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'psiFactory' @ [241:59] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'createExpression' @ [241:70] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'IdeDescriptorRenderers' @ [242:29] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [242:52] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderClassifierName' @ [242:64] ==> public abstract fun renderClassifierName(klass: ClassifierDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'typeClassifier' @ [242:85] ==> val typeClassifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'arguments' @ [242:103] ==> val arguments: String defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'if (parent is KtUserType) {
                    parent.replace(typeElement)
                }
                else {
                    //TODO: tests for this?
                    codeToInline.replaceExpression(usage, psiFactory.createExpression(typeElement.text))
                }' @ [245:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'parent' @ [245:26] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'parent' @ [246:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'replace' @ [246:28] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'typeElement' @ [246:36] ==> val typeElement: KtTypeElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'codeToInline' @ [250:21] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'replaceExpression' @ [250:34] ==> public final fun replaceExpression(oldExpression: KtExpression, newExpression: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[SimpleFunctionDescriptorImpl]

'usage' @ [250:52] ==> val usage: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'psiFactory' @ [250:59] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'createExpression' @ [250:70] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'typeElement' @ [250:87] ==> val typeElement: KtTypeElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.processTypeParameterUsages[LocalVariableDescriptor]

'text' @ [250:99] ==> public final val KtTypeElement.text: (String..String?)[MyPropertyDescriptor]

'codeToInline' @ [257:13] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'statementsBefore' @ [257:26] ==> public final val statementsBefore: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'isEmpty' @ [257:43] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'codeToInline' @ [258:29] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'mainExpression' @ [258:42] ==> public final var mainExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'qualified' @ [259:17] ==> val qualified: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.wrapCodeForSafeCall[LocalVariableDescriptor]

'qualified' @ [260:21] ==> val qualified: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.wrapCodeForSafeCall[LocalVariableDescriptor]

'receiverExpression' @ [260:31] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'RECEIVER_VALUE_KEY' @ [260:50] ==> private final val RECEIVER_VALUE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'qualified' @ [261:25] ==> val qualified: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.wrapCodeForSafeCall[LocalVariableDescriptor]

'qualified' @ [262:36] ==> val qualified: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.wrapCodeForSafeCall[LocalVariableDescriptor]

'selectorExpression' @ [262:46] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'selector' @ [263:25] ==> val selector: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.wrapCodeForSafeCall[LocalVariableDescriptor]

'codeToInline' @ [264:25] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'mainExpression' @ [264:38] ==> public final var mainExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'psiFactory' @ [264:55] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'createExpressionByPattern' @ [264:66] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'receiver' @ [264:102] ==> value-parameter receiver: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.wrapCodeForSafeCall[ValueParameterDescriptorImpl]

'selector' @ [264:112] ==> val selector: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.wrapCodeForSafeCall[LocalVariableDescriptor]

'if (expressionToBeReplaced.isUsedAsExpression(bindingContext)) {
            val thisReplaced = codeToInline.collectDescendantsOfType<KtExpression> { it[RECEIVER_VALUE_KEY] }
            codeToInline.introduceValue(receiver, receiverType, thisReplaced, expressionToBeReplaced, safeCall = true)
        }
        else {
            val ifExpression = psiFactory.buildExpression {
                appendFixedText("if (")
                appendExpression(receiver)
                appendFixedText("!=null) {")
                codeToInline.statementsBefore.forEach {
                    appendExpression(it)
                    appendFixedText("\n")
                }
                codeToInline.mainExpression?.let {
                    appendExpression(it)
                    appendFixedText("\n")
                }
                appendFixedText("}")
            }
            codeToInline.mainExpression = ifExpression
            codeToInline.statementsBefore.clear()
        }' @ [271:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'expressionToBeReplaced' @ [271:13] ==> value-parameter expressionToBeReplaced: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.wrapCodeForSafeCall[ValueParameterDescriptorImpl]

'isUsedAsExpression' @ [271:36] ==> public fun KtExpression.isUsedAsExpression(context: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [271:55] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'codeToInline' @ [272:32] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'collectDescendantsOfType' @ [272:45] ==> internal inline fun <reified T : PsiElement> MutableCodeToInline.collectDescendantsOfType(noinline predicate: (KtExpression) -> Boolean = ...): List<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'it' @ [272:86] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.wrapCodeForSafeCall.<anonymous>[ValueParameterDescriptorImpl]

'RECEIVER_VALUE_KEY' @ [272:89] ==> private final val RECEIVER_VALUE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'codeToInline' @ [273:13] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'introduceValue' @ [273:26] ==> internal fun MutableCodeToInline.introduceValue(value: KtExpression, valueType: KotlinType?, usages: Collection<KtExpression>, expressionToBeReplaced: KtExpression, nameSuggestion: String? = ..., safeCall: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.codeInliner in file introduceValue.kt[SimpleFunctionDescriptorImpl]

'receiver' @ [273:41] ==> value-parameter receiver: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.wrapCodeForSafeCall[ValueParameterDescriptorImpl]

'receiverType' @ [273:51] ==> value-parameter receiverType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.wrapCodeForSafeCall[ValueParameterDescriptorImpl]

'thisReplaced' @ [273:65] ==> val thisReplaced: List<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.wrapCodeForSafeCall[LocalVariableDescriptor]

'expressionToBeReplaced' @ [273:79] ==> value-parameter expressionToBeReplaced: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.wrapCodeForSafeCall[ValueParameterDescriptorImpl]

'psiFactory' @ [276:32] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'buildExpression' @ [276:43] ==> public fun KtPsiFactory.buildExpression(build: BuilderByPattern<KtExpression>.() -> Unit): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [277:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendExpression' @ [278:17] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'receiver' @ [278:34] ==> value-parameter receiver: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.wrapCodeForSafeCall[ValueParameterDescriptorImpl]

'appendFixedText' @ [279:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'codeToInline' @ [280:17] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'statementsBefore' @ [280:30] ==> public final val statementsBefore: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'forEach' @ [280:47] ==> @HidesMembers public inline fun <T> Iterable<KtExpression>.forEach(action: (KtExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'appendExpression' @ [281:21] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'it' @ [281:38] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.wrapCodeForSafeCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'appendFixedText' @ [282:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'codeToInline' @ [284:17] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'mainExpression' @ [284:30] ==> public final var mainExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'let' @ [284:46] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> BuilderByPattern<KtExpression>): BuilderByPattern<KtExpression> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> BuilderByPattern<KtExpression>

'appendExpression' @ [285:21] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'it' @ [285:38] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.wrapCodeForSafeCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'appendFixedText' @ [286:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [288:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'codeToInline' @ [290:13] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'mainExpression' @ [290:26] ==> public final var mainExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'ifExpression' @ [290:43] ==> val ifExpression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.wrapCodeForSafeCall[LocalVariableDescriptor]

'codeToInline' @ [291:13] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'statementsBefore' @ [291:26] ==> public final val statementsBefore: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'clear' @ [291:43] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'codeToInline' @ [296:13] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'statementsBefore' @ [296:26] ==> public final val statementsBefore: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'isNotEmpty' @ [296:43] ==> @InlineOnly public inline fun <T> Collection<KtExpression>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'codeToInline' @ [297:28] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'mainExpression' @ [297:41] ==> public final var mainExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'dotQualified' @ [298:24] ==> val dotQualified: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.keepInfixFormIfPossible[LocalVariableDescriptor]

'receiverExpression' @ [298:37] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'!' @ [299:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'receiver' @ [299:14] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.keepInfixFormIfPossible[LocalVariableDescriptor]

'RECEIVER_VALUE_KEY' @ [299:23] ==> private final val RECEIVER_VALUE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'dotQualified' @ [300:20] ==> val dotQualified: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.keepInfixFormIfPossible[LocalVariableDescriptor]

'selectorExpression' @ [300:33] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'call' @ [301:30] ==> val call: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.keepInfixFormIfPossible[LocalVariableDescriptor]

'calleeExpression' @ [301:35] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'call' @ [302:24] ==> val call: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.keepInfixFormIfPossible[LocalVariableDescriptor]

'valueArguments' @ [302:29] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'singleOrNull' @ [302:44] ==> public fun <T> List<(KtValueArgument..KtValueArgument?)>.singleOrNull(): KtValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'argument' @ [303:13] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.keepInfixFormIfPossible[LocalVariableDescriptor]

'getArgumentName' @ [303:22] ==> @Nullable public open fun getArgumentName(): KtValueArgumentName? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'argument' @ [304:34] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.keepInfixFormIfPossible[LocalVariableDescriptor]

'getArgumentExpression' @ [304:43] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'codeToInline' @ [305:9] ==> private final val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'mainExpression' @ [305:22] ==> public final var mainExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'psiFactory' @ [305:39] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'createExpressionByPattern' @ [305:50] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'nameExpression' @ [305:82] ==> val nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.keepInfixFormIfPossible[LocalVariableDescriptor]

'text' @ [305:97] ==> public final val KtSimpleNameExpression.text: (String..String?)[MyPropertyDescriptor]

'receiver' @ [305:108] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.keepInfixFormIfPossible[LocalVariableDescriptor]

'argumentExpression' @ [305:118] ==> val argumentExpression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.keepInfixFormIfPossible[LocalVariableDescriptor]

'usageCount' @ [309:13] ==> value-parameter usageCount: Int defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue[ValueParameterDescriptorImpl]

'usageCount' @ [310:30] ==> value-parameter usageCount: Int defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue[ValueParameterDescriptorImpl]

'when (this) {
            is KtSimpleNameExpression -> false
            is KtQualifiedExpression -> receiverExpression.shouldKeepValue(usageCount) || selectorExpression.shouldKeepValue(usageCount)
            is KtUnaryExpression -> operationToken in setOf(KtTokens.PLUSPLUS, KtTokens.MINUSMINUS) || baseExpression.shouldKeepValue(usageCount)
            is KtStringTemplateExpression -> entries.any { if (sideEffectOnly) it.expression.shouldKeepValue(usageCount) else it is KtStringTemplateEntryWithExpression }
            is KtThisExpression, is KtSuperExpression, is KtConstantExpression -> false
            is KtParenthesizedExpression -> expression.shouldKeepValue(usageCount)
            is KtArrayAccessExpression -> if (sideEffectOnly) arrayExpression.shouldKeepValue(usageCount) || indexExpressions.any { it.shouldKeepValue(usageCount) } else true
            is KtBinaryExpression -> if (sideEffectOnly) left.shouldKeepValue(usageCount) || right.shouldKeepValue(usageCount) else true
            is KtIfExpression -> if (sideEffectOnly) condition.shouldKeepValue(usageCount) || then.shouldKeepValue(usageCount) || `else`.shouldKeepValue(usageCount) else true
            is KtBinaryExpressionWithTypeRHS -> true
            null -> false
            else -> true
        }' @ [312:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean, entry5: Boolean, entry6: Boolean, entry7: Boolean, entry8: Boolean, entry9: Boolean, entry10: Boolean, entry11: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [312:22] ==> <this> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue[ReceiverParameterDescriptorImpl]

'receiverExpression' @ [314:41] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'shouldKeepValue' @ [314:60] ==> private final fun KtExpression?.shouldKeepValue(usageCount: Int): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'usageCount' @ [314:76] ==> value-parameter usageCount: Int defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue[ValueParameterDescriptorImpl]

'selectorExpression' @ [314:91] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'shouldKeepValue' @ [314:110] ==> private final fun KtExpression?.shouldKeepValue(usageCount: Int): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'usageCount' @ [314:126] ==> value-parameter usageCount: Int defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue[ValueParameterDescriptorImpl]

'operationToken' @ [315:37] ==> public final val KtUnaryExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'setOf' @ [315:55] ==> public fun <T> setOf(vararg elements: (KtSingleValueToken..KtSingleValueToken?)): Set<(KtSingleValueToken..KtSingleValueToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtSingleValueToken..org.jetbrains.kotlin.lexer.KtSingleValueToken?)

'PLUSPLUS' @ [315:70] ==> public final val PLUSPLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MINUSMINUS' @ [315:89] ==> public final val MINUSMINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'baseExpression' @ [315:104] ==> public final val KtUnaryExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'shouldKeepValue' @ [315:119] ==> private final fun KtExpression?.shouldKeepValue(usageCount: Int): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'usageCount' @ [315:135] ==> value-parameter usageCount: Int defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue[ValueParameterDescriptorImpl]

'entries' @ [316:46] ==> public final val KtStringTemplateExpression.entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>)[MyPropertyDescriptor]

'any' @ [316:54] ==> public inline fun <T> Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>.any(predicate: ((KtStringTemplateEntry..KtStringTemplateEntry?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtStringTemplateEntry..org.jetbrains.kotlin.psi.KtStringTemplateEntry?)

'if (sideEffectOnly) it.expression.shouldKeepValue(usageCount) else it is KtStringTemplateEntryWithExpression' @ [316:60] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'sideEffectOnly' @ [316:64] ==> val sideEffectOnly: Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue[LocalVariableDescriptor]

'it' @ [316:80] ==> value-parameter it: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [316:83] ==> public final val KtStringTemplateEntry.expression: KtExpression?[MyPropertyDescriptor]

'shouldKeepValue' @ [316:94] ==> private final fun KtExpression?.shouldKeepValue(usageCount: Int): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'usageCount' @ [316:110] ==> value-parameter usageCount: Int defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue[ValueParameterDescriptorImpl]

'it' @ [316:127] ==> value-parameter it: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [318:45] ==> public final val KtParenthesizedExpression.expression: KtExpression?[MyPropertyDescriptor]

'shouldKeepValue' @ [318:56] ==> private final fun KtExpression?.shouldKeepValue(usageCount: Int): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'usageCount' @ [318:72] ==> value-parameter usageCount: Int defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue[ValueParameterDescriptorImpl]

'if (sideEffectOnly) arrayExpression.shouldKeepValue(usageCount) || indexExpressions.any { it.shouldKeepValue(usageCount) } else true' @ [319:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'sideEffectOnly' @ [319:47] ==> val sideEffectOnly: Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue[LocalVariableDescriptor]

'arrayExpression' @ [319:63] ==> public final val KtArrayAccessExpression.arrayExpression: KtExpression?[MyPropertyDescriptor]

'shouldKeepValue' @ [319:79] ==> private final fun KtExpression?.shouldKeepValue(usageCount: Int): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'usageCount' @ [319:95] ==> value-parameter usageCount: Int defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue[ValueParameterDescriptorImpl]

'indexExpressions' @ [319:110] ==> public final val KtArrayAccessExpression.indexExpressions: (MutableList<(KtExpression..KtExpression?)>..List<(KtExpression..KtExpression?)>)[MyPropertyDescriptor]

'any' @ [319:127] ==> public inline fun <T> Iterable<(KtExpression..KtExpression?)>.any(predicate: ((KtExpression..KtExpression?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'it' @ [319:133] ==> value-parameter it: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue.<anonymous>[ValueParameterDescriptorImpl]

'shouldKeepValue' @ [319:136] ==> private final fun KtExpression?.shouldKeepValue(usageCount: Int): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'usageCount' @ [319:152] ==> value-parameter usageCount: Int defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue[ValueParameterDescriptorImpl]

'if (sideEffectOnly) left.shouldKeepValue(usageCount) || right.shouldKeepValue(usageCount) else true' @ [320:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'sideEffectOnly' @ [320:42] ==> val sideEffectOnly: Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue[LocalVariableDescriptor]

'left' @ [320:58] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'shouldKeepValue' @ [320:63] ==> private final fun KtExpression?.shouldKeepValue(usageCount: Int): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'usageCount' @ [320:79] ==> value-parameter usageCount: Int defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue[ValueParameterDescriptorImpl]

'right' @ [320:94] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'shouldKeepValue' @ [320:100] ==> private final fun KtExpression?.shouldKeepValue(usageCount: Int): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'usageCount' @ [320:116] ==> value-parameter usageCount: Int defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue[ValueParameterDescriptorImpl]

'if (sideEffectOnly) condition.shouldKeepValue(usageCount) || then.shouldKeepValue(usageCount) || `else`.shouldKeepValue(usageCount) else true' @ [321:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'sideEffectOnly' @ [321:38] ==> val sideEffectOnly: Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue[LocalVariableDescriptor]

'condition' @ [321:54] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'shouldKeepValue' @ [321:64] ==> private final fun KtExpression?.shouldKeepValue(usageCount: Int): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'usageCount' @ [321:80] ==> value-parameter usageCount: Int defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue[ValueParameterDescriptorImpl]

'then' @ [321:95] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'shouldKeepValue' @ [321:100] ==> private final fun KtExpression?.shouldKeepValue(usageCount: Int): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'usageCount' @ [321:116] ==> value-parameter usageCount: Int defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue[ValueParameterDescriptorImpl]

'`else`' @ [321:131] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'shouldKeepValue' @ [321:138] ==> private final fun KtExpression?.shouldKeepValue(usageCount: Int): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'usageCount' @ [321:154] ==> value-parameter usageCount: Int defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.shouldKeepValue[ValueParameterDescriptorImpl]

'callableDescriptor' @ [335:13] ==> value-parameter callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[ValueParameterDescriptorImpl]

'?:' @ [336:33] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'callElement' @ [336:34] ==> private final val callElement: TCallElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'getQualifiedExpressionForSelectorOrThis' @ [337:23] ==> public fun KtExpression.getQualifiedExpressionForSelectorOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'getAssignmentByLHS' @ [338:23] ==> public fun KtExpression.getAssignmentByLHS(): KtBinaryExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'right' @ [339:23] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'Argument' @ [340:20] ==> public constructor Argument(expression: KtExpression, expressionType: KotlinType?, isNamed: Boolean = ..., isDefaultValue: Boolean = ...) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.Argument[ClassConstructorDescriptorImpl]

'valueAssigned' @ [340:29] ==> val valueAssigned: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'bindingContext' @ [340:44] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'getType' @ [340:59] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'valueAssigned' @ [340:67] ==> val valueAssigned: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'resolvedCall' @ [343:32] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'valueArguments' @ [343:45] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'parameter' @ [343:60] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[ValueParameterDescriptorImpl]

'when (resolvedArgument) {
            is ExpressionValueArgument -> {
                val valueArgument = resolvedArgument.valueArgument!!
                val expression = valueArgument.getArgumentExpression()!!
                expression.mark(USER_CODE_KEY)
                if (valueArgument is LambdaArgument) {
                    expression.mark(WAS_FUNCTION_LITERAL_ARGUMENT_KEY)
                }
                return Argument(expression, bindingContext.getType(expression), isNamed = valueArgument.isNamed())
            }

            is DefaultValueArgument -> {
                val (defaultValue, parameterUsages) = OptionalParametersHelper.defaultParameterValue(parameter, project) ?: return null

                for ((param, usages) in parameterUsages) {
                    usages.forEach { it.put(CodeToInline.PARAMETER_USAGE_KEY, param.name) }
                }

                val defaultValueCopy = defaultValue.copied()

                // clean up user data in original
                defaultValue.forEachDescendantOfType<KtExpression> { it.clear(CodeToInline.PARAMETER_USAGE_KEY) }

                return Argument(defaultValueCopy, null/*TODO*/, isDefaultValue = true)
            }

            is VarargValueArgument -> {
                val arguments = resolvedArgument.arguments
                val single = arguments.singleOrNull()
                if (single?.getSpreadElement() != null) {
                    val expression = single.getArgumentExpression()!!.marked(USER_CODE_KEY)
                    return Argument(expression, bindingContext.getType(expression), isNamed = single.isNamed())
                }

                val elementType = parameter.varargElementType!!
                val expression = psiFactory.buildExpression {
                    appendFixedText(arrayOfFunctionName(elementType))
                    appendFixedText("(")
                    for ((i, argument) in arguments.withIndex()) {
                        if (i > 0) appendFixedText(",")
                        if (argument.getSpreadElement() != null) {
                            appendFixedText("*")
                        }
                        appendExpression(argument.getArgumentExpression()!!.marked(USER_CODE_KEY))
                    }
                    appendFixedText(")")
                }
                return Argument(expression, parameter.type, isNamed = single?.isNamed() ?: false)
            }

            else -> error("Unknown argument type: $resolvedArgument")
        }' @ [344:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing, entry3: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'resolvedArgument' @ [344:15] ==> val resolvedArgument: ResolvedValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'resolvedArgument' @ [346:37] ==> val resolvedArgument: ResolvedValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'valueArgument' @ [346:54] ==> public final val ExpressionValueArgument.valueArgument: ValueArgument?[MyPropertyDescriptor]

'valueArgument' @ [347:34] ==> val valueArgument: ValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'getArgumentExpression' @ [347:48] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'expression' @ [348:17] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'mark' @ [348:28] ==> private final fun KtElement.mark(key: Key<Unit>): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'USER_CODE_KEY' @ [348:33] ==> private final val USER_CODE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'valueArgument' @ [349:21] ==> val valueArgument: ValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'expression' @ [350:21] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'mark' @ [350:32] ==> private final fun KtElement.mark(key: Key<Unit>): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'WAS_FUNCTION_LITERAL_ARGUMENT_KEY' @ [350:37] ==> private final val WAS_FUNCTION_LITERAL_ARGUMENT_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'Argument' @ [352:24] ==> public constructor Argument(expression: KtExpression, expressionType: KotlinType?, isNamed: Boolean = ..., isDefaultValue: Boolean = ...) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.Argument[ClassConstructorDescriptorImpl]

'expression' @ [352:33] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'bindingContext' @ [352:45] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'getType' @ [352:60] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'expression' @ [352:68] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'valueArgument' @ [352:91] ==> val valueArgument: ValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'isNamed' @ [352:105] ==> public abstract fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'component1' @ [356:22] ==> public final operator fun component1(): KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.DefaultValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [356:36] ==> public final operator fun component2(): Map<ValueParameterDescriptor, Collection<KtExpression>> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.DefaultValue[DeserializedSimpleFunctionDescriptor]

'?:' @ [356:55] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: OptionalParametersHelper.DefaultValue?, right: OptionalParametersHelper.DefaultValue): OptionalParametersHelper.DefaultValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> DefaultValue

'defaultParameterValue' @ [356:80] ==> public final fun defaultParameterValue(parameter: ValueParameterDescriptor, project: Project): OptionalParametersHelper.DefaultValue? defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper[DeserializedSimpleFunctionDescriptor]

'parameter' @ [356:102] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[ValueParameterDescriptorImpl]

'project' @ [356:113] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'component1' @ [358:23] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ValueParameterDescriptor, Collection<KtExpression>>.component1(): ValueParameterDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> Collection<KtExpression>

'component2' @ [358:30] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ValueParameterDescriptor, Collection<KtExpression>>.component2(): Collection<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> Collection<KtExpression>

'parameterUsages' @ [358:41] ==> val parameterUsages: Map<ValueParameterDescriptor, Collection<KtExpression>> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'usages' @ [359:21] ==> val usages: Collection<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'forEach' @ [359:28] ==> @HidesMembers public inline fun <T> Iterable<KtExpression>.forEach(action: (KtExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [359:38] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter.<anonymous>[ValueParameterDescriptorImpl]

'put' @ [359:41] ==> private final fun <T : Any> KtElement.put(key: Key<Name>, value: Name): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Name

'PARAMETER_USAGE_KEY' @ [359:58] ==> public final val PARAMETER_USAGE_KEY: Key<Name> defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInline.Companion[PropertyDescriptorImpl]

'param' @ [359:79] ==> val param: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'name' @ [359:85] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'defaultValue' @ [362:40] ==> val defaultValue: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'copied' @ [362:53] ==> public fun <T : PsiElement> KtExpression.copied(): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : PsiElement> -> KtExpression

'defaultValue' @ [365:17] ==> val defaultValue: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'forEachDescendantOfType' @ [365:30] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'it' @ [365:70] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter.<anonymous>[ValueParameterDescriptorImpl]

'clear' @ [365:73] ==> private final fun <T : Any> KtElement.clear(key: Key<Name>): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Name

'PARAMETER_USAGE_KEY' @ [365:92] ==> public final val PARAMETER_USAGE_KEY: Key<Name> defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInline.Companion[PropertyDescriptorImpl]

'Argument' @ [367:24] ==> public constructor Argument(expression: KtExpression, expressionType: KotlinType?, isNamed: Boolean = ..., isDefaultValue: Boolean = ...) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.Argument[ClassConstructorDescriptorImpl]

'defaultValueCopy' @ [367:33] ==> val defaultValueCopy: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'resolvedArgument' @ [371:33] ==> val resolvedArgument: ResolvedValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'arguments' @ [371:50] ==> public final val VarargValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'arguments' @ [372:30] ==> val arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'singleOrNull' @ [372:40] ==> public fun <T> List<(ValueArgument..ValueArgument?)>.singleOrNull(): ValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'single' @ [373:21] ==> val single: ValueArgument? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'getSpreadElement' @ [373:29] ==> public abstract fun getSpreadElement(): LeafPsiElement? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'single' @ [374:38] ==> val single: ValueArgument? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'getArgumentExpression' @ [374:45] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'marked' @ [374:71] ==> private final fun <T : KtElement> KtExpression.marked(key: Key<Unit>): KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : KtElement> -> KtExpression

'USER_CODE_KEY' @ [374:78] ==> private final val USER_CODE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'Argument' @ [375:28] ==> public constructor Argument(expression: KtExpression, expressionType: KotlinType?, isNamed: Boolean = ..., isDefaultValue: Boolean = ...) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.Argument[ClassConstructorDescriptorImpl]

'expression' @ [375:37] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'bindingContext' @ [375:49] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'getType' @ [375:64] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'expression' @ [375:72] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'single' @ [375:95] ==> val single: ValueArgument? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'isNamed' @ [375:102] ==> public abstract fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'parameter' @ [378:35] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[ValueParameterDescriptorImpl]

'varargElementType' @ [378:45] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'psiFactory' @ [379:34] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'buildExpression' @ [379:45] ==> public fun KtPsiFactory.buildExpression(build: BuilderByPattern<KtExpression>.() -> Unit): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [380:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'arrayOfFunctionName' @ [380:37] ==> private final fun arrayOfFunctionName(elementType: KotlinType): String defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'elementType' @ [380:57] ==> val elementType: KotlinType defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'appendFixedText' @ [381:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'component1' @ [382:27] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [382:30] ==> public final operator fun component2(): (ValueArgument..ValueArgument?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'arguments' @ [382:43] ==> val arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'withIndex' @ [382:53] ==> public fun <T> Iterable<(ValueArgument..ValueArgument?)>.withIndex(): Iterable<IndexedValue<(ValueArgument..ValueArgument?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'i' @ [383:29] ==> val i: Int defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter.<anonymous>[LocalVariableDescriptor]

'appendFixedText' @ [383:36] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'argument' @ [384:29] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter.<anonymous>[LocalVariableDescriptor]

'getSpreadElement' @ [384:38] ==> public abstract fun getSpreadElement(): LeafPsiElement? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [385:29] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendExpression' @ [387:25] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'argument' @ [387:42] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter.<anonymous>[LocalVariableDescriptor]

'getArgumentExpression' @ [387:51] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'marked' @ [387:77] ==> private final fun <T : KtElement> KtExpression.marked(key: Key<Unit>): KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : KtElement> -> KtExpression

'USER_CODE_KEY' @ [387:84] ==> private final val USER_CODE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'appendFixedText' @ [389:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'Argument' @ [391:24] ==> public constructor Argument(expression: KtExpression, expressionType: KotlinType?, isNamed: Boolean = ..., isDefaultValue: Boolean = ...) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.Argument[ClassConstructorDescriptorImpl]

'expression' @ [391:33] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'parameter' @ [391:45] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[ValueParameterDescriptorImpl]

'type' @ [391:55] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'single' @ [391:71] ==> val single: ValueArgument? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'isNamed' @ [391:79] ==> public abstract fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'error' @ [394:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'resolvedArgument' @ [394:52] ==> val resolvedArgument: ResolvedValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.argumentForParameter[LocalVariableDescriptor]

'range' @ [399:24] ==> value-parameter range: PsiChildRange defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode[ValueParameterDescriptorImpl]

'filterIsInstance' @ [399:30] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<KtElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtElement

'toList' @ [399:60] ==> public fun <T> Sequence<KtElement>.toList(): List<KtElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'elements' @ [400:13] ==> val elements: List<KtElement> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode[LocalVariableDescriptor]

'isEmpty' @ [400:22] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'PsiChildRange' @ [400:40] ==> public companion object defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[FakeCallableDescriptorForObject]

'EMPTY' @ [400:54] ==> public final val EMPTY: PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange.Companion[DeserializedPropertyDescriptor]

'lexicalScope' @ [402:9] ==> value-parameter lexicalScope: LexicalScope? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode[ValueParameterDescriptorImpl]

'let' @ [402:23] ==> @InlineOnly public inline fun <T, R> LexicalScope.let(block: (LexicalScope) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LexicalScope
    <R> -> Unit

'renameDuplicates' @ [403:13] ==> private final fun renameDuplicates(declarations: List<KtNamedDeclaration>, lexicalScope: LexicalScope): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'elements' @ [403:30] ==> val elements: List<KtElement> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode[LocalVariableDescriptor]

'dropLast' @ [403:39] ==> public fun <T> List<KtElement>.dropLast(n: Int): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'filterIsInstance' @ [403:51] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtNamedDeclaration

'it' @ [403:91] ==> value-parameter it: LexicalScope defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>[ValueParameterDescriptorImpl]

'elements' @ [406:9] ==> val elements: List<KtElement> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode[LocalVariableDescriptor]

'forEach' @ [406:18] ==> @HidesMembers public inline fun <T> Iterable<KtElement>.forEach(action: (KtElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'introduceNamedArguments' @ [407:13] ==> private final fun introduceNamedArguments(result: KtElement): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'it' @ [407:37] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>[ValueParameterDescriptorImpl]

'restoreFunctionLiteralArguments' @ [409:13] ==> private final fun restoreFunctionLiteralArguments(expression: KtElement): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'it' @ [409:45] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>[ValueParameterDescriptorImpl]

'dropArgumentsForDefaultValues' @ [412:13] ==> private final fun dropArgumentsForDefaultValues(result: KtElement): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'it' @ [412:43] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>[ValueParameterDescriptorImpl]

'simplifySpreadArrayOfArguments' @ [414:13] ==> private final fun simplifySpreadArrayOfArguments(result: KtElement): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'it' @ [414:44] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>[ValueParameterDescriptorImpl]

'removeExplicitTypeArguments' @ [416:13] ==> private final fun removeExplicitTypeArguments(result: KtElement): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'it' @ [416:41] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>[ValueParameterDescriptorImpl]

'if (element[USER_CODE_KEY]) {
                ShortenReferences.FilterResult.SKIP
            }
            else {
                val thisReceiver = (element as? KtQualifiedExpression)?.receiverExpression as? KtThisExpression
                if (thisReceiver != null && thisReceiver[USER_CODE_KEY]) // don't remove explicit 'this' coming from user's code
                    ShortenReferences.FilterResult.GO_INSIDE
                else
                    ShortenReferences.FilterResult.PROCESS
            }' @ [421:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ShortenReferences.FilterResult, elseBranch: ShortenReferences.FilterResult): ShortenReferences.FilterResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FilterResult

'element' @ [421:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>[ValueParameterDescriptorImpl]

'USER_CODE_KEY' @ [421:25] ==> private final val USER_CODE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'SKIP' @ [422:48] ==> enum entry SKIP defined in org.jetbrains.kotlin.idea.core.ShortenReferences.FilterResult[FakeCallableDescriptorForObject]

'element' @ [425:37] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>[ValueParameterDescriptorImpl]

'receiverExpression' @ [425:73] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'if (thisReceiver != null && thisReceiver[USER_CODE_KEY]) // don't remove explicit 'this' coming from user's code
                    ShortenReferences.FilterResult.GO_INSIDE
                else
                    ShortenReferences.FilterResult.PROCESS' @ [426:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ShortenReferences.FilterResult, elseBranch: ShortenReferences.FilterResult): ShortenReferences.FilterResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FilterResult

'thisReceiver' @ [426:21] ==> val thisReceiver: KtThisExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>[LocalVariableDescriptor]

'thisReceiver' @ [426:45] ==> val thisReceiver: KtThisExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>[LocalVariableDescriptor]

'USER_CODE_KEY' @ [426:58] ==> private final val USER_CODE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'GO_INSIDE' @ [427:52] ==> enum entry GO_INSIDE defined in org.jetbrains.kotlin.idea.core.ShortenReferences.FilterResult[FakeCallableDescriptorForObject]

'PROCESS' @ [429:52] ==> enum entry PROCESS defined in org.jetbrains.kotlin.idea.core.ShortenReferences.FilterResult[FakeCallableDescriptorForObject]

'elements' @ [433:27] ==> val elements: List<KtElement> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode[LocalVariableDescriptor]

'map' @ [433:36] ==> public inline fun <T, R> Iterable<KtElement>.map(transform: (KtElement) -> KtElement): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> KtElement

'ShortenReferences' @ [434:13] ==> public constructor ShortenReferences(options: (KtElement) -> ShortenReferences.Options = ...) defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedClassConstructorDescriptor]

'ShortenReferences' @ [434:33] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'Options' @ [434:51] ==> public constructor Options(removeThisLabels: Boolean = ..., removeThis: Boolean = ..., removeExplicitCompanion: Boolean = ...) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options[DeserializedClassConstructorDescriptor]

'process' @ [434:81] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'it' @ [434:89] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>[ValueParameterDescriptorImpl]

'shortenFilter' @ [434:93] ==> val shortenFilter: (PsiElement) -> ShortenReferences.FilterResult defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode[LocalVariableDescriptor]

'newElements' @ [437:9] ==> val newElements: List<KtElement> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode[LocalVariableDescriptor]

'forEach' @ [437:21] ==> @HidesMembers public inline fun <T> Iterable<KtElement>.forEach(action: (KtElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'it' @ [439:13] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [439:16] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'it' @ [440:17] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'clear' @ [440:20] ==> private final fun <T : Any> KtElement.clear(key: Key<Unit>): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Unit

'USER_CODE_KEY' @ [440:26] ==> private final val USER_CODE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'it' @ [441:17] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'clear' @ [441:20] ==> private final fun <T : Any> KtElement.clear(key: Key<Name>): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Name

'PARAMETER_USAGE_KEY' @ [441:39] ==> public final val PARAMETER_USAGE_KEY: Key<Name> defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInline.Companion[PropertyDescriptorImpl]

'it' @ [442:17] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'clear' @ [442:20] ==> private final fun <T : Any> KtElement.clear(key: Key<Name>): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Name

'TYPE_PARAMETER_USAGE_KEY' @ [442:39] ==> public final val TYPE_PARAMETER_USAGE_KEY: Key<Name> defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInline.Companion[PropertyDescriptorImpl]

'it' @ [443:17] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'clear' @ [443:20] ==> private final fun <T : Any> KtElement.clear(key: Key<ValueParameterDescriptor>): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> ValueParameterDescriptor

'PARAMETER_VALUE_KEY' @ [443:26] ==> private final val PARAMETER_VALUE_KEY: Key<ValueParameterDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'it' @ [444:17] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'clear' @ [444:20] ==> private final fun <T : Any> KtElement.clear(key: Key<Unit>): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Unit

'RECEIVER_VALUE_KEY' @ [444:26] ==> private final val RECEIVER_VALUE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'it' @ [445:17] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'clear' @ [445:20] ==> private final fun <T : Any> KtElement.clear(key: Key<Unit>): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Unit

'WAS_FUNCTION_LITERAL_ARGUMENT_KEY' @ [445:26] ==> private final val WAS_FUNCTION_LITERAL_ARGUMENT_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'it' @ [447:13] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [447:16] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtValueArgument) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtValueArgument

'it' @ [448:17] ==> value-parameter it: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'clear' @ [448:20] ==> private final fun <T : Any> KtElement.clear(key: Key<Unit>): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Unit

'MAKE_ARGUMENT_NAMED_KEY' @ [448:26] ==> private final val MAKE_ARGUMENT_NAMED_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'it' @ [449:17] ==> value-parameter it: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'clear' @ [449:20] ==> private final fun <T : Any> KtElement.clear(key: Key<Unit>): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Unit

'DEFAULT_PARAMETER_VALUE_KEY' @ [449:26] ==> private final val DEFAULT_PARAMETER_VALUE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'PsiChildRange' @ [453:16] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedClassConstructorDescriptor]

'newElements' @ [453:30] ==> val newElements: List<KtElement> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode[LocalVariableDescriptor]

'first' @ [453:42] ==> public fun <T> List<KtElement>.first(): KtElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'newElements' @ [453:51] ==> val newElements: List<KtElement> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.postProcessInsertedCode[LocalVariableDescriptor]

'last' @ [453:63] ==> public fun <T> List<KtElement>.last(): KtElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'LinkedHashSet' @ [457:30] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtCallExpression

'result' @ [458:9] ==> value-parameter result: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [458:16] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtValueArgument) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtValueArgument

'it' @ [459:17] ==> value-parameter it: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments.<anonymous>[ValueParameterDescriptorImpl]

'MAKE_ARGUMENT_NAMED_KEY' @ [459:20] ==> private final val MAKE_ARGUMENT_NAMED_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'!' @ [459:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [459:49] ==> value-parameter it: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments.<anonymous>[ValueParameterDescriptorImpl]

'isNamed' @ [459:52] ==> public open fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'it' @ [460:39] ==> value-parameter it: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [460:42] ==> public final val KtValueArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [460:75] ==> public final val KtValueArgumentList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callsToProcess' @ [461:17] ==> val callsToProcess: LinkedHashSet<KtCallExpression> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'addIfNotNull' @ [461:32] ==> public fun <T : Any> MutableCollection<KtCallExpression>.addIfNotNull(t: KtCallExpression?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtCallExpression

'callExpression' @ [461:45] ==> val callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments.<anonymous>[LocalVariableDescriptor]

'callsToProcess' @ [465:32] ==> val callsToProcess: LinkedHashSet<KtCallExpression> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'callExpression' @ [466:34] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'analyze' @ [466:49] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [466:73] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'callExpression' @ [467:32] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'getResolvedCall' @ [467:47] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [467:63] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'!' @ [468:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [468:18] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'isReallySuccess' @ [468:31] ==> public fun ResolvedCall<*>.isReallySuccess(): Boolean defined in org.jetbrains.kotlin.resolve.calls.model[DeserializedSimpleFunctionDescriptor]

'callExpression' @ [470:40] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'valueArguments' @ [470:55] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'dropWhile' @ [470:70] ==> public inline fun <T> Iterable<(KtValueArgument..KtValueArgument?)>.dropWhile(predicate: ((KtValueArgument..KtValueArgument?)) -> Boolean): List<(KtValueArgument..KtValueArgument?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'!' @ [470:82] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [470:83] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments.<anonymous>[ValueParameterDescriptorImpl]

'MAKE_ARGUMENT_NAMED_KEY' @ [470:86] ==> private final val MAKE_ARGUMENT_NAMED_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'argumentsToMakeNamed' @ [471:30] ==> val argumentsToMakeNamed: List<(KtValueArgument..KtValueArgument?)> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'argument' @ [472:21] ==> val argument: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'isNamed' @ [472:30] ==> public open fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'argument' @ [473:21] ==> val argument: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'resolvedCall' @ [474:37] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'getArgumentMapping' @ [474:50] ==> @NotNull public abstract fun getArgumentMapping(@NotNull p0: ValueArgument): ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCall[JavaMethodDescriptor]

'argument' @ [474:69] ==> val argument: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'argumentMatch' @ [475:28] ==> val argumentMatch: ArgumentMatch defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'valueParameter' @ [475:42] ==> public abstract val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[DeserializedPropertyDescriptor]

'name' @ [475:57] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'psiFactory' @ [477:35] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'createArgument' @ [477:46] ==> public final fun createArgument(expression: KtExpression?, name: Name? = ..., isSpread: Boolean = ...): KtValueArgument defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'argument' @ [477:61] ==> val argument: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'getArgumentExpression' @ [477:70] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'name' @ [477:97] ==> val name: Name defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'argument' @ [477:103] ==> val argument: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'getSpreadElement' @ [477:112] ==> public open fun getSpreadElement(): LeafPsiElement? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'argument' @ [479:21] ==> val argument: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'DEFAULT_PARAMETER_VALUE_KEY' @ [479:30] ==> private final val DEFAULT_PARAMETER_VALUE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'newArgument' @ [480:21] ==> val newArgument: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'mark' @ [480:33] ==> private final fun KtElement.mark(key: Key<Unit>): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'DEFAULT_PARAMETER_VALUE_KEY' @ [480:38] ==> private final val DEFAULT_PARAMETER_VALUE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'argument' @ [483:17] ==> val argument: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'replace' @ [483:26] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'newArgument' @ [483:34] ==> val newArgument: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.introduceNamedArguments[LocalVariableDescriptor]

'result' @ [489:23] ==> value-parameter result: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.dropArgumentsForDefaultValues[ValueParameterDescriptorImpl]

'project' @ [489:30] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'result' @ [490:33] ==> value-parameter result: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.dropArgumentsForDefaultValues[ValueParameterDescriptorImpl]

'analyze' @ [490:40] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [491:31] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ValueArgument

'(argument as KtValueArgument)[DEFAULT_PARAMETER_VALUE_KEY]' @ [494:56] ==> private final operator fun PsiElement.get(key: Key<Unit>): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'argument' @ [494:57] ==> value-parameter argument: ValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.dropArgumentsForDefaultValues.canDropArgument[ValueParameterDescriptorImpl]

'DEFAULT_PARAMETER_VALUE_KEY' @ [494:86] ==> private final val DEFAULT_PARAMETER_VALUE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'result' @ [496:9] ==> value-parameter result: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.dropArgumentsForDefaultValues[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [496:16] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtCallExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallExpression

'callExpression' @ [497:32] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.dropArgumentsForDefaultValues.<anonymous>[ValueParameterDescriptorImpl]

'getResolvedCall' @ [497:47] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'newBindingContext' @ [497:63] ==> val newBindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.dropArgumentsForDefaultValues[LocalVariableDescriptor]

'argumentsToDrop' @ [499:13] ==> val argumentsToDrop: ArrayList<ValueArgument> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.dropArgumentsForDefaultValues[LocalVariableDescriptor]

'addAll' @ [499:29] ==> public open fun addAll(elements: Collection<ValueArgument>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'detectArgumentsToDropForDefaults' @ [499:61] ==> public final fun detectArgumentsToDropForDefaults(resolvedCall: ResolvedCall<out CallableDescriptor>, project: Project, canDrop: (ValueArgument) -> Boolean = ...): Collection<ValueArgument> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [499:94] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.dropArgumentsForDefaultValues.<anonymous>[LocalVariableDescriptor]

'project' @ [499:108] ==> val project: Project defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.dropArgumentsForDefaultValues[LocalVariableDescriptor]

'canDropArgument' @ [499:119] ==> local final fun canDropArgument(argument: ValueArgument): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.dropArgumentsForDefaultValues[SimpleFunctionDescriptorImpl]

'argumentsToDrop' @ [502:26] ==> val argumentsToDrop: ArrayList<ValueArgument> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.dropArgumentsForDefaultValues[LocalVariableDescriptor]

'argument' @ [503:13] ==> val argument: ValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.dropArgumentsForDefaultValues[LocalVariableDescriptor]

'argument' @ [504:32] ==> val argument: ValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.dropArgumentsForDefaultValues[LocalVariableDescriptor]

'parent' @ [504:41] ==> public final val KtValueArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'argumentList' @ [505:13] ==> val argumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.dropArgumentsForDefaultValues[LocalVariableDescriptor]

'removeArgument' @ [505:26] ==> public open fun removeArgument(@NotNull p0: KtValueArgument): Unit defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'argument' @ [505:41] ==> val argument: ValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.dropArgumentsForDefaultValues[LocalVariableDescriptor]

'argumentList' @ [506:17] ==> val argumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.dropArgumentsForDefaultValues[LocalVariableDescriptor]

'arguments' @ [506:30] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'isEmpty' @ [506:40] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'argumentList' @ [507:38] ==> val argumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.dropArgumentsForDefaultValues[LocalVariableDescriptor]

'parent' @ [507:51] ==> public final val KtValueArgumentList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callExpression' @ [508:21] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.dropArgumentsForDefaultValues[LocalVariableDescriptor]

'lambdaArguments' @ [508:36] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [508:52] ==> @InlineOnly public inline fun <T> Collection<(KtLambdaArgument..KtLambdaArgument?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'argumentList' @ [509:21] ==> val argumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.dropArgumentsForDefaultValues[LocalVariableDescriptor]

'delete' @ [509:34] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'when {
            KotlinBuiltIns.isInt(elementType) -> "kotlin.intArrayOf"
            KotlinBuiltIns.isLong(elementType) -> "kotlin.longArrayOf"
            KotlinBuiltIns.isShort(elementType) -> "kotlin.shortArrayOf"
            KotlinBuiltIns.isChar(elementType) -> "kotlin.charArrayOf"
            KotlinBuiltIns.isBoolean(elementType) -> "kotlin.booleanArrayOf"
            KotlinBuiltIns.isByte(elementType) -> "kotlin.byteArrayOf"
            KotlinBuiltIns.isDouble(elementType) -> "kotlin.doubleArrayOf"
            KotlinBuiltIns.isFloat(elementType) -> "kotlin.floatArrayOf"
            elementType.isError -> "kotlin.arrayOf"
            else -> "kotlin.arrayOf<" + IdeDescriptorRenderers.SOURCE_CODE.renderType(elementType) + ">"
        }' @ [516:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String, entry5: String, entry6: String, entry7: String, entry8: String, entry9: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'isInt' @ [517:28] ==> public open fun isInt(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'elementType' @ [517:34] ==> value-parameter elementType: KotlinType defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.arrayOfFunctionName[ValueParameterDescriptorImpl]

'isLong' @ [518:28] ==> public open fun isLong(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'elementType' @ [518:35] ==> value-parameter elementType: KotlinType defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.arrayOfFunctionName[ValueParameterDescriptorImpl]

'isShort' @ [519:28] ==> public open fun isShort(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'elementType' @ [519:36] ==> value-parameter elementType: KotlinType defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.arrayOfFunctionName[ValueParameterDescriptorImpl]

'isChar' @ [520:28] ==> public open fun isChar(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'elementType' @ [520:35] ==> value-parameter elementType: KotlinType defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.arrayOfFunctionName[ValueParameterDescriptorImpl]

'isBoolean' @ [521:28] ==> public open fun isBoolean(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'elementType' @ [521:38] ==> value-parameter elementType: KotlinType defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.arrayOfFunctionName[ValueParameterDescriptorImpl]

'isByte' @ [522:28] ==> public open fun isByte(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'elementType' @ [522:35] ==> value-parameter elementType: KotlinType defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.arrayOfFunctionName[ValueParameterDescriptorImpl]

'isDouble' @ [523:28] ==> public open fun isDouble(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'elementType' @ [523:37] ==> value-parameter elementType: KotlinType defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.arrayOfFunctionName[ValueParameterDescriptorImpl]

'isFloat' @ [524:28] ==> public open fun isFloat(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'elementType' @ [524:36] ==> value-parameter elementType: KotlinType defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.arrayOfFunctionName[ValueParameterDescriptorImpl]

'elementType' @ [525:13] ==> value-parameter elementType: KotlinType defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.arrayOfFunctionName[ValueParameterDescriptorImpl]

'isError' @ [525:25] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'+' @ [526:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'SOURCE_CODE' @ [526:64] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [526:76] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'elementType' @ [526:87] ==> value-parameter elementType: KotlinType defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.arrayOfFunctionName[ValueParameterDescriptorImpl]

'result' @ [531:9] ==> value-parameter result: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.removeExplicitTypeArguments[ValueParameterDescriptorImpl]

'collectDescendantsOfType' @ [531:16] ==> public inline fun <reified T : PsiElement> PsiElement.collectDescendantsOfType(crossinline canGoInside: (PsiElement) -> Boolean, noinline predicate: (KtTypeArgumentList) -> Boolean = ...): List<KtTypeArgumentList> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeArgumentList

'!' @ [531:77] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [531:78] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.removeExplicitTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'USER_CODE_KEY' @ [531:81] ==> private final val USER_CODE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'RemoveExplicitTypeArgumentsIntention' @ [532:13] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeArgumentsIntention[FakeCallableDescriptorForObject]

'isApplicableTo' @ [532:50] ==> public final fun isApplicableTo(element: KtTypeArgumentList, approximateFlexible: Boolean): Boolean defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeArgumentsIntention.Companion[SimpleFunctionDescriptorImpl]

'it' @ [532:65] ==> value-parameter it: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.removeExplicitTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [533:11] ==> @HidesMembers public inline fun <T> Iterable<KtTypeArgumentList>.forEach(action: (KtTypeArgumentList) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeArgumentList

'it' @ [533:21] ==> value-parameter it: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.removeExplicitTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'delete' @ [533:24] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtTypeArgumentList[JavaMethodDescriptor]

'ArrayList' @ [539:33] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<KtValueArgument, Collection<KtValueArgument>>

'result' @ [541:9] ==> value-parameter result: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.simplifySpreadArrayOfArguments[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [541:16] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(crossinline canGoInside: (PsiElement) -> Boolean, noinline action: (KtValueArgument) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtValueArgument

'!' @ [541:73] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [541:74] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.simplifySpreadArrayOfArguments.<anonymous>[ValueParameterDescriptorImpl]

'USER_CODE_KEY' @ [541:77] ==> private final val USER_CODE_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'argument' @ [542:17] ==> value-parameter argument: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.simplifySpreadArrayOfArguments.<anonymous>[ValueParameterDescriptorImpl]

'getSpreadElement' @ [542:26] ==> public open fun getSpreadElement(): LeafPsiElement? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'!' @ [542:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'argument' @ [542:57] ==> value-parameter argument: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.simplifySpreadArrayOfArguments.<anonymous>[ValueParameterDescriptorImpl]

'isNamed' @ [542:66] ==> public open fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'argument' @ [543:42] ==> value-parameter argument: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.simplifySpreadArrayOfArguments.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [543:51] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'argumentExpression' @ [544:36] ==> val argumentExpression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.simplifySpreadArrayOfArguments.<anonymous>[LocalVariableDescriptor]

'getResolvedCall' @ [544:55] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'argumentExpression' @ [544:71] ==> val argumentExpression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.simplifySpreadArrayOfArguments.<anonymous>[LocalVariableDescriptor]

'analyze' @ [544:90] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [544:114] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'resolvedCall' @ [545:38] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.simplifySpreadArrayOfArguments.<anonymous>[LocalVariableDescriptor]

'call' @ [545:51] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'callElement' @ [545:56] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'isArrayFunctionCall' @ [546:46] ==> public open fun isArrayFunctionCall(@NotNull p0: ResolvedCall<*>): Boolean defined in org.jetbrains.kotlin.resolve.CompileTimeConstantUtils[JavaMethodDescriptor]

'resolvedCall' @ [546:66] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.simplifySpreadArrayOfArguments.<anonymous>[LocalVariableDescriptor]

'argumentsToExpand' @ [547:21] ==> val argumentsToExpand: ArrayList<Pair<KtValueArgument, Collection<KtValueArgument>>> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.simplifySpreadArrayOfArguments[LocalVariableDescriptor]

'add' @ [547:39] ==> public open fun add(element: Pair<KtValueArgument, Collection<KtValueArgument>>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'argument' @ [547:43] ==> value-parameter argument: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.simplifySpreadArrayOfArguments.<anonymous>[ValueParameterDescriptorImpl]

'callExpression' @ [547:55] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.simplifySpreadArrayOfArguments.<anonymous>[LocalVariableDescriptor]

'valueArguments' @ [547:70] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'component1' @ [552:15] ==> public final operator fun component1(): KtValueArgument defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [552:25] ==> public final operator fun component2(): Collection<KtValueArgument> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'argumentsToExpand' @ [552:42] ==> val argumentsToExpand: ArrayList<Pair<KtValueArgument, Collection<KtValueArgument>>> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.simplifySpreadArrayOfArguments[LocalVariableDescriptor]

'argument' @ [553:13] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.simplifySpreadArrayOfArguments[LocalVariableDescriptor]

'replaceByMultiple' @ [553:22] ==> private final fun KtValueArgument.replaceByMultiple(arguments: Collection<KtValueArgument>): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

'replacements' @ [553:40] ==> val replacements: Collection<KtValueArgument> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.simplifySpreadArrayOfArguments[LocalVariableDescriptor]

'parent' @ [558:20] ==> public final val KtValueArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (arguments.isEmpty()) {
            list.removeArgument(this)
        }
        else {
            var anchor = this
            for (argument in arguments) {
                anchor = list.addArgumentAfter(argument, anchor)
            }
            list.removeArgument(this)
        }' @ [559:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'arguments' @ [559:13] ==> value-parameter arguments: Collection<KtValueArgument> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.replaceByMultiple[ValueParameterDescriptorImpl]

'isEmpty' @ [559:23] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'list' @ [560:13] ==> val list: KtValueArgumentList defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.replaceByMultiple[LocalVariableDescriptor]

'removeArgument' @ [560:18] ==> public open fun removeArgument(@NotNull p0: KtValueArgument): Unit defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'this' @ [560:33] ==> <this> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.replaceByMultiple[ReceiverParameterDescriptorImpl]

'this' @ [563:26] ==> <this> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.replaceByMultiple[ReceiverParameterDescriptorImpl]

'arguments' @ [564:30] ==> value-parameter arguments: Collection<KtValueArgument> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.replaceByMultiple[ValueParameterDescriptorImpl]

'anchor' @ [565:17] ==> var anchor: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.replaceByMultiple[LocalVariableDescriptor]

'list' @ [565:26] ==> val list: KtValueArgumentList defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.replaceByMultiple[LocalVariableDescriptor]

'addArgumentAfter' @ [565:31] ==> @NotNull public open fun addArgumentAfter(@NotNull p0: KtValueArgument, @Nullable p1: KtValueArgument?): KtValueArgument defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'argument' @ [565:48] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.replaceByMultiple[LocalVariableDescriptor]

'anchor' @ [565:58] ==> var anchor: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.replaceByMultiple[LocalVariableDescriptor]

'list' @ [567:13] ==> val list: KtValueArgumentList defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.replaceByMultiple[LocalVariableDescriptor]

'removeArgument' @ [567:18] ==> public open fun removeArgument(@NotNull p0: KtValueArgument): Unit defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'this' @ [567:33] ==> <this> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.replaceByMultiple[ReceiverParameterDescriptorImpl]

'ArrayList' @ [572:31] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtCallExpression

'expression' @ [574:9] ==> value-parameter expression: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [574:20] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'!' @ [575:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expr' @ [575:18] ==> value-parameter expr: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments.<no name provided>[ValueParameterDescriptorImpl]

'WAS_FUNCTION_LITERAL_ARGUMENT_KEY' @ [575:23] ==> private final val WAS_FUNCTION_LITERAL_ARGUMENT_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[PropertyDescriptorImpl]

'assert' @ [576:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'expr' @ [576:20] ==> value-parameter expr: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments.<no name provided>[ValueParameterDescriptorImpl]

'unpackFunctionLiteral' @ [576:25] ==> public fun KtExpression.unpackFunctionLiteral(allowParentheses: Boolean = ...): KtLambdaExpression? defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'expr' @ [578:28] ==> value-parameter expr: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments.<no name provided>[ValueParameterDescriptorImpl]

'parent' @ [578:33] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'argument' @ [579:17] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments.<no name provided>[LocalVariableDescriptor]

'argument' @ [580:17] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments.<no name provided>[LocalVariableDescriptor]

'isNamed' @ [580:26] ==> public open fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'argument' @ [581:32] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments.<no name provided>[LocalVariableDescriptor]

'parent' @ [581:41] ==> public final val KtValueArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'argument' @ [582:17] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments.<no name provided>[LocalVariableDescriptor]

'argumentList' @ [582:29] ==> val argumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments.<no name provided>[LocalVariableDescriptor]

'arguments' @ [582:42] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'last' @ [582:52] ==> public fun <T> List<(KtValueArgument..KtValueArgument?)>.last(): (KtValueArgument..KtValueArgument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'argumentList' @ [583:34] ==> val argumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments.<no name provided>[LocalVariableDescriptor]

'parent' @ [583:47] ==> public final val KtValueArgumentList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callExpression' @ [584:17] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments.<no name provided>[LocalVariableDescriptor]

'lambdaArguments' @ [584:32] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [584:48] ==> @InlineOnly public inline fun <T> Collection<(KtLambdaArgument..KtLambdaArgument?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'callExpression' @ [586:32] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments.<no name provided>[LocalVariableDescriptor]

'getResolvedCall' @ [586:47] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'callExpression' @ [586:63] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments.<no name provided>[LocalVariableDescriptor]

'analyze' @ [586:78] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [586:102] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'!' @ [587:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [587:18] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments.<no name provided>[LocalVariableDescriptor]

'isReallySuccess' @ [587:31] ==> public fun ResolvedCall<*>.isReallySuccess(): Boolean defined in org.jetbrains.kotlin.resolve.calls.model[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [588:33] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments.<no name provided>[LocalVariableDescriptor]

'getArgumentMapping' @ [588:46] ==> @NotNull public abstract fun getArgumentMapping(@NotNull p0: ValueArgument): ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCall[JavaMethodDescriptor]

'argument' @ [588:65] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments.<no name provided>[LocalVariableDescriptor]

'argumentMatch' @ [589:17] ==> val argumentMatch: ArgumentMatch defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments.<no name provided>[LocalVariableDescriptor]

'valueParameter' @ [589:31] ==> public abstract val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[DeserializedPropertyDescriptor]

'resolvedCall' @ [589:49] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments.<no name provided>[LocalVariableDescriptor]

'resultingDescriptor' @ [589:62] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'valueParameters' @ [589:82] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'last' @ [589:98] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.last(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'callExpressions' @ [591:13] ==> val callExpressions: ArrayList<KtCallExpression> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments[LocalVariableDescriptor]

'add' @ [591:29] ==> public open fun add(element: KtCallExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'callExpression' @ [591:33] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments.<no name provided>[LocalVariableDescriptor]

'callExpressions' @ [594:9] ==> val callExpressions: ArrayList<KtCallExpression> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments[LocalVariableDescriptor]

'forEach' @ [594:25] ==> @HidesMembers public inline fun <T> Iterable<KtCallExpression>.forEach(action: (KtCallExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallExpression

'it' @ [594:35] ==> value-parameter it: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.restoreFunctionLiteralArguments.<anonymous>[ValueParameterDescriptorImpl]

'moveFunctionLiteralOutsideParentheses' @ [594:38] ==> public fun KtCallExpression.moveFunctionLiteralOutsideParentheses(): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'getCopyableUserData' @ [597:69] ==> @Nullable @Contract public abstract fun <T : (Any..Any?)> getCopyableUserData(p0: (Key<(T..T?)>..Key<(T..T?)>?)): T? defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (T..T?)

'key' @ [597:89] ==> value-parameter key: Key<T> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.get[ValueParameterDescriptorImpl]

'getCopyableUserData' @ [598:68] ==> @Nullable @Contract public abstract fun <T : (Any..Any?)> getCopyableUserData(p0: (Key<(Unit..Unit?)>..Key<(Unit..Unit?)>?)): Unit? defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Unit..kotlin.Unit?)

'key' @ [598:88] ==> value-parameter key: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.get[ValueParameterDescriptorImpl]

'putCopyableUserData' @ [599:57] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(T..T?)>..Key<(T..T?)>?), @Nullable p1: T?): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (T..T?)

'key' @ [599:77] ==> value-parameter key: Key<T> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.clear[ValueParameterDescriptorImpl]

'putCopyableUserData' @ [600:65] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(T..T?)>..Key<(T..T?)>?), @Nullable p1: T?): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (T..T?)

'key' @ [600:85] ==> value-parameter key: Key<T> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.put[ValueParameterDescriptorImpl]

'value' @ [600:90] ==> value-parameter value: T defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.put[ValueParameterDescriptorImpl]

'putCopyableUserData' @ [601:50] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(Unit..Unit?)>..Key<(Unit..Unit?)>?), @Nullable p1: Unit?): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Unit..kotlin.Unit?)

'key' @ [601:70] ==> value-parameter key: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.mark[ValueParameterDescriptorImpl]

'Unit' @ [601:75] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'putCopyableUserData' @ [604:9] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(Unit..Unit?)>..Key<(Unit..Unit?)>?), @Nullable p1: Unit?): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Unit..kotlin.Unit?)

'key' @ [604:29] ==> value-parameter key: Key<Unit> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.marked[ValueParameterDescriptorImpl]

'Unit' @ [604:34] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'this' @ [605:16] ==> <this> defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner.marked[ReceiverParameterDescriptorImpl]

'Key' @ [609:33] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'Key' @ [610:39] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ValueParameterDescriptor

'Key' @ [611:38] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'Key' @ [612:53] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'Key' @ [615:43] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'Key' @ [616:47] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

