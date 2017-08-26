'JvmStatic' @ [25:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'when (kind) {
            ModuleKind.AMD -> wrapAmd(function, importedModules, program)
            ModuleKind.COMMON_JS -> wrapCommonJs(function, importedModules, program)
            ModuleKind.UMD -> wrapUmd(moduleId, function, importedModules, program)
            ModuleKind.PLAIN -> wrapPlain(moduleId, function, importedModules, program)
        }' @ [29:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<JsStatement>, entry1: List<JsStatement>, entry2: List<JsStatement>, entry3: List<JsStatement>): List<JsStatement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<JsStatement>

'kind' @ [29:22] ==> value-parameter kind: ModuleKind defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapIfNecessary[ValueParameterDescriptorImpl]

'AMD' @ [30:24] ==> enum entry AMD defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'wrapAmd' @ [30:31] ==> private final fun wrapAmd(function: JsExpression, importedModules: List<JsImportedModule>, program: JsProgram): List<JsStatement> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation[SimpleFunctionDescriptorImpl]

'function' @ [30:39] ==> value-parameter function: JsExpression defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapIfNecessary[ValueParameterDescriptorImpl]

'importedModules' @ [30:49] ==> value-parameter importedModules: List<JsImportedModule> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapIfNecessary[ValueParameterDescriptorImpl]

'program' @ [30:66] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapIfNecessary[ValueParameterDescriptorImpl]

'COMMON_JS' @ [31:24] ==> enum entry COMMON_JS defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'wrapCommonJs' @ [31:37] ==> private final fun wrapCommonJs(function: JsExpression, importedModules: List<JsImportedModule>, program: JsProgram): List<JsStatement> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation[SimpleFunctionDescriptorImpl]

'function' @ [31:50] ==> value-parameter function: JsExpression defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapIfNecessary[ValueParameterDescriptorImpl]

'importedModules' @ [31:60] ==> value-parameter importedModules: List<JsImportedModule> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapIfNecessary[ValueParameterDescriptorImpl]

'program' @ [31:77] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapIfNecessary[ValueParameterDescriptorImpl]

'UMD' @ [32:24] ==> enum entry UMD defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'wrapUmd' @ [32:31] ==> private final fun wrapUmd(moduleId: String, function: JsExpression, importedModules: List<JsImportedModule>, program: JsProgram): List<JsStatement> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation[SimpleFunctionDescriptorImpl]

'moduleId' @ [32:39] ==> value-parameter moduleId: String defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapIfNecessary[ValueParameterDescriptorImpl]

'function' @ [32:49] ==> value-parameter function: JsExpression defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapIfNecessary[ValueParameterDescriptorImpl]

'importedModules' @ [32:59] ==> value-parameter importedModules: List<JsImportedModule> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapIfNecessary[ValueParameterDescriptorImpl]

'program' @ [32:76] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapIfNecessary[ValueParameterDescriptorImpl]

'PLAIN' @ [33:24] ==> enum entry PLAIN defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'wrapPlain' @ [33:33] ==> private final fun wrapPlain(moduleId: String, function: JsExpression, importedModules: List<JsImportedModule>, program: JsProgram): List<JsStatement> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation[SimpleFunctionDescriptorImpl]

'moduleId' @ [33:43] ==> value-parameter moduleId: String defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapIfNecessary[ValueParameterDescriptorImpl]

'function' @ [33:53] ==> value-parameter function: JsExpression defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapIfNecessary[ValueParameterDescriptorImpl]

'importedModules' @ [33:63] ==> value-parameter importedModules: List<JsImportedModule> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapIfNecessary[ValueParameterDescriptorImpl]

'program' @ [33:80] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapIfNecessary[ValueParameterDescriptorImpl]

'program' @ [41:21] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[ValueParameterDescriptorImpl]

'scope' @ [41:29] ==> public final val JsProgram.scope: (JsObjectScope..JsObjectScope?)[MyPropertyDescriptor]

'scope' @ [42:26] ==> val scope: (JsObjectScope..JsObjectScope?) defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'declareName' @ [42:32] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsObjectScope[JavaMethodDescriptor]

'scope' @ [43:27] ==> val scope: (JsObjectScope..JsObjectScope?) defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'declareName' @ [43:33] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsObjectScope[JavaMethodDescriptor]

'JsBlock' @ [45:27] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'JsFunction' @ [46:23] ==> public constructor JsFunction(@NotNull p0: JsScope, @NotNull p1: JsBlock, @NotNull p2: String) defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaClassConstructorDescriptor]

'program' @ [46:34] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[ValueParameterDescriptorImpl]

'scope' @ [46:42] ==> public final val JsProgram.scope: (JsObjectScope..JsObjectScope?)[MyPropertyDescriptor]

'adapterBody' @ [46:49] ==> val adapterBody: JsBlock defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'adapter' @ [47:24] ==> val adapter: JsFunction defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'scope' @ [47:32] ==> public final val JsFunction.scope: JsFunctionScope[MyPropertyDescriptor]

'declareName' @ [47:38] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope[JavaMethodDescriptor]

'adapter' @ [48:27] ==> val adapter: JsFunction defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'scope' @ [48:35] ==> public final val JsFunction.scope: JsFunctionScope[MyPropertyDescriptor]

'declareName' @ [48:41] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope[JavaMethodDescriptor]

'adapter' @ [49:9] ==> val adapter: JsFunction defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'parameters' @ [49:17] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'JsParameter' @ [49:31] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'rootName' @ [49:43] ==> val rootName: JsName defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'adapter' @ [50:9] ==> val adapter: JsFunction defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'parameters' @ [50:17] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'JsParameter' @ [50:31] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'factoryName' @ [50:43] ==> val factoryName: JsName defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'and' @ [52:34] ==> @NotNull public open fun and(@NotNull op1: JsExpression, @NotNull op2: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'typeOfIs' @ [52:49] ==> @NotNull public open fun typeOfIs(@NotNull expression: JsExpression, @NotNull string: JsStringLiteral): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'defineName' @ [52:58] ==> val defineName: JsName defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'makeRef' @ [52:69] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'JsStringLiteral' @ [52:80] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'JsNameRef' @ [53:38] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'defineName' @ [53:55] ==> val defineName: JsName defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'makeRef' @ [53:66] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'typeOfIs' @ [54:39] ==> @NotNull public open fun typeOfIs(@NotNull expression: JsExpression, @NotNull string: JsStringLiteral): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'exportsName' @ [54:48] ==> val exportsName: JsName defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'makeRef' @ [54:60] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'JsStringLiteral' @ [54:71] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'JsBlock' @ [56:23] ==> public constructor JsBlock(@NotNull p0: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'wrapAmd' @ [56:31] ==> private final fun wrapAmd(function: JsExpression, importedModules: List<JsImportedModule>, program: JsProgram): List<JsStatement> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation[SimpleFunctionDescriptorImpl]

'factoryName' @ [56:39] ==> val factoryName: JsName defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'makeRef' @ [56:51] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'importedModules' @ [56:62] ==> value-parameter importedModules: List<JsImportedModule> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[ValueParameterDescriptorImpl]

'program' @ [56:79] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[ValueParameterDescriptorImpl]

'JsBlock' @ [57:28] ==> public constructor JsBlock(@NotNull p0: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'wrapCommonJs' @ [57:36] ==> private final fun wrapCommonJs(function: JsExpression, importedModules: List<JsImportedModule>, program: JsProgram): List<JsStatement> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation[SimpleFunctionDescriptorImpl]

'factoryName' @ [57:49] ==> val factoryName: JsName defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'makeRef' @ [57:61] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'importedModules' @ [57:72] ==> value-parameter importedModules: List<JsImportedModule> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[ValueParameterDescriptorImpl]

'program' @ [57:89] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[ValueParameterDescriptorImpl]

'makePlainInvocation' @ [58:31] ==> private final fun makePlainInvocation(moduleId: String, function: JsExpression, importedModules: List<JsImportedModule>, program: JsProgram): JsInvocation defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation[SimpleFunctionDescriptorImpl]

'moduleId' @ [58:51] ==> value-parameter moduleId: String defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[ValueParameterDescriptorImpl]

'factoryName' @ [58:61] ==> val factoryName: JsName defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'makeRef' @ [58:73] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'importedModules' @ [58:84] ==> value-parameter importedModules: List<JsImportedModule> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[ValueParameterDescriptorImpl]

'program' @ [58:101] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[ValueParameterDescriptorImpl]

'if (Namer.requiresEscaping(moduleId)) {
            JsArrayAccess(rootName.makeRef(), JsStringLiteral(moduleId))
        }
        else {
            JsNameRef(scope.declareName(moduleId), rootName.makeRef())
        }' @ [60:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'requiresEscaping' @ [60:43] ==> public open fun requiresEscaping(@NotNull name: String): Boolean defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'moduleId' @ [60:60] ==> value-parameter moduleId: String defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[ValueParameterDescriptorImpl]

'JsArrayAccess' @ [61:13] ==> public constructor JsArrayAccess(p0: (JsExpression..JsExpression?), p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsArrayAccess[JavaClassConstructorDescriptor]

'rootName' @ [61:27] ==> val rootName: JsName defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'makeRef' @ [61:36] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'JsStringLiteral' @ [61:47] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'moduleId' @ [61:63] ==> value-parameter moduleId: String defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[ValueParameterDescriptorImpl]

'JsNameRef' @ [64:13] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'scope' @ [64:23] ==> val scope: (JsObjectScope..JsObjectScope?) defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'declareName' @ [64:29] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsObjectScope[JavaMethodDescriptor]

'moduleId' @ [64:41] ==> value-parameter moduleId: String defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[ValueParameterDescriptorImpl]

'rootName' @ [64:52] ==> val rootName: JsName defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'makeRef' @ [64:61] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'JsBlock' @ [67:26] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'importedModules' @ [68:32] ==> value-parameter importedModules: List<JsImportedModule> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[ValueParameterDescriptorImpl]

'plainBlock' @ [69:13] ==> val plainBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'statements' @ [69:24] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'addModuleValidation' @ [69:38] ==> private final fun addModuleValidation(currentModuleId: String, program: JsProgram, module: JsImportedModule): JsStatement defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation[SimpleFunctionDescriptorImpl]

'moduleId' @ [69:58] ==> value-parameter moduleId: String defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[ValueParameterDescriptorImpl]

'program' @ [69:68] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[ValueParameterDescriptorImpl]

'importedModule' @ [69:77] ==> val importedModule: JsImportedModule defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'plainBlock' @ [71:9] ==> val plainBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'statements' @ [71:20] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'assignment' @ [71:45] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'lhs' @ [71:56] ==> val lhs: JsExpression defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'plainInvocation' @ [71:61] ==> val plainInvocation: JsInvocation defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'makeStmt' @ [71:78] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'newJsIf' @ [73:35] ==> @NotNull public open fun newJsIf(@NotNull ifExpression: JsExpression, @NotNull thenStatement: JsStatement, @Nullable elseStatement: JsStatement?): JsIf defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'amdTest' @ [73:43] ==> val amdTest: JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'amdBody' @ [73:52] ==> val amdBody: JsBlock defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'newJsIf' @ [73:72] ==> @NotNull public open fun newJsIf(@NotNull ifExpression: JsExpression, @NotNull thenStatement: JsStatement, @Nullable elseStatement: JsStatement?): JsIf defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'commonJsTest' @ [73:80] ==> val commonJsTest: JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'commonJsBody' @ [73:94] ==> val commonJsBody: JsBlock defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'plainBlock' @ [73:108] ==> val plainBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'adapterBody' @ [74:9] ==> val adapterBody: JsBlock defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'statements' @ [74:21] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'selector' @ [74:35] ==> val selector: JsIf defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'listOf' @ [76:16] ==> public fun <T> listOf(element: JsStatement): List<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'JsInvocation' @ [76:23] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'adapter' @ [76:36] ==> val adapter: JsFunction defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[LocalVariableDescriptor]

'JsThisRef' @ [76:45] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'function' @ [76:58] ==> value-parameter function: JsExpression defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapUmd[ValueParameterDescriptorImpl]

'makeStmt' @ [76:68] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaMethodDescriptor]

'program' @ [83:21] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapAmd[ValueParameterDescriptorImpl]

'scope' @ [83:29] ==> public final val JsProgram.scope: (JsObjectScope..JsObjectScope?)[MyPropertyDescriptor]

'scope' @ [84:26] ==> val scope: (JsObjectScope..JsObjectScope?) defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapAmd[LocalVariableDescriptor]

'declareName' @ [84:32] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsObjectScope[JavaMethodDescriptor]

'listOf' @ [85:30] ==> public fun <T> listOf(vararg elements: JsExpression): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'JsArrayLiteral' @ [86:17] ==> public constructor JsArrayLiteral(p0: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?)) defined in org.jetbrains.kotlin.js.backend.ast.JsArrayLiteral[JavaClassConstructorDescriptor]

'listOf' @ [86:32] ==> public fun <T> listOf(element: JsStringLiteral): List<JsStringLiteral> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStringLiteral

'JsStringLiteral' @ [86:39] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'importedModules' @ [86:69] ==> value-parameter importedModules: List<JsImportedModule> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapAmd[ValueParameterDescriptorImpl]

'map' @ [86:85] ==> public inline fun <T, R> Iterable<JsImportedModule>.map(transform: (JsImportedModule) -> JsStringLiteral): List<JsStringLiteral> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsImportedModule
    <R> -> JsStringLiteral

'JsStringLiteral' @ [86:91] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'it' @ [86:107] ==> value-parameter it: JsImportedModule defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapAmd.<anonymous>[ValueParameterDescriptorImpl]

'externalName' @ [86:110] ==> public final val externalName: String defined in org.jetbrains.kotlin.js.backend.ast.JsImportedModule[DeserializedPropertyDescriptor]

'function' @ [87:17] ==> value-parameter function: JsExpression defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapAmd[ValueParameterDescriptorImpl]

'JsInvocation' @ [90:26] ==> public constructor JsInvocation(@NotNull p0: JsExpression, @NotNull p1: (MutableList<out (JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'defineName' @ [90:39] ==> val defineName: JsName defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapAmd[LocalVariableDescriptor]

'makeRef' @ [90:50] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'invocationArgs' @ [90:61] ==> val invocationArgs: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapAmd[LocalVariableDescriptor]

'listOf' @ [91:16] ==> public fun <T> listOf(element: JsStatement): List<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'invocation' @ [91:23] ==> val invocation: JsInvocation defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapAmd[LocalVariableDescriptor]

'makeStmt' @ [91:34] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaMethodDescriptor]

'program' @ [99:21] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapCommonJs[ValueParameterDescriptorImpl]

'scope' @ [99:29] ==> public final val JsProgram.scope: (JsObjectScope..JsObjectScope?)[MyPropertyDescriptor]

'scope' @ [100:26] ==> val scope: (JsObjectScope..JsObjectScope?) defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapCommonJs[LocalVariableDescriptor]

'declareName' @ [100:32] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsObjectScope[JavaMethodDescriptor]

'scope' @ [101:27] ==> val scope: (JsObjectScope..JsObjectScope?) defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapCommonJs[LocalVariableDescriptor]

'declareName' @ [101:33] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsObjectScope[JavaMethodDescriptor]

'importedModules' @ [103:30] ==> value-parameter importedModules: List<JsImportedModule> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapCommonJs[ValueParameterDescriptorImpl]

'map' @ [103:46] ==> public inline fun <T, R> Iterable<JsImportedModule>.map(transform: (JsImportedModule) -> JsInvocation): List<JsInvocation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsImportedModule
    <R> -> JsInvocation

'JsInvocation' @ [103:52] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'requireName' @ [103:65] ==> val requireName: JsName defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapCommonJs[LocalVariableDescriptor]

'makeRef' @ [103:77] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'JsStringLiteral' @ [103:88] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'it' @ [103:104] ==> value-parameter it: JsImportedModule defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapCommonJs.<anonymous>[ValueParameterDescriptorImpl]

'externalName' @ [103:107] ==> public final val externalName: String defined in org.jetbrains.kotlin.js.backend.ast.JsImportedModule[DeserializedPropertyDescriptor]

'JsInvocation' @ [104:26] ==> public constructor JsInvocation(@NotNull p0: JsExpression, @NotNull p1: (MutableList<out (JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'function' @ [104:39] ==> value-parameter function: JsExpression defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapCommonJs[ValueParameterDescriptorImpl]

'listOf' @ [104:49] ==> public fun <T> listOf(element: JsNameRef): List<JsNameRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNameRef

'JsNameRef' @ [104:56] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'moduleName' @ [104:77] ==> val moduleName: JsName defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapCommonJs[LocalVariableDescriptor]

'makeRef' @ [104:88] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'invocationArgs' @ [104:102] ==> val invocationArgs: List<JsInvocation> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapCommonJs[LocalVariableDescriptor]

'listOf' @ [105:16] ==> public fun <T> listOf(element: JsStatement): List<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'invocation' @ [105:23] ==> val invocation: JsInvocation defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapCommonJs[LocalVariableDescriptor]

'makeStmt' @ [105:34] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaMethodDescriptor]

'makePlainInvocation' @ [112:26] ==> private final fun makePlainInvocation(moduleId: String, function: JsExpression, importedModules: List<JsImportedModule>, program: JsProgram): JsInvocation defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation[SimpleFunctionDescriptorImpl]

'moduleId' @ [112:46] ==> value-parameter moduleId: String defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapPlain[ValueParameterDescriptorImpl]

'function' @ [112:56] ==> value-parameter function: JsExpression defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapPlain[ValueParameterDescriptorImpl]

'importedModules' @ [112:66] ==> value-parameter importedModules: List<JsImportedModule> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapPlain[ValueParameterDescriptorImpl]

'program' @ [112:83] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapPlain[ValueParameterDescriptorImpl]

'mutableListOf' @ [113:26] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'importedModules' @ [115:32] ==> value-parameter importedModules: List<JsImportedModule> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapPlain[ValueParameterDescriptorImpl]

'statements' @ [116:13] ==> val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapPlain[LocalVariableDescriptor]

'addModuleValidation' @ [116:27] ==> private final fun addModuleValidation(currentModuleId: String, program: JsProgram, module: JsImportedModule): JsStatement defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation[SimpleFunctionDescriptorImpl]

'moduleId' @ [116:47] ==> value-parameter moduleId: String defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapPlain[ValueParameterDescriptorImpl]

'program' @ [116:57] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapPlain[ValueParameterDescriptorImpl]

'importedModule' @ [116:66] ==> val importedModule: JsImportedModule defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapPlain[LocalVariableDescriptor]

'statements' @ [119:9] ==> val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapPlain[LocalVariableDescriptor]

'if (Namer.requiresEscaping(moduleId)) {
            JsAstUtils.assignment(makePlainModuleRef(moduleId, program), invocation).makeStmt()
        }
        else {
            JsAstUtils.newVar(program.rootScope.declareName(moduleId), invocation)
        }' @ [119:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsStatement, elseBranch: JsStatement): JsStatement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsStatement

'requiresEscaping' @ [119:33] ==> public open fun requiresEscaping(@NotNull name: String): Boolean defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'moduleId' @ [119:50] ==> value-parameter moduleId: String defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapPlain[ValueParameterDescriptorImpl]

'assignment' @ [120:24] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'makePlainModuleRef' @ [120:35] ==> private final fun makePlainModuleRef(moduleId: String, program: JsProgram): JsExpression defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation[SimpleFunctionDescriptorImpl]

'moduleId' @ [120:54] ==> value-parameter moduleId: String defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapPlain[ValueParameterDescriptorImpl]

'program' @ [120:64] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapPlain[ValueParameterDescriptorImpl]

'invocation' @ [120:74] ==> val invocation: JsInvocation defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapPlain[LocalVariableDescriptor]

'makeStmt' @ [120:86] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'newVar' @ [123:24] ==> @NotNull public open fun newVar(@NotNull name: JsName, @Nullable expr: JsExpression?): JsVars defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'program' @ [123:31] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapPlain[ValueParameterDescriptorImpl]

'rootScope' @ [123:39] ==> public final val JsProgram.rootScope: (JsRootScope..JsRootScope?)[MyPropertyDescriptor]

'declareName' @ [123:49] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsRootScope[JavaMethodDescriptor]

'moduleId' @ [123:61] ==> value-parameter moduleId: String defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapPlain[ValueParameterDescriptorImpl]

'invocation' @ [123:72] ==> val invocation: JsInvocation defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapPlain[LocalVariableDescriptor]

'statements' @ [126:16] ==> val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.wrapPlain[LocalVariableDescriptor]

'makePlainModuleRef' @ [134:25] ==> private final fun makePlainModuleRef(module: JsImportedModule, program: JsProgram): JsExpression defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation[SimpleFunctionDescriptorImpl]

'module' @ [134:44] ==> value-parameter module: JsImportedModule defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.addModuleValidation[ValueParameterDescriptorImpl]

'program' @ [134:52] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.addModuleValidation[ValueParameterDescriptorImpl]

'typeOfIs' @ [135:43] ==> @NotNull public open fun typeOfIs(@NotNull expression: JsExpression, @NotNull string: JsStringLiteral): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'moduleRef' @ [135:52] ==> val moduleRef: JsExpression defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.addModuleValidation[LocalVariableDescriptor]

'JsStringLiteral' @ [135:63] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'JsStringLiteral' @ [136:37] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'+' @ [137:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'currentModuleId' @ [137:44] ==> value-parameter currentModuleId: String defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.addModuleValidation[ValueParameterDescriptorImpl]

'module' @ [137:86] ==> value-parameter module: JsImportedModule defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.addModuleValidation[ValueParameterDescriptorImpl]

'externalName' @ [137:93] ==> public final val externalName: String defined in org.jetbrains.kotlin.js.backend.ast.JsImportedModule[DeserializedPropertyDescriptor]

'module' @ [138:45] ==> value-parameter module: JsImportedModule defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.addModuleValidation[ValueParameterDescriptorImpl]

'externalName' @ [138:52] ==> public final val externalName: String defined in org.jetbrains.kotlin.js.backend.ast.JsImportedModule[DeserializedPropertyDescriptor]

'currentModuleId' @ [138:94] ==> value-parameter currentModuleId: String defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.addModuleValidation[ValueParameterDescriptorImpl]

'JsThrow' @ [139:35] ==> public constructor JsThrow(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsThrow[JavaClassConstructorDescriptor]

'JsNew' @ [139:43] ==> public constructor JsNew(p0: (JsExpression..JsExpression?), p1: (MutableList<out (JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNew[JavaClassConstructorDescriptor]

'JsNameRef' @ [139:49] ==> public constructor JsNameRef(@NotNull p0: String) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'listOf' @ [139:69] ==> public fun <T> listOf(element: JsExpression): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'moduleNotFoundMessage' @ [139:90] ==> val moduleNotFoundMessage: JsStringLiteral defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.addModuleValidation[LocalVariableDescriptor]

'JsIf' @ [140:16] ==> public constructor JsIf(@NotNull p0: JsExpression, @NotNull p1: JsStatement) defined in org.jetbrains.kotlin.js.backend.ast.JsIf[JavaClassConstructorDescriptor]

'moduleExistsCond' @ [140:21] ==> val moduleExistsCond: JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.addModuleValidation[LocalVariableDescriptor]

'JsBlock' @ [140:39] ==> public constructor JsBlock(p0: (JsStatement..JsStatement?)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'moduleNotFoundThrow' @ [140:47] ==> val moduleNotFoundThrow: JsThrow defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.addModuleValidation[LocalVariableDescriptor]

'importedModules' @ [149:30] ==> value-parameter importedModules: List<JsImportedModule> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.makePlainInvocation[ValueParameterDescriptorImpl]

'map' @ [149:46] ==> public inline fun <T, R> Iterable<JsImportedModule>.map(transform: (JsImportedModule) -> JsExpression): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsImportedModule
    <R> -> JsExpression

'makePlainModuleRef' @ [149:52] ==> private final fun makePlainModuleRef(module: JsImportedModule, program: JsProgram): JsExpression defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation[SimpleFunctionDescriptorImpl]

'it' @ [149:71] ==> value-parameter it: JsImportedModule defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.makePlainInvocation.<anonymous>[ValueParameterDescriptorImpl]

'program' @ [149:75] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.makePlainInvocation[ValueParameterDescriptorImpl]

'makePlainModuleRef' @ [150:25] ==> private final fun makePlainModuleRef(moduleId: String, program: JsProgram): JsExpression defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation[SimpleFunctionDescriptorImpl]

'moduleId' @ [150:44] ==> value-parameter moduleId: String defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.makePlainInvocation[ValueParameterDescriptorImpl]

'program' @ [150:54] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.makePlainInvocation[ValueParameterDescriptorImpl]

'typeOfIs' @ [151:44] ==> @NotNull public open fun typeOfIs(@NotNull expression: JsExpression, @NotNull string: JsStringLiteral): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'moduleRef' @ [151:53] ==> val moduleRef: JsExpression defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.makePlainInvocation[LocalVariableDescriptor]

'JsStringLiteral' @ [151:64] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'JsConditional' @ [152:23] ==> public constructor JsConditional(p0: (JsExpression..JsExpression?), p1: (JsExpression..JsExpression?), p2: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsConditional[JavaClassConstructorDescriptor]

'testModuleDefined' @ [152:37] ==> val testModuleDefined: JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.makePlainInvocation[LocalVariableDescriptor]

'JsObjectLiteral' @ [152:56] ==> public constructor JsObjectLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsObjectLiteral[JavaClassConstructorDescriptor]

'moduleRef' @ [152:80] ==> val moduleRef: JsExpression defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.makePlainInvocation[LocalVariableDescriptor]

'deepCopy' @ [152:90] ==> @NotNull public abstract fun deepCopy(): JsExpression defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'JsInvocation' @ [154:16] ==> public constructor JsInvocation(@NotNull p0: JsExpression, @NotNull p1: (MutableList<out (JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'function' @ [154:29] ==> value-parameter function: JsExpression defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.makePlainInvocation[ValueParameterDescriptorImpl]

'listOf' @ [154:39] ==> public fun <T> listOf(element: JsConditional): List<JsConditional> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsConditional

'selfArg' @ [154:46] ==> val selfArg: JsConditional defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.makePlainInvocation[LocalVariableDescriptor]

'invocationArgs' @ [154:57] ==> val invocationArgs: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.makePlainInvocation[LocalVariableDescriptor]

'module' @ [158:16] ==> value-parameter module: JsImportedModule defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.makePlainModuleRef[ValueParameterDescriptorImpl]

'plainReference' @ [158:23] ==> public final val plainReference: JsExpression? defined in org.jetbrains.kotlin.js.backend.ast.JsImportedModule[DeserializedPropertyDescriptor]

'makePlainModuleRef' @ [158:41] ==> private final fun makePlainModuleRef(moduleId: String, program: JsProgram): JsExpression defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation[SimpleFunctionDescriptorImpl]

'module' @ [158:60] ==> value-parameter module: JsImportedModule defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.makePlainModuleRef[ValueParameterDescriptorImpl]

'externalName' @ [158:67] ==> public final val externalName: String defined in org.jetbrains.kotlin.js.backend.ast.JsImportedModule[DeserializedPropertyDescriptor]

'program' @ [158:81] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.makePlainModuleRef[ValueParameterDescriptorImpl]

'if (Namer.requiresEscaping(moduleId)) {
            JsArrayAccess(JsThisRef(), JsStringLiteral(moduleId))
        }
        else {
            program.scope.declareName(moduleId).makeRef()
        }' @ [164:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'requiresEscaping' @ [164:26] ==> public open fun requiresEscaping(@NotNull name: String): Boolean defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'moduleId' @ [164:43] ==> value-parameter moduleId: String defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.makePlainModuleRef[ValueParameterDescriptorImpl]

'JsArrayAccess' @ [165:13] ==> public constructor JsArrayAccess(p0: (JsExpression..JsExpression?), p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsArrayAccess[JavaClassConstructorDescriptor]

'JsThisRef' @ [165:27] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'JsStringLiteral' @ [165:40] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'moduleId' @ [165:56] ==> value-parameter moduleId: String defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.makePlainModuleRef[ValueParameterDescriptorImpl]

'program' @ [168:13] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.makePlainModuleRef[ValueParameterDescriptorImpl]

'scope' @ [168:21] ==> public final val JsProgram.scope: (JsObjectScope..JsObjectScope?)[MyPropertyDescriptor]

'declareName' @ [168:27] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsObjectScope[JavaMethodDescriptor]

'moduleId' @ [168:39] ==> value-parameter moduleId: String defined in org.jetbrains.kotlin.js.translate.general.ModuleWrapperTranslation.makePlainModuleRef[ValueParameterDescriptorImpl]

'makeRef' @ [168:49] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

