'AddModifierFix' @ [31:87] ==> public constructor AddModifierFix(element: KtModifierListOwner, modifier: KtModifierKeywordToken) defined in org.jetbrains.kotlin.idea.quickfix.AddModifierFix[ClassConstructorDescriptorImpl]

'element' @ [31:102] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.<init>[ValueParameterDescriptorImpl]

'SUSPEND_KEYWORD' @ [31:120] ==> public final val SUSPEND_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'when (element) {
                is KtNamedFunction -> "Make ${name ?: "containing function"} suspend"
                is KtTypeReference -> "Make ${name ?: "receiver"} type suspend"
                else -> super.getText()
            }' @ [34:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'element' @ [34:19] ==> protected final val element: KtModifierListOwner? defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix[PropertyDescriptorImpl]

'name' @ [35:47] ==> private final val name: String? defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix[PropertyDescriptorImpl]

'name' @ [36:47] ==> private final val name: String? defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix[PropertyDescriptorImpl]

'super' @ [37:25] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix[LazyClassReceiverParameterDescriptor]

'getText' @ [37:31] ==> public open fun getText(): String defined in org.jetbrains.kotlin.idea.quickfix.AddModifierFix[SimpleFunctionDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [40:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [42:27] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [42:38] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'?:' @ [43:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtNamedFunction?, right: KtNamedFunction): KtNamedFunction[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtNamedFunction

'element' @ [43:29] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.Companion.createAction[LocalVariableDescriptor]

'containingDeclarationForPseudocode' @ [43:53] ==> public val KtElement.containingDeclarationForPseudocode: KtDeclaration? defined in org.jetbrains.kotlin.cfg.pseudocode[DeserializedPropertyDescriptor]

'AddSuspendModifierFix' @ [45:20] ==> public constructor AddSuspendModifierFix(element: KtModifierListOwner, name: String?) defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix[ClassConstructorDescriptorImpl]

'function' @ [45:42] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.Companion.createAction[LocalVariableDescriptor]

'function' @ [45:52] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.Companion.createAction[LocalVariableDescriptor]

'name' @ [45:61] ==> public final val KtNamedFunction.name: String?[MyPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [49:41] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'setOf' @ [51:45] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'diagnostic' @ [54:27] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.UnresolvedReferenceFactory.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [54:38] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'refExpr' @ [55:17] ==> val refExpr: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.UnresolvedReferenceFactory.createAction[LocalVariableDescriptor]

'getReferencedName' @ [55:25] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'suspendExtensionNames' @ [55:49] ==> private final val suspendExtensionNames: Set<String> defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.UnresolvedReferenceFactory[PropertyDescriptorImpl]

'refExpr' @ [57:30] ==> val refExpr: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.UnresolvedReferenceFactory.createAction[LocalVariableDescriptor]

'parent' @ [57:38] ==> public final val KtNameReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callParent' @ [58:40] ==> val callParent: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.UnresolvedReferenceFactory.createAction[LocalVariableDescriptor]

'parent' @ [58:51] ==> public final val KtCallExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callParent' @ [59:17] ==> val callParent: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.UnresolvedReferenceFactory.createAction[LocalVariableDescriptor]

'qualifiedGrandParent' @ [59:32] ==> val qualifiedGrandParent: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.UnresolvedReferenceFactory.createAction[LocalVariableDescriptor]

'selectorExpression' @ [59:53] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'refExpr' @ [59:75] ==> val refExpr: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.UnresolvedReferenceFactory.createAction[LocalVariableDescriptor]

'callParent' @ [59:87] ==> val callParent: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.UnresolvedReferenceFactory.createAction[LocalVariableDescriptor]

'calleeExpression' @ [59:98] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'qualifiedGrandParent' @ [60:28] ==> val qualifiedGrandParent: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.UnresolvedReferenceFactory.createAction[LocalVariableDescriptor]

'receiverExpression' @ [60:49] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'receiver' @ [62:27] ==> val receiver: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.UnresolvedReferenceFactory.createAction[LocalVariableDescriptor]

'analyze' @ [62:36] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [62:60] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'context' @ [63:38] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.UnresolvedReferenceFactory.createAction[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [63:61] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'receiver' @ [63:79] ==> val receiver: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.UnresolvedReferenceFactory.createAction[LocalVariableDescriptor]

'!' @ [64:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'receiverDescriptor' @ [64:18] ==> val receiverDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.UnresolvedReferenceFactory.createAction[LocalVariableDescriptor]

'type' @ [64:37] ==> public final val ValueDescriptor.type: KotlinType[MyPropertyDescriptor]

'isFunctionType' @ [64:42] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'DescriptorToSourceUtils' @ [65:31] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [65:55] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'receiverDescriptor' @ [65:79] ==> val receiverDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.UnresolvedReferenceFactory.createAction[LocalVariableDescriptor]

'declaration' @ [67:17] ==> val declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.UnresolvedReferenceFactory.createAction[LocalVariableDescriptor]

'declaration' @ [68:41] ==> val declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.UnresolvedReferenceFactory.createAction[LocalVariableDescriptor]

'typeReference' @ [68:53] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'AddSuspendModifierFix' @ [70:20] ==> public constructor AddSuspendModifierFix(element: KtModifierListOwner, name: String?) defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix[ClassConstructorDescriptorImpl]

'variableTypeReference' @ [70:42] ==> val variableTypeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.UnresolvedReferenceFactory.createAction[LocalVariableDescriptor]

'declaration' @ [70:65] ==> val declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.AddSuspendModifierFix.UnresolvedReferenceFactory.createAction[LocalVariableDescriptor]

'name' @ [70:77] ==> public final val KtCallableDeclaration.name: String?[MyPropertyDescriptor]

