from flask import Flask, request, jsonify, abort

application = Flask(__name__)

@application.route("/rt", methods=['POST'])
