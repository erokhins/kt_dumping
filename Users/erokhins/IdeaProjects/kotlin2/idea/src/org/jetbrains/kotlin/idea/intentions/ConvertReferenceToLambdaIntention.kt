'IntentionBasedInspection<KtCallableReferenceExpression>' @ [37:44] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtCallableReferenceExpression>>, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtCallableReferenceExpression

'ConvertReferenceToLambdaIntention' @ [37:100] ==> public constructor ConvertReferenceToLambdaIntention() defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention[ClassConstructorDescriptorImpl]

'SelfTargetingOffsetIndependentIntention<KtCallableReferenceExpression>' @ [39:43] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtCallableReferenceExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtCallableReferenceExpression

'KtCallableReferenceExpression' @ [40:9] ==> public constructor KtCallableReferenceExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[JavaClassConstructorDescriptor]

'java' @ [40:46] ==> public val <T> KClass<KtCallableReferenceExpression>.java: Class<KtCallableReferenceExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtCallableReferenceExpression

'IdeDescriptorRenderers' @ [42:35] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [42:58] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'element' @ [45:23] ==> value-parameter element: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[ValueParameterDescriptorImpl]

'analyze' @ [45:31] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [45:55] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'element' @ [46:25] ==> value-parameter element: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[ValueParameterDescriptorImpl]

'callableReference' @ [46:33] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'context' @ [47:32] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [47:40] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'reference' @ [47:58] ==> val reference: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'targetDescriptor' @ [48:38] ==> val targetDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'valueParameters' @ [48:55] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [48:71] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Pair<String, KotlinType>): List<Pair<String, KotlinType>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> Pair<String, KotlinType>

'it' @ [48:77] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [48:80] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [48:85] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [48:99] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [48:102] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'element' @ [49:34] ==> value-parameter element: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[ValueParameterDescriptorImpl]

'receiverExpression' @ [49:42] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[DeserializedPropertyDescriptor]

'receiverExpression' @ [50:28] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'let' @ [50:48] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KotlinType?

'context' @ [51:14] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'DOUBLE_COLON_LHS' @ [51:22] ==> public final val DOUBLE_COLON_LHS: (WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [51:40] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [51:70] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Type[DeserializedPropertyDescriptor]

'receiverType' @ [53:35] ==> val receiverType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'let' @ [53:49] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Pair<String, KotlinType>): Pair<String, KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Pair<String, KotlinType>

'KotlinNameSuggester' @ [53:55] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNamesByType' @ [53:75] ==> public final fun suggestNamesByType(type: KotlinType, validator: (String) -> Boolean, defaultName: String? = ...): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'it' @ [53:94] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [54:21] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parameterNamesAndTypes' @ [54:30] ==> val parameterNamesAndTypes: List<Pair<String, KotlinType>> defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'map' @ [54:53] ==> public inline fun <T, R> Iterable<Pair<String, KotlinType>>.map(transform: (Pair<String, KotlinType>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, KotlinType>
    <R> -> String

'it' @ [54:59] ==> value-parameter it: Pair<String, KotlinType> defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [54:62] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'first' @ [55:38] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [55:49] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [57:35] ==> value-parameter element: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[ValueParameterDescriptorImpl]

'parent' @ [57:43] ==> public final val KtCallableReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'valueArgumentParent' @ [58:31] ==> val valueArgumentParent: KtValueArgument? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'parent' @ [58:52] ==> public final val KtValueArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [58:60] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callGrandParent' @ [59:28] ==> val callGrandParent: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'getResolvedCall' @ [59:45] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [59:61] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'resolvedCall' @ [60:37] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'getParameterForArgument' @ [60:51] ==> public fun <D : CallableDescriptor> ResolvedCall<out CallableDescriptor>.getParameterForArgument(valueArgument: ValueArgument?): ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableDescriptor> -> Captured(out CallableDescriptor)

'valueArgumentParent' @ [60:75] ==> val valueArgumentParent: KtValueArgument? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'type' @ [60:97] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'matchingParameterType' @ [61:44] ==> val matchingParameterType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'isExtensionFunctionType' @ [61:67] ==> public val KotlinType.isExtensionFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'receiverNameAndType' @ [63:42] ==> val receiverNameAndType: Pair<String, KotlinType>? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'!' @ [63:73] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'matchingParameterIsExtension' @ [63:74] ==> val matchingParameterIsExtension: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'targetDescriptor' @ [64:43] ==> val targetDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [64:60] ==> public final val CallableMemberDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'targetDescriptor' @ [65:43] ==> val targetDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'extensionReceiverParameter' @ [65:60] ==> public final val CallableMemberDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'KtPsiFactory' @ [67:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [67:36] ==> value-parameter element: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[ValueParameterDescriptorImpl]

'reference' @ [68:26] ==> val reference: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'text' @ [68:36] ==> public final val KtSimpleNameExpression.text: (String..String?)[MyPropertyDescriptor]

'if (acceptsReceiverAsParameter) listOf(receiverNameAndType!!) + parameterNamesAndTypes
                else parameterNamesAndTypes' @ [70:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<Pair<String, KotlinType>>, elseBranch: List<Pair<String, KotlinType>>): List<Pair<String, KotlinType>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<Pair<String, KotlinType>>

'acceptsReceiverAsParameter' @ [70:21] ==> val acceptsReceiverAsParameter: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'listOf' @ [70:49] ==> public fun <T> listOf(element: Pair<String, KotlinType>): List<Pair<String, KotlinType>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, KotlinType>

'receiverNameAndType' @ [70:56] ==> val receiverNameAndType: Pair<String, KotlinType>? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'parameterNamesAndTypes' @ [70:81] ==> val parameterNamesAndTypes: List<Pair<String, KotlinType>> defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'parameterNamesAndTypes' @ [71:22] ==> val parameterNamesAndTypes: List<Pair<String, KotlinType>> defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'when {
            acceptsReceiverAsParameter -> receiverNameAndType!!.first + "."
            matchingParameterIsExtension -> ""
            else -> receiverExpression?.let { it.text + "." } ?: ""
        }' @ [73:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'acceptsReceiverAsParameter' @ [74:13] ==> val acceptsReceiverAsParameter: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'receiverNameAndType' @ [74:43] ==> val receiverNameAndType: Pair<String, KotlinType>? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'first' @ [74:65] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'matchingParameterIsExtension' @ [75:13] ==> val matchingParameterIsExtension: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'receiverExpression' @ [76:21] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'let' @ [76:41] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> String

'it' @ [76:47] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [76:50] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'if (valueArgumentParent != null &&
                                   lambdaParameterNamesAndTypes.size == 1 &&
                                   receiverExpression?.text != "it") {
            factory.createLambdaExpression(
                    parameters = "",
                    body = when {
                        acceptsReceiverAsParameter ->
                            if (targetDescriptor is PropertyDescriptor) "it.$targetName"
                            else "it.$targetName()"
                        else ->
                            "$receiverPrefix$targetName(it)"
                    }
            )
        }
        else {
            factory.createLambdaExpression(
                    parameters = lambdaParameterNamesAndTypes.joinToString(separator = ", ") {
                        if (valueArgumentParent != null) it.first
                        else it.first + ": " + SOURCE_RENDERER.renderType(it.second)
                    },
                    body = if (targetDescriptor is PropertyDescriptor) {
                        "$receiverPrefix$targetName"
                    }
                    else {
                        parameterNamesAndTypes.joinToString(
                                prefix = "$receiverPrefix$targetName(",
                                separator = ", ",
                                postfix = ")"
                        ) { it.first }
                    }
            )
        }' @ [79:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtLambdaExpression, elseBranch: KtLambdaExpression): KtLambdaExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtLambdaExpression

'valueArgumentParent' @ [79:36] ==> val valueArgumentParent: KtValueArgument? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'lambdaParameterNamesAndTypes' @ [80:36] ==> val lambdaParameterNamesAndTypes: List<Pair<String, KotlinType>> defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'size' @ [80:65] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'receiverExpression' @ [81:36] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'text' @ [81:56] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'factory' @ [82:13] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'createLambdaExpression' @ [82:21] ==> public final fun createLambdaExpression(parameters: String, body: String): KtLambdaExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'when {
                        acceptsReceiverAsParameter ->
                            if (targetDescriptor is PropertyDescriptor) "it.$targetName"
                            else "it.$targetName()"
                        else ->
                            "$receiverPrefix$targetName(it)"
                    }' @ [84:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'acceptsReceiverAsParameter' @ [85:25] ==> val acceptsReceiverAsParameter: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'if (targetDescriptor is PropertyDescriptor) "it.$targetName"
                            else "it.$targetName()"' @ [86:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'targetDescriptor' @ [86:33] ==> val targetDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'targetName' @ [86:78] ==> val targetName: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'targetName' @ [87:39] ==> val targetName: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'receiverPrefix' @ [89:31] ==> val receiverPrefix: String defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'targetName' @ [89:46] ==> val targetName: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'factory' @ [94:13] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'createLambdaExpression' @ [94:21] ==> public final fun createLambdaExpression(parameters: String, body: String): KtLambdaExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'lambdaParameterNamesAndTypes' @ [95:34] ==> val lambdaParameterNamesAndTypes: List<Pair<String, KotlinType>> defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'joinToString' @ [95:63] ==> public fun <T> Iterable<Pair<String, KotlinType>>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Pair<String, KotlinType>) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, KotlinType>

'if (valueArgumentParent != null) it.first
                        else it.first + ": " + SOURCE_RENDERER.renderType(it.second)' @ [96:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CharSequence, elseBranch: CharSequence): CharSequence[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CharSequence

'valueArgumentParent' @ [96:29] ==> val valueArgumentParent: KtValueArgument? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'it' @ [96:58] ==> value-parameter it: Pair<String, KotlinType> defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [96:61] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [97:30] ==> value-parameter it: Pair<String, KotlinType> defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [97:33] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'SOURCE_RENDERER' @ [97:48] ==> private final val SOURCE_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention[PropertyDescriptorImpl]

'renderType' @ [97:64] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [97:75] ==> value-parameter it: Pair<String, KotlinType> defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [97:78] ==> public final val second: KotlinType defined in kotlin.Pair[DeserializedPropertyDescriptor]

'if (targetDescriptor is PropertyDescriptor) {
                        "$receiverPrefix$targetName"
                    }
                    else {
                        parameterNamesAndTypes.joinToString(
                                prefix = "$receiverPrefix$targetName(",
                                separator = ", ",
                                postfix = ")"
                        ) { it.first }
                    }' @ [99:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'targetDescriptor' @ [99:32] ==> val targetDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'receiverPrefix' @ [100:27] ==> val receiverPrefix: String defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'targetName' @ [100:42] ==> val targetName: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'parameterNamesAndTypes' @ [103:25] ==> val parameterNamesAndTypes: List<Pair<String, KotlinType>> defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'joinToString' @ [103:48] ==> public fun <T> Iterable<Pair<String, KotlinType>>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Pair<String, KotlinType>) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, KotlinType>

'receiverPrefix' @ [104:44] ==> val receiverPrefix: String defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'targetName' @ [104:59] ==> val targetName: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'it' @ [107:29] ==> value-parameter it: Pair<String, KotlinType> defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [107:32] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'element' @ [111:28] ==> value-parameter element: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [111:36] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[DeserializedSimpleFunctionDescriptor]

'lambdaExpression' @ [111:44] ==> val lambdaExpression: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'ShortenReferences' @ [112:9] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [112:27] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [112:35] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'lambdaResult' @ [112:43] ==> val lambdaResult: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'valueArgumentParent' @ [114:13] ==> val valueArgumentParent: KtValueArgument? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'callGrandParent' @ [114:44] ==> val callGrandParent: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'MoveLambdaOutsideParenthesesIntention' @ [115:40] ==> public constructor MoveLambdaOutsideParenthesesIntention() defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention[ClassConstructorDescriptorImpl]

'moveOutOfParenthesis' @ [116:17] ==> val moveOutOfParenthesis: MoveLambdaOutsideParenthesesIntention defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'isApplicableTo' @ [116:38] ==> public open fun isApplicableTo(element: KtCallExpression, caretOffset: Int): Boolean defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention[SimpleFunctionDescriptorImpl]

'callGrandParent' @ [116:53] ==> val callGrandParent: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'valueArgumentParent' @ [116:70] ==> val valueArgumentParent: KtValueArgument? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'startOffset' @ [116:90] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'moveOutOfParenthesis' @ [117:17] ==> val moveOutOfParenthesis: MoveLambdaOutsideParenthesesIntention defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'applyTo' @ [117:38] ==> public open fun applyTo(element: KtCallExpression, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention[SimpleFunctionDescriptorImpl]

'callGrandParent' @ [117:46] ==> val callGrandParent: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[LocalVariableDescriptor]

'editor' @ [117:63] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention.applyTo[ValueParameterDescriptorImpl]

