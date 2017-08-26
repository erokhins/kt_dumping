'AfterAnalysisHighlightingVisitor' @ [36:9] ==> protected constructor AfterAnalysisHighlightingVisitor(holder: AnnotationHolder, bindingContext: BindingContext) defined in org.jetbrains.kotlin.idea.highlighter.AfterAnalysisHighlightingVisitor[ClassConstructorDescriptorImpl]

'holder' @ [36:42] ==> value-parameter holder: AnnotationHolder defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.<init>[ValueParameterDescriptorImpl]

'bindingContext' @ [36:50] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.<init>[ValueParameterDescriptorImpl]

'function' @ [39:9] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitNamedFunction[ValueParameterDescriptorImpl]

'nameIdentifier' @ [39:18] ==> public final val KtNamedFunction.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'let' @ [39:34] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Unit

'highlightName' @ [39:40] ==> protected final fun highlightName(element: PsiElement, attributesKey: TextAttributesKey, message: String?): Unit defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor[SimpleFunctionDescriptorImpl]

'it' @ [39:54] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitNamedFunction.<anonymous>[ValueParameterDescriptorImpl]

'FUNCTION_DECLARATION' @ [39:58] ==> public final val FUNCTION_DECLARATION: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'super' @ [41:9] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor[LazyClassReceiverParameterDescriptor]

'visitNamedFunction' @ [41:15] ==> public open fun visitNamedFunction(@NotNull p0: KtNamedFunction): Unit defined in org.jetbrains.kotlin.idea.highlighter.AfterAnalysisHighlightingVisitor[JavaMethodDescriptor]

'function' @ [41:34] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitNamedFunction[ValueParameterDescriptorImpl]

'call' @ [45:32] ==> value-parameter call: KtSuperTypeCallEntry defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitSuperTypeCallEntry[ValueParameterDescriptorImpl]

'calleeExpression' @ [45:37] ==> public final val KtSuperTypeCallEntry.calleeExpression: KtConstructorCalleeExpression[MyPropertyDescriptor]

'calleeExpression' @ [46:27] ==> val calleeExpression: KtConstructorCalleeExpression defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitSuperTypeCallEntry[LocalVariableDescriptor]

'typeReference' @ [46:44] ==> public final val KtConstructorCalleeExpression.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeElement' @ [46:59] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'typeElement' @ [47:13] ==> val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitSuperTypeCallEntry[LocalVariableDescriptor]

'typeElement' @ [48:13] ==> val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitSuperTypeCallEntry[LocalVariableDescriptor]

'referenceExpression' @ [48:25] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'let' @ [48:46] ==> @InlineOnly public inline fun <T, R> KtSimpleNameExpression.let(block: (KtSimpleNameExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression
    <R> -> Unit

'highlightName' @ [48:52] ==> protected final fun highlightName(element: PsiElement, attributesKey: TextAttributesKey, message: String?): Unit defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor[SimpleFunctionDescriptorImpl]

'it' @ [48:66] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitSuperTypeCallEntry.<anonymous>[ValueParameterDescriptorImpl]

'CONSTRUCTOR_CALL' @ [48:70] ==> public final val CONSTRUCTOR_CALL: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'super' @ [50:9] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor[LazyClassReceiverParameterDescriptor]

'visitSuperTypeCallEntry' @ [50:15] ==> public open fun visitSuperTypeCallEntry(@NotNull p0: KtSuperTypeCallEntry): Unit defined in org.jetbrains.kotlin.idea.highlighter.AfterAnalysisHighlightingVisitor[JavaMethodDescriptor]

'call' @ [50:39] ==> value-parameter call: KtSuperTypeCallEntry defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitSuperTypeCallEntry[ValueParameterDescriptorImpl]

'expression' @ [54:13] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitBinaryExpression[ValueParameterDescriptorImpl]

'operationReference' @ [54:24] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'getIdentifier' @ [54:43] ==> public open fun getIdentifier(): PsiElement? defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[DeserializedSimpleFunctionDescriptor]

'expression' @ [55:32] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitBinaryExpression[ValueParameterDescriptorImpl]

'getResolvedCall' @ [55:43] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [55:59] ==> protected final var bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor[PropertyDescriptorImpl]

'resolvedCall' @ [56:17] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitBinaryExpression[LocalVariableDescriptor]

'highlightCall' @ [57:17] ==> private final fun highlightCall(callee: PsiElement, resolvedCall: ResolvedCall<out CallableDescriptor>): Unit defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [57:31] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitBinaryExpression[ValueParameterDescriptorImpl]

'operationReference' @ [57:42] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'resolvedCall' @ [57:62] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitBinaryExpression[LocalVariableDescriptor]

'super' @ [60:9] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor[LazyClassReceiverParameterDescriptor]

'visitBinaryExpression' @ [60:15] ==> public open fun visitBinaryExpression(@NotNull p0: KtBinaryExpression): Unit defined in org.jetbrains.kotlin.idea.highlighter.AfterAnalysisHighlightingVisitor[JavaMethodDescriptor]

'expression' @ [60:37] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitBinaryExpression[ValueParameterDescriptorImpl]

'expression' @ [64:22] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitCallExpression[ValueParameterDescriptorImpl]

'calleeExpression' @ [64:33] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'expression' @ [65:28] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitCallExpression[ValueParameterDescriptorImpl]

'getResolvedCall' @ [65:39] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [65:55] ==> protected final var bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor[PropertyDescriptorImpl]

'callee' @ [66:13] ==> val callee: KtExpression? defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitCallExpression[LocalVariableDescriptor]

'callee' @ [66:48] ==> val callee: KtExpression? defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitCallExpression[LocalVariableDescriptor]

'resolvedCall' @ [66:79] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitCallExpression[LocalVariableDescriptor]

'highlightCall' @ [67:13] ==> private final fun highlightCall(callee: PsiElement, resolvedCall: ResolvedCall<out CallableDescriptor>): Unit defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor[SimpleFunctionDescriptorImpl]

'callee' @ [67:27] ==> val callee: KtExpression? defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitCallExpression[LocalVariableDescriptor]

'resolvedCall' @ [67:35] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitCallExpression[LocalVariableDescriptor]

'super' @ [70:9] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor[LazyClassReceiverParameterDescriptor]

'visitCallExpression' @ [70:15] ==> public open fun visitCallExpression(@NotNull p0: KtCallExpression): Unit defined in org.jetbrains.kotlin.idea.highlighter.AfterAnalysisHighlightingVisitor[JavaMethodDescriptor]

'expression' @ [70:35] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.visitCallExpression[ValueParameterDescriptorImpl]

'resolvedCall' @ [74:32] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.highlightCall[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [74:45] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'if (calleeDescriptor.isDynamic()) {
            highlightName(callee, DYNAMIC_FUNCTION_CALL)
        }
        else if (resolvedCall is VariableAsFunctionResolvedCall) {
            val container = calleeDescriptor.containingDeclaration
            val containedInFunctionClassOrSubclass = container is ClassDescriptor && container.defaultType.isFunctionTypeOrSubtype
            highlightName(callee, if (containedInFunctionClassOrSubclass)
                VARIABLE_AS_FUNCTION_CALL
            else
                VARIABLE_AS_FUNCTION_LIKE_CALL)
        }
        else {
            if (calleeDescriptor is ConstructorDescriptor) {
                highlightName(callee, CONSTRUCTOR_CALL)
            }
            else if (calleeDescriptor is FunctionDescriptor) {
                val attributesKey = when {
                    calleeDescriptor.extensionReceiverParameter != null ->
                        EXTENSION_FUNCTION_CALL

                    DescriptorUtils.isTopLevelDeclaration(calleeDescriptor) ->
                        PACKAGE_FUNCTION_CALL

                    else ->
                        FUNCTION_CALL
                }

                highlightName(callee, attributesKey)
            }
        }' @ [76:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'calleeDescriptor' @ [76:13] ==> val calleeDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.highlightCall[LocalVariableDescriptor]

'isDynamic' @ [76:30] ==> public fun DeclarationDescriptor.isDynamic(): Boolean defined in org.jetbrains.kotlin.resolve.calls.tasks[DeserializedSimpleFunctionDescriptor]

'highlightName' @ [77:13] ==> protected final fun highlightName(element: PsiElement, attributesKey: TextAttributesKey, message: String?): Unit defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor[SimpleFunctionDescriptorImpl]

'callee' @ [77:27] ==> value-parameter callee: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.highlightCall[ValueParameterDescriptorImpl]

'DYNAMIC_FUNCTION_CALL' @ [77:35] ==> public final val DYNAMIC_FUNCTION_CALL: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'if (resolvedCall is VariableAsFunctionResolvedCall) {
            val container = calleeDescriptor.containingDeclaration
            val containedInFunctionClassOrSubclass = container is ClassDescriptor && container.defaultType.isFunctionTypeOrSubtype
            highlightName(callee, if (containedInFunctionClassOrSubclass)
                VARIABLE_AS_FUNCTION_CALL
            else
                VARIABLE_AS_FUNCTION_LIKE_CALL)
        }
        else {
            if (calleeDescriptor is ConstructorDescriptor) {
                highlightName(callee, CONSTRUCTOR_CALL)
            }
            else if (calleeDescriptor is FunctionDescriptor) {
                val attributesKey = when {
                    calleeDescriptor.extensionReceiverParameter != null ->
                        EXTENSION_FUNCTION_CALL

                    DescriptorUtils.isTopLevelDeclaration(calleeDescriptor) ->
                        PACKAGE_FUNCTION_CALL

                    else ->
                        FUNCTION_CALL
                }

                highlightName(callee, attributesKey)
            }
        }' @ [79:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'resolvedCall' @ [79:18] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.highlightCall[ValueParameterDescriptorImpl]

'calleeDescriptor' @ [80:29] ==> val calleeDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.highlightCall[LocalVariableDescriptor]

'containingDeclaration' @ [80:46] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'container' @ [81:54] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.highlightCall[LocalVariableDescriptor]

'container' @ [81:86] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.highlightCall[LocalVariableDescriptor]

'defaultType' @ [81:96] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'isFunctionTypeOrSubtype' @ [81:108] ==> public val KotlinType.isFunctionTypeOrSubtype: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'highlightName' @ [82:13] ==> protected final fun highlightName(element: PsiElement, attributesKey: TextAttributesKey, message: String?): Unit defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor[SimpleFunctionDescriptorImpl]

'callee' @ [82:27] ==> value-parameter callee: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.highlightCall[ValueParameterDescriptorImpl]

'if (containedInFunctionClassOrSubclass)
                VARIABLE_AS_FUNCTION_CALL
            else
                VARIABLE_AS_FUNCTION_LIKE_CALL' @ [82:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (TextAttributesKey..TextAttributesKey?), elseBranch: (TextAttributesKey..TextAttributesKey?)): (TextAttributesKey..TextAttributesKey?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.openapi.editor.colors.TextAttributesKey..com.intellij.openapi.editor.colors.TextAttributesKey?)

'containedInFunctionClassOrSubclass' @ [82:39] ==> val containedInFunctionClassOrSubclass: Boolean defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.highlightCall[LocalVariableDescriptor]

'VARIABLE_AS_FUNCTION_CALL' @ [83:17] ==> public final val VARIABLE_AS_FUNCTION_CALL: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'VARIABLE_AS_FUNCTION_LIKE_CALL' @ [85:17] ==> public final val VARIABLE_AS_FUNCTION_LIKE_CALL: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'if (calleeDescriptor is ConstructorDescriptor) {
                highlightName(callee, CONSTRUCTOR_CALL)
            }
            else if (calleeDescriptor is FunctionDescriptor) {
                val attributesKey = when {
                    calleeDescriptor.extensionReceiverParameter != null ->
                        EXTENSION_FUNCTION_CALL

                    DescriptorUtils.isTopLevelDeclaration(calleeDescriptor) ->
                        PACKAGE_FUNCTION_CALL

                    else ->
                        FUNCTION_CALL
                }

                highlightName(callee, attributesKey)
            }' @ [88:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'calleeDescriptor' @ [88:17] ==> val calleeDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.highlightCall[LocalVariableDescriptor]

'highlightName' @ [89:17] ==> protected final fun highlightName(element: PsiElement, attributesKey: TextAttributesKey, message: String?): Unit defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor[SimpleFunctionDescriptorImpl]

'callee' @ [89:31] ==> value-parameter callee: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.highlightCall[ValueParameterDescriptorImpl]

'CONSTRUCTOR_CALL' @ [89:39] ==> public final val CONSTRUCTOR_CALL: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'calleeDescriptor' @ [91:22] ==> val calleeDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.highlightCall[LocalVariableDescriptor]

'when {
                    calleeDescriptor.extensionReceiverParameter != null ->
                        EXTENSION_FUNCTION_CALL

                    DescriptorUtils.isTopLevelDeclaration(calleeDescriptor) ->
                        PACKAGE_FUNCTION_CALL

                    else ->
                        FUNCTION_CALL
                }' @ [92:37] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (TextAttributesKey..TextAttributesKey?), entry1: (TextAttributesKey..TextAttributesKey?), entry2: (TextAttributesKey..TextAttributesKey?)): (TextAttributesKey..TextAttributesKey?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (com.intellij.openapi.editor.colors.TextAttributesKey..com.intellij.openapi.editor.colors.TextAttributesKey?)

'calleeDescriptor' @ [93:21] ==> val calleeDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.highlightCall[LocalVariableDescriptor]

'extensionReceiverParameter' @ [93:38] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'EXTENSION_FUNCTION_CALL' @ [94:25] ==> public final val EXTENSION_FUNCTION_CALL: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'isTopLevelDeclaration' @ [96:37] ==> public open fun isTopLevelDeclaration(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'calleeDescriptor' @ [96:59] ==> val calleeDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.highlightCall[LocalVariableDescriptor]

'PACKAGE_FUNCTION_CALL' @ [97:25] ==> public final val PACKAGE_FUNCTION_CALL: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'FUNCTION_CALL' @ [100:25] ==> public final val FUNCTION_CALL: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'highlightName' @ [103:17] ==> protected final fun highlightName(element: PsiElement, attributesKey: TextAttributesKey, message: String?): Unit defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor[SimpleFunctionDescriptorImpl]

'callee' @ [103:31] ==> value-parameter callee: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.highlightCall[ValueParameterDescriptorImpl]

'attributesKey' @ [103:39] ==> val attributesKey: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor.highlightCall[LocalVariableDescriptor]

