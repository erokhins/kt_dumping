'SelfTargetingIntention<KtDeclarationWithBody>' @ [34:37] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<KtDeclarationWithBody>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtDeclarationWithBody

'java' @ [35:38] ==> public val <T> KClass<KtDeclarationWithBody>.java: Class<KtDeclarationWithBody> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtDeclarationWithBody

'element' @ [38:13] ==> value-parameter element: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.isApplicableTo[ValueParameterDescriptorImpl]

'element' @ [38:45] ==> value-parameter element: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.isApplicableTo[ValueParameterDescriptorImpl]

'hasBlockBody' @ [38:53] ==> public abstract fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'!' @ [38:71] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [38:72] ==> value-parameter element: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.isApplicableTo[ValueParameterDescriptorImpl]

'hasBody' @ [38:80] ==> public abstract fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'when (element) {
            is KtNamedFunction -> {
                val returnType = element.returnType() ?: return false
                if (!element.hasDeclaredReturnType() && returnType.isError) return false// do not convert when type is implicit and unknown
                return true
            }

            is KtPropertyAccessor -> return true

            else -> error("Unknown declaration type: $element")
        }' @ [40:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'element' @ [40:15] ==> value-parameter element: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.isApplicableTo[ValueParameterDescriptorImpl]

'element' @ [42:34] ==> value-parameter element: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.isApplicableTo[ValueParameterDescriptorImpl]

'returnType' @ [42:42] ==> private final fun KtNamedFunction.returnType(): KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion[SimpleFunctionDescriptorImpl]

'!' @ [43:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [43:22] ==> value-parameter element: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.isApplicableTo[ValueParameterDescriptorImpl]

'hasDeclaredReturnType' @ [43:30] ==> public abstract fun hasDeclaredReturnType(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'returnType' @ [43:57] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.isApplicableTo[LocalVariableDescriptor]

'isError' @ [43:68] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'error' @ [49:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'element' @ [49:55] ==> value-parameter element: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.isApplicableTo[ValueParameterDescriptorImpl]

'element' @ [53:65] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.allowCaretInsideElement[ValueParameterDescriptorImpl]

'super' @ [53:94] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention[LazyClassReceiverParameterDescriptor]

'allowCaretInsideElement' @ [53:100] ==> protected open fun allowCaretInsideElement(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedSimpleFunctionDescriptor]

'element' @ [53:124] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.allowCaretInsideElement[ValueParameterDescriptorImpl]

'convert' @ [56:9] ==> public final fun convert(declaration: KtDeclarationWithBody): KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [56:17] ==> value-parameter element: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.applyTo[ValueParameterDescriptorImpl]

'declaration' @ [62:24] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[ValueParameterDescriptorImpl]

'bodyExpression' @ [62:36] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'body' @ [65:32] ==> val body: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[LocalVariableDescriptor]

'analyze' @ [65:37] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getType' @ [65:47] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'body' @ [65:55] ==> val body: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[LocalVariableDescriptor]

'KtPsiFactory' @ [66:31] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'declaration' @ [66:44] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[ValueParameterDescriptorImpl]

'bodyType' @ [67:21] ==> val bodyType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert.generateBody[LocalVariableDescriptor]

'bodyType' @ [67:41] ==> val bodyType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert.generateBody[LocalVariableDescriptor]

'isUnit' @ [67:50] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'body' @ [67:62] ==> val body: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[LocalVariableDescriptor]

'factory' @ [67:104] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert.generateBody[LocalVariableDescriptor]

'createEmptyBody' @ [67:112] ==> public final fun createEmptyBody(): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'bodyType' @ [68:41] ==> val bodyType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert.generateBody[LocalVariableDescriptor]

'bodyType' @ [68:61] ==> val bodyType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert.generateBody[LocalVariableDescriptor]

'isUnit' @ [68:70] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'body' @ [68:83] ==> val body: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[LocalVariableDescriptor]

'resultingWhens' @ [68:88] ==> public fun KtExpression.resultingWhens(): List<KtWhenExpression> defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'isNotEmpty' @ [68:105] ==> @InlineOnly public inline fun <T> Collection<KtWhenExpression>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtWhenExpression

'returnsValue' @ [69:34] ==> value-parameter returnsValue: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert.generateBody[ValueParameterDescriptorImpl]

'bodyType' @ [70:35] ==> val bodyType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert.generateBody[LocalVariableDescriptor]

'!' @ [70:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'bodyType' @ [70:57] ==> val bodyType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert.generateBody[LocalVariableDescriptor]

'isUnit' @ [70:66] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'!' @ [70:78] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'bodyType' @ [70:79] ==> val bodyType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert.generateBody[LocalVariableDescriptor]

'isNothing' @ [70:88] ==> public fun KotlinType.isNothing(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'if (needReturn || unitWhenAsResult) factory.createExpressionByPattern("return $0", body) else body' @ [71:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'needReturn' @ [71:37] ==> val needReturn: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert.generateBody[LocalVariableDescriptor]

'unitWhenAsResult' @ [71:51] ==> val unitWhenAsResult: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert.generateBody[LocalVariableDescriptor]

'factory' @ [71:69] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert.generateBody[LocalVariableDescriptor]

'createExpressionByPattern' @ [71:77] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'body' @ [71:116] ==> val body: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[LocalVariableDescriptor]

'body' @ [71:127] ==> val body: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[LocalVariableDescriptor]

'factory' @ [72:24] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert.generateBody[LocalVariableDescriptor]

'createSingleStatementBlock' @ [72:32] ==> public final fun createSingleStatementBlock(statement: KtExpression): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'statement' @ [72:59] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert.generateBody[LocalVariableDescriptor]

'when (declaration) {
                is KtNamedFunction -> {
                    val returnType = declaration.returnType()!!
                    if (!declaration.hasDeclaredReturnType() && !returnType.isUnit()) {
                        declaration.setType(returnType)
                    }
                    generateBody(!returnType.isUnit() && !returnType.isNothing())
                }

                is KtPropertyAccessor -> generateBody(declaration.isGetter)

                else -> throw RuntimeException("Unknown declaration type: $declaration")
            }' @ [75:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression, entry1: KtExpression, entry2: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression

'declaration' @ [75:33] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[ValueParameterDescriptorImpl]

'declaration' @ [77:38] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[ValueParameterDescriptorImpl]

'returnType' @ [77:50] ==> private final fun KtNamedFunction.returnType(): KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion[SimpleFunctionDescriptorImpl]

'!' @ [78:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [78:26] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[ValueParameterDescriptorImpl]

'hasDeclaredReturnType' @ [78:38] ==> public abstract fun hasDeclaredReturnType(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'!' @ [78:65] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'returnType' @ [78:66] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[LocalVariableDescriptor]

'isUnit' @ [78:77] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'declaration' @ [79:25] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[ValueParameterDescriptorImpl]

'setType' @ [79:37] ==> public fun KtCallableDeclaration.setType(type: KotlinType, shortenReferences: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'returnType' @ [79:45] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[LocalVariableDescriptor]

'generateBody' @ [81:21] ==> local final fun generateBody(returnsValue: Boolean): KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[SimpleFunctionDescriptorImpl]

'!' @ [81:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'returnType' @ [81:35] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[LocalVariableDescriptor]

'isUnit' @ [81:46] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'!' @ [81:58] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'returnType' @ [81:59] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[LocalVariableDescriptor]

'isNothing' @ [81:70] ==> public fun KotlinType.isNothing(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'generateBody' @ [84:42] ==> local final fun generateBody(returnsValue: Boolean): KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[SimpleFunctionDescriptorImpl]

'declaration' @ [84:55] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[ValueParameterDescriptorImpl]

'isGetter' @ [84:67] ==> public final val KtPropertyAccessor.isGetter: Boolean[MyPropertyDescriptor]

'RuntimeException' @ [86:31] ==> public constructor RuntimeException(p0: (String..String?)) defined in java.lang.RuntimeException[JavaClassConstructorDescriptor]

'declaration' @ [86:76] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[ValueParameterDescriptorImpl]

'declaration' @ [89:13] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[ValueParameterDescriptorImpl]

'equalsToken' @ [89:25] ==> public final val KtDeclarationWithBody.equalsToken: PsiElement?[MyPropertyDescriptor]

'delete' @ [89:39] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'body' @ [90:13] ==> val body: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[LocalVariableDescriptor]

'replace' @ [90:18] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'newBody' @ [90:26] ==> val newBody: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[LocalVariableDescriptor]

'declaration' @ [91:20] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.convert[ValueParameterDescriptorImpl]

'analyze' @ [95:30] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [95:54] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'DECLARATION_TO_DESCRIPTOR' @ [95:78] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [95:105] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.returnType[ReceiverParameterDescriptorImpl]

'descriptor' @ [96:21] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion.returnType[LocalVariableDescriptor]

'returnType' @ [96:55] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

