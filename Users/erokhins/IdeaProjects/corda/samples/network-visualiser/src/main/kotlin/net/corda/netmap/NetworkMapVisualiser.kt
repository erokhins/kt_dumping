'EASE_OUT' @ [35:96] ==> public final val EASE_OUT: (Interpolator..Interpolator?) defined in javafx.animation.Interpolator[JavaPropertyDescriptor]

'KeyValue' @ [35:108] ==> public constructor KeyValue<T : (Any..Any?)>(@NamedArg p0: (WritableValue<(T..T?)>..WritableValue<(T..T?)>?), @NamedArg p1: (T..T?), @NamedArg p2: (Interpolator..Interpolator?)) defined in javafx.animation.KeyValue[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (T..T?)

'this' @ [35:117] ==> <this> defined in net.corda.netmap.keyValue[ReceiverParameterDescriptorImpl]

'endValue' @ [35:123] ==> value-parameter endValue: T defined in net.corda.netmap.keyValue[ValueParameterDescriptorImpl]

'interpolator' @ [35:133] ==> value-parameter interpolator: Interpolator = ... defined in net.corda.netmap.keyValue[ValueParameterDescriptorImpl]

'Application' @ [39:30] ==> public constructor Application() defined in javafx.application.Application[JavaClassConstructorDescriptor]

'name' @ [48:20] ==> public final val name: String defined in net.corda.netmap.NetworkMapVisualiser.RunPauseButtonLabel[DeserializedPropertyDescriptor]

'toLowerCase' @ [48:25] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'capitalize' @ [48:39] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'RunningPausedState' @ [53:51] ==> private constructor RunningPausedState() defined in net.corda.netmap.NetworkMapVisualiser.RunningPausedState[ClassConstructorDescriptorImpl]

'RunningPausedState' @ [54:24] ==> private constructor RunningPausedState() defined in net.corda.netmap.NetworkMapVisualiser.RunningPausedState[ClassConstructorDescriptorImpl]

'when (this) {
                    is RunningPausedState.Running -> RunPauseButtonLabel.PAUSE
                    is RunningPausedState.Paused -> RunPauseButtonLabel.RUN
                }' @ [58:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: NetworkMapVisualiser.RunPauseButtonLabel, entry1: NetworkMapVisualiser.RunPauseButtonLabel): NetworkMapVisualiser.RunPauseButtonLabel[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> RunPauseButtonLabel

'this' @ [58:30] ==> <this> defined in net.corda.netmap.NetworkMapVisualiser.RunningPausedState[LazyClassReceiverParameterDescriptor]

'PAUSE' @ [59:74] ==> enum entry PAUSE defined in net.corda.netmap.NetworkMapVisualiser.RunPauseButtonLabel[FakeCallableDescriptorForObject]

'RUN' @ [60:73] ==> enum entry RUN defined in net.corda.netmap.NetworkMapVisualiser.RunPauseButtonLabel[FakeCallableDescriptorForObject]

'VisualiserView' @ [65:24] ==> public constructor VisualiserView() defined in net.corda.netmap.VisualiserView[ClassConstructorDescriptorImpl]

'VisualiserViewModel' @ [66:29] ==> public constructor VisualiserViewModel() defined in net.corda.netmap.VisualiserViewModel[ClassConstructorDescriptorImpl]

'Timer' @ [68:17] ==> public constructor Timer() defined in java.util.Timer[JavaClassConstructorDescriptor]

'from' @ [69:42] ==> public final fun from(p0: (((Runnable..Runnable?)) -> Unit..(((Runnable..Runnable?)) -> Unit)?)): (Scheduler..Scheduler?) defined in rx.schedulers.Schedulers[SamAdapterFunctionDescriptor]

'runLater' @ [69:58] ==> public open fun runLater(p0: (Runnable..Runnable?)): Unit defined in javafx.application.Platform[JavaMethodDescriptor]

'it' @ [69:67] ==> value-parameter it: (Runnable..Runnable?) defined in net.corda.netmap.NetworkMapVisualiser.uiThread.<anonymous>[ValueParameterDescriptorImpl]

'viewModel' @ [72:9] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'view' @ [72:19] ==> internal final lateinit var view: VisualiserView defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'view' @ [72:26] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'viewModel' @ [73:9] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'presentationMode' @ [73:19] ==> public final var presentationMode: Boolean defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'in' @ [73:38] ==> public abstract fun contains(element: (String..String?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'parameters' @ [73:63] ==> public final val NetworkMapVisualiser.parameters: (Application.Parameters..Application.Parameters?)[MyPropertyDescriptor]

'raw' @ [73:74] ==> public final val Application.Parameters.raw: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]

'buildScene' @ [74:9] ==> private final fun buildScene(stage: Stage): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'stage' @ [74:20] ==> value-parameter stage: Stage defined in net.corda.netmap.NetworkMapVisualiser.start[ValueParameterDescriptorImpl]

'viewModel' @ [75:9] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'displayStyle' @ [75:19] ==> public final var displayStyle: VisualiserViewModel.Style defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'if ("--circle" in parameters.raw) {
            Style.CIRCLE
        } else {
            viewModel.displayStyle
        }' @ [75:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: VisualiserViewModel.Style, elseBranch: VisualiserViewModel.Style): VisualiserViewModel.Style[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Style

'in' @ [75:38] ==> public abstract fun contains(element: (String..String?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'parameters' @ [75:52] ==> public final val NetworkMapVisualiser.parameters: (Application.Parameters..Application.Parameters?)[MyPropertyDescriptor]

'raw' @ [75:63] ==> public final val Application.Parameters.raw: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]

'CIRCLE' @ [76:19] ==> enum entry CIRCLE defined in net.corda.netmap.VisualiserViewModel.Style[FakeCallableDescriptorForObject]

'viewModel' @ [78:13] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'displayStyle' @ [78:23] ==> public final var displayStyle: VisualiserViewModel.Style defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'viewModel' @ [81:26] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'simulation' @ [81:36] ==> public final var simulation: IRSSimulation defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'simulation' @ [83:9] ==> val simulation: IRSSimulation defined in net.corda.netmap.NetworkMapVisualiser.start[LocalVariableDescriptor]

'allFlowSteps' @ [83:20] ==> @Suppress public final val allFlowSteps: Observable<Pair<Simulation.SimulatedNode, ProgressTracker.Change>> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'observeOn' @ [83:33] ==> public final fun observeOn(p0: (Scheduler..Scheduler?)): (Observable<(Pair<Simulation.SimulatedNode, ProgressTracker.Change>..Pair<Simulation.SimulatedNode, ProgressTracker.Change>?)>..Observable<(Pair<Simulation.SimulatedNode, ProgressTracker.Change>..Pair<Simulation.SimulatedNode, ProgressTracker.Change>?)>?) defined in rx.Observable[JavaMethodDescriptor]

'uiThread' @ [83:43] ==> public final val uiThread: Scheduler defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'subscribe' @ [83:53] ==> public final fun subscribe(p0: (((Pair<Simulation.SimulatedNode, ProgressTracker.Change>..Pair<Simulation.SimulatedNode, ProgressTracker.Change>?)) -> Unit..(((Pair<Simulation.SimulatedNode, ProgressTracker.Change>..Pair<Simulation.SimulatedNode, ProgressTracker.Change>?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'component1' @ [83:66] ==> public final operator fun component1(): Simulation.SimulatedNode defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [83:72] ==> public final operator fun component2(): ProgressTracker.Change defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'viewModel' @ [84:25] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'nodesToWidgets' @ [84:35] ==> public final val nodesToWidgets: HashMap<MockNetwork.MockNode, VisualiserViewModel.NodeWidget> defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'node' @ [84:50] ==> val node: Simulation.SimulatedNode defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[LocalVariableDescriptor]

'statusLabel' @ [84:58] ==> public final val statusLabel: Label defined in net.corda.netmap.VisualiserViewModel.NodeWidget[PropertyDescriptorImpl]

'if (change is ProgressTracker.Change.Position) {
                // Fade in the status label if it's our first step.
                if (label.text == "") {
                    with(FadeTransition(Duration(150.0), label)) {
                        fromValue = 0.0
                        toValue = 1.0
                        play()
                    }
                }
                label.text = change.newStep.label
                if (change.newStep == ProgressTracker.DONE && change.tracker == change.tracker.topLevelTracker) {
                    runLater(500, -1) {
                        // Fade out the status label.
                        with(FadeTransition(Duration(750.0), label)) {
                            fromValue = 1.0
                            toValue = 0.0
                            setOnFinished { label.text = "" }
                            play()
                        }
                    }
                }
            } else if (change is ProgressTracker.Change.Rendering) {
                label.text = change.ofStep.label
            }' @ [85:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'change' @ [85:17] ==> val change: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[LocalVariableDescriptor]

'label' @ [87:21] ==> val label: Label defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[LocalVariableDescriptor]

'text' @ [87:27] ==> public final var Label.text: (String..String?)[MyPropertyDescriptor]

'with' @ [88:21] ==> @InlineOnly public inline fun <T, R> with(receiver: FadeTransition, block: FadeTransition.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FadeTransition
    <R> -> Unit

'FadeTransition' @ [88:26] ==> public constructor FadeTransition(p0: (Duration..Duration?), p1: (Node..Node?)) defined in javafx.animation.FadeTransition[JavaClassConstructorDescriptor]

'Duration' @ [88:41] ==> public constructor Duration(@NamedArg p0: Double) defined in javafx.util.Duration[JavaClassConstructorDescriptor]

'label' @ [88:58] ==> val label: Label defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[LocalVariableDescriptor]

'fromValue' @ [89:25] ==> public final var FadeTransition.fromValue: Double[MyPropertyDescriptor]

'toValue' @ [90:25] ==> public final var FadeTransition.toValue: Double[MyPropertyDescriptor]

'play' @ [91:25] ==> public open fun play(): Unit defined in javafx.animation.FadeTransition[JavaMethodDescriptor]

'label' @ [94:17] ==> val label: Label defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[LocalVariableDescriptor]

'text' @ [94:23] ==> public final var Label.text: (String..String?)[MyPropertyDescriptor]

'change' @ [94:30] ==> val change: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[LocalVariableDescriptor]

'newStep' @ [94:37] ==> public final val newStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker.Change.Position[DeserializedPropertyDescriptor]

'label' @ [94:45] ==> public open val label: String defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedPropertyDescriptor]

'change' @ [95:21] ==> val change: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[LocalVariableDescriptor]

'newStep' @ [95:28] ==> public final val newStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker.Change.Position[DeserializedPropertyDescriptor]

'DONE' @ [95:55] ==> public object DONE : ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[FakeCallableDescriptorForObject]

'change' @ [95:63] ==> val change: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[LocalVariableDescriptor]

'tracker' @ [95:70] ==> public final val tracker: ProgressTracker defined in net.corda.core.utilities.ProgressTracker.Change.Position[DeserializedPropertyDescriptor]

'change' @ [95:81] ==> val change: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[LocalVariableDescriptor]

'tracker' @ [95:88] ==> public final val tracker: ProgressTracker defined in net.corda.core.utilities.ProgressTracker.Change.Position[DeserializedPropertyDescriptor]

'topLevelTracker' @ [95:96] ==> public final val topLevelTracker: ProgressTracker defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'runLater' @ [96:21] ==> public final fun runLater(startAfter: Int, delayBetween: Int, body: () -> Unit): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'-' @ [96:35] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'with' @ [98:25] ==> @InlineOnly public inline fun <T, R> with(receiver: FadeTransition, block: FadeTransition.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FadeTransition
    <R> -> Unit

'FadeTransition' @ [98:30] ==> public constructor FadeTransition(p0: (Duration..Duration?), p1: (Node..Node?)) defined in javafx.animation.FadeTransition[JavaClassConstructorDescriptor]

'Duration' @ [98:45] ==> public constructor Duration(@NamedArg p0: Double) defined in javafx.util.Duration[JavaClassConstructorDescriptor]

'label' @ [98:62] ==> val label: Label defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[LocalVariableDescriptor]

'fromValue' @ [99:29] ==> public final var FadeTransition.fromValue: Double[MyPropertyDescriptor]

'toValue' @ [100:29] ==> public final var FadeTransition.toValue: Double[MyPropertyDescriptor]

'setOnFinished' @ [101:29] ==> public final fun setOnFinished(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javafx.animation.FadeTransition[MyFunctionDescriptor]

'label' @ [101:45] ==> val label: Label defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[LocalVariableDescriptor]

'text' @ [101:51] ==> public final var Label.text: (String..String?)[MyPropertyDescriptor]

'play' @ [102:29] ==> public open fun play(): Unit defined in javafx.animation.FadeTransition[JavaMethodDescriptor]

'change' @ [106:24] ==> val change: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[LocalVariableDescriptor]

'label' @ [107:17] ==> val label: Label defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[LocalVariableDescriptor]

'text' @ [107:23] ==> public final var Label.text: (String..String?)[MyPropertyDescriptor]

'change' @ [107:30] ==> val change: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[LocalVariableDescriptor]

'ofStep' @ [107:37] ==> public final val ofStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker.Change.Rendering[DeserializedPropertyDescriptor]

'label' @ [107:44] ==> public open val label: String defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedPropertyDescriptor]

'simulation' @ [111:9] ==> val simulation: IRSSimulation defined in net.corda.netmap.NetworkMapVisualiser.start[LocalVariableDescriptor]

'mockNet' @ [111:20] ==> public final val mockNet: MockNetwork defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'messagingNetwork' @ [111:28] ==> public final val messagingNetwork: InMemoryMessagingNetwork defined in net.corda.testing.node.MockNetwork[DeserializedPropertyDescriptor]

'sentMessages' @ [111:45] ==> public final val sentMessages: Observable<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork[DeserializedPropertyDescriptor]

'observeOn' @ [111:58] ==> public final fun observeOn(p0: (Scheduler..Scheduler?)): (Observable<(InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)>..Observable<(InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)>?) defined in rx.Observable[JavaMethodDescriptor]

'uiThread' @ [111:68] ==> public final val uiThread: Scheduler defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'subscribe' @ [111:78] ==> public final fun subscribe(p0: (((InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)) -> Unit..(((InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'simulation' @ [112:52] ==> val simulation: IRSSimulation defined in net.corda.netmap.NetworkMapVisualiser.start[LocalVariableDescriptor]

'mockNet' @ [112:63] ==> public final val mockNet: MockNetwork defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'addressToNode' @ [112:71] ==> public final fun addressToNode(msgRecipient: MessageRecipients): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'msg' @ [112:85] ==> value-parameter msg: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[ValueParameterDescriptorImpl]

'sender' @ [112:89] ==> public final val sender: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[DeserializedPropertyDescriptor]

'simulation' @ [113:50] ==> val simulation: IRSSimulation defined in net.corda.netmap.NetworkMapVisualiser.start[LocalVariableDescriptor]

'mockNet' @ [113:61] ==> public final val mockNet: MockNetwork defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'addressToNode' @ [113:69] ==> public final fun addressToNode(msgRecipient: MessageRecipients): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'msg' @ [113:83] ==> value-parameter msg: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[ValueParameterDescriptorImpl]

'recipients' @ [113:87] ==> public final val recipients: MessageRecipients defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[DeserializedPropertyDescriptor]

'transferIsInteresting' @ [115:17] ==> private final fun transferIsInteresting(transfer: InMemoryMessagingNetwork.MessageTransfer): Boolean defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'msg' @ [115:39] ==> value-parameter msg: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[ValueParameterDescriptorImpl]

'viewModel' @ [116:17] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'nodesToWidgets' @ [116:27] ==> public final val nodesToWidgets: HashMap<MockNetwork.MockNode, VisualiserViewModel.NodeWidget> defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'senderNode' @ [116:42] ==> val senderNode: MockNetwork.MockNode defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[LocalVariableDescriptor]

'pulseAnim' @ [116:56] ==> public final val pulseAnim: Animation defined in net.corda.netmap.VisualiserViewModel.NodeWidget[PropertyDescriptorImpl]

'play' @ [116:66] ==> public open fun play(): Unit defined in javafx.animation.Animation[JavaMethodDescriptor]

'viewModel' @ [117:17] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'fireBulletBetweenNodes' @ [117:27] ==> public final fun fireBulletBetweenNodes(senderNode: MockNetwork.MockNode, destNode: MockNetwork.MockNode, startType: String, endType: String): Unit defined in net.corda.netmap.VisualiserViewModel[SimpleFunctionDescriptorImpl]

'senderNode' @ [117:50] ==> val senderNode: MockNetwork.MockNode defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[LocalVariableDescriptor]

'destNode' @ [117:62] ==> val destNode: MockNetwork.MockNode defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[LocalVariableDescriptor]

'simulation' @ [121:9] ==> val simulation: IRSSimulation defined in net.corda.netmap.NetworkMapVisualiser.start[LocalVariableDescriptor]

'doneSteps' @ [121:20] ==> @Suppress public final val doneSteps: Observable<Collection<Simulation.SimulatedNode>> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'observeOn' @ [121:30] ==> public final fun observeOn(p0: (Scheduler..Scheduler?)): (Observable<(Collection<Simulation.SimulatedNode>..Collection<Simulation.SimulatedNode>?)>..Observable<(Collection<Simulation.SimulatedNode>..Collection<Simulation.SimulatedNode>?)>?) defined in rx.Observable[JavaMethodDescriptor]

'uiThread' @ [121:40] ==> public final val uiThread: Scheduler defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'subscribe' @ [121:50] ==> public final fun subscribe(p0: (((Collection<Simulation.SimulatedNode>..Collection<Simulation.SimulatedNode>?)) -> Unit..(((Collection<Simulation.SimulatedNode>..Collection<Simulation.SimulatedNode>?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'nodes' @ [122:13] ==> value-parameter nodes: Collection<Simulation.SimulatedNode> defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [122:19] ==> @HidesMembers public inline fun <T> Iterable<Simulation.SimulatedNode>.forEach(action: (Simulation.SimulatedNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimulatedNode

'viewModel' @ [122:29] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'nodesToWidgets' @ [122:39] ==> public final val nodesToWidgets: HashMap<MockNetwork.MockNode, VisualiserViewModel.NodeWidget> defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'it' @ [122:54] ==> value-parameter it: Simulation.SimulatedNode defined in net.corda.netmap.NetworkMapVisualiser.start.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'longPulseAnim' @ [122:60] ==> public final val longPulseAnim: Animation defined in net.corda.netmap.VisualiserViewModel.NodeWidget[PropertyDescriptorImpl]

'play' @ [122:74] ==> public open fun play(): Unit defined in javafx.animation.Animation[JavaMethodDescriptor]

'stage' @ [125:9] ==> value-parameter stage: Stage defined in net.corda.netmap.NetworkMapVisualiser.start[ValueParameterDescriptorImpl]

'setOnCloseRequest' @ [125:15] ==> public final fun setOnCloseRequest(p0: (((WindowEvent..WindowEvent?)) -> Unit..(((WindowEvent..WindowEvent?)) -> Unit)?)): Unit defined in javafx.stage.Stage[MyFunctionDescriptor]

'exitProcess' @ [125:35] ==> @InlineOnly public inline fun exitProcess(status: Int): Nothing defined in kotlin.system[DeserializedSimpleFunctionDescriptor]

'stage' @ [127:9] ==> value-parameter stage: Stage defined in net.corda.netmap.NetworkMapVisualiser.start[ValueParameterDescriptorImpl]

'show' @ [127:15] ==> public final fun show(): Unit defined in javafx.stage.Stage[JavaMethodDescriptor]

'if (delayBetween != -1) {
            timer.scheduleAtFixedRate(startAfter.toLong(), delayBetween.toLong()) {
                Platform.runLater {
                    body()
                }
            }
        } else {
            timer.schedule(startAfter.toLong()) {
                Platform.runLater {
                    body()
                }
            }
        }' @ [131:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TimerTask, elseBranch: TimerTask): TimerTask[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TimerTask

'delayBetween' @ [131:13] ==> value-parameter delayBetween: Int defined in net.corda.netmap.NetworkMapVisualiser.runLater[ValueParameterDescriptorImpl]

'-' @ [131:29] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'timer' @ [132:13] ==> public final val timer: Timer defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'scheduleAtFixedRate' @ [132:19] ==> @InlineOnly public inline fun Timer.scheduleAtFixedRate(delay: Long, period: Long, crossinline action: TimerTask.() -> Unit): TimerTask defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'startAfter' @ [132:39] ==> value-parameter startAfter: Int defined in net.corda.netmap.NetworkMapVisualiser.runLater[ValueParameterDescriptorImpl]

'toLong' @ [132:50] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'delayBetween' @ [132:60] ==> value-parameter delayBetween: Int defined in net.corda.netmap.NetworkMapVisualiser.runLater[ValueParameterDescriptorImpl]

'toLong' @ [132:73] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'runLater' @ [133:26] ==> public final fun runLater(p0: (() -> Unit..(() -> Unit)?)): Unit defined in javafx.application.Platform[SamAdapterFunctionDescriptor]

'invoke' @ [134:21] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'timer' @ [138:13] ==> public final val timer: Timer defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'schedule' @ [138:19] ==> @InlineOnly public inline fun Timer.schedule(delay: Long, crossinline action: TimerTask.() -> Unit): TimerTask defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'startAfter' @ [138:28] ==> value-parameter startAfter: Int defined in net.corda.netmap.NetworkMapVisualiser.runLater[ValueParameterDescriptorImpl]

'toLong' @ [138:39] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'runLater' @ [139:26] ==> public final fun runLater(p0: (() -> Unit..(() -> Unit)?)): Unit defined in javafx.application.Platform[SamAdapterFunctionDescriptor]

'invoke' @ [140:21] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'view' @ [147:9] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'stage' @ [147:14] ==> public final lateinit var stage: Stage defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'stage' @ [147:22] ==> value-parameter stage: Stage defined in net.corda.netmap.NetworkMapVisualiser.buildScene[ValueParameterDescriptorImpl]

'view' @ [148:9] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'setup' @ [148:14] ==> public final fun setup(runningPausedState: NetworkMapVisualiser.RunningPausedState, displayStyle: VisualiserViewModel.Style, presentationMode: Boolean): Unit defined in net.corda.netmap.VisualiserView[SimpleFunctionDescriptorImpl]

'viewModel' @ [148:20] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'runningPausedState' @ [148:30] ==> public final var runningPausedState: NetworkMapVisualiser.RunningPausedState defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'viewModel' @ [148:50] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'displayStyle' @ [148:60] ==> public final var displayStyle: VisualiserViewModel.Style defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'viewModel' @ [148:74] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'presentationMode' @ [148:84] ==> public final var presentationMode: Boolean defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'bindSidebar' @ [149:9] ==> private final fun bindSidebar(): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'bindTopbar' @ [150:9] ==> private final fun bindTopbar(): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'viewModel' @ [151:9] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'createNodes' @ [151:19] ==> public final fun createNodes(): Unit defined in net.corda.netmap.VisualiserViewModel[SimpleFunctionDescriptorImpl]

'stage' @ [154:9] ==> value-parameter stage: Stage defined in net.corda.netmap.NetworkMapVisualiser.buildScene[ValueParameterDescriptorImpl]

'scene' @ [154:15] ==> public final var Stage.scene: (Scene..Scene?)[MyPropertyDescriptor]

'accelerators' @ [154:21] ==> public final val Scene.accelerators: (ObservableMap<(KeyCombination..KeyCombination?), (Runnable..Runnable?)>..ObservableMap<(KeyCombination..KeyCombination?), (Runnable..Runnable?)>?)[MyPropertyDescriptor]

'KeyCodeCombination' @ [154:34] ==> public constructor KeyCodeCombination(@NamedArg p0: (KeyCode..KeyCode?), @NamedArg vararg p1: (KeyCombination.Modifier..KeyCombination.Modifier?)) defined in javafx.scene.input.KeyCodeCombination[JavaClassConstructorDescriptor]

'SPACE' @ [154:61] ==> enum entry SPACE defined in javafx.scene.input.KeyCode[FakeCallableDescriptorForObject]

'Runnable' @ [154:71] ==> @FunctionalInterface public fun Runnable(function: () -> Unit): Runnable defined in java.lang[SamConstructorDescriptorImpl]

'onNextInvoked' @ [154:82] ==> private final fun onNextInvoked(): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'reloadStylesheet' @ [156:9] ==> private final fun reloadStylesheet(stage: Stage): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'stage' @ [156:26] ==> value-parameter stage: Stage defined in net.corda.netmap.NetworkMapVisualiser.buildScene[ValueParameterDescriptorImpl]

'stage' @ [158:9] ==> value-parameter stage: Stage defined in net.corda.netmap.NetworkMapVisualiser.buildScene[ValueParameterDescriptorImpl]

'focusedProperty' @ [158:15] ==> public final fun focusedProperty(): (ReadOnlyBooleanProperty..ReadOnlyBooleanProperty?) defined in javafx.stage.Stage[JavaMethodDescriptor]

'addListener' @ [158:33] ==> public final fun addListener(p0: (((ObservableValue<out (Boolean..Boolean?)>..ObservableValue<out (Boolean..Boolean?)>?), (Boolean..Boolean?), (Boolean..Boolean?)) -> Unit..(((ObservableValue<out (Boolean..Boolean?)>..ObservableValue<out (Boolean..Boolean?)>?), (Boolean..Boolean?), (Boolean..Boolean?)) -> Unit)?)): Unit defined in javafx.beans.property.ReadOnlyBooleanProperty[MyFunctionDescriptor]

'new' @ [159:17] ==> value-parameter new: (Boolean..Boolean?) defined in net.corda.netmap.NetworkMapVisualiser.buildScene.<anonymous>[ValueParameterDescriptorImpl]

'reloadStylesheet' @ [160:17] ==> private final fun reloadStylesheet(stage: Stage): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'stage' @ [160:34] ==> value-parameter stage: Stage defined in net.corda.netmap.NetworkMapVisualiser.buildScene[ValueParameterDescriptorImpl]

'view' @ [166:9] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'resetButton' @ [166:14] ==> public final lateinit var resetButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'setOnAction' @ [166:26] ==> public final fun setOnAction(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javafx.scene.control.Button[MyFunctionDescriptor]

'reset' @ [166:40] ==> private final fun reset(): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'view' @ [167:9] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'nextButton' @ [167:14] ==> public final lateinit var nextButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'setOnAction' @ [167:25] ==> public final fun setOnAction(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javafx.scene.control.Button[MyFunctionDescriptor]

'if (!view.simulateInitialisationCheckbox.isSelected && !viewModel.simulation.networkInitialisationFinished.isDone) {
                skipNetworkInitialisation()
            } else {
                onNextInvoked()
            }' @ [168:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [168:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'view' @ [168:18] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'simulateInitialisationCheckbox' @ [168:23] ==> public final lateinit var simulateInitialisationCheckbox: CheckBox defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'isSelected' @ [168:54] ==> public final var CheckBox.isSelected: Boolean[MyPropertyDescriptor]

'!' @ [168:68] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'viewModel' @ [168:69] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'simulation' @ [168:79] ==> public final var simulation: IRSSimulation defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'networkInitialisationFinished' @ [168:90] ==> public final val networkInitialisationFinished: CordaFuture<List<Unit>> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'isDone' @ [168:120] ==> public final val <V> CordaFuture<List<Unit>>.isDone: Boolean[MyPropertyDescriptor]
Inferred types:
    <V> -> List<Unit>

'skipNetworkInitialisation' @ [169:17] ==> private final fun skipNetworkInitialisation(): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'onNextInvoked' @ [171:17] ==> private final fun onNextInvoked(): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'viewModel' @ [174:9] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'simulation' @ [174:19] ==> public final var simulation: IRSSimulation defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'networkInitialisationFinished' @ [174:30] ==> public final val networkInitialisationFinished: CordaFuture<List<Unit>> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'then' @ [174:60] ==> public abstract fun <W> then(callback: (CordaFuture<List<Unit>>) -> Unit): Unit defined in net.corda.core.concurrent.CordaFuture[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <W> -> Unit

'view' @ [175:13] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'simulateInitialisationCheckbox' @ [175:18] ==> public final lateinit var simulateInitialisationCheckbox: CheckBox defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'isVisible' @ [175:49] ==> public final var CheckBox.isVisible: Boolean[MyPropertyDescriptor]

'view' @ [177:9] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'runPauseButton' @ [177:14] ==> public final lateinit var runPauseButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'setOnAction' @ [177:29] ==> public final fun setOnAction(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javafx.scene.control.Button[MyFunctionDescriptor]

'viewModel' @ [178:41] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'runningPausedState' @ [178:51] ==> public final var runningPausedState: NetworkMapVisualiser.RunningPausedState defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'when (oldRunningPausedState) {
                is NetworkMapVisualiser.RunningPausedState.Running -> {
                    oldRunningPausedState.tickTimer.cancel()

                    view.nextButton.isDisable = false
                    view.resetButton.isDisable = false

                    NetworkMapVisualiser.RunningPausedState.Paused()
                }
                is NetworkMapVisualiser.RunningPausedState.Paused -> {
                    val tickTimer = timer.scheduleAtFixedRate(viewModel.stepDuration.toMillis().toLong(), viewModel.stepDuration.toMillis().toLong()) {
                        Platform.runLater {
                            onNextInvoked()
                        }
                    }

                    view.nextButton.isDisable = true
                    view.resetButton.isDisable = true

                    if (!view.simulateInitialisationCheckbox.isSelected && !viewModel.simulation.networkInitialisationFinished.isDone) {
                        skipNetworkInitialisation()
                    }

                    NetworkMapVisualiser.RunningPausedState.Running(tickTimer)
                }
            }' @ [179:41] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: NetworkMapVisualiser.RunningPausedState, entry1: NetworkMapVisualiser.RunningPausedState): NetworkMapVisualiser.RunningPausedState[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> RunningPausedState

'oldRunningPausedState' @ [179:47] ==> val oldRunningPausedState: NetworkMapVisualiser.RunningPausedState defined in net.corda.netmap.NetworkMapVisualiser.bindTopbar.<anonymous>[LocalVariableDescriptor]

'oldRunningPausedState' @ [181:21] ==> val oldRunningPausedState: NetworkMapVisualiser.RunningPausedState defined in net.corda.netmap.NetworkMapVisualiser.bindTopbar.<anonymous>[LocalVariableDescriptor]

'tickTimer' @ [181:43] ==> public final val tickTimer: TimerTask defined in net.corda.netmap.NetworkMapVisualiser.RunningPausedState.Running[PropertyDescriptorImpl]

'cancel' @ [181:53] ==> public open fun cancel(): Boolean defined in java.util.TimerTask[JavaMethodDescriptor]

'view' @ [183:21] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'nextButton' @ [183:26] ==> public final lateinit var nextButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'isDisable' @ [183:37] ==> public final var Button.isDisable: Boolean[MyPropertyDescriptor]

'view' @ [184:21] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'resetButton' @ [184:26] ==> public final lateinit var resetButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'isDisable' @ [184:38] ==> public final var Button.isDisable: Boolean[MyPropertyDescriptor]

'Paused' @ [186:61] ==> public constructor Paused() defined in net.corda.netmap.NetworkMapVisualiser.RunningPausedState.Paused[ClassConstructorDescriptorImpl]

'timer' @ [189:37] ==> public final val timer: Timer defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'scheduleAtFixedRate' @ [189:43] ==> @InlineOnly public inline fun Timer.scheduleAtFixedRate(delay: Long, period: Long, crossinline action: TimerTask.() -> Unit): TimerTask defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'viewModel' @ [189:63] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'stepDuration' @ [189:73] ==> public final var stepDuration: Duration defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'toMillis' @ [189:86] ==> public open fun toMillis(): Double defined in javafx.util.Duration[JavaMethodDescriptor]

'toLong' @ [189:97] ==> public open fun toLong(): Long defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'viewModel' @ [189:107] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'stepDuration' @ [189:117] ==> public final var stepDuration: Duration defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'toMillis' @ [189:130] ==> public open fun toMillis(): Double defined in javafx.util.Duration[JavaMethodDescriptor]

'toLong' @ [189:141] ==> public open fun toLong(): Long defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'runLater' @ [190:34] ==> public final fun runLater(p0: (() -> Unit..(() -> Unit)?)): Unit defined in javafx.application.Platform[SamAdapterFunctionDescriptor]

'onNextInvoked' @ [191:29] ==> private final fun onNextInvoked(): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'view' @ [195:21] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'nextButton' @ [195:26] ==> public final lateinit var nextButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'isDisable' @ [195:37] ==> public final var Button.isDisable: Boolean[MyPropertyDescriptor]

'view' @ [196:21] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'resetButton' @ [196:26] ==> public final lateinit var resetButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'isDisable' @ [196:38] ==> public final var Button.isDisable: Boolean[MyPropertyDescriptor]

'!' @ [198:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'view' @ [198:26] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'simulateInitialisationCheckbox' @ [198:31] ==> public final lateinit var simulateInitialisationCheckbox: CheckBox defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'isSelected' @ [198:62] ==> public final var CheckBox.isSelected: Boolean[MyPropertyDescriptor]

'!' @ [198:76] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'viewModel' @ [198:77] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'simulation' @ [198:87] ==> public final var simulation: IRSSimulation defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'networkInitialisationFinished' @ [198:98] ==> public final val networkInitialisationFinished: CordaFuture<List<Unit>> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'isDone' @ [198:128] ==> public final val <V> CordaFuture<List<Unit>>.isDone: Boolean[MyPropertyDescriptor]
Inferred types:
    <V> -> List<Unit>

'skipNetworkInitialisation' @ [199:25] ==> private final fun skipNetworkInitialisation(): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'Running' @ [202:61] ==> public constructor Running(tickTimer: TimerTask) defined in net.corda.netmap.NetworkMapVisualiser.RunningPausedState.Running[ClassConstructorDescriptorImpl]

'tickTimer' @ [202:69] ==> val tickTimer: TimerTask defined in net.corda.netmap.NetworkMapVisualiser.bindTopbar.<anonymous>[LocalVariableDescriptor]

'view' @ [206:13] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'runPauseButton' @ [206:18] ==> public final lateinit var runPauseButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'text' @ [206:33] ==> public final var Button.text: (String..String?)[MyPropertyDescriptor]

'newRunningPausedState' @ [206:40] ==> val newRunningPausedState: NetworkMapVisualiser.RunningPausedState defined in net.corda.netmap.NetworkMapVisualiser.bindTopbar.<anonymous>[LocalVariableDescriptor]

'buttonLabel' @ [206:62] ==> public final val buttonLabel: NetworkMapVisualiser.RunPauseButtonLabel defined in net.corda.netmap.NetworkMapVisualiser.RunningPausedState[PropertyDescriptorImpl]

'toString' @ [206:74] ==> public open fun toString(): String defined in net.corda.netmap.NetworkMapVisualiser.RunPauseButtonLabel[SimpleFunctionDescriptorImpl]

'viewModel' @ [207:13] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'runningPausedState' @ [207:23] ==> public final var runningPausedState: NetworkMapVisualiser.RunningPausedState defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'newRunningPausedState' @ [207:44] ==> val newRunningPausedState: NetworkMapVisualiser.RunningPausedState defined in net.corda.netmap.NetworkMapVisualiser.bindTopbar.<anonymous>[LocalVariableDescriptor]

'view' @ [209:9] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'styleChoice' @ [209:14] ==> public final lateinit var styleChoice: ChoiceBox<VisualiserViewModel.Style> defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'selectionModel' @ [209:26] ==> public final var <T : (Any..Any?)> ChoiceBox<VisualiserViewModel.Style>.selectionModel: (SingleSelectionModel<(VisualiserViewModel.Style..VisualiserViewModel.Style?)>..SingleSelectionModel<(VisualiserViewModel.Style..VisualiserViewModel.Style?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Style

'selectedItemProperty' @ [209:41] ==> public final fun selectedItemProperty(): (ReadOnlyObjectProperty<(VisualiserViewModel.Style..VisualiserViewModel.Style?)>..ReadOnlyObjectProperty<(VisualiserViewModel.Style..VisualiserViewModel.Style?)>?) defined in javafx.scene.control.SingleSelectionModel[JavaMethodDescriptor]

'addListener' @ [210:18] ==> public final fun addListener(p0: (((ObservableValue<out (VisualiserViewModel.Style..VisualiserViewModel.Style?)>..ObservableValue<out (VisualiserViewModel.Style..VisualiserViewModel.Style?)>?), (VisualiserViewModel.Style..VisualiserViewModel.Style?), (VisualiserViewModel.Style..VisualiserViewModel.Style?)) -> Unit..(((ObservableValue<out (VisualiserViewModel.Style..VisualiserViewModel.Style?)>..ObservableValue<out (VisualiserViewModel.Style..VisualiserViewModel.Style?)>?), (VisualiserViewModel.Style..VisualiserViewModel.Style?), (VisualiserViewModel.Style..VisualiserViewModel.Style?)) -> Unit)?)): Unit defined in javafx.beans.property.ReadOnlyObjectProperty[MyFunctionDescriptor]

'viewModel' @ [210:50] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'displayStyle' @ [210:60] ==> public final var displayStyle: VisualiserViewModel.Style defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'newValue' @ [210:75] ==> value-parameter newValue: (VisualiserViewModel.Style..VisualiserViewModel.Style?) defined in net.corda.netmap.NetworkMapVisualiser.bindTopbar.<anonymous>[ValueParameterDescriptorImpl]

'viewModel' @ [211:9] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'simulation' @ [211:19] ==> public final var simulation: IRSSimulation defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'dateChanges' @ [211:30] ==> public final val dateChanges: Observable<LocalDateTime> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'observeOn' @ [211:42] ==> public final fun observeOn(p0: (Scheduler..Scheduler?)): (Observable<(LocalDateTime..LocalDateTime?)>..Observable<(LocalDateTime..LocalDateTime?)>?) defined in rx.Observable[JavaMethodDescriptor]

'uiThread' @ [211:52] ==> public final val uiThread: Scheduler defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'subscribe' @ [211:62] ==> public final fun subscribe(p0: (((LocalDateTime..LocalDateTime?)) -> Unit..(((LocalDateTime..LocalDateTime?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'view' @ [211:74] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'dateLabel' @ [211:79] ==> public final var dateLabel: Label defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'text' @ [211:89] ==> public final var Label.text: (String..String?)[MyPropertyDescriptor]

'it' @ [211:96] ==> value-parameter it: (LocalDateTime..LocalDateTime?) defined in net.corda.netmap.NetworkMapVisualiser.bindTopbar.<anonymous>[ValueParameterDescriptorImpl]

'format' @ [211:99] ==> public open fun format(p0: (DateTimeFormatter..DateTimeFormatter?)): (String..String?) defined in java.time.LocalDateTime[JavaMethodDescriptor]

'ofLocalizedDate' @ [211:124] ==> public open fun ofLocalizedDate(p0: (FormatStyle..FormatStyle?)): (DateTimeFormatter..DateTimeFormatter?) defined in java.time.format.DateTimeFormatter[JavaMethodDescriptor]

'MEDIUM' @ [211:152] ==> enum entry MEDIUM defined in java.time.format.FormatStyle[FakeCallableDescriptorForObject]

'stage' @ [215:9] ==> value-parameter stage: Stage defined in net.corda.netmap.NetworkMapVisualiser.reloadStylesheet[ValueParameterDescriptorImpl]

'scene' @ [215:15] ==> public final var Stage.scene: (Scene..Scene?)[MyPropertyDescriptor]

'stylesheets' @ [215:21] ==> public final val Scene.stylesheets: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'clear' @ [215:33] ==> public abstract fun clear(): Unit defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'stage' @ [216:9] ==> value-parameter stage: Stage defined in net.corda.netmap.NetworkMapVisualiser.reloadStylesheet[ValueParameterDescriptorImpl]

'scene' @ [216:15] ==> public final var Stage.scene: (Scene..Scene?)[MyPropertyDescriptor]

'stylesheets' @ [216:21] ==> public final val Scene.stylesheets: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'add' @ [216:33] ==> public abstract fun add(element: (String..String?)): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'NetworkMapVisualiser' @ [216:37] ==> public constructor NetworkMapVisualiser() defined in net.corda.netmap.NetworkMapVisualiser[ClassConstructorDescriptorImpl]

'java' @ [216:65] ==> public val <T> KClass<NetworkMapVisualiser>.java: Class<NetworkMapVisualiser> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NetworkMapVisualiser

'getResource' @ [216:70] ==> public open fun getResource(p0: (String..String?)): (URL..URL?) defined in java.lang.Class[JavaMethodDescriptor]

'toString' @ [216:96] ==> public open fun toString(): String defined in java.net.URL[JavaMethodDescriptor]

'viewModel' @ [220:9] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'simulation' @ [220:19] ==> public final var simulation: IRSSimulation defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'allFlowSteps' @ [220:30] ==> @Suppress public final val allFlowSteps: Observable<Pair<Simulation.SimulatedNode, ProgressTracker.Change>> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'observeOn' @ [220:43] ==> public final fun observeOn(p0: (Scheduler..Scheduler?)): (Observable<(Pair<Simulation.SimulatedNode, ProgressTracker.Change>..Pair<Simulation.SimulatedNode, ProgressTracker.Change>?)>..Observable<(Pair<Simulation.SimulatedNode, ProgressTracker.Change>..Pair<Simulation.SimulatedNode, ProgressTracker.Change>?)>?) defined in rx.Observable[JavaMethodDescriptor]

'uiThread' @ [220:53] ==> public final val uiThread: Scheduler defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'subscribe' @ [220:63] ==> public final fun subscribe(p0: (((Pair<Simulation.SimulatedNode, ProgressTracker.Change>..Pair<Simulation.SimulatedNode, ProgressTracker.Change>?)) -> Unit..(((Pair<Simulation.SimulatedNode, ProgressTracker.Change>..Pair<Simulation.SimulatedNode, ProgressTracker.Change>?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'component1' @ [220:76] ==> public final operator fun component1(): Simulation.SimulatedNode defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [220:82] ==> public final operator fun component2(): ProgressTracker.Change defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'if (change is ProgressTracker.Change.Position) {
                val tracker = change.tracker.topLevelTracker
                if (change.newStep == ProgressTracker.DONE) {
                    if (change.tracker == tracker) {
                        // Flow done; schedule it for removal in a few seconds. We batch them up to make nicer
                        // animations.
                        updateProgressTrackerWidget(change)
                        println("Flow done for ${node.info.legalIdentity.name}")
                        viewModel.doneTrackers += tracker
                    } else {
                        // Subflow is done; ignore it.
                    }
                } else if (!viewModel.trackerBoxes.containsKey(tracker)) {
                    // New flow started up; add.
                    val extraLabel = viewModel.simulation.extraNodeLabels[node]
                    val label = if (extraLabel != null) "${node.info.legalIdentity.name.commonName}: $extraLabel" else node.info.legalIdentity.name.commonName
                    val widget = view.buildProgressTrackerWidget(label, tracker.topLevelTracker)
                    println("Added: $tracker, $widget")
                    viewModel.trackerBoxes[tracker] = widget
                    view.sidebar.children += widget.vbox
                } else {
                    updateProgressTrackerWidget(change)
                }
            } else if (change is ProgressTracker.Change.Structural) {
                updateProgressTrackerWidget(change)
            }' @ [221:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'change' @ [221:17] ==> val change: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'change' @ [222:31] ==> val change: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'tracker' @ [222:38] ==> public final val tracker: ProgressTracker defined in net.corda.core.utilities.ProgressTracker.Change.Position[DeserializedPropertyDescriptor]

'topLevelTracker' @ [222:46] ==> public final val topLevelTracker: ProgressTracker defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'if (change.newStep == ProgressTracker.DONE) {
                    if (change.tracker == tracker) {
                        // Flow done; schedule it for removal in a few seconds. We batch them up to make nicer
                        // animations.
                        updateProgressTrackerWidget(change)
                        println("Flow done for ${node.info.legalIdentity.name}")
                        viewModel.doneTrackers += tracker
                    } else {
                        // Subflow is done; ignore it.
                    }
                } else if (!viewModel.trackerBoxes.containsKey(tracker)) {
                    // New flow started up; add.
                    val extraLabel = viewModel.simulation.extraNodeLabels[node]
                    val label = if (extraLabel != null) "${node.info.legalIdentity.name.commonName}: $extraLabel" else node.info.legalIdentity.name.commonName
                    val widget = view.buildProgressTrackerWidget(label, tracker.topLevelTracker)
                    println("Added: $tracker, $widget")
                    viewModel.trackerBoxes[tracker] = widget
                    view.sidebar.children += widget.vbox
                } else {
                    updateProgressTrackerWidget(change)
                }' @ [223:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'change' @ [223:21] ==> val change: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'newStep' @ [223:28] ==> public final val newStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker.Change.Position[DeserializedPropertyDescriptor]

'DONE' @ [223:55] ==> public object DONE : ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[FakeCallableDescriptorForObject]

'if (change.tracker == tracker) {
                        // Flow done; schedule it for removal in a few seconds. We batch them up to make nicer
                        // animations.
                        updateProgressTrackerWidget(change)
                        println("Flow done for ${node.info.legalIdentity.name}")
                        viewModel.doneTrackers += tracker
                    } else {
                        // Subflow is done; ignore it.
                    }' @ [224:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'change' @ [224:25] ==> val change: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'tracker' @ [224:32] ==> public final val tracker: ProgressTracker defined in net.corda.core.utilities.ProgressTracker.Change.Position[DeserializedPropertyDescriptor]

'tracker' @ [224:43] ==> val tracker: ProgressTracker defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'updateProgressTrackerWidget' @ [227:25] ==> private final fun updateProgressTrackerWidget(step: ProgressTracker.Change): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'change' @ [227:53] ==> val change: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'println' @ [228:25] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'node' @ [228:50] ==> val node: Simulation.SimulatedNode defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'info' @ [228:55] ==> public final lateinit var info: NodeInfo defined in net.corda.netmap.simulation.Simulation.SimulatedNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [228:60] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'name' @ [228:74] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'viewModel' @ [229:25] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'doneTrackers' @ [229:35] ==> public final val doneTrackers: ArrayList<ProgressTracker> defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'tracker' @ [229:51] ==> val tracker: ProgressTracker defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'if (!viewModel.trackerBoxes.containsKey(tracker)) {
                    // New flow started up; add.
                    val extraLabel = viewModel.simulation.extraNodeLabels[node]
                    val label = if (extraLabel != null) "${node.info.legalIdentity.name.commonName}: $extraLabel" else node.info.legalIdentity.name.commonName
                    val widget = view.buildProgressTrackerWidget(label, tracker.topLevelTracker)
                    println("Added: $tracker, $widget")
                    viewModel.trackerBoxes[tracker] = widget
                    view.sidebar.children += widget.vbox
                } else {
                    updateProgressTrackerWidget(change)
                }' @ [233:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [233:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'viewModel' @ [233:29] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'trackerBoxes' @ [233:39] ==> public final val trackerBoxes: HashMap<ProgressTracker, TrackerWidget> defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'containsKey' @ [233:52] ==> public open fun containsKey(key: ProgressTracker): Boolean defined in java.util.HashMap[JavaMethodDescriptor]

'tracker' @ [233:64] ==> val tracker: ProgressTracker defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'viewModel' @ [235:38] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'simulation' @ [235:48] ==> public final var simulation: IRSSimulation defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'extraNodeLabels' @ [235:59] ==> public final val extraNodeLabels: MutableMap<Simulation.SimulatedNode, String> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'node' @ [235:75] ==> val node: Simulation.SimulatedNode defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'if (extraLabel != null) "${node.info.legalIdentity.name.commonName}: $extraLabel" else node.info.legalIdentity.name.commonName' @ [236:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'extraLabel' @ [236:37] ==> val extraLabel: String? defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'node' @ [236:60] ==> val node: Simulation.SimulatedNode defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'info' @ [236:65] ==> public final lateinit var info: NodeInfo defined in net.corda.netmap.simulation.Simulation.SimulatedNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [236:70] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'name' @ [236:84] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'commonName' @ [236:89] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'extraLabel' @ [236:103] ==> val extraLabel: String? defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'node' @ [236:120] ==> val node: Simulation.SimulatedNode defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'info' @ [236:125] ==> public final lateinit var info: NodeInfo defined in net.corda.netmap.simulation.Simulation.SimulatedNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [236:130] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'name' @ [236:144] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'commonName' @ [236:149] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'view' @ [237:34] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'buildProgressTrackerWidget' @ [237:39] ==> public final fun buildProgressTrackerWidget(label: String, tracker: ProgressTracker): TrackerWidget defined in net.corda.netmap.VisualiserView[SimpleFunctionDescriptorImpl]

'label' @ [237:66] ==> val label: String defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'tracker' @ [237:73] ==> val tracker: ProgressTracker defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'topLevelTracker' @ [237:81] ==> public final val topLevelTracker: ProgressTracker defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'println' @ [238:21] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'tracker' @ [238:38] ==> val tracker: ProgressTracker defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'widget' @ [238:48] ==> val widget: TrackerWidget defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'viewModel' @ [239:21] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'trackerBoxes' @ [239:31] ==> public final val trackerBoxes: HashMap<ProgressTracker, TrackerWidget> defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'tracker' @ [239:44] ==> val tracker: ProgressTracker defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'widget' @ [239:55] ==> val widget: TrackerWidget defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'view' @ [240:21] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'sidebar' @ [240:26] ==> public final lateinit var sidebar: VBox defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'children' @ [240:34] ==> public final val VBox.children: (ObservableList<(Node..Node?)>..ObservableList<(Node..Node?)>?)[MyPropertyDescriptor]

'widget' @ [240:46] ==> val widget: TrackerWidget defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'vbox' @ [240:53] ==> public final val vbox: VBox defined in net.corda.netmap.TrackerWidget[PropertyDescriptorImpl]

'updateProgressTrackerWidget' @ [242:21] ==> private final fun updateProgressTrackerWidget(step: ProgressTracker.Change): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'change' @ [242:49] ==> val change: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'change' @ [244:24] ==> val change: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'updateProgressTrackerWidget' @ [245:17] ==> private final fun updateProgressTrackerWidget(step: ProgressTracker.Change): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'change' @ [245:45] ==> val change: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>[LocalVariableDescriptor]

'Timer' @ [249:9] ==> public constructor Timer() defined in java.util.Timer[JavaClassConstructorDescriptor]

'scheduleAtFixedRate' @ [249:17] ==> @InlineOnly public inline fun Timer.scheduleAtFixedRate(delay: Long, period: Long, crossinline action: TimerTask.() -> Unit): TimerTask defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'runLater' @ [250:22] ==> public final fun runLater(p0: (() -> Unit..(() -> Unit)?)): Unit defined in javafx.application.Platform[SamAdapterFunctionDescriptor]

'viewModel' @ [251:33] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'doneTrackers' @ [251:43] ==> public final val doneTrackers: ArrayList<ProgressTracker> defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'viewModel' @ [252:32] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'trackerBoxes' @ [252:42] ==> public final val trackerBoxes: HashMap<ProgressTracker, TrackerWidget> defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'tracker' @ [252:55] ==> val tracker: ProgressTracker defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'vbox' @ [252:66] ==> public final val vbox: VBox defined in net.corda.netmap.TrackerWidget[PropertyDescriptorImpl]

'SimpleDoubleProperty' @ [254:37] ==> public constructor SimpleDoubleProperty(p0: Double) defined in javafx.beans.property.SimpleDoubleProperty[JavaClassConstructorDescriptor]

'slideProp' @ [255:21] ==> val slideProp: SimpleDoubleProperty defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'addListener' @ [255:31] ==> public final fun addListener(p0: (((Observable..Observable?)) -> Unit..(((Observable..Observable?)) -> Unit)?)): Unit defined in javafx.beans.property.SimpleDoubleProperty[MyFunctionDescriptor]

'pane' @ [255:50] ==> val pane: VBox defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'padding' @ [255:55] ==> public final var VBox.padding: (Insets..Insets?)[MyPropertyDescriptor]

'Insets' @ [255:65] ==> public constructor Insets(@NamedArg p0: Double, @NamedArg p1: Double, @NamedArg p2: Double, @NamedArg p3: Double) defined in javafx.geometry.Insets[JavaClassConstructorDescriptor]

'slideProp' @ [255:82] ==> val slideProp: SimpleDoubleProperty defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'value' @ [255:92] ==> public final var SimpleDoubleProperty.value: (Double..Double?)[MyPropertyDescriptor]

'Timeline' @ [256:36] ==> public constructor Timeline(vararg p0: (KeyFrame..KeyFrame?)) defined in javafx.animation.Timeline[JavaClassConstructorDescriptor]

'KeyFrame' @ [257:29] ==> public constructor KeyFrame(@NamedArg p0: (Duration..Duration?), @NamedArg vararg p1: (KeyValue..KeyValue?)) defined in javafx.animation.KeyFrame[JavaClassConstructorDescriptor]

'Duration' @ [257:38] ==> public constructor Duration(@NamedArg p0: Double) defined in javafx.util.Duration[JavaClassConstructorDescriptor]

'KeyValue' @ [258:37] ==> public constructor KeyValue<T : (Any..Any?)>(@NamedArg p0: (WritableValue<(Number..Number?)>..WritableValue<(Number..Number?)>?), @NamedArg p1: (Number..Number?)) defined in javafx.animation.KeyValue[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Number..kotlin.Number?)

'pane' @ [258:46] ==> val pane: VBox defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'opacityProperty' @ [258:51] ==> public final fun opacityProperty(): (DoubleProperty..DoubleProperty?) defined in javafx.scene.layout.VBox[JavaMethodDescriptor]

'KeyValue' @ [259:37] ==> public constructor KeyValue<T : (Any..Any?)>(@NamedArg p0: (WritableValue<(Number..Number?)>..WritableValue<(Number..Number?)>?), @NamedArg p1: (Number..Number?)) defined in javafx.animation.KeyValue[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Number..kotlin.Number?)

'slideProp' @ [259:46] ==> val slideProp: SimpleDoubleProperty defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'-' @ [259:57] ==> public final operator fun unaryMinus(): Double defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'pane' @ [259:58] ==> val pane: VBox defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'height' @ [259:63] ==> public final var VBox.height: Double[MyPropertyDescriptor]

'timeline' @ [262:21] ==> val timeline: Timeline defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'setOnFinished' @ [262:30] ==> public final fun setOnFinished(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javafx.animation.Timeline[MyFunctionDescriptor]

'println' @ [263:25] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'tracker' @ [263:44] ==> val tracker: ProgressTracker defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'viewModel' @ [264:36] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'trackerBoxes' @ [264:46] ==> public final val trackerBoxes: HashMap<ProgressTracker, TrackerWidget> defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'remove' @ [264:59] ==> public open fun remove(key: ProgressTracker): TrackerWidget? defined in java.util.HashMap[JavaMethodDescriptor]

'tracker' @ [264:66] ==> val tracker: ProgressTracker defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'vbox' @ [264:76] ==> public final val vbox: VBox defined in net.corda.netmap.TrackerWidget[PropertyDescriptorImpl]

'view' @ [265:25] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'sidebar' @ [265:30] ==> public final lateinit var sidebar: VBox defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'children' @ [265:38] ==> public final val VBox.children: (ObservableList<(Node..Node?)>..ObservableList<(Node..Node?)>?)[MyPropertyDescriptor]

'remove' @ [265:47] ==> public abstract fun remove(element: (Node..Node?)): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'vbox' @ [265:54] ==> val vbox: VBox? defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'timeline' @ [267:21] ==> val timeline: Timeline defined in net.corda.netmap.NetworkMapVisualiser.bindSidebar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'play' @ [267:30] ==> public open fun play(): Unit defined in javafx.animation.Timeline[JavaMethodDescriptor]

'viewModel' @ [269:17] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'doneTrackers' @ [269:27] ==> public final val doneTrackers: ArrayList<ProgressTracker> defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'clear' @ [269:40] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'if (step is ProgressTracker.Change.Position) {
            // Animate the cursor to the right place.
            Platform.runLater {
                val tracker: ProgressTracker = step.tracker.topLevelTracker
                val widget = viewModel.trackerBoxes[tracker] ?: return@runLater
                val allSteps: List<Pair<Int, ProgressTracker.Step>> = tracker.allSteps

                // Figure out the index of the new step.
                val curStep = allSteps.indexOfFirst { it.second == step.newStep }
                with(TranslateTransition(Duration(350.0), widget.cursor)) {
                    fromY = widget.cursor.translateY
                    toY = (curStep * view.sideBarStepHeight) + (view.sideBarStepHeight / 2.0)
                    play()
                }
            }
        } else if (step is ProgressTracker.Change.Structural) {
            Platform.runLater {
                val tracker: ProgressTracker = step.tracker.topLevelTracker
                val widget = viewModel.trackerBoxes[tracker] ?: return@runLater
                val new = view.buildProgressTrackerWidget(widget.label.text, tracker)
                val prevWidget = viewModel.trackerBoxes[tracker]?.vbox ?: throw AssertionError("No previous widget for tracker: $tracker")
                val i = (prevWidget.parent as VBox).children.indexOf(viewModel.trackerBoxes[tracker]?.vbox)
                (prevWidget.parent as VBox).children[i] = new.vbox
                viewModel.trackerBoxes[tracker] = new
            }
        }' @ [275:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'step' @ [275:13] ==> value-parameter step: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget[ValueParameterDescriptorImpl]

'runLater' @ [277:22] ==> public final fun runLater(p0: (() -> Unit..(() -> Unit)?)): Unit defined in javafx.application.Platform[SamAdapterFunctionDescriptor]

'step' @ [278:48] ==> value-parameter step: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget[ValueParameterDescriptorImpl]

'tracker' @ [278:53] ==> public final val tracker: ProgressTracker defined in net.corda.core.utilities.ProgressTracker.Change.Position[DeserializedPropertyDescriptor]

'topLevelTracker' @ [278:61] ==> public final val topLevelTracker: ProgressTracker defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'viewModel' @ [279:30] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'trackerBoxes' @ [279:40] ==> public final val trackerBoxes: HashMap<ProgressTracker, TrackerWidget> defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'tracker' @ [279:53] ==> val tracker: ProgressTracker defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget.<anonymous>[LocalVariableDescriptor]

'tracker' @ [280:71] ==> val tracker: ProgressTracker defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget.<anonymous>[LocalVariableDescriptor]

'allSteps' @ [280:79] ==> public final val allSteps: List<Pair<Int, ProgressTracker.Step>> defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'allSteps' @ [283:31] ==> val allSteps: List<Pair<Int, ProgressTracker.Step>> defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget.<anonymous>[LocalVariableDescriptor]

'indexOfFirst' @ [283:40] ==> public inline fun <T> List<Pair<Int, ProgressTracker.Step>>.indexOfFirst(predicate: (Pair<Int, ProgressTracker.Step>) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Int, Step>

'it' @ [283:55] ==> value-parameter it: Pair<Int, ProgressTracker.Step> defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [283:58] ==> public final val second: ProgressTracker.Step defined in kotlin.Pair[DeserializedPropertyDescriptor]

'step' @ [283:68] ==> value-parameter step: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget[ValueParameterDescriptorImpl]

'newStep' @ [283:73] ==> public final val newStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker.Change.Position[DeserializedPropertyDescriptor]

'with' @ [284:17] ==> @InlineOnly public inline fun <T, R> with(receiver: TranslateTransition, block: TranslateTransition.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TranslateTransition
    <R> -> Unit

'TranslateTransition' @ [284:22] ==> public constructor TranslateTransition(p0: (Duration..Duration?), p1: (Node..Node?)) defined in javafx.animation.TranslateTransition[JavaClassConstructorDescriptor]

'Duration' @ [284:42] ==> public constructor Duration(@NamedArg p0: Double) defined in javafx.util.Duration[JavaClassConstructorDescriptor]

'widget' @ [284:59] ==> val widget: TrackerWidget defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget.<anonymous>[LocalVariableDescriptor]

'cursor' @ [284:66] ==> public final val cursor: Polygon defined in net.corda.netmap.TrackerWidget[PropertyDescriptorImpl]

'fromY' @ [285:21] ==> public final var TranslateTransition.fromY: Double[MyPropertyDescriptor]

'widget' @ [285:29] ==> val widget: TrackerWidget defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget.<anonymous>[LocalVariableDescriptor]

'cursor' @ [285:36] ==> public final val cursor: Polygon defined in net.corda.netmap.TrackerWidget[PropertyDescriptorImpl]

'translateY' @ [285:43] ==> public final var Polygon.translateY: Double[MyPropertyDescriptor]

'toY' @ [286:21] ==> public final var TranslateTransition.toY: Double[MyPropertyDescriptor]

'+' @ [286:27] ==> public final operator fun plus(other: Double): Double defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'curStep' @ [286:28] ==> val curStep: Int defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget.<anonymous>[LocalVariableDescriptor]

'view' @ [286:38] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'sideBarStepHeight' @ [286:43] ==> public final val sideBarStepHeight: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'view' @ [286:65] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'sideBarStepHeight' @ [286:70] ==> public final val sideBarStepHeight: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'play' @ [287:21] ==> public open fun play(): Unit defined in javafx.animation.TranslateTransition[JavaMethodDescriptor]

'step' @ [290:20] ==> value-parameter step: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget[ValueParameterDescriptorImpl]

'runLater' @ [291:22] ==> public final fun runLater(p0: (() -> Unit..(() -> Unit)?)): Unit defined in javafx.application.Platform[SamAdapterFunctionDescriptor]

'step' @ [292:48] ==> value-parameter step: ProgressTracker.Change defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget[ValueParameterDescriptorImpl]

'tracker' @ [292:53] ==> public final val tracker: ProgressTracker defined in net.corda.core.utilities.ProgressTracker.Change.Structural[DeserializedPropertyDescriptor]

'topLevelTracker' @ [292:61] ==> public final val topLevelTracker: ProgressTracker defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'viewModel' @ [293:30] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'trackerBoxes' @ [293:40] ==> public final val trackerBoxes: HashMap<ProgressTracker, TrackerWidget> defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'tracker' @ [293:53] ==> val tracker: ProgressTracker defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget.<anonymous>[LocalVariableDescriptor]

'view' @ [294:27] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'buildProgressTrackerWidget' @ [294:32] ==> public final fun buildProgressTrackerWidget(label: String, tracker: ProgressTracker): TrackerWidget defined in net.corda.netmap.VisualiserView[SimpleFunctionDescriptorImpl]

'widget' @ [294:59] ==> val widget: TrackerWidget defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget.<anonymous>[LocalVariableDescriptor]

'label' @ [294:66] ==> public final val label: Label defined in net.corda.netmap.TrackerWidget[PropertyDescriptorImpl]

'text' @ [294:72] ==> public final var Label.text: (String..String?)[MyPropertyDescriptor]

'tracker' @ [294:78] ==> val tracker: ProgressTracker defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget.<anonymous>[LocalVariableDescriptor]

'viewModel' @ [295:34] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'trackerBoxes' @ [295:44] ==> public final val trackerBoxes: HashMap<ProgressTracker, TrackerWidget> defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'tracker' @ [295:57] ==> val tracker: ProgressTracker defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget.<anonymous>[LocalVariableDescriptor]

'vbox' @ [295:67] ==> public final val vbox: VBox defined in net.corda.netmap.TrackerWidget[PropertyDescriptorImpl]

'AssertionError' @ [295:81] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'tracker' @ [295:130] ==> val tracker: ProgressTracker defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget.<anonymous>[LocalVariableDescriptor]

'prevWidget' @ [296:26] ==> val prevWidget: VBox defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget.<anonymous>[LocalVariableDescriptor]

'parent' @ [296:37] ==> public final val VBox.parent: (Parent..Parent?)[MyPropertyDescriptor]

'children' @ [296:53] ==> public final val VBox.children: (ObservableList<(Node..Node?)>..ObservableList<(Node..Node?)>?)[MyPropertyDescriptor]

'indexOf' @ [296:62] ==> public abstract fun indexOf(element: (Node..Node?)): Int defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'viewModel' @ [296:70] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'trackerBoxes' @ [296:80] ==> public final val trackerBoxes: HashMap<ProgressTracker, TrackerWidget> defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'tracker' @ [296:93] ==> val tracker: ProgressTracker defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget.<anonymous>[LocalVariableDescriptor]

'vbox' @ [296:103] ==> public final val vbox: VBox defined in net.corda.netmap.TrackerWidget[PropertyDescriptorImpl]

'(prevWidget.parent as VBox).children[i]' @ [297:17] ==> public abstract fun set(index: Int, element: (Node..Node?)): (Node..Node?) defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'prevWidget' @ [297:18] ==> val prevWidget: VBox defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget.<anonymous>[LocalVariableDescriptor]

'parent' @ [297:29] ==> public final val VBox.parent: (Parent..Parent?)[MyPropertyDescriptor]

'children' @ [297:45] ==> public final val VBox.children: (ObservableList<(Node..Node?)>..ObservableList<(Node..Node?)>?)[MyPropertyDescriptor]

'i' @ [297:54] ==> val i: Int defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget.<anonymous>[LocalVariableDescriptor]

'new' @ [297:59] ==> val new: TrackerWidget defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget.<anonymous>[LocalVariableDescriptor]

'vbox' @ [297:63] ==> public final val vbox: VBox defined in net.corda.netmap.TrackerWidget[PropertyDescriptorImpl]

'viewModel' @ [298:17] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'trackerBoxes' @ [298:27] ==> public final val trackerBoxes: HashMap<ProgressTracker, TrackerWidget> defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'tracker' @ [298:40] ==> val tracker: ProgressTracker defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget.<anonymous>[LocalVariableDescriptor]

'new' @ [298:51] ==> val new: TrackerWidget defined in net.corda.netmap.NetworkMapVisualiser.updateProgressTrackerWidget.<anonymous>[LocalVariableDescriptor]

'!' @ [305:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'started' @ [305:14] ==> public final var started: Boolean defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'viewModel' @ [306:13] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'simulation' @ [306:23] ==> public final var simulation: IRSSimulation defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'start' @ [306:34] ==> public final fun start(): CordaFuture<Unit> defined in net.corda.netmap.simulation.IRSSimulation[SimpleFunctionDescriptorImpl]

'started' @ [307:13] ==> public final var started: Boolean defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'viewModel' @ [312:9] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'simulation' @ [312:19] ==> public final var simulation: IRSSimulation defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'stop' @ [312:30] ==> public final fun stop(): Unit defined in net.corda.netmap.simulation.IRSSimulation[SimpleFunctionDescriptorImpl]

'viewModel' @ [313:9] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'simulation' @ [313:19] ==> public final var simulation: IRSSimulation defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'IRSSimulation' @ [313:32] ==> public constructor IRSSimulation(networkSendManuallyPumped: Boolean, runAsync: Boolean, latencyInjector: InMemoryMessagingNetwork.LatencyCalculator?) defined in net.corda.netmap.simulation.IRSSimulation[ClassConstructorDescriptorImpl]

'started' @ [314:9] ==> public final var started: Boolean defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'start' @ [315:9] ==> public open fun start(stage: Stage): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'view' @ [315:15] ==> private final val view: VisualiserView defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'stage' @ [315:20] ==> public final lateinit var stage: Stage defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'startSimulation' @ [319:9] ==> private final fun startSimulation(): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'!' @ [320:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'viewModel' @ [320:17] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'simulation' @ [320:27] ==> public final var simulation: IRSSimulation defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'networkInitialisationFinished' @ [320:38] ==> public final val networkInitialisationFinished: CordaFuture<List<Unit>> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'isDone' @ [320:68] ==> public final val <V> CordaFuture<List<Unit>>.isDone: Boolean[MyPropertyDescriptor]
Inferred types:
    <V> -> List<Unit>

'iterateSimulation' @ [321:13] ==> private final fun iterateSimulation(): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'if (started) {
            iterateSimulation()
        } else {
            startSimulation()
        }' @ [326:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'started' @ [326:13] ==> public final var started: Boolean defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'iterateSimulation' @ [327:13] ==> private final fun iterateSimulation(): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'startSimulation' @ [329:13] ==> private final fun startSimulation(): Unit defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'viewModel' @ [336:70] ==> private final val viewModel: VisualiserViewModel defined in net.corda.netmap.NetworkMapVisualiser[PropertyDescriptorImpl]

'simulation' @ [336:80] ==> public final var simulation: IRSSimulation defined in net.corda.netmap.VisualiserViewModel[PropertyDescriptorImpl]

'iterate' @ [336:91] ==> public open fun iterate(): InMemoryMessagingNetwork.MessageTransfer? defined in net.corda.netmap.simulation.IRSSimulation[SimpleFunctionDescriptorImpl]

'if (transferIsInteresting(transfer))
                break
            else
                System.err.println("skipping boring $transfer")' @ [337:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'transferIsInteresting' @ [337:17] ==> private final fun transferIsInteresting(transfer: InMemoryMessagingNetwork.MessageTransfer): Boolean defined in net.corda.netmap.NetworkMapVisualiser[SimpleFunctionDescriptorImpl]

'transfer' @ [337:39] ==> val transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.netmap.NetworkMapVisualiser.iterateSimulation[LocalVariableDescriptor]

'err' @ [340:24] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [340:28] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'transfer' @ [340:54] ==> val transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.netmap.NetworkMapVisualiser.iterateSimulation[LocalVariableDescriptor]

'transfer' @ [346:13] ==> value-parameter transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.netmap.NetworkMapVisualiser.transferIsInteresting[ValueParameterDescriptorImpl]

'sender' @ [346:22] ==> public final val sender: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[DeserializedPropertyDescriptor]

'transfer' @ [346:32] ==> value-parameter transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.netmap.NetworkMapVisualiser.transferIsInteresting[ValueParameterDescriptorImpl]

'recipients' @ [346:41] ==> public final val recipients: MessageRecipients defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[DeserializedPropertyDescriptor]

'in' @ [348:13] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'PUSH_ACK_TOPIC' @ [348:31] ==> public final val PUSH_ACK_TOPIC: String defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'transfer' @ [348:49] ==> value-parameter transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.netmap.NetworkMapVisualiser.transferIsInteresting[ValueParameterDescriptorImpl]

'message' @ [348:58] ==> public final val message: Message defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[DeserializedPropertyDescriptor]

'topicSession' @ [348:66] ==> public abstract val topicSession: TopicSession defined in net.corda.node.services.messaging.Message[DeserializedPropertyDescriptor]

'topic' @ [348:79] ==> public final val topic: String defined in net.corda.node.services.messaging.TopicSession[DeserializedPropertyDescriptor]

'transfer' @ [349:23] ==> value-parameter transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.netmap.NetworkMapVisualiser.transferIsInteresting[ValueParameterDescriptorImpl]

'message' @ [349:32] ==> public final val message: Message defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[DeserializedPropertyDescriptor]

'data' @ [349:40] ==> public abstract val data: ByteArray defined in net.corda.node.services.messaging.Message[DeserializedPropertyDescriptor]

'deserialize' @ [349:45] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): Any defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Any

'when (message) {
            is SessionEnd -> false
            is SessionConfirm -> false
            is SessionInit -> message.firstPayload != null
            else -> true
        }' @ [350:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'message' @ [350:22] ==> val message: Any defined in net.corda.netmap.NetworkMapVisualiser.transferIsInteresting[LocalVariableDescriptor]

'message' @ [353:31] ==> val message: Any defined in net.corda.netmap.NetworkMapVisualiser.transferIsInteresting[LocalVariableDescriptor]

'firstPayload' @ [353:39] ==> public final val firstPayload: Any? defined in net.corda.node.services.statemachine.SessionInit[DeserializedPropertyDescriptor]

'launch' @ [360:17] ==> public open fun launch(p0: (Class<out (Application..Application?)>..Class<out (Application..Application?)>?), vararg p1: (String..String?)): Unit defined in javafx.application.Application[JavaMethodDescriptor]

'NetworkMapVisualiser' @ [360:24] ==> public constructor NetworkMapVisualiser() defined in net.corda.netmap.NetworkMapVisualiser[ClassConstructorDescriptorImpl]

'java' @ [360:52] ==> public val <T> KClass<NetworkMapVisualiser>.java: Class<NetworkMapVisualiser> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NetworkMapVisualiser

'args' @ [360:59] ==> value-parameter args: Array<String> defined in net.corda.netmap.main[ValueParameterDescriptorImpl]

