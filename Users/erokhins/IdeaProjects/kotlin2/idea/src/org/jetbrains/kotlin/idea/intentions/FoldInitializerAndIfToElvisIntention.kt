'IntentionBasedInspection<KtIfExpression>' @ [42:47] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtIfExpression>>, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtIfExpression

'FoldInitializerAndIfToElvisIntention' @ [42:88] ==> public constructor FoldInitializerAndIfToElvisIntention() defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention[ClassConstructorDescriptorImpl]

'SelfTargetingRangeIntention<KtIfExpression>' @ [44:46] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtIfExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtIfExpression

'KtIfExpression' @ [44:90] ==> public constructor KtIfExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtIfExpression[JavaClassConstructorDescriptor]

'java' @ [44:112] ==> public val <T> KClass<KtIfExpression>.java: Class<KtIfExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtIfExpression

'calcData' @ [46:20] ==> private final fun calcData(ifExpression: KtIfExpression): FoldInitializerAndIfToElvisIntention.Data? defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention[SimpleFunctionDescriptorImpl]

'element' @ [46:29] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applicabilityRange[ValueParameterDescriptorImpl]

'data' @ [48:20] ==> val data: FoldInitializerAndIfToElvisIntention.Data defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applicabilityRange[LocalVariableDescriptor]

'ifNullExpression' @ [48:25] ==> public final val ifNullExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.Data[PropertyDescriptorImpl]

'analyze' @ [48:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getType' @ [48:52] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'data' @ [48:60] ==> val data: FoldInitializerAndIfToElvisIntention.Data defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applicabilityRange[LocalVariableDescriptor]

'ifNullExpression' @ [48:65] ==> public final val ifNullExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.Data[PropertyDescriptorImpl]

'!' @ [49:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [49:14] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applicabilityRange[LocalVariableDescriptor]

'isNothing' @ [49:19] ==> public fun KotlinType.isNothing(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [51:22] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applicabilityRange[ValueParameterDescriptorImpl]

'rightParenthesis' @ [51:30] ==> public final val KtIfExpression.rightParenthesis: PsiElement?[MyPropertyDescriptor]

'TextRange' @ [52:16] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'element' @ [52:26] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applicabilityRange[ValueParameterDescriptorImpl]

'startOffset' @ [52:34] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'rParen' @ [52:47] ==> val rParen: PsiElement defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applicabilityRange[LocalVariableDescriptor]

'endOffset' @ [52:54] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'component1' @ [56:14] ==> public final operator fun component1(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.Data[SimpleFunctionDescriptorImpl]

'component2' @ [56:27] ==> public final operator fun component2(): KtVariableDeclaration defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.Data[SimpleFunctionDescriptorImpl]

'component3' @ [56:40] ==> public final operator fun component3(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.Data[SimpleFunctionDescriptorImpl]

'component4' @ [56:52] ==> public final operator fun component4(): KtTypeReference? defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.Data[SimpleFunctionDescriptorImpl]

'calcData' @ [56:69] ==> private final fun calcData(ifExpression: KtIfExpression): FoldInitializerAndIfToElvisIntention.Data? defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention[SimpleFunctionDescriptorImpl]

'element' @ [56:78] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [57:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [57:36] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[ValueParameterDescriptorImpl]

'when {
            // for var with no explicit type, add it so that the actual change won't change
            declaration.isVar && declaration.typeReference == null -> initializer.analyze(BodyResolveMode.PARTIAL).getType(initializer)

            // for val with explicit type, change it to non-nullable
            !declaration.isVar && declaration.typeReference != null -> initializer.analyze(BodyResolveMode.PARTIAL).getType(initializer)?.makeNotNullable()

            else -> null
        }' @ [59:33] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinType?, entry1: KotlinType?, entry2: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinType?

'declaration' @ [61:13] ==> val declaration: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'isVar' @ [61:25] ==> public final val KtVariableDeclaration.isVar: Boolean[MyPropertyDescriptor]

'declaration' @ [61:34] ==> val declaration: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'typeReference' @ [61:46] ==> public final var KtVariableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'initializer' @ [61:71] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'analyze' @ [61:83] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [61:107] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'getType' @ [61:116] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'initializer' @ [61:124] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'!' @ [64:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [64:14] ==> val declaration: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'isVar' @ [64:26] ==> public final val KtVariableDeclaration.isVar: Boolean[MyPropertyDescriptor]

'declaration' @ [64:35] ==> val declaration: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'typeReference' @ [64:47] ==> public final var KtVariableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'initializer' @ [64:72] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'analyze' @ [64:84] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [64:108] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'getType' @ [64:117] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'initializer' @ [64:125] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'makeNotNullable' @ [64:139] ==> public fun KotlinType.makeNotNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'PsiChildRange' @ [69:32] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedClassConstructorDescriptor]

'declaration' @ [69:46] ==> val declaration: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'element' @ [69:59] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[ValueParameterDescriptorImpl]

'CommentSaver' @ [70:28] ==> public constructor CommentSaver(originalElements: PsiChildRange, saveLineBreaks: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedClassConstructorDescriptor]

'childRangeBefore' @ [70:41] ==> val childRangeBefore: PsiChildRange defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'childRangeBefore' @ [71:31] ==> val childRangeBefore: PsiChildRange defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'withoutLastStatement' @ [71:48] ==> private final fun PsiChildRange.withoutLastStatement(): PsiChildRange defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention[SimpleFunctionDescriptorImpl]

'factory' @ [73:21] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'createExpressionByPattern' @ [73:29] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'initializer' @ [73:67] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'ifNullExpr' @ [73:80] ==> val ifNullExpr: KtExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'typeReference' @ [74:13] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'elvis' @ [75:13] ==> val elvis: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'left' @ [75:19] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'replace' @ [75:26] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'factory' @ [75:34] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'createExpressionByPattern' @ [75:42] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'initializer' @ [75:81] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'typeReference' @ [75:94] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'initializer' @ [77:24] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'replaced' @ [77:36] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtBinaryExpression): KtBinaryExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtBinaryExpression

'elvis' @ [77:45] ==> val elvis: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'element' @ [78:9] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[ValueParameterDescriptorImpl]

'delete' @ [78:17] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtIfExpression[JavaMethodDescriptor]

'explicitTypeToSet' @ [80:13] ==> val explicitTypeToSet: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'!' @ [80:42] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'explicitTypeToSet' @ [80:43] ==> val explicitTypeToSet: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'isError' @ [80:61] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'declaration' @ [81:13] ==> val declaration: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'setType' @ [81:25] ==> public fun KtCallableDeclaration.setType(type: KotlinType, shortenReferences: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'explicitTypeToSet' @ [81:33] ==> val explicitTypeToSet: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'commentSaver' @ [84:9] ==> val commentSaver: CommentSaver defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'restore' @ [84:22] ==> public final fun restore(resultElements: PsiChildRange, forceAdjustIndent: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedSimpleFunctionDescriptor]

'childRangeAfter' @ [84:30] ==> val childRangeAfter: PsiChildRange defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'editor' @ [86:9] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[ValueParameterDescriptorImpl]

'caretModel' @ [86:17] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [86:29] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'newElvis' @ [86:42] ==> val newElvis: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.applyTo[LocalVariableDescriptor]

'right' @ [86:51] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'textOffset' @ [86:59] ==> public final val KtExpression.textOffset: Int[MyPropertyDescriptor]

'ifExpression' @ [97:13] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[ValueParameterDescriptorImpl]

'`else`' @ [97:26] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'ifExpression' @ [99:35] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[ValueParameterDescriptorImpl]

'condition' @ [99:48] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'when (operationExpression) {
            is KtBinaryExpression -> {
                if (operationExpression.operationToken != KtTokens.EQEQ) return null
                operationExpression.expressionComparedToNull()
            }
            is KtIsExpression -> {
                if (!operationExpression.isNegated) return null
                operationExpression.leftHandSide
            }
            else -> return null
        }' @ [100:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'operationExpression' @ [100:27] ==> val operationExpression: KtOperationExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'operationExpression' @ [102:21] ==> val operationExpression: KtOperationExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'operationToken' @ [102:41] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQEQ' @ [102:68] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'operationExpression' @ [103:17] ==> val operationExpression: KtOperationExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'expressionComparedToNull' @ [103:37] ==> public fun KtBinaryExpression.expressionComparedToNull(): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'!' @ [106:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'operationExpression' @ [106:22] ==> val operationExpression: KtOperationExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'isNegated' @ [106:42] ==> public final val KtIsExpression.isNegated: Boolean[MyPropertyDescriptor]

'operationExpression' @ [107:17] ==> val operationExpression: KtOperationExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'leftHandSide' @ [107:37] ==> public final val KtIsExpression.leftHandSide: KtExpression[MyPropertyDescriptor]

'ifExpression' @ [112:13] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[ValueParameterDescriptorImpl]

'parent' @ [112:26] ==> public final val KtIfExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'ifExpression' @ [113:30] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[ValueParameterDescriptorImpl]

'siblings' @ [113:43] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'firstIsInstanceOrNull' @ [114:43] ==> public inline fun <reified T : Any> Sequence<*>.firstIsInstanceOrNull(): KtExpression? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KtExpression

'prevStatement' @ [115:9] ==> val prevStatement: KtVariableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'prevStatement' @ [116:13] ==> val prevStatement: KtVariableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'nameAsName' @ [116:27] ==> public final val KtVariableDeclaration.nameAsName: Name?[MyPropertyDescriptor]

'value' @ [116:41] ==> val value: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'getReferencedNameAsName' @ [116:47] ==> public open fun getReferencedNameAsName(): Name defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'prevStatement' @ [117:27] ==> val prevStatement: KtVariableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'initializer' @ [117:41] ==> public final val KtVariableDeclaration.initializer: KtExpression?[MyPropertyDescriptor]

'ifExpression' @ [118:20] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[ValueParameterDescriptorImpl]

'then' @ [118:33] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'operationExpression' @ [119:30] ==> val operationExpression: KtOperationExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'typeReference' @ [119:71] ==> public final val KtIsExpression.typeReference: KtTypeReference?[MyPropertyDescriptor]

'if (then is KtBlockExpression) then.statements.singleOrNull() else then' @ [121:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'then' @ [121:29] ==> val then: KtExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'then' @ [121:56] ==> val then: KtExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'statements' @ [121:61] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'singleOrNull' @ [121:72] ==> public fun <T> List<(KtExpression..KtExpression?)>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'then' @ [121:92] ==> val then: KtExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'statement' @ [122:9] ==> val statement: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'!=' @ [124:13] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.psi.PsiReference[DeserializedSimpleFunctionDescriptor]

'search' @ [124:30] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'prevStatement' @ [124:37] ==> val prevStatement: KtVariableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'LocalSearchScope' @ [124:52] ==> public constructor LocalSearchScope(@NotNull p0: PsiElement) defined in com.intellij.psi.search.LocalSearchScope[JavaClassConstructorDescriptor]

'statement' @ [124:69] ==> val statement: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'findFirst' @ [124:81] ==> @Nullable public abstract fun findFirst(): PsiReference? defined in com.intellij.util.Query[JavaMethodDescriptor]

'Data' @ [128:16] ==> public constructor Data(initializer: KtExpression, declaration: KtVariableDeclaration, ifNullExpression: KtExpression, typeChecked: KtTypeReference? = ...) defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.Data[ClassConstructorDescriptorImpl]

'initializer' @ [128:21] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'prevStatement' @ [128:34] ==> val prevStatement: KtVariableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'statement' @ [128:49] ==> val statement: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'typeReference' @ [128:60] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.calcData[LocalVariableDescriptor]

'last' @ [132:23] ==> public final val last: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedPropertyDescriptor]

'siblings' @ [132:30] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'first' @ [132:76] ==> public inline fun <T> Sequence<PsiElement>.first(predicate: (PsiElement) -> Boolean): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [132:84] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.withoutLastStatement.<anonymous>[ValueParameterDescriptorImpl]

'PsiChildRange' @ [133:16] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedClassConstructorDescriptor]

'first' @ [133:30] ==> public final val first: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedPropertyDescriptor]

'newLast' @ [133:37] ==> val newLast: PsiElement defined in org.jetbrains.kotlin.idea.intentions.FoldInitializerAndIfToElvisIntention.withoutLastStatement[LocalVariableDescriptor]

