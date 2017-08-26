'AssignToVariableResultTransformation' @ [34:5] ==> public constructor AssignToVariableResultTransformation(loop: KtForExpression, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[ClassConstructorDescriptorImpl]

'loop' @ [34:42] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.<init>[ValueParameterDescriptorImpl]

'initialization' @ [34:48] ==> value-parameter initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.<init>[ValueParameterDescriptorImpl]

'generateCall' @ [37:20] ==> protected abstract fun generateCall(chainedCallGenerator: ChainedCallGenerator): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase[SimpleFunctionDescriptorImpl]

'chainedCallGenerator' @ [37:33] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.generateCode[ValueParameterDescriptorImpl]

'if (initialization.initializer.isZeroConstant()) {
            call
        }
        else {
            KtPsiFactory(call).createExpressionByPattern("$0 + $1", initialization.initializer, call)
        }' @ [39:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'initialization' @ [39:20] ==> protected final val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase[PropertyDescriptorImpl]

'initializer' @ [39:35] ==> public final val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'isZeroConstant' @ [39:47] ==> public fun KtExpression.isZeroConstant(): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'call' @ [40:13] ==> val call: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.generateCode[LocalVariableDescriptor]

'KtPsiFactory' @ [43:13] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'call' @ [43:26] ==> val call: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.generateCode[LocalVariableDescriptor]

'createExpressionByPattern' @ [43:32] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'initialization' @ [43:69] ==> protected final val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase[PropertyDescriptorImpl]

'initializer' @ [43:84] ==> public final val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'call' @ [43:97] ==> val call: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.generateCode[LocalVariableDescriptor]

'state' @ [62:29] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[ValueParameterDescriptorImpl]

'statements' @ [62:35] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'singleOrNull' @ [62:46] ==> public fun <T> List<KtExpression>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'statement' @ [63:17] ==> val statement: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'operationToken' @ [63:27] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'PLUSEQ' @ [63:54] ==> public final val PLUSEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'statement' @ [65:42] ==> val statement: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'left' @ [65:52] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'findVariableInitializationBeforeLoop' @ [65:57] ==> public fun KtExpression?.findVariableInitializationBeforeLoop(loop: KtForExpression, checkNoOtherUsagesInLoop: Boolean): VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'state' @ [65:94] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[ValueParameterDescriptorImpl]

'outerLoop' @ [65:100] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'statement' @ [68:25] ==> val statement: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'right' @ [68:35] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'value' @ [70:29] ==> val value: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'typeWithSmartCast' @ [70:35] ==> private final fun KtExpression.typeWithSmartCast(): KotlinType? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher[SimpleFunctionDescriptorImpl]

'toSupportedType' @ [70:56] ==> private final fun KotlinType.toSupportedType(): SumTransformationBase.Matcher.SupportedType? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher[SimpleFunctionDescriptorImpl]

'?:' @ [71:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: SumTransformationBase.Matcher.SupportedType?, right: SumTransformationBase.Matcher.SupportedType): SumTransformationBase.Matcher.SupportedType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> SupportedType

'variableInitialization' @ [71:28] ==> val variableInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'variable' @ [71:51] ==> public final val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'resolveToDescriptorIfAny' @ [71:60] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'type' @ [71:112] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'toSupportedType' @ [71:118] ==> private final fun KotlinType.toSupportedType(): SumTransformationBase.Matcher.SupportedType? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher[SimpleFunctionDescriptorImpl]

'when (sumType) {
                SupportedType.INT -> {
                    val needConversion = when (valueType) {
                        SupportedType.INT -> false

                        SupportedType.BYTE, SupportedType.SHORT -> {
                            // we don't need conversion to Int to use "sum" function but need it for "sumBy"
                            !value.isVariableReference(state.inputVariable) && state.indexVariable == null
                        }

                        else -> true
                    }
                    if (needConversion) "toInt" else null
                }

                SupportedType.LONG -> if (valueType != SupportedType.LONG) "toLong" else null

                SupportedType.FLOAT -> if (valueType != SupportedType.FLOAT) "toFloat" else null

                SupportedType.DOUBLE -> if (valueType != SupportedType.DOUBLE) "toDouble" else null

                SupportedType.BYTE, SupportedType.SHORT -> return null // cannot use sum or sumBy to get Byte or Short result
            }' @ [73:42] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?, entry3: String?, entry4: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'sumType' @ [73:48] ==> val sumType: SumTransformationBase.Matcher.SupportedType defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'INT' @ [74:31] ==> enum entry INT defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'when (valueType) {
                        SupportedType.INT -> false

                        SupportedType.BYTE, SupportedType.SHORT -> {
                            // we don't need conversion to Int to use "sum" function but need it for "sumBy"
                            !value.isVariableReference(state.inputVariable) && state.indexVariable == null
                        }

                        else -> true
                    }' @ [75:42] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'valueType' @ [75:48] ==> val valueType: SumTransformationBase.Matcher.SupportedType defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'INT' @ [76:39] ==> enum entry INT defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'BYTE' @ [78:39] ==> enum entry BYTE defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'SHORT' @ [78:59] ==> enum entry SHORT defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'!' @ [80:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'value' @ [80:30] ==> val value: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'isVariableReference' @ [80:36] ==> public fun KtExpression?.isVariableReference(variable: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'state' @ [80:56] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[ValueParameterDescriptorImpl]

'inputVariable' @ [80:62] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [80:80] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[ValueParameterDescriptorImpl]

'indexVariable' @ [80:86] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'if (needConversion) "toInt" else null' @ [85:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'needConversion' @ [85:25] ==> val needConversion: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'LONG' @ [88:31] ==> enum entry LONG defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'if (valueType != SupportedType.LONG) "toLong" else null' @ [88:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'valueType' @ [88:43] ==> val valueType: SumTransformationBase.Matcher.SupportedType defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'LONG' @ [88:70] ==> enum entry LONG defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'FLOAT' @ [90:31] ==> enum entry FLOAT defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'if (valueType != SupportedType.FLOAT) "toFloat" else null' @ [90:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'valueType' @ [90:44] ==> val valueType: SumTransformationBase.Matcher.SupportedType defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'FLOAT' @ [90:71] ==> enum entry FLOAT defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'DOUBLE' @ [92:31] ==> enum entry DOUBLE defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'if (valueType != SupportedType.DOUBLE) "toDouble" else null' @ [92:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'valueType' @ [92:45] ==> val valueType: SumTransformationBase.Matcher.SupportedType defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'DOUBLE' @ [92:72] ==> enum entry DOUBLE defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'BYTE' @ [94:31] ==> enum entry BYTE defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'SHORT' @ [94:51] ==> enum entry SHORT defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'if (conversionFunctionName != null)
                KtPsiFactory(value).createExpressionByPattern("$0.$conversionFunctionName()", value)
            else
                value' @ [97:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'conversionFunctionName' @ [97:36] ==> val conversionFunctionName: String? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'KtPsiFactory' @ [98:17] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'value' @ [98:30] ==> val value: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'createExpressionByPattern' @ [98:37] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'conversionFunctionName' @ [98:68] ==> val conversionFunctionName: String? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'value' @ [98:95] ==> val value: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'value' @ [100:17] ==> val value: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'byExpression' @ [102:17] ==> val byExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'isVariableReference' @ [102:30] ==> public fun KtExpression?.isVariableReference(variable: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'state' @ [102:50] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[ValueParameterDescriptorImpl]

'inputVariable' @ [102:56] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'SumTransformation' @ [103:38] ==> public constructor SumTransformation(loop: KtForExpression, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformation[ClassConstructorDescriptorImpl]

'state' @ [103:56] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[ValueParameterDescriptorImpl]

'outerLoop' @ [103:62] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'variableInitialization' @ [103:73] ==> val variableInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'Result' @ [104:44] ==> public constructor Result(resultTransformation: ResultTransformation, vararg sequenceTransformations: SequenceTransformation) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'transformation' @ [104:51] ==> val transformation: SumTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'state' @ [107:17] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[ValueParameterDescriptorImpl]

'indexVariable' @ [107:23] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'MapTransformation' @ [108:41] ==> public constructor MapTransformation(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, mapping: KtExpression, mapNotNull: Boolean) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[ClassConstructorDescriptorImpl]

'state' @ [108:59] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[ValueParameterDescriptorImpl]

'outerLoop' @ [108:65] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [108:76] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[ValueParameterDescriptorImpl]

'inputVariable' @ [108:82] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [108:97] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[ValueParameterDescriptorImpl]

'indexVariable' @ [108:103] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'byExpression' @ [108:118] ==> val byExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'SumTransformation' @ [109:41] ==> public constructor SumTransformation(loop: KtForExpression, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformation[ClassConstructorDescriptorImpl]

'state' @ [109:59] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[ValueParameterDescriptorImpl]

'outerLoop' @ [109:65] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'variableInitialization' @ [109:76] ==> val variableInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'Result' @ [110:44] ==> public constructor Result(resultTransformation: ResultTransformation, vararg sequenceTransformations: SequenceTransformation) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'sumTransformation' @ [110:51] ==> val sumTransformation: SumTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'mapTransformation' @ [110:70] ==> val mapTransformation: MapTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'when (sumType) {
                SupportedType.INT -> "sumBy"

                SupportedType.DOUBLE -> "sumByDouble"

                else -> {
                    val mapTransformation = MapTransformation(state.outerLoop, state.inputVariable, null, byExpression, mapNotNull = false)
                    val sumTransformation = SumTransformation(state.outerLoop, variableInitialization)
                    return TransformationMatch.Result(sumTransformation, mapTransformation)
                }
            }' @ [113:37] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'sumType' @ [113:43] ==> val sumType: SumTransformationBase.Matcher.SupportedType defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'INT' @ [114:31] ==> enum entry INT defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'DOUBLE' @ [116:31] ==> enum entry DOUBLE defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'MapTransformation' @ [119:45] ==> public constructor MapTransformation(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, mapping: KtExpression, mapNotNull: Boolean) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[ClassConstructorDescriptorImpl]

'state' @ [119:63] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[ValueParameterDescriptorImpl]

'outerLoop' @ [119:69] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [119:80] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[ValueParameterDescriptorImpl]

'inputVariable' @ [119:86] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'byExpression' @ [119:107] ==> val byExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'SumTransformation' @ [120:45] ==> public constructor SumTransformation(loop: KtForExpression, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformation[ClassConstructorDescriptorImpl]

'state' @ [120:63] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[ValueParameterDescriptorImpl]

'outerLoop' @ [120:69] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'variableInitialization' @ [120:80] ==> val variableInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'Result' @ [121:48] ==> public constructor Result(resultTransformation: ResultTransformation, vararg sequenceTransformations: SequenceTransformation) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'sumTransformation' @ [121:55] ==> val sumTransformation: SumTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'mapTransformation' @ [121:74] ==> val mapTransformation: MapTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'SumByTransformation' @ [125:34] ==> public constructor SumByTransformation(loop: KtForExpression, initialization: VariableInitialization, inputVariable: KtCallableDeclaration, byExpression: KtExpression, functionName: String) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumByTransformation[ClassConstructorDescriptorImpl]

'state' @ [125:54] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[ValueParameterDescriptorImpl]

'outerLoop' @ [125:60] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'variableInitialization' @ [125:71] ==> val variableInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'state' @ [125:95] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[ValueParameterDescriptorImpl]

'inputVariable' @ [125:101] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'byExpression' @ [125:116] ==> val byExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'sumByFunctionName' @ [125:130] ==> val sumByFunctionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'Result' @ [126:40] ==> public constructor Result(resultTransformation: ResultTransformation, vararg sequenceTransformations: SequenceTransformation) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'transformation' @ [126:47] ==> val transformation: SumByTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.match[LocalVariableDescriptor]

'when {
                KotlinBuiltIns.isInt(this) -> SupportedType.INT
                KotlinBuiltIns.isLong(this) -> SupportedType.LONG
                KotlinBuiltIns.isShort(this) -> SupportedType.SHORT
                KotlinBuiltIns.isByte(this) -> SupportedType.BYTE
                KotlinBuiltIns.isDouble(this) -> SupportedType.DOUBLE
                KotlinBuiltIns.isFloat(this) -> SupportedType.FLOAT
                else -> null
            }' @ [134:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SumTransformationBase.Matcher.SupportedType?, entry1: SumTransformationBase.Matcher.SupportedType?, entry2: SumTransformationBase.Matcher.SupportedType?, entry3: SumTransformationBase.Matcher.SupportedType?, entry4: SumTransformationBase.Matcher.SupportedType?, entry5: SumTransformationBase.Matcher.SupportedType?, entry6: SumTransformationBase.Matcher.SupportedType?): SumTransformationBase.Matcher.SupportedType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SupportedType?

'isInt' @ [135:32] ==> public open fun isInt(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [135:38] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.toSupportedType[ReceiverParameterDescriptorImpl]

'INT' @ [135:61] ==> enum entry INT defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'isLong' @ [136:32] ==> public open fun isLong(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [136:39] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.toSupportedType[ReceiverParameterDescriptorImpl]

'LONG' @ [136:62] ==> enum entry LONG defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'isShort' @ [137:32] ==> public open fun isShort(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [137:40] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.toSupportedType[ReceiverParameterDescriptorImpl]

'SHORT' @ [137:63] ==> enum entry SHORT defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'isByte' @ [138:32] ==> public open fun isByte(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [138:39] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.toSupportedType[ReceiverParameterDescriptorImpl]

'BYTE' @ [138:62] ==> enum entry BYTE defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'isDouble' @ [139:32] ==> public open fun isDouble(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [139:41] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.toSupportedType[ReceiverParameterDescriptorImpl]

'DOUBLE' @ [139:64] ==> enum entry DOUBLE defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'isFloat' @ [140:32] ==> public open fun isFloat(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [140:40] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.toSupportedType[ReceiverParameterDescriptorImpl]

'FLOAT' @ [140:63] ==> enum entry FLOAT defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.SupportedType[FakeCallableDescriptorForObject]

'analyze' @ [146:34] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [146:58] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'bindingContext' @ [147:20] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.typeWithSmartCast[LocalVariableDescriptor]

'SMARTCAST' @ [147:50] ==> public final val SMARTCAST: (WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>..WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [147:61] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.typeWithSmartCast[ReceiverParameterDescriptorImpl]

'defaultType' @ [147:68] ==> public abstract val defaultType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.ExplicitSmartCasts[DeserializedPropertyDescriptor]

'bindingContext' @ [148:23] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.typeWithSmartCast[LocalVariableDescriptor]

'getType' @ [148:38] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'this' @ [148:46] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase.Matcher.typeWithSmartCast[ReceiverParameterDescriptorImpl]

'SumTransformationBase' @ [153:90] ==> public constructor SumTransformationBase(loop: KtForExpression, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase[ClassConstructorDescriptorImpl]

'loop' @ [153:112] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformation.<init>[ValueParameterDescriptorImpl]

'initialization' @ [153:118] ==> value-parameter initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformation.<init>[ValueParameterDescriptorImpl]

'chainedCallGenerator' @ [158:16] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformation.generateCall[ValueParameterDescriptorImpl]

'generate' @ [158:37] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'SumTransformationBase' @ [168:5] ==> public constructor SumTransformationBase(loop: KtForExpression, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase[ClassConstructorDescriptorImpl]

'loop' @ [168:27] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumByTransformation.<init>[ValueParameterDescriptorImpl]

'initialization' @ [168:33] ==> value-parameter initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumByTransformation.<init>[ValueParameterDescriptorImpl]

'functionName' @ [171:19] ==> private final val functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumByTransformation[PropertyDescriptorImpl]

'generateLambda' @ [174:22] ==> public fun generateLambda(inputVariable: KtCallableDeclaration, expression: KtExpression): KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'inputVariable' @ [174:37] ==> private final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumByTransformation[PropertyDescriptorImpl]

'byExpression' @ [174:52] ==> private final val byExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumByTransformation[PropertyDescriptorImpl]

'chainedCallGenerator' @ [175:16] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumByTransformation.generateCall[ValueParameterDescriptorImpl]

'generate' @ [175:37] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'functionName' @ [175:48] ==> private final val functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumByTransformation[PropertyDescriptorImpl]

'lambda' @ [175:71] ==> val lambda: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumByTransformation.generateCall[LocalVariableDescriptor]

