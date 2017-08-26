'AbstractKotlinInspection' @ [30:41] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'KtVisitorVoid' @ [32:22] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [34:21] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitProperty' @ [34:27] ==> public open fun visitProperty(@NotNull p0: KtProperty): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'property' @ [34:41] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'!' @ [36:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'property' @ [36:26] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'isLocal' @ [36:35] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'property' @ [37:41] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'typeReference' @ [37:50] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'property' @ [38:39] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'initializer' @ [38:48] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'property' @ [40:32] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'analyze' @ [40:41] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [40:65] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'TYPE' @ [40:89] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeReference' @ [40:95] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'when (initializer) {
                        is KtConstantExpression -> {
                            when (initializer.node.elementType) {
                                KtNodeTypes.BOOLEAN_CONSTANT -> {
                                    if (!KotlinBuiltIns.isBoolean(type)) return
                                }
                                KtNodeTypes.INTEGER_CONSTANT -> {
                                    if (initializer.text.endsWith("L")) {
                                        if (!KotlinBuiltIns.isLong(type)) return
                                    }
                                    else {
                                        if (!KotlinBuiltIns.isInt(type)) return
                                    }
                                }
                                KtNodeTypes.FLOAT_CONSTANT -> {
                                    if (initializer.text.endsWith("f") || initializer.text.endsWith("F")) {
                                        if (!KotlinBuiltIns.isFloat(type)) return
                                    }
                                    else {
                                        if (!KotlinBuiltIns.isDouble(type)) return
                                    }
                                }
                                KtNodeTypes.CHARACTER_CONSTANT -> {
                                    if (!KotlinBuiltIns.isChar(type)) return
                                }
                                else -> return
                            }
                        }
                        is KtStringTemplateExpression -> {
                            if (!KotlinBuiltIns.isString(type)) return
                        }
                        is KtNameReferenceExpression -> {
                            if (typeReference.text != initializer.getReferencedName()) return
                        }
                        is KtCallExpression -> {
                            if (typeReference.text != initializer.calleeExpression?.text) return
                        }
                        else -> return
                    }' @ [41:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'initializer' @ [41:27] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'when (initializer.node.elementType) {
                                KtNodeTypes.BOOLEAN_CONSTANT -> {
                                    if (!KotlinBuiltIns.isBoolean(type)) return
                                }
                                KtNodeTypes.INTEGER_CONSTANT -> {
                                    if (initializer.text.endsWith("L")) {
                                        if (!KotlinBuiltIns.isLong(type)) return
                                    }
                                    else {
                                        if (!KotlinBuiltIns.isInt(type)) return
                                    }
                                }
                                KtNodeTypes.FLOAT_CONSTANT -> {
                                    if (initializer.text.endsWith("f") || initializer.text.endsWith("F")) {
                                        if (!KotlinBuiltIns.isFloat(type)) return
                                    }
                                    else {
                                        if (!KotlinBuiltIns.isDouble(type)) return
                                    }
                                }
                                KtNodeTypes.CHARACTER_CONSTANT -> {
                                    if (!KotlinBuiltIns.isChar(type)) return
                                }
                                else -> return
                            }' @ [43:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'initializer' @ [43:35] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'node' @ [43:47] ==> public final val KtConstantExpression.node: ASTNode[MyPropertyDescriptor]

'elementType' @ [43:52] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'BOOLEAN_CONSTANT' @ [44:45] ==> public final val BOOLEAN_CONSTANT: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'!' @ [45:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isBoolean' @ [45:57] ==> public open fun isBoolean(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [45:67] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'INTEGER_CONSTANT' @ [47:45] ==> public final val INTEGER_CONSTANT: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'if (initializer.text.endsWith("L")) {
                                        if (!KotlinBuiltIns.isLong(type)) return
                                    }
                                    else {
                                        if (!KotlinBuiltIns.isInt(type)) return
                                    }' @ [48:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'initializer' @ [48:41] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'text' @ [48:53] ==> public final val KtConstantExpression.text: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [48:58] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [49:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLong' @ [49:61] ==> public open fun isLong(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [49:68] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'!' @ [52:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInt' @ [52:61] ==> public open fun isInt(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [52:67] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'FLOAT_CONSTANT' @ [55:45] ==> public final val FLOAT_CONSTANT: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'if (initializer.text.endsWith("f") || initializer.text.endsWith("F")) {
                                        if (!KotlinBuiltIns.isFloat(type)) return
                                    }
                                    else {
                                        if (!KotlinBuiltIns.isDouble(type)) return
                                    }' @ [56:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'initializer' @ [56:41] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'text' @ [56:53] ==> public final val KtConstantExpression.text: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [56:58] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'initializer' @ [56:75] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'text' @ [56:87] ==> public final val KtConstantExpression.text: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [56:92] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [57:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isFloat' @ [57:61] ==> public open fun isFloat(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [57:69] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'!' @ [60:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isDouble' @ [60:61] ==> public open fun isDouble(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [60:70] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'CHARACTER_CONSTANT' @ [63:45] ==> public final val CHARACTER_CONSTANT: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'!' @ [64:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isChar' @ [64:57] ==> public open fun isChar(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [64:64] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'!' @ [70:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isString' @ [70:49] ==> public open fun isString(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [70:58] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'typeReference' @ [73:33] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'text' @ [73:47] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'initializer' @ [73:55] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'getReferencedName' @ [73:67] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'typeReference' @ [76:33] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'text' @ [76:47] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'initializer' @ [76:55] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'calleeExpression' @ [76:67] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'text' @ [76:85] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'holder' @ [81:21] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [81:28] ==> public open fun registerProblem(@NotNull p0: PsiElement, @NotNull @Nls p1: String, @NotNull p2: ProblemHighlightType, @Nullable vararg p3: (LocalQuickFix..LocalQuickFix?)): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'typeReference' @ [82:29] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'LIKE_UNUSED_SYMBOL' @ [84:50] ==> enum entry LIKE_UNUSED_SYMBOL defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'IntentionWrapper' @ [85:29] ==> public constructor IntentionWrapper(@NotNull p0: IntentionAction, @NotNull p1: PsiFile) defined in com.intellij.codeInspection.IntentionWrapper[JavaClassConstructorDescriptor]

'RemoveExplicitTypeIntention' @ [85:46] ==> public constructor RemoveExplicitTypeIntention() defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention[ClassConstructorDescriptorImpl]

'property' @ [85:77] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.RedundantExplicitTypeInspection.buildVisitor.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'containingKtFile' @ [85:86] ==> public final val KtProperty.containingKtFile: KtFile[MyPropertyDescriptor]

