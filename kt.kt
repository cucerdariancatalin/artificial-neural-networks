class ArtificialNeuron {
    var weights: List<Double>
    var bias: Double

    constructor(weights: List<Double>, bias: Double) {
        this.weights = weights
        this.bias = bias
    }

    fun sigmoid(x: Double): Double {
        return 1.0 / (1 + Math.exp(-x))
    }

    fun computeOutput(inputs: List<Double>): Double {
        var sum = bias
        for (i in inputs.indices) {
            sum += inputs[i] * weights[i]
        }
        return sigmoid(sum)
    }
}
